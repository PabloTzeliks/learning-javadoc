# Learning JavaDoc

A simple Java project demonstrating the practical use of JavaDoc documentation.

## About the Project

This project showcases how to use JavaDoc to document Java code effectively. It includes a simple e-commerce example with `Produto` (Product) and `Carrinho` (Shopping Cart) classes that demonstrate various JavaDoc annotations and best practices.

## Code Examples

### Produto (Product) Class

The `Produto` class represents a product for purchase and demonstrates several JavaDoc features:

```java
/**
 * Representa um Produto para Compra
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 */
public class Produto {
    // ...
}
```

### Carrinho (Shopping Cart) Class

The `Carrinho` class shows how to reference other classes and methods in documentation:

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

## JavaDoc Notations

This project demonstrates the following JavaDoc tags:

| Tag | Description | Example |
|-----|-------------|---------|
| `@author` | Specifies the author of the class | `@author Pablo Ruan Tzeliks` |
| `@version` | Indicates the version of the class | `@version 1.0.0` |
| `@param` | Documents a method parameter | `@param percentual desconto a ser aplicado (0 - 100)` |
| `@return` | Describes the return value | `@return preço final após desconto` |
| `@throws` | Documents exceptions that may be thrown | `@throws IllegalArgumentException caso o parâmetro percentual for negativo ou maior que cem` |
| `@see` | Creates a reference to another class or method | `@see Produto#applyDiscount(double)` |
| `@deprecated` | Marks a method as deprecated | `@deprecated Use the old taxes pattern` |
| `@apiNote` | Adds API usage notes | `@apiNote Esse método considera impostos federais fixos` |
| `@implSpec` | Describes implementation specifications | `@implSpec Deve ser usado apenas para cálculo estimado` |

## Generating JavaDoc

To generate the JavaDoc documentation, run:

```bash
mvn javadoc:javadoc
```

The generated documentation will be available in `target/site/apidocs/`.

## Author

**Pablo Ruan Tzeliks**

---

*This project is intended for educational purposes to learn and practice JavaDoc documentation.*
