
---
# Pilha (Stack)

Uma pilha é uma estrutura de dados linear que segue a filosofia LIFO (Last In, First Out), onde o último elemento inserido é o primeiro a ser removido. Ela suporta duas operações principais:

- **Push**: Adiciona um elemento ao topo da pilha.
- **Pop**: Remove o elemento mais recente adicionado à pilha.

Além dessas operações básicas, uma pilha geralmente inclui:

- **Peek (ou Top)**: Retorna o elemento no topo da pilha sem removê-lo.
- **isEmpty**: Verifica se a pilha está vazia.

### Aplicações

As pilhas são amplamente utilizadas em algoritmos de parsing (análise sintática), execução de expressões matemáticas (usando notação polonesa reversa), implementação de undo/redo em editores de texto e navegadores web (para histórico de páginas visitadas), entre outros.

### Implementação

A implementação de uma pilha pode ser feita usando arrays ou listas encadeadas. Exemplo básico usando array em Python:

```python
class Stack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[-1]

    def size(self):
        return len(self.items)
```

### Exemplo de Uso

```python
stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)
print(stack.pop())  # Saída: 3
print(stack.peek())  # Saída: 2
print(stack.size())  # Saída: 2
print(stack.isEmpty())  # Saída: False
```

### Considerações

Pilhas são úteis quando a ordem de processamento de elementos segue um padrão LIFO. É essencial considerar limitações como estouro de pilha (stack overflow) em implementações com tamanho fixo.

---
