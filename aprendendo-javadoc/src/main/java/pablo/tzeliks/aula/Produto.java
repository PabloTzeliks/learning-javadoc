package pablo.tzeliks.aula;

/**
 * Representa um Produto para Compra
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 */

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     *
     * Aplica um percentual de desconto sobre o Preço do Produto
     * @param percentual desconto a ser aplicado (0 - 100)
     * @return preço final após desconto
     * @throws IllegalArgumentException caso o parâmetro percentual for negativo ou maior que cem
     */

    public double applyDiscount(double percentual) {

        if (percentual < 0 || percentual > 100) {

            throw new IllegalArgumentException("Valor incorreto de Percentual!");
        }

        this.preco = this.preco * (percentual / 100 - 1) * (-1);

        return preco;
    }

    /**
     * Calcular Imposto sobre o Preço do Produto
     * @apiNote Esse método considera impostos federais fixos
     * @implSpec Deve ser usado apenas para cálculo estimado
     * @return valor do imposto calculado
     */
    public double taxesCalculation() {

        return this.preco * 0.25;
    }

    /**
     *
     * @deprecated Use the old taxes pattern
     */
    public double taxesOld() {

        return this.preco * 0.12;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
