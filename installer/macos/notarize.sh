#!/bin/sh
set -eu

artifact=${1:?Informe o caminho do DMG assinado}
keychain_profile=${2:-portugol-studio-notary}

xcrun notarytool submit "$artifact" --keychain-profile "$keychain_profile" --wait
xcrun stapler staple "$artifact"
xcrun stapler validate "$artifact"
spctl --assess --type open --context context:primary-signature --verbose=2 "$artifact"
