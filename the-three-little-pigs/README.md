# 🐷 The Three Little Pigs

Uma abstração em Java da clássica história dos Três Porquinhos, demonstrando conceitos de Programação Orientada a Objetos (POO) e documentação JavaDoc.

## 📋 Sobre o Projeto

Este projeto implementa uma simulação da história dos **Três Porquinhos**, onde cada porquinho constrói uma casa de material diferente (palha, madeira ou tijolos) e deve resistir ao sopro do **Lobo Mau**. O projeto demonstra o uso de:

- **Interfaces** para definir contratos
- **Enums** para representar materiais
- **Herança e Polimorfismo**
- **Documentação JavaDoc completa**

## 🗂️ Estrutura do Projeto

```
the-three-little-pigs/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── pablo/
        │       └── tzeliks/
        │           ├── Main.java
        │           └── model/
        │               ├── entity/
        │               │   ├── LittePig.java
        │               │   └── TheBigBadWolf.java
        │               └── house/
        │                   ├── IHouse.java
        │                   ├── Material.java
        │                   ├── StrawHouse.java
        │                   ├── WoodenHouse.java
        │                   └── BrickHouse.java
        └── resources/
            └── javadoc/
```

## 📚 Classes e Interfaces Documentadas

### 🐺 Classe TheBigBadWolf (Lobo Mau)

Representa a entidade do Lobo Mau com força de sopro aleatória:

```java
/**
 * Representa a entidade do <strong>Lobo Mau</strong>.
 * <p>Esta classe é responsável por gerar uma força de sopro aleatória e interagir
 * com objetos que implementam a interface {@link IHouse} para testar sua resistência.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 */
public class TheBigBadWolf {
    private int blowForce;       // Força do sopro (0-10)
    private final int max = 10;   // Limite máximo
    private final int min = 0;    // Limite mínimo
    // ...
}
```

#### Métodos:

| Método | Descrição | Tags JavaDoc |
|--------|-----------|--------------|
| `TheBigBadWolf()` | Construtor que inicializa força aleatória | `<p>`, `<code>` |
| `blow(IHouse)` | Sopra contra uma casa | `@param`, `@return`, `{@link}` |
| `getBlowforce()` | Retorna a força do sopro | `@return` |

### 🐷 Classe LittePig (Porquinho)

Representa a entidade do Porquinho que constrói casas:

```java
/**
 * Representa a entidade do <strong>Porquinho</strong>.
 * <p>Esta classe é responsável por construir casas e fugir do {@link TheBigBadWolf},
 * com objetos que implementam a interface {@link IHouse} para construirem e se esconderem nas mesmas.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 */
public class LittePig {
    private String name;
    // ...
}
```

#### Métodos:

| Método | Descrição | Tags JavaDoc |
|--------|-----------|--------------|
| `buildHouse(IHouse)` | Constrói uma casa | `@param`, `@return`, `{@link}` |
| `runAway(LittePig)` | Foge do lobo | `@deprecated`, `@param` |
| `getName()` | Retorna o nome do porquinho | `@return` |

### 🏠 Interface IHouse

Define o contrato para os diferentes tipos de casa:

```java
/**
 * Interface responsável por definir o contrato para os diferentes tipos de <strong>Casa</strong>.
 * <p>Define os comportamentos de resistência e verificação de estado estrutural.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 */
public interface IHouse {
    String getMaterial();
    int getResistencia();
    boolean resisteAoSopro(int forcaDoSopro);
    String statusAtual();
}
```

#### Métodos da Interface:

| Método | Descrição | Tags JavaDoc |
|--------|-----------|--------------|
| `getMaterial()` | Obtém descrição do material | `@return` |
| `getResistencia()` | Obtém valor de resistência | `@return` |
| `resisteAoSopro(int)` | Calcula se resiste ao sopro | `@param`, `@return`, `<strong>` |
| `statusAtual()` | Verifica estado da estrutura | `@return` |

### 🧱 Enum Material

Define os materiais disponíveis para construção:

```java
/**
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * <p><em>Interface</em> responsável por ditar métodos necessários para <strong>Classificar</strong> uma <strong>Casa</strong></p>
 * @since 2025-11-25
 */
public enum Material {
    STRAW("Straw", 2),    // Palha - baixa resistência
    WOOD("Wood", 4),      // Madeira - resistência média
    BRICK("Brick", 12);   // Tijolo - alta resistência
    // ...
}
```

### 🏡 Implementações de Casa

#### StrawHouse (Casa de Palha)

```java
/**
 * Representa uma casa construída de <strong>Palha</strong>.
 * <p>Esta implementação possui baixa resistência estrutural baseada no material {@link Material#STRAW}.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 * @see IHouse
 */
public class StrawHouse implements IHouse {
    // Resistência: 2
}
```

#### WoodenHouse (Casa de Madeira)

```java
/**
 * Representa uma casa construída de <strong>Madeira</strong>.
 * <p>Esta implementação possui resistência mediana baseada no material {@link Material#WOOD}.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 * @see IHouse
 */
public class WoodenHouse implements IHouse {
    // Resistência: 4
}
```

#### BrickHouse (Casa de Tijolos)

```java
/**
 * Representa uma casa construída de <strong>Tijolos</strong>.
 * <p>Esta implementação possui alta resistência estrutural baseada no material {@link Material#BRICK}.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 * @see IHouse
 */
public class BrickHouse implements IHouse {
    // Resistência: 12
}
```

## 🏷️ Tags JavaDoc Demonstradas

| Tag | Descrição | Exemplo |
|-----|-----------|---------|
| `@author` | Especifica o autor | `@author Pablo Ruan Tzeliks` |
| `@version` | Indica a versão | `@version 1.0.0` |
| `@since` | Indica quando foi adicionado | `@since 2025-11-25` |
| `@param` | Documenta parâmetro | `@param house A instância da Casa` |
| `@return` | Descreve retorno | `@return <code>true</code> se a casa resistir` |
| `@see` | Referência a outra classe | `@see IHouse` |
| `@deprecated` | Marca como obsoleto | `@deprecated` |
| `{@link}` | Link inline para classe/método | `{@link TheBigBadWolf}` |
| `{@inheritDoc}` | Herda documentação do método pai | `{@inheritDoc}` |

### Tags HTML no JavaDoc

| Tag HTML | Descrição | Exemplo |
|----------|-----------|---------|
| `<strong>` | Texto em negrito | `<strong>Lobo Mau</strong>` |
| `<p>` | Parágrafo | `<p>Esta classe é responsável...</p>` |
| `<code>` | Código inline | `<code>true</code>` |
| `<em>` | Texto em itálico | `<em>Interface</em>` |

## 🎯 Lógica do Jogo

### Tabela de Resistência

| Material | Resistência | Sobrevive ao Sopro (0-10)? |
|----------|-------------|---------------------------|
| Palha (Straw) | 2 | Só se sopro ≤ 2 |
| Madeira (Wood) | 4 | Só se sopro ≤ 4 |
| Tijolo (Brick) | 12 | Sempre (sopro máx = 10) |

### Fluxo de Verificação

```
Lobo gera força aleatória (0-10)
    ↓
Lobo sopra na casa (blow)
    ↓
Casa verifica resistência (resisteAoSopro)
    ↓
Se força > resistência → Casa destruída
Se força ≤ resistência → Casa permanece de pé
```

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior
- Maven 3.6 ou superior

### Compilar o Projeto

```bash
cd the-three-little-pigs
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

A documentação gerada estará disponível em `target/site/apidocs/` ou em `src/main/resources/javadoc/`.

## 📖 Exemplo de Uso

```java
import pablo.tzeliks.model.entity.*;
import pablo.tzeliks.model.house.*;

public class Main {
    public static void main(String[] args) {
        // Criar os três porquinhos
        LittePig pig1 = new LittePig("Prático");
        LittePig pig2 = new LittePig("Heitor");
        LittePig pig3 = new LittePig("Cícero");
        
        // Construir as casas
        IHouse strawHouse = pig1.buildHouse(new StrawHouse(true));
        IHouse woodenHouse = pig2.buildHouse(new WoodenHouse(true));
        IHouse brickHouse = pig3.buildHouse(new BrickHouse(true));
        
        // O Lobo Mau aparece!
        TheBigBadWolf wolf = new TheBigBadWolf();
        System.out.println("Força do sopro: " + wolf.getBlowforce());
        
        // Testar resistência das casas
        System.out.println("Casa de Palha: " + (wolf.blow(strawHouse) ? "Resistiu!" : "Destruída!"));
        System.out.println("Casa de Madeira: " + (wolf.blow(woodenHouse) ? "Resistiu!" : "Destruída!"));
        System.out.println("Casa de Tijolos: " + (wolf.blow(brickHouse) ? "Resistiu!" : "Destruída!"));
    }
}
```

## 👤 Autor

**Pablo Ruan Tzeliks**

---

*Este projeto tem fins educacionais para aprender e praticar documentação JavaDoc e conceitos de POO em Java.*
