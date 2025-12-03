package model;

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

    /**
     * Armazena como atributo o número a ser adivinhdo.
     */
    private int numberToGuess;

    /**
     * Limite máximo para a geração aleatória do número a ser adivinhado.
     */
    private final int max = 100;

    /**
     * Limite mínimo para a geração aleatória do número a ser adivinhado.
     */
    private final int min = 1;

    /**
     * Construtor padrão.
     * <p>Inicializa a Adivinhação calculando automaticamente um número aleatório
     * entre os valores definidos de <code>min</code> (0) e <code>max</code> (100).</p>
     */
    public Guess() {
        this.numberToGuess = (int) (Math.random() * (max - min + 1)) + min;
    }

    /**
     * Obtém o número a ser adivinhado.
     *
     * @return Um número inteiro representando o número a ser adivinhado.
     */
    public int getNumberToGuess() {
        return this.numberToGuess;
    }

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

    /**
     * Traz ao usuário um retorno de quão perto o número de input está do número a ser adivinhado
     * Calculo é feito com uma diferença entre o Número a ser adivinhado e o input
     * Depois garante que esse número seja positivo
     * E cria as condicionais com intervalos de > 75, 50, 25, 15, 5 e por ultimo menor que 5 a diferença
     *
     * @param numberGuess número a ser adivinhado
     * @return o quão perto o número a ser adivinhado está do número inserido
     */
    public void howClose(int numberGuess) {

        int difference = this.numberToGuess - numberGuess;

        if (difference < 0) {

            difference = difference * -1;
        }

        if (difference > max) {

            difference = max;
        }

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
}
