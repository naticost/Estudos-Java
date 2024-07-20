# Curso Springboot - Aula: Projeto Springboot

### 1. Introdução ao Spring Framework e Springboot

#### Spring Framework
- Baseado no padrão de injeção de dependências.

#### Springboot
- Foca na configuração automática, facilitando o processo de setup de novos projetos.

### 2. Desafios Antes do Springboot
- Dependência individual
- Verbosidade
- Incompatibilidade de versões
- Complexidade de gestão
- Configurações complexas e repetitivas

### 3. Springboot

#### Configurações Manuais
- Simplificação das configurações iniciais do projeto com definições já prontas.

### 4. Starters

#### Benefícios dos Starters
- Coesão
- Versões compatíveis
- Otimização do tempo
- Configuração simples
- Foco no negócio

#### Principais Starters
- `spring-boot-starter-data-jpa`: Integração ao banco de dados via JPA - Hibernate.
- `spring-boot-starter-data-mongodb`: Interação com banco de dados MongoDB.
- `spring-boot-starter-web`: Inclusão do container Tomcat para aplicações REST.
- `spring-boot-starter-web-services`: Webservices baseados na arquitetura SOAP.
- `spring-boot-starter-batch`: Implementação de JOBs de processos.
- `spring-boot-starter-test`: Recursos para testes unitários como JUnit.
- `spring-boot-starter-openfeign`: Client HTTP baseado em interfaces.
- `spring-boot-starter-actuator`: Gerenciamento e monitoramento da aplicação.

### 5. Primeiros Passos com Springboot

#### Criando um Projeto
- Utilização do Spring Initializr para criar um projeto.
- Importação do projeto Maven no IntelliJ.
- Conhecendo a estrutura do Spring Boot.
- Utilização de Bean e CommandLineRunner.

### 6. Beans x Components

#### Quando usar @Bean?
#### Quando usar @Component?
- Implementação de IoC (Inversão de Controle) e DI (Injeção de Dependências).

### 7. Singleton ou Prototype

#### Conceito de Scope
- Configurando objeto Singleton.
- Configurando objetos Prototype.

### 8. Properties Value

#### O poderoso application.properties
- Utilização da anotação @Value.
- Definição de valores padrão.

### 9. Configuration Properties

#### O poderoso application.properties
- Utilização da anotação @ConfigurationProperties com prefixo.

### 10. Conceito de ORM e JPA

#### ORM (Object-Relational Mapping)
- Mapeamento objeto-relacional para aproximar o paradigma de orientação a objetos ao contexto de banco de dados relacional.

  ![Texto Alternativo](https://github.com/naticost/Estudos-Java/blob/main/CursoJavaDeveloper/SpringBoot/img/Curso%20Springboot%20-%20Aula%20-%20Projeto%20Springboot.pptx%20(1).png)


#### JPA (Java Persistence API)
- Especificação baseada em interfaces para persistência de objetos em Java.

![Texto Alternativo]( https://github.com/naticost/Estudos-Java/blob/main/CursoJavaDeveloper/SpringBoot/img/Curso%20Springboot%20-%20Aula%20-%20Projeto%20Springboot.pptx.png
)
#### Mapeamento
- Anotações de mapeamento do JPA:
  - Identificação
  - Definição
  - Relacionamento
  - Herança
  - Persistência

#### EntityManager
- Gerenciamento de entidades e suas operações no contexto do JPA.
