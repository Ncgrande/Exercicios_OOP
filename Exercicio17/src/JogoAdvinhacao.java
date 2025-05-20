import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Random rand = new Random();

        try (Scanner entrada = new Scanner(System.in)) {
            int numeroSecreto = rand.nextInt(100) + 1;
            int palpite = 0;

            while (palpite != numeroSecreto) {
                System.out.print("Adivinhe o número (1 a 100): ");
                palpite = entrada.nextInt();

                if (palpite < numeroSecreto) {
                    System.out.println("Maior!");
                } else if (palpite > numeroSecreto) {
                    System.out.println("Menor!");
                } else {
                    System.out.println("Acertou!");
                }
            }
        }
    }
}
