#!/bin/sh
set -eu

app_path=${1:?Informe o caminho da aplicação .app}
launcher="$app_path/Contents/MacOS/Portugol Studio"
javac="$app_path/Contents/runtime/Contents/Home/bin/javac"
launcher_config="$app_path/Contents/app/Portugol Studio.cfg"
icon_name=$(/usr/libexec/PlistBuddy -c 'Print :CFBundleIconFile' "$app_path/Contents/Info.plist")
icon_path="$app_path/Contents/Resources/$icon_name"
icon_temp_path=$(mktemp -d "${TMPDIR:-/tmp}/portugol-icon.XXXXXX")
iconset_path="$icon_temp_path/Portugol.iconset"
trap 'rm -rf "$icon_temp_path"' EXIT

test -x "$launcher"
test -x "$javac"
test -f "$launcher_config"
test -f "$icon_path"
grep -Fq 'java-options=-Dapple.awt.application.appearance=system' "$launcher_config"
iconutil -c iconset "$icon_path" -o "$iconset_path"
find "$iconset_path" -type f -name '*.png' -exec sips -g pixelWidth {} \; | grep -Eq 'pixelWidth: (256|512|1024)'
file "$launcher"
plutil -lint "$app_path/Contents/Info.plist"
codesign --verify --deep --strict --verbose=2 "$app_path"

if command -v spctl >/dev/null 2>&1; then
    spctl --assess --type execute --verbose=2 "$app_path" || true
fi
