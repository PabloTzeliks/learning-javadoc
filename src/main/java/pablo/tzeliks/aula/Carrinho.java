package pablo.tzeliks.aula;

public class Carrinho {

    /**
     * Calcula o total com base no produto e quantidade
     * @param produto produto a ser adicionado
     * @param quantidade quantidade do produto
     * @return valor total da compra
     * @see Produto#applyDiscount(double)
     * */

    public double calcularTotal(Produto produto, int quantidade) {

        return produto.applyDiscount(0) * quantidade;
    }
}
