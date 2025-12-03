import model.Guess;

import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);
        Guess guess = new Guess();
        boolean correct = false;

        for (int count = 0; count <= MAX_TRY; count++) {

            System.out.println();
            System.out.println("- Faça uma tentativa: ");
            int numberGuess = sc.nextInt();

            correct = guess.isCorrectGuess(numberGuess);

            if (correct) {

                System.out.println("\nVocê adivinhou Corretamente!\n");
                break;
            }
        }

        System.out.println("O número correto era: " + guess.getNumberToGuess());
    }
}