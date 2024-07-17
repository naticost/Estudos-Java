---

# Guia do Spring Framework

## O que é Spring Framework

O Spring Framework é um poderoso framework de desenvolvimento de aplicações Java. Ele fornece infraestrutura abrangente para o desenvolvimento de aplicações Java robustas, escaláveis e seguras. O Spring oferece suporte para várias funcionalidades, incluindo:

- **Inversão de Controle (IoC)**: Gerenciamento de dependências de objetos.
- **Programação Orientada a Aspectos (AOP)**: Suporte para separar a lógica transversal do código principal.
- **Acesso a dados**: Integração com bancos de dados e frameworks ORM como Hibernate e JPA.
- **Suporte a transações**: Gerenciamento simplificado de transações.
- **MVC (Model-View-Controller)**: Desenvolvimento de aplicações web.

## Spring Versus Java EE

| Aspecto                  | Spring                                | Java EE                             |
|--------------------------|---------------------------------------|-------------------------------------|
| **Complexidade**         | Leve, modular, fácil de configurar    | Mais pesado, pode ser mais complexo |
| **Configuração**         | Baseada em anotações e XML            | Geralmente baseada em XML           |
| **Flexibilidade**        | Altamente flexível                    | Mais rígido e padronizado           |
| **Ecossistema**          | Grande comunidade, muitos projetos    | Suporte oficial, padrão da indústria|
| **Desempenho**           | Alto desempenho, menor overhead       | Pode ter overhead maior             |

## Conceito de Inversão de Controle

Inversão de Controle (IoC) é um princípio de design que inverte o fluxo de controle de um programa. Em vez do próprio código da aplicação instanciar seus componentes e gerenciar suas dependências, um contêiner IoC é responsável por fazer isso. No Spring, esse contêiner é o **Spring IoC Container**.

## Injeção de Dependências

Injeção de Dependências (DI) é um padrão de design usado para implementar IoC, onde o contêiner IoC injeta as dependências de um objeto em vez de o próprio objeto gerenciá-las. Isso promove uma arquitetura mais flexível e testável.


## Beans \ Autowired \ Scopes

### Beans
Um **Bean** é um objeto que é instanciado, montado e gerenciado pelo contêiner Spring IoC. Os Beans são definidos em um arquivo de configuração XML ou anotados com **@Component**.

### Autowired
A anotação **@Autowired** é usada para permitir a injeção automática de dependências. O Spring resolve e injeta os Beans colaborativos em um Bean.

### Scopes
O escopo de um Bean define seu ciclo de vida. Alguns dos escopos mais comuns são:

- **Singleton**: Um único Bean por contêiner Spring (padrão).
- **Prototype**: Um novo Bean é criado a cada solicitação.
- **Request**: Um Bean por solicitação HTTP (somente para aplicações web).
- **Session**: Um Bean por sessão HTTP (somente para aplicações web).

## Projeto Spring Boot

**Spring Boot** é um projeto da Spring que simplifica o processo de criação de aplicações Spring. Ele oferece uma configuração padrão para a maioria dos projetos e permite que os desenvolvedores comecem rapidamente com uma aplicação Spring sem a necessidade de muita configuração manual.

### Principais Características do Spring Boot:

- **Autoconfiguração**: Configura automaticamente os componentes do Spring.
- **Inicializadores**: Ferramentas que ajudam a inicializar novos projetos rapidamente.
- **Servidor Embutido**: Capacidade de rodar servidores como Tomcat ou Jetty embutidos.
- **Actuator**: Fornece endpoints para monitoramento e gerenciamento da aplicação.

### Exemplo de Projeto Spring Boot

**pom.xml**:
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

**Application.java**:
```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

**Controller.java**:
```java
@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
```

---
