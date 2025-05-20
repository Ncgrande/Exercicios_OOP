import java.util.Scanner;

public class ContadorPalavrasSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        if (frase.trim().isEmpty()) {
            System.out.println("Quantidade de palavras: 0");
        } else {
            String[] palavras = frase.trim().split(" ");
            System.out.println("Quantidade de palavras: " + palavras.length);
        }

        scanner.close();
    }
}
