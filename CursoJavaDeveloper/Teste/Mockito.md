# Mockito: Visão Geral e Conceitos

## O que é Mockito?

Mockito é um framework Java popular que permite testes unitários eficazes criando objetos simulados (mocks). Esses mocks simulam o comportamento de objetos reais de maneira controlada durante os testes.

## Conceitos Principais

### Mocks

Mocks são objetos simulados que imitam o comportamento de objetos reais de maneira controlada. Eles ajudam a isolar o código em teste substituindo dependências por respostas previsíveis.

### Framework de Mocking

Mockito fornece um framework de mocking que simplifica a criação, verificação e stubbing (configuração de respostas) de mocks. Isso permite que os desenvolvedores se concentrem em testar o comportamento da unidade em teste sem envolver setups complexos de dependências.

### Mock Objects vs. Stubs

- **Mock Objects:** Mocks são gerados dinamicamente durante a execução e são configurados para se comportarem conforme especificado. Eles permitem que os desenvolvedores verifiquem interações e comportamentos entre a unidade em teste e suas dependências.

- **Stubs:** Stubs fornecem respostas pré-definidas para chamadas de métodos. Ao contrário de mocks, stubs não verificam interações entre a unidade em teste e suas dependências; eles apenas fornecem respostas predefinidas.

### Ciclo de Vida do Mocking

1. **Criação:** Mocks são criados usando a API do Mockito, geralmente na fase de configuração dos testes unitários.
   
2. **Configuração:** Os desenvolvedores configuram o comportamento do mock, especificando valores de retorno para chamadas de métodos e definindo expectativas sobre interações.

3. **Verificação:** Mockito permite que os desenvolvedores verifiquem quais métodos específicos foram chamados em objetos mocks com argumentos esperados, garantindo interações corretas.

### Benefícios

- **Simplificação dos Testes:** Mockito simplifica os testes unitários permitindo que os desenvolvedores isolem componentes e testem comportamentos de forma independente.
  
- **Testes Legíveis:** Testes usando Mockito geralmente são mais legíveis e fáceis de manter devido à clara separação de responsabilidades e assertivas focadas.

### Exemplo de Uso

```java
// Exemplo demonstrando o uso do Mockito
import static org.mockito.Mockito.*;

// Criar um objeto mock
List<String> mockList = mock(List.class);

// Definir o comportamento do mock
when(mockList.get(0)).thenReturn("Mockito");

// Usar o objeto mock
System.out.println(mockList.get(0)); // Imprime "Mockito"

// Verificar interações
verify(mockList).get(0);
