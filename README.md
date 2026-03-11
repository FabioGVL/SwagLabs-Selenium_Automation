#  Escopo do Projeto
Este documento detalha a estratégia de automação de testes para a plataforma **Swag Labs**, utilizando o ecossistema Java. O foco é a validação do fluxo de autenticação através do Desenvolvimento Orientado a Comportamento (**BDD**), garantindo que as regras de negócio de login sejam respeitadas tanto em cenários de sucesso quanto em tentativas inválidas (campos vazios, dados incorretos e caracteres especiais).

##  2. TECNOLOGIAS UTILIZADAS
* **Linguagem:** Java 11
* **Framework de Automação:** [Selenium WebDriver](https://www.selenium.dev/) (v4.15.0)
* **BDD/Gherkin:** [Cucumber Java](https://cucumber.io/) (v7.14.0)
* **Runner & Assertions:** [JUnit 5](https://junit.org/junit5/)
* **Gerenciador de Dependências:** Maven
* **IDE:** VS Code (com Extension Pack for Java)

##  3. ARQUITETURA E ESTRUTURA
O projeto segue o padrão de separação de responsabilidades para garantir manutenibilidade:

* **Behavior Driven Development (BDD):** Escrita de cenários em linguagem natural (Português) utilizando arquivos `.feature`, facilitando a comunicação entre o time técnico e de negócios.
* **Data-Driven Testing (Gherkin Examples):** Implementação de uma matriz de testes no arquivo de feature, permitindo a execução de múltiplos casos de teste (sucesso, falha, borda) reutilizando os mesmos steps.
* **Cucumber Hooks:** Uso de `@Before` e `@After` para gerenciar o ciclo de vida do WebDriver, garantindo que o navegador seja aberto e fechado corretamente em cada cenário.
* **Wait Strategies:** Implementação de `Implicit Wait` para lidar com a latência de renderização de elementos web.
* **Maven Lifecycle:** Configuração do `maven-surefire-plugin` para possibilitar a execução dos testes via linha de comando e integração com ferramentas de CI/CD.



##  4. COMO EXECUTAR O PROJETO

### **Pré-requisitos**
* Java JDK 11 (Configurado no `JAVA_HOME`)
* Maven instalado
* ChromeDriver compatível com a sua versão do navegador Chrome (posicionado no caminho configurado em `System.setProperty`)
* Java JDK 11 instalado
* Configurar as variáveis de ambiente JAVA_HOME
* Visual Studio Code na versão 1.84 ou superior instalado
* Plugin do VS code Extension Pack for Java instalado
* Plugin do VS code Cucumber instalado

### **Passo a Passo**
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
