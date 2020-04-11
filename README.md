# Projeto concessionária PWII - Professor Leonardo Lazarini

### Stack do projeto:
  - Spring MVC
  - H2 Database
  - Java 11
  - Gradle
  
  ### Inicializando o projeto:
    1. Faça download do repositório
    2. Dentro da pasta do repositório, execute o comando: gradle bootRun
      2.1 Caso não tenha o Gradle instalado: https://gradle.org/install/
    3. Acesse o endereço http://localhost:8080/
    
  ### Acessando o banco de dados e consultando os dados registrados:
    1. Acesse o endereço: http://localhost:8080/h2
    2. Clique em "connect"
    3. À esquerda encontram-se as entidades do sistema, para consultar os dados:
      3.1 Clique em uma das entidades e a query de consulta será preenchida automáticamente
        3.2 Clique em run para executar a query
