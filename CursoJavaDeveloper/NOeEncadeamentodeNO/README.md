
---
# No (Node) e Generics em Java

## O que é um "No" (Node)?

Imagine que você tem uma linha de bonecos de brinquedo. Cada boneco está segurando a mão do próximo boneco. Agora, pense que cada boneco é um "No" (Node).

- **No (Node)**: É como cada boneco na linha. Cada "No" sabe quem é o próximo boneco na fila.

```java
class No {
    int valor;
    No proximo;

    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
```

No exemplo acima:
- Cada `No` tem um valor (como o nome do boneco).
- Cada `No` sabe quem é o próximo boneco (próximo No).

## O que são Generics?

Agora, imagine que em vez de uma linha de bonecos, você tem uma linha de brinquedos diferentes: bonecos, carrinhos, bolas, etc.

- **Generics**: São como uma caixa mágica onde você pode colocar qualquer tipo de brinquedo, e essa caixa ainda funciona do mesmo jeito!

```java
class CaixaMagica<T> {
    T brinquedo;
    
    CaixaMagica(T brinquedo) {
        this.brinquedo = brinquedo;
    }
    
    T pegarBrinquedo() {
        return brinquedo;
    }
}
```

No exemplo acima:
- `CaixaMagica<T>` é uma caixa mágica que pode guardar qualquer tipo de brinquedo.
- `T` é como uma variável mágica que pode ser substituída por qualquer coisa, como Boneco, Carrinho, Bola, etc.

## Como usar Generics com Nos (Nodes)?

Agora, vamos combinar nossas duas ideias: a linha de bonecos e a caixa mágica.

```java
class NoGenerico<T> {
    T valor;
    NoGenerico<T> proximo;

    NoGenerico(T valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
```

No exemplo acima:
- `NoGenerico<T>` é como nosso No, mas agora ele pode segurar qualquer tipo de brinquedo!
- `T valor` pode ser um Boneco, Carrinho, Bola, ou qualquer coisa que você quiser.

### Exemplo de uma linha de Nos genéricos:

```java
NoGenerico<String> no1 = new NoGenerico<>("Boneco");
NoGenerico<String> no2 = new NoGenerico<>("Carrinho");
no1.proximo = no2;

System.out.println(no1.valor);  // Imprime: Boneco
System.out.println(no1.proximo.valor);  // Imprime: Carrinho
```

### Exemplo de uma linha de Nos genéricos com diferentes tipos de brinquedos:

```java
NoGenerico<Boneco> noBoneco = new NoGenerico<>(new Boneco());
NoGenerico<Carrinho> noCarrinho = new NoGenerico<>(new Carrinho());
noBoneco.proximo = noCarrinho;  // Isso na verdade não funcionaria porque são tipos diferentes!
```

Como resolver isso? Podemos usar o tipo mais geral:

```java
class Brinquedo { }

class Boneco extends Brinquedo { }
class Carrinho extends Brinquedo { }

NoGenerico<Brinquedo> noBoneco = new NoGenerico<>(new Boneco());
NoGenerico<Brinquedo> noCarrinho = new NoGenerico<>(new Carrinho());
noBoneco.proximo = noCarrinho;  // Isso agora funciona!
```

## Wildcards (Curingas) em Generics

Além dos tipos genéricos que já vimos, como `CaixaMagica<T>` e `NoGenerico<T>`, existem também os **wildcards** (curingas). Eles são usados quando você quer flexibilidade extra em suas classes genéricas.

### Wildcards Desconhecidos (?)

Às vezes, você não se importa com o tipo exato do brinquedo em sua caixa mágica, só quer saber se é possível pegá-lo. É aí que os **wildcards desconhecidos** entram em cena!

```java
class CaixaMagica<?> {
    Object brinquedo;
    
    CaixaMagica(Object brinquedo) {
        this.brinquedo = brinquedo;
    }
    
    Object pegarBrinquedo() {
        return brinquedo;
    }
}
```

No exemplo acima, `<?>` indica que qualquer tipo é aceitável na caixa mágica. Você não sabe o tipo exato, mas ainda pode pegar o brinquedo e usá-lo!

### Curingas Delimitados (Bounded Wildcards)

Às vezes, você quer ser um pouco mais específico sobre quais tipos de brinquedos podem ser colocados em sua caixa mágica. É aí que entram os **curingas delimitados**.

#### Upper Bounded Wildcard (Curinga Delimitado Superior)

Digamos que você só quer aceitar brinquedos que sejam "brinquedos educativos", como `BonecoEducacional` e `Quebra-CabeçaEducacional`.

```java
class CaixaMagica<? extends BrinquedoEducacional> {
    BrinquedoEducacional brinquedo;
    
    CaixaMagica(BrinquedoEducacional brinquedo) {
        this.brinquedo = brinquedo;
    }
    
    BrinquedoEducacional pegarBrinquedo() {
        return brinquedo;
    }
}
```

Aqui, `<? extends BrinquedoEducacional>` significa que qualquer tipo que seja uma subclasse de `BrinquedoEducacional` pode ser aceito na caixa mágica.

#### Lower Bounded Wildcard (Curinga Delimitado Inferior)

E se você quiser aceitar qualquer tipo de brinquedo que seja um "brinquedo divertido", incluindo `BonecoDivertido`, `BolaDivertida`, etc.?

```java
class CaixaMagica<? super BrinquedoDivertido> {
    Object brinquedo;
    
    CaixaMagica(Object brinquedo) {
        this.brinquedo = brinquedo;
    }
    
    Object pegarBrinquedo() {
        return brinquedo;
    }
}
```

Aqui, `<? super BrinquedoDivertido>` significa que qualquer tipo que seja uma superclasse de `BrinquedoDivertido` pode ser aceito na caixa mágica.

## Conclusão

Agora, você aprendeu sobre os wildcards em generics, que podem adicionar ainda mais flexibilidade às suas classes genéricas em Java!

---

Espero que isso te ajude!
