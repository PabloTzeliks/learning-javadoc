# 📦 Aprendendo JavaDoc

Um projeto Java simples que demonstra o uso prático da documentação JavaDoc através de classes de exemplo simulando um sistema de e-commerce.

## 📋 Sobre o Projeto

Este projeto foi desenvolvido para aprender e praticar as principais anotações e funcionalidades do JavaDoc. Ele inclui classes que representam um **Produto** e um **Carrinho de Compras**, demonstrando como documentar código Java de forma eficiente e profissional.

## 🗂️ Estrutura do Projeto

```
aprendendo-javadoc/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── pablo/
                └── tzeliks/
                    ├── Main.java
                    └── aula/
                        ├── Carrinho.java
                        └── Produto.java
```

## 📚 Classes Documentadas

### 🛒 Classe Produto

A classe `Produto` representa um produto para compra e demonstra várias funcionalidades do JavaDoc:

```java
/**
 * Representa um Produto para Compra
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 */
public class Produto {
    private String nome;
    private double preco;
    // ...
}
```

#### Métodos Documentados:

| Método | Descrição | Tags JavaDoc |
|--------|-----------|--------------|
| `applyDiscount(double percentual)` | Aplica um percentual de desconto sobre o preço | `@param`, `@return`, `@throws` |
| `taxesCalculation()` | Calcula imposto sobre o preço | `@apiNote`, `@implSpec`, `@return` |
| `taxesOld()` | Método legado de cálculo de impostos | `@deprecated` |

**Exemplo de Documentação do Método `applyDiscount`:**

```java
/**
 * Aplica um percentual de desconto sobre o Preço do Produto
 * @param percentual desconto a ser aplicado (0 - 100)
 * @return preço final após desconto
 * @throws IllegalArgumentException caso o parâmetro percentual for negativo ou maior que cem
 */
public double applyDiscount(double percentual) {
    // implementação
}
```

### 🛒 Classe Carrinho

A classe `Carrinho` representa um carrinho de compras e demonstra o uso da tag `@see`:

```java
/**
 * Calcula o total com base no produto e quantidade
 * @param produto produto a ser adicionado
 * @param quantidade quantidade do produto
 * @return valor total da compra
 * @see Produto#applyDiscount(double)
 */
public double calcularTotal(Produto produto, int quantidade) {
    return produto.applyDiscount(0) * quantidade;
}
```

## 🏷️ Tags JavaDoc Demonstradas

| Tag | Descrição | Exemplo |
|-----|-----------|---------|
| `@author` | Especifica o autor da classe | `@author Pablo Ruan Tzeliks` |
| `@version` | Indica a versão da classe | `@version 1.0.0` |
| `@param` | Documenta um parâmetro do método | `@param percentual desconto a ser aplicado (0 - 100)` |
| `@return` | Descreve o valor de retorno | `@return preço final após desconto` |
| `@throws` | Documenta exceções que podem ser lançadas | `@throws IllegalArgumentException caso o parâmetro percentual for negativo ou maior que cem` |
| `@see` | Cria uma referência para outra classe ou método | `@see Produto#applyDiscount(double)` |
| `@deprecated` | Marca um método como obsoleto | `@deprecated Use the old taxes pattern` |
| `@apiNote` | Adiciona notas sobre o uso da API | `@apiNote Esse método considera impostos federais fixos` |
| `@implSpec` | Descreve especificações de implementação | `@implSpec Deve ser usado apenas para cálculo estimado` |

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior
- Maven 3.6 ou superior

### Compilar o Projeto

```bash
cd aprendendo-javadoc
mvn compile
```

### Executar a Aplicação

```bash
mvn exec:java -Dexec.mainClass="pablo.tzeliks.Main"
```

### Gerar Documentação JavaDoc

```bash
mvn javadoc:javadoc
```

A documentação gerada estará disponível em `target/site/apidocs/`.

## 📖 Exemplo de Uso

```java
import pablo.tzeliks.aula.Produto;
import pablo.tzeliks.aula.Carrinho;

public class Main {
    public static void main(String[] args) {
        // Criar um produto
        Produto p1 = new Produto("Manteiga", 1000);
        
        // Aplicar desconto de 10%
        p1.applyDiscount(10);
        
        // Verificar preço após desconto
        System.out.println(p1.getPreco()); // 900.0
        
        // Calcular total no carrinho
        Carrinho carrinho = new Carrinho();
        double total = carrinho.calcularTotal(p1, 2);
        System.out.println("Total: " + total);
    }
}
```

## 👤 Autor

**Pablo Ruan Tzeliks**

---

*Este projeto tem fins educacionais para aprender e praticar documentação JavaDoc.*
