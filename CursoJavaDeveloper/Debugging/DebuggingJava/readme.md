
Erros de programação são conhecidos como bugs, e o processo de localizar e corrigir esses erros é chamado de depuração ou debugging.

Depurar código é uma tarefa muitas vezes difícil e trabalhosa. A complexidade dessa tarefa pode variar de acordo com o ambiente de desenvolvimento, que inclui a linguagem de programação e as ferramentas disponíveis, como depuradores.

Existem duas grandes categorias de erros:

**Erros de Sintaxe**:
São erros nas regras estabelecidas da linguagem:
- Parênteses, chaves ou colchetes que abrem, mas não fecham.
- Duas instruções sem um ponto-e-vírgula entre elas.
- Uma palavra-chave sendo usada numa posição inesperada.

**Erros de Semântica**:
São erros na "lógica do código", ou seja, o código está sintaticamente correto, mas não faz o que se espera dele.
- Tentar dividir um número por uma String ou por zero.
- Atribuir um valor incoerente a um tipo de dado.
- Tentar fechar um arquivo que não foi aberto.

### Depuração/Debugging

Linguagens de alto nível facilitam a depuração, pois oferecem mais ferramentas para identificar erros, como o tratamento de exceções.

Os depuradores funcionam assumindo o controle do tempo de execução de um programa e permitindo que você o observe e controle. Eles mostram a pilha do programa e permitem que você a atravesse em qualquer direção. Quando você está em um depurador, obtém uma visão mais completa de um quadro de pilha do que ao observar rastreamentos de pilha em uma mensagem de log.

### Pilha de Execução de um Programa Java/Stack Trace

**Pilha de Execução**:
Toda invocação de método é empilhada em uma estrutura de dados que isola a área de memória de cada um. Quando um método termina (retorna), ele volta para o método que o invocou.

**Stack Trace**:
É a matriz onde encontramos a pilha de execução da exceção. Em outras palavras, é o rastreamento da pilha que busca a próxima linha onde a exceção pode surgir.

### Depuração em Java

No Java, a depuração é um processo vital para garantir que os programas funcionem corretamente. Aqui estão algumas ferramentas e práticas comuns para depuração em Java:

1. **IDE com Depurador Integrado**: A maioria dos ambientes de desenvolvimento integrados (IDEs), como Eclipse, IntelliJ IDEA e NetBeans, possuem depuradores robustos que permitem definir pontos de interrupção (breakpoints), inspecionar variáveis e percorrer o código linha por linha.

2. **Pontos de Interrupção (Breakpoints)**: Ao definir breakpoints, você pode interromper a execução do programa em pontos específicos para inspecionar o estado do programa, valores de variáveis e fluxo de controle.

3. **Console de Depuração**: As IDEs oferecem um console de depuração onde você pode avaliar expressões, executar comandos e obter informações detalhadas sobre o estado atual do programa.

4. **Tratamento de Exceções**: Utilizar blocos try-catch para capturar e lidar com exceções ajuda a identificar e isolar problemas em seu código.

5. **Log de Mensagens**: Incluir declarações de log em seu código pode ajudar a rastrear a execução do programa e identificar onde os problemas ocorrem. Bibliotecas como Log4j e SLF4J são comumente usadas para este propósito.

6. **Ferramentas de Análise de Código**: Ferramentas como SonarQube podem analisar seu código em busca de potenciais erros, problemas de estilo e vulnerabilidades de segurança, ajudando a prevenir bugs antes que eles ocorram.

7. **JVM Options**: Utilizar opções de JVM, como `-Xdebug` e `-Xrunjdwp`, permite configurar a JVM para suportar depuração remota, o que é útil para depurar aplicações em ambientes de produção ou servidores remotos.

