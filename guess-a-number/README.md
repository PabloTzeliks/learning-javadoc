# 🎲 Guess a Number

Um jogo interativo de adivinhação de números desenvolvido em Java, demonstrando o uso de documentação JavaDoc.

## 📋 Sobre o Projeto

O projeto **Guess a Number** é um jogo simples onde o usuário deve adivinhar um número gerado aleatoriamente pelo sistema. O jogo fornece dicas sobre o quão próximo o palpite está do número correto, usando uma escala de "temperatura" (frio, morno, quente, etc.).

## 🗂️ Estrutura do Projeto

```
guess-a-number/
├── src/
│   ├── Main.java
│   └── model/
│       └── Guess.java
```

## 🎮 Como o Jogo Funciona

1. O sistema gera um número aleatório entre **1** e **100**
2. O usuário tem **5 tentativas** para adivinhar o número
3. A cada tentativa, o sistema informa o quão próximo o palpite está:
   - **Está muito Frio**: diferença > 75
   - **Está Frio**: diferença > 50
   - **Está Morno**: diferença > 25
   - **Está Quente**: diferença > 15
   - **Está Muito Quente**: diferença > 5
   - **Está Pegando Fogo**: diferença < 5

## 📚 Classes Documentadas

### 🎯 Classe Main

A classe `Main` é responsável pela inicialização e interação com o usuário:

```java
/**
 * Representa a Classe de inicialização.
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-12-02
 */
public class Main {
    /**
     * Uma variável final estática que delimita o número tentativas máximas
     */
    private static final int MAX_TRY = 5;

    /**
     * Inicialização do usuário, onde há a tentativa de adivinhação do número
     */
    public static void main(String[] args) {
        // ...
    }
}
```

### 🔢 Classe Guess

A classe `Guess` abstrai a lógica de adivinhação:

```java
/**
 * Representa uma Abstração de uma <strong>Tentativa</strong>.
 * <p>Esta classe é responsável por gerar abstrair o que seria uma tentativa no sistema
 * com validações para analisar se o número adivinhado é o número a ser adivinhado.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-12-02
 */
public class Guess {
    // ...
}
```

#### Atributos:

| Atributo | Tipo | Descrição |
|----------|------|-----------|
| `numberToGuess` | `int` | Armazena o número a ser adivinhado |
| `max` | `int` | Limite máximo (100) para geração aleatória |
| `min` | `int` | Limite mínimo (1) para geração aleatória |

#### Métodos:

| Método | Descrição | Tags JavaDoc |
|--------|-----------|--------------|
| `Guess()` | Construtor que inicializa com número aleatório | Descrição, `<p>`, `<code>` |
| `getNumberToGuess()` | Retorna o número a ser adivinhado | `@return` |
| `isCorrectGuess(int)` | Valida se o palpite está correto | `@param`, `@return`, `<code>` |
| `howClose(int)` | Informa a proximidade do palpite | `@param`, `@return` |

**Exemplo de Documentação do Método `isCorrectGuess`:**

```java
/**
 * Valida se o número que o usuário inseriu é o número correto a ser adivinhado,
 * chamando ainda o quão próximo o número é do correto com o método howClose
 *
 * @param numberGuess número a ser adivinhado
 * @return <code>true</code> se for o número correto e <code>false</code> se não for.
 */
public boolean isCorrectGuess(int numberGuess) {
    howClose(numberGuess);
    return numberGuess == this.numberToGuess;
}
```

## 🏷️ Tags JavaDoc Demonstradas

| Tag | Descrição | Exemplo |
|-----|-----------|---------|
| `@author` | Especifica o autor da classe | `@author Pablo Ruan Tzeliks` |
| `@version` | Indica a versão da classe | `@version 1.0.0` |
| `@since` | Indica quando a classe foi adicionada | `@since 2025-12-02` |
| `@param` | Documenta um parâmetro do método | `@param numberGuess número a ser adivinhado` |
| `@return` | Descreve o valor de retorno | `@return <code>true</code> se for o número correto` |

### Tags HTML no JavaDoc

Este projeto também demonstra o uso de tags HTML na documentação:

| Tag HTML | Descrição | Exemplo |
|----------|-----------|---------|
| `<strong>` | Texto em negrito | `<strong>Tentativa</strong>` |
| `<p>` | Parágrafo | `<p>Esta classe é responsável por...</p>` |
| `<code>` | Código inline | `<code>min</code>`, `<code>true</code>` |

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior

### Compilar o Projeto

```bash
cd guess-a-number
javac -d out src/Main.java src/model/Guess.java
```

### Executar o Jogo

```bash
cd out
java Main
```

## 📖 Exemplo de Execução

```
- Faça uma tentativa: 
50
Está Morno

- Faça uma tentativa: 
75
Está Quente

- Faça uma tentativa: 
85
Está Pegando Fogo

- Faça uma tentativa: 
82

Você adivinhou Corretamente!

O número correto era: 82
```

## 🔧 Lógica de Proximidade

O método `howClose` calcula a diferença entre o palpite e o número correto:

```java
public void howClose(int numberGuess) {
    int difference = Math.abs(this.numberToGuess - numberGuess);
    
    if (difference > 75) {
        System.out.println("Está muito Frio");
    } else if (difference > 50) {
        System.out.println("Está Frio");
    } else if (difference > 25) {
        System.out.println("Está Morno");
    } else if (difference > 15) {
        System.out.println("Está Quente");
    } else if (difference > 5) {
        System.out.println("Está Muito Quente");
    } else if (difference < 5) {
        System.out.println("Está Pegando Fogo");
    }
}
```

## 👤 Autor

**Pablo Ruan Tzeliks**

---

*Este projeto tem fins educacionais para aprender e praticar documentação JavaDoc.*
