## Suporte moderno ao macOS

Esta versão contém adaptações para executar o Portugol Studio de forma mais estável em versões atuais do macOS, especialmente em Macs com Apple Silicon.

### Principais melhorias

- Compatibilidade com processadores Apple Silicon ARM64.
- Atualização do ambiente de compilação para JDK 21.
- Atualização e modernização da configuração do Gradle.
- Inclusão de um runtime Java próprio dentro do aplicativo.
- Correção do classpath usado ao executar programas Portugol.
- Correção de dependências incompatíveis com versões modernas do Java.
- Uso da janela nativa do macOS.
- Botões nativos de fechar, minimizar e maximizar.
- Suporte ao modo tela cheia e maximização nativa do macOS.
- Barra de título sincronizada automaticamente com o tema claro ou escuro do sistema.
- Integração com o menu global do macOS.
- Associação de arquivos `.por` ao Portugol Studio.
- Abertura de arquivos Portugol pelo Finder e pelo sistema.
- Correção do cursor branco no editor de código.
- Uso do ícone Retina do aplicativo no Dock.
- Remoção do ícone PNG de baixa resolução que causava desfoque ao minimizar.
- Geração de aplicativo `.app` para macOS.
- Geração de instalador `.dmg`.
- Verificação automática da arquitetura ARM64.
- Verificação do bundle, metadados, runtime e ícones do aplicativo.
- Inclusão de testes automatizados para a aparência do macOS e do editor.

### Compatibilidade

- macOS 11 Big Sur ou superior.
- Macs com Apple Silicon: M1, M2, M3, M4 ou posteriores.
- Testado no macOS 27 em arquitetura ARM64.

Esta build não é destinada a Macs Intel.

### Como executar

1. Baixe o arquivo `.dmg` na seção de Releases.
2. Abra o instalador e arraste o `Portugol Studio.app` para a pasta `Applications`.
3. Execute o aplicativo normalmente.

Como a build não é assinada nem notarizada pela Apple, pode ser necessário clicar com o botão direito no aplicativo, selecionar **Abrir** e confirmar a execução na primeira inicialização.

### Como gerar uma build para macOS

É necessário utilizar um Mac Apple Silicon com JDK 21 instalado.

```bash
./gradlew clean build verifyMacApp macDmg
```

Os arquivos gerados estarão em:

```text
build/macos/output/
```

A aplicação ficará disponível como:

```text
build/macos/output/Portugol Studio.app
```

E o instalador será gerado como:

```text
build/macos/output/Portugol Studio-2.7.5.dmg
```

### Observações

Esta adaptação mantém a interface e a linguagem Portugol existentes, concentrando as mudanças na compatibilidade do aplicativo desktop, no editor, no empacotamento e na integração com o macOS.
 
