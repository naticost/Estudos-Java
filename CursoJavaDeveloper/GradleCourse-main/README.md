# Projeto Java com Gradle

Este projeto demonstra o uso do Gradle como ferramenta de automação de builds para um projeto Java.

## O que é Gradle?

Gradle é uma ferramenta de automação de build que se destaca pela flexibilidade e pela capacidade de gerenciar projetos de software de qualquer tamanho e complexidade. Ele é especialmente popular em projetos Java, mas suporta muitas outras linguagens e ambientes de desenvolvimento.

### Funções do Gradle

1. **Compilação de Código**: Gradle compila o código-fonte do seu projeto, seja ele escrito em Java, Kotlin, Groovy ou outras linguagens suportadas.
2. **Gestão de Dependências**: Gradle baixa e gerencia bibliotecas de terceiros necessárias para o seu projeto.
3. **Execução de Testes**: Gradle pode executar testes unitários e de integração para garantir que seu código funciona conforme esperado.
4. **Empacotamento**: Gradle pode criar arquivos JAR, WAR, ou outros tipos de pacotes.
5. **Deploy e Publicação**: Gradle pode publicar seus artefatos em repositórios locais ou remotos.
6. **Tarefas Customizadas**: Gradle permite a criação de tarefas personalizadas para realizar qualquer tipo de automação que você precise no seu projeto.

## Multi-Módulos

**Multi-Módulos** referem-se a um projeto Gradle dividido em múltiplos subprojetos ou módulos. Cada módulo pode ter seu próprio `build.gradle` e ser responsável por uma parte específica do projeto.

### Benefícios dos Multi-Módulos

- **Organização**: Melhor estrutura e organização do código.
- **Reutilização**: Módulos podem ser reutilizados em diferentes projetos.
- **Isolamento**: Facilita a manutenção, testes e implementação de funcionalidades específicas.

### Estrutura de um Projeto Multi-Módulo

- **Raiz do Projeto**: Contém o `settings.gradle` e o `build.gradle` principal.
- **Subprojetos/Módulos**: Cada subprojeto tem seu próprio diretório com um `build.gradle`.

## Conceitos Fundamentais

1. **Gradle Wrapper**: Um script que garante que todos os desenvolvedores usem a mesma versão do Gradle sem precisar instalá-lo diretamente. Arquivos principais: `gradlew`, `gradlew.bat`, `gradle/wrapper/gradle-wrapper.properties`.
2. **Repositórios**: Locais de onde Gradle baixa dependências e plugins. Exemplos: `mavenCentral()`, `jcenter()`, `ivy()`.
3. **Dependências**: Bibliotecas ou módulos necessários para compilar e rodar o projeto. Podem ser classificadas como `implementation`, `compileOnly`, `runtimeOnly`, `testImplementation`, entre outras.
4. **Plugins**: Extensões que adicionam novas funcionalidades ao Gradle. Exemplo: `apply plugin: 'java'`.
5. **Configuração vs. Execução**: Gradle possui duas fases principais: configuração (onde ele configura o projeto e suas tasks) e execução (onde ele executa as tasks selecionadas).
6. **Gradle Daemon**: Um processo em segundo plano que melhora a performance das builds armazenando em cache informações entre execuções.

## Tipos de Tarefas (Tasks) no Gradle

Gradle define diferentes tipos de tarefas para executar diversas atividades no processo de build do seu projeto:

- **Tarefas de Compilação**: Como `compileJava` para compilar código Java.
- **Tarefas de Teste**: Como `test` para executar testes unitários.
- **Tarefas de Empacotamento**: Como `jar` para criar um arquivo JAR do projeto.
- **Tarefas Customizadas**: Criadas pelo usuário para automatizar qualquer processo específico.

### Exemplo de Uso do Gradle

Aqui está um exemplo simples de um `build.gradle` para um projeto Java:

```groovy
plugins {
    id 'java'
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework:spring-core:5.3.8'
    testImplementation 'junit:junit:4.13.2'
}

task hello {
    doLast {
        println 'Hello, Gradle!'
    }
}
```

Neste exemplo:

- **plugins**: Adiciona o plugin Java, que configura o projeto para compilar código Java.
- **repositories**: Define que as dependências serão baixadas do Maven Central.
- **dependencies**: Declara as dependências do projeto.
- **task hello**: Define uma tarefa customizada que simplesmente imprime "Hello, Gradle!".

## Conclusão

Gradle é uma ferramenta poderosa para automatizar o processo de build de projetos de software, facilitando a gestão de dependências, a execução de testes, e muitas outras tarefas de desenvolvimento. Ele não é uma extensão do código do projeto, mas sim uma ferramenta externa que orquestra e automatiza o ciclo de vida do desenvolvimento de software.
