# Projeto concessionária PWII - Professor Leonardo Lazarini

# Stack do projeto:
  - Spring MVC
  - H2 Database
  - Java 11
  - Gradle
  
  # Inicializando o projeto:
    - Faça download do repositório
    - Dentro da pasta do repositório, execute o comando: gradle bootRun
      - Caso não tenha o Gradle instalado: https://gradle.org/install/
    - Acesso o endereço http://localhost:8080/
    
  # Acessando o banco de dados e consultando os dados registrados:
    - Acesse o endereço: http://localhost:8080/h2
    - Clique em "connect"
    - À esquerda encontram-se as entidades do sistema, para consultar os dados:
      - Clique em uma das entidades e a query de consulta será preenchida automáticamente
        - Clique em run para executar a query