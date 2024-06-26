# CURSO JAVA BACKEND - MÓDULO II

## Descrição

Neste projeto estão todos os exemplos utilizados no módulo II do curso de java backend.

## Organização

O código fonte esta organizado em pacotes dentro da pasta src,
cada pacote esta identificado com o nome do recurso que esta sendo exemplificado.

Dentro de cada pacote estão as classes com os exemplos.

Na raiz do projeto, você encontra o documento curso_java_backend_modulo2_java_intermediario_avancado.pdf,
com a parte teórica e exemplos, que são os mesmos que estão no projeto.

## Pré-requisitos

- Java JDK 14 ou superior
- IDE de sua preferência

## Tecnologias utilizadas

- IntelliJ
- Java 17

### Download do projeto

Você pode baixar o projeto para o seu computador de duas formas:

1. Fazer o download a partir do GitHib
  - Clique em Code
  - Escolha Download ZIP
  - Crie uma pasta no seu computador
  - Copie o arquivo baixado para a pasta criada
  - Descompacte o arquivo
2. Clone o repositório (Requer o Git instalado no seu computador)
```
   cd seu-repositorio
   git clone https://github.com/birapcampos/curso-java-backend-modulo3.git
```
## Configuração do ambiente de desenvolvimento

### Instalação do Java JDK 17

#### Passo 1: Baixar o JDK 17
Acesse o site oficial da Oracle para download do JDK: https://www.oracle.com/java/technologies/downloads/#jdk17-windows
- Selecione a versão adequada para o seu sistema operacional (Windows) e baixe o instalador (.exe).

#### Passo 2: Instalar o JDK 17
- Após baixar o instalador, execute o arquivo .exe.
- Siga as instruções do assistente de instalação.
- Anote o caminho de instalação (por exemplo, C:\Program Files\Java\jdk-17).

### Passo 3: Configurar Variáveis de Ambiente

Adicionar JAVA_HOME:

- Abra o Menu Iniciar e digite "variáveis de ambiente".
- Clique em "Editar as variáveis de ambiente do sistema".
- Na janela "Propriedades do Sistema", clique em "Variáveis de Ambiente".
- Na seção "Variáveis do sistema", clique em "Novo".
- Nome da variável: JAVA_HOME
- Valor da variável: C:\Program Files\Java\jdk-17 (ou o caminho onde você instalou o JDK).

Adicionar JAVA_HOME ao PATH:

- Ainda na janela "Variáveis de Ambiente", localize a variável Path na seção "Variáveis do sistema" e clique em "Editar".
- Clique em "Novo" e adicione o caminho %JAVA_HOME%\bin.

#### Passo 4: Verificar a Instalação
- Abra o Prompt de Comando (CMD).
- Digite o comando java -version e pressione Enter.
- Você deve ver a versão do Java instalada. Algo semelhante a:

```
java version "17.0.x"
Java(TM) SE Runtime Environment (build 17.0.x)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.x, mixed mode, sharing)
```

### Instalação do IntelliJ IDEA

#### Passo 1: Baixar o IntelliJ IDEA
- Acesse o site oficial da JetBrains para download do IntelliJ IDEA: https://www.jetbrains.com/idea/download.
- Escolha a edição que você deseja instalar (Community Edition é gratuita e suficiente para a maioria dos projetos Java) e clique em "Download".

- #### Passo 2: Instalar o IntelliJ IDEA
- Após baixar o instalador, execute o arquivo .exe.
- Siga as instruções do assistente de instalação.
- Durante a instalação, você pode personalizar a instalação conforme necessário (por exemplo, adicionar atalhos ao menu Iniciar ou à área de trabalho, 
  associar arquivos .java ao IntelliJ IDEA, etc.).
- Conclua a instalação clicando em "Finish".

#### Passo 3: Configurar o IntelliJ IDEA
- Abra o IntelliJ IDEA pela primeira vez.
- Você pode ser solicitado a importar configurações de uma instalação anterior. Se não tiver nenhuma, escolha "Do not import settings".
- Siga as instruções para configurar temas, plugins, etc.

#### Passo 4: Verificar a Configuração do JDK
- No IntelliJ IDEA, vá para File > Project Structure (ou pressione Ctrl+Alt+Shift+S).
- Na seção Platform Settings, selecione SDKs.
- Clique no ícone de + e selecione Add JDK.
- Navegue até o diretório onde você instalou o JDK 17 (por exemplo, C:\Program Files\Java\jdk-17) e selecione-o.
- Verifique se o JDK 17 está listado corretamente.

#### Passo 5: Abrir um Projeto Java Existente
- No IntelliJ IDEA, vá para File > Open.
- Navegue até o diretório do seu projeto Java existente.
- Selecione a pasta do projeto e clique em OK.
- O IntelliJ IDEA pode detectar automaticamente a estrutura do projeto e perguntar se você deseja abrir como um projeto Maven/Gradle, 
  se aplicável. Selecione a opção apropriada.
- Se o projeto não tiver uma configuração de build (por exemplo, Maven ou Gradle), você pode precisar configurar manualmente o JDK. Vá para File > Project Structure e selecione
  o JDK 17 para o projeto.

#### Passo 6: Executar o Projeto
- Certifique-se de que todas as dependências do projeto estejam configuradas corretamente.
- Navegue até a classe principal do seu projeto (geralmente contém o método public static void main(String[] args)).
- Clique com o botão direito na classe principal e selecione Run 'NomeDaClassePrincipal'.
- O IntelliJ IDEA compilará e executará seu projeto. O console na parte inferior mostrará a saída do programa.

#### Dicas Adicionais
- Plugins: IntelliJ IDEA suporta muitos plugins que podem ajudar no desenvolvimento. Vá para File > Settings > Plugins para explorar e instalar plugins adicionais.
- Version Control: Se seu projeto estiver em um sistema de controle de versão (como Git), você pode clonar o repositório diretamente pelo IntelliJ IDEA. Vá para File > New > Project from Version Control.

