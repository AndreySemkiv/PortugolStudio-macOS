# Build do Portugol Studio para macOS Apple Silicon

Esta distribuição usa Gradle 8, JDK 21, `jlink` e `jpackage`. O resultado é um
aplicativo ARM64 autocontido: o usuário final não precisa instalar Java.

## Requisitos

- Mac Apple Silicon com macOS 14 ou posterior (validado no macOS 27);
- Xcode Command Line Tools;
- JDK 21 ARM64 (Temurin, Oracle ou outro build compatível).

Confirme que `java -version` usa JDK 21 e que `uname -m` retorna `arm64`.

Se o repositório estiver dentro de Desktop/Documents sincronizado pelo iCloud,
redirecione os arquivos transitórios para evitar conflitos do File Provider:

```sh
export PORTUGOL_BUILD_ROOT="$TMPDIR/portugol-studio-build"
```

## Compilar e testar

```sh
./gradlew --no-daemon clean build
```

O código é compilado para bytecode Java 11, mas o processo de build e o runtime
distribuído usam JDK 21. O runtime inclui `java`, `javac` e os módulos necessários
para compilar e executar programas Portugol.

## Criar e validar o aplicativo

```sh
./gradlew --no-daemon verifyMacApp
```

O resultado fica em `build/macos/output/Portugol Studio.app`. A validação confere
o executável ARM64, o `Info.plist`, o `javac` embutido e a assinatura. Sem uma
identidade Apple configurada, o `jpackage` aplica apenas uma assinatura ad hoc;
ela serve para testes locais, não para distribuição pública.

## Criar o DMG

```sh
./gradlew --no-daemon macDmg
```

O arquivo fica em `build/macos/output`.

## Assinar para distribuição

É necessário um certificado **Developer ID Application** no chaveiro. Exporte:

```sh
export MAC_SIGNING_IDENTITY='Developer ID Application: Nome (TEAMID)'
export MAC_SIGNING_KEYCHAIN='/caminho/para/chaveiro.keychain-db' # opcional
./gradlew --no-daemon clean build verifyMacApp macDmg
```

Nunca grave certificados, senhas ou chaves no repositório.

## Notarizar e anexar o ticket

Crie uma senha específica de app e salve as credenciais uma vez:

```sh
xcrun notarytool store-credentials portugol-studio-notary \
  --apple-id 'conta@exemplo.com' \
  --team-id 'TEAMID' \
  --password 'senha-especifica-do-app'
```

Depois execute:

```sh
installer/macos/notarize.sh 'build/macos/output/Portugol Studio-2.7.5.dmg'
```

O script aguarda a análise da Apple, aplica o ticket com `stapler` e valida o
DMG com Gatekeeper.

## Associação de arquivos

O pacote registra a extensão `.por`. O manipulador nativo do Java recebe arquivos
abertos pelo Finder e os encaminha à instância já em execução, quando houver.

## CI e releases

`.github/workflows/macos-arm64.yml` executa testes e cria um DMG não assinado em
pull requests e no branch principal. Tags `v*` exigem estes secrets:

- `MACOS_CERTIFICATE`: certificado `.p12` em Base64;
- `MACOS_CERTIFICATE_PASSWORD`: senha do `.p12`;
- `MACOS_KEYCHAIN_PASSWORD`: senha temporária para o chaveiro da CI;
- `MACOS_SIGNING_IDENTITY`: nome completo do Developer ID Application;
- `APPLE_ID`, `APPLE_TEAM_ID` e `APPLE_APP_SPECIFIC_PASSWORD`.

## Compatibilidade legada

O WebLaF 1.29 embute XStream 1.4.7 e usa reflexão em partes do Swing. Por isso o
launcher abre somente os pacotes Java estritamente necessários. A antiga SwingBox
1.1 foi removida da tela de ajuda porque dependia de uma classe SSL interna que
não existe em JDKs modernos; a ajuda agora usa `JEditorPane`, parte do Swing.

Uma modernização futura pode migrar o tema para FlatLaf ou outro Look and Feel
mantido e então remover as opções `--add-opens` restantes.
