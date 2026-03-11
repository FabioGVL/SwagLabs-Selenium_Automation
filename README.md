#  Escopo do Projeto
Este documento detalha a estratégia de automação de testes para a plataforma **Swag Labs**, utilizando o ecossistema Java. O foco é a validação do fluxo de autenticação através do Desenvolvimento Orientado a Comportamento (**BDD**), garantindo que as regras de negócio de login sejam respeitadas tanto em cenários de sucesso quanto em tentativas inválidas (campos vazios, dados incorretos e caracteres especiais).

## Escopo do Teste

### 1. Mapeamento de Features:
* **Interface de Login:** Portal de entrada com validação de credenciais.
* **Gestão de Inventário:** Visualização e seleção de produtos.

### 2. Features Testadas:
* **Login Data-Driven:** Execução de múltiplos cenários de login (sucesso, falha, campos vazios) utilizando a mesma estrutura de teste via BDD.
* **Ciclo de Vida do Navegador:** Gerenciamento automático de abertura e fechamento das instâncias do ChromeDriver.

### 3. Massa de Dados para Teste:
* Utilização de tabelas de exemplos no Gherkin para injetar variadas combinações de usuário e senha diretamente nos steps.

### 4. Tipos de Testes Utilizados:
* **Testes de Funcionalidade:** Verificar se as funcionalidades de autenticação estão operando conforme as regras de negócio.
* **Testes de Usabilidade:** Avaliar a clareza das mensagens de erro e a fluidez da navegação entre a tela de login e a home.
* **Testes de Integração:** Garantir a correta interação entre o script Java/Selenium e os elementos da interface web.

## Arquitetura e estrutura
O projeto segue o padrão de separação de responsabilidades para garantir manutenibilidade:

* Escrita de cenários em Gherkin utilizando arquivos `.feature`, facilitando a comunicação entre o time técnico e de negócios.
* Implementação de uma matriz de testes no arquivo de feature, permitindo a execução de múltiplos casos de teste (sucesso e falha) reutilizando os mesmos steps.
* Uso de `@Before` e `@After` para gerenciar o ciclo de vida do WebDriver, garantindo que o navegador seja aberto e fechado corretamente em cada cenário.
* Implementação de `Implicit Wait` para lidar com a latência de renderização de elementos web.
* Configuração do `maven-surefire-plugin` para possibilitar a execução dos testes via linha de comando e integração com ferramentas de CI/CD.


## Tecnologias e ambientes utilizados para execução do projeto:
* Java 11
* [Selenium WebDriver](https://www.selenium.dev/) (v4.15.0)
* [Cucumber Java](https://cucumber.io/) (v7.14.0)
* [JUnit 5](https://junit.org/junit5/)
* Maven
* **IDE:** VS Code (com Extension Pack for Java)



## Passos para reproduzir o teste

### 1. **Pré-requisitos**
* Java JDK 11 (Configurado no `JAVA_HOME`)
* Maven instalado
* ChromeDriver compatível com a sua versão do navegador Chrome (posicionado no caminho configurado em `System.setProperty`)
* Java JDK 11 instalado
* Configurar as variáveis de ambiente JAVA_HOME
* Visual Studio Code na versão 1.84 ou superior instalado
* Plugin do VS code Extension Pack for Java instalado
* Plugin do VS code Cucumber instalado

### 1.2 **Passo a Passo**
* Clique em "code"
* Clique em "Download Zip" para baixar arquivo zipado
* Acesse a área de Downloads do seu PC
* Encontre o arquivo zipado baixado
* Descompacte/extraia a pasta do arquivo zipado
* Abra o Visual Studio Code
* Clique em arquivo/file
* Clique em abrir pasta/open folder
* Escolha a pasta do arquivo descompactado
* No Visual Studio Code, acesse a pasta src>test>runner
* Dentro da pasta runner, acesse o arquvo TestRunner.java
* Ao lado da linha 13, clique no Icone de play para executar o projeto

# Links úteis

[Download Java JDK 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html) [Download Visual Studio Code](https://code.visualstudio.com/) [Fonte dos Frameworks](https://mvnrepository.com/) [Fonte da biblioteca](https://github.com/bonigarcia/webdrivermanager)
