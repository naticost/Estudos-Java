# Sistema de Gerenciamento de Biblioteca

Este é um sistema simples de gerenciamento de biblioteca desenvolvido em Java, com uma interface gráfica de usuário (GUI) utilizando a biblioteca Swing.

## Índice

1. [Equipe de Desenvolvimento](#equipe-de-desenvolvimento)
2. [Propriedades para Criar uma Interface Gráfica](#propriedades-para-criar-uma-interface-gráfica)
3. [Guia de Criação de Interface Gráfica com Java no NetBeans](#guia-de-criação-de-interface-gráfica-com-java-no-netbeans)
    - [Requisitos](#requisitos)
    - [Passo a Passo](#passo-a-passo)
4. [Configurando e Programando em Java no Visual Studio Code](#configurando-e-programando-em-java-no-visual-studio-code)
    - [Requisitos](#requisitos-1)
    - [Passo a Passo](#passo-a-passo-1)
5. [Estrutura do Projeto](#estrutura-do-projeto)
6. [Referências de Estudo para Desenvolvimento](#referências-de-estudo-para-desenvolvimento)

## Equipe de Desenvolvimento

- **Adila Zairaa** (https://github.com/adizairaa)
- **Natiele Costa** (https://github.com/naticost)
- **Yan Fernandes** (https://github.com/yancfgomes)

## Propriedades para Criar uma Interface Gráfica

- **JFrame:** Janela principal da aplicação que serve como contêiner de nível superior para outros componentes GUI. Todos os componentes e contêineres são adicionados dentro de um JFrame.
  
- **JPanel:** Um contêiner genérico usado para agrupar outros componentes. Pode ser utilizado para organizar layouts complexos dividindo a janela principal em várias seções.

- **JLabel:** Componente para exibir texto ou imagens. Utilizado frequentemente para rótulos de campos de entrada, instruções, ou qualquer tipo de texto informativo.

- **JTextField:** Campo de texto de linha única para entrada de dados pelo usuário. Comum em formulários para entradas de dados como nomes, emails, etc.

- **JButton:** Botão que pode ser clicado pelo usuário para acionar eventos e executar ações. Pode ser personalizado com texto ou ícones.

- **ActionListener:** Interface que deve ser implementada para lidar com eventos de ação, como cliques em botões. Define o método `actionPerformed(ActionEvent e)` onde a lógica de resposta ao evento é escrita.

- **Layout Manager:** Interfaces que definem o layout para organizar componentes dentro de contêineres. Exemplos incluem:
  - **BorderLayout:** Divide o contêiner em cinco regiões: norte, sul, leste, oeste e centro.
  - **FlowLayout:** Organiza os componentes na ordem em que são adicionados, em uma linha.
  - **GridLayout:** Organiza os componentes em uma grade com células de tamanho igual.
  - **BoxLayout:** Organiza os componentes em uma única linha ou coluna.

- **JTable:** Componente para exibir e editar dados tabulares. É altamente configurável e é comumente utilizado para mostrar listas de dados como registros de empréstimos, livros e usuários.

- **JRadioButton:** Botões de opção que permitem ao usuário selecionar uma única opção de um grupo. Usado frequentemente em formulários para seleções exclusivas como gênero, sim/não, etc.

- **JComboBox:** Caixa de combinação que permite ao usuário selecionar uma opção de uma lista suspensa. Utilizado para selecionar entre várias opções pré-definidas, como estados, categorias, etc.

## Guia de Criação de Interface Gráfica com Java no NetBeans

### Requisitos

- NetBeans IDE
- JDK instalado

### Passo a Passo

1. **Criar Projeto:** `File > New Project > Java Application`
2. **Criar JFrame:** `New > JFrame Form`
3. **Adicionar Componentes:** Arrastar componentes no editor de design.
4. **Configurar Propriedades:** Alterar propriedades na janela `Properties`.
5. **Adicionar Eventos:** `Events > Action > actionPerformed`.
6. **Executar Projeto:** `File > Save All` e `Run`.
7. **Distribuir Projeto:** `Run > Clean and Build Project` para gerar o JAR.

## Configurando e Programando em Java no Visual Studio Code

### Requisitos

- Visual Studio Code
- JDK instalado

### Passo a Passo

1. **Instalar JDK:** Baixar e adicionar ao `PATH`.
2. **Instalar VS Code:** Baixar e instalar.
3. **Instalar Extensões:** `Extension Pack for Java`.
4. **Configurar Projeto:**
   - Estrutura de pastas:
     ```
     MeuProjeto/
     ├── src/
     │   └── App.java
     └── .vscode/
         └── launch.json
     ```
   - Escrever código em `App.java`.
   - Configurar `launch.json` para compilação e execução.
5. **Compilar e Executar:** `javac App.java` e `java App` no terminal integrado ou pelo ícone de "play".
6. **Depuração:** Adicionar breakpoints e iniciar depuração com `F5`.

## Estrutura do Projeto

```
scr/
├── enums/
│   ├── Sexo.java
│   ├── UF.java
│
├── exceptions/
│   └── RegistroNaoEncontradoException.java
│
├── gui/
│   ├── CadastrarLivros.form
│   ├── CadastrarLivros.java
│   ├── CadastrarUsuario.form
│   ├── CadastrarUsuario.java
│   ├── Devolucao.form
│   ├── Devolucao.java
│   ├── Emprestimo.form
│   ├── Emprestimo.java
│   ├── GerenciarLivros.form
│   ├── GerenciarLivros.java
│   ├── GerenciarUsuarios.form
│   ├── GerenciarUsuarios.java
│   ├── NovoEmprestimo.form
│   ├── NovoEmprestimo.java
│   ├── Sobre.form
│   ├── Sobre.java
│   ├── TelaPrincipal.form
│   └── TelaPrincipal.java
│
├── main/
│   └── BiblioTK.java
│
└── models/
    ├── Database.java
    ├── Emprestimo.java
    ├── GeradorID.java
    ├── Helper.java
    ├── Livro.java
    └── Usuario.java
```

## Referências de Estudo para Desenvolvimento

- [Vídeo tutorial no YouTube](https://youtu.be/oRnFvPX5f8A?si=pZSt3ALyRmINSIDq)
- [Dicas básicas de interface gráfica do usuário com o NetBeans na DIO](https://www.dio.me/articles/dicas-basicas-interface-grafica-do-usuario-com-o-netbeans)
- [Como criar interface gráfica com Swing no Java pela Alura](https://www.alura.com.br/artigos/como-criar-interface-grafica-swing-java)