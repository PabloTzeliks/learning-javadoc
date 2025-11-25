package pablo.tzeliks;

import pablo.tzeliks.aula.Produto;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Manteiga", 1000);

        p1.applyDiscount(10);

        System.out.println(p1.getPreco());
    }
}