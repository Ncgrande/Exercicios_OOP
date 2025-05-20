public class Main {
    public static void main(String[] args) {
        // Exibe os números pares de 1 a 20
        System.out.println("Números pares de 1 a 20:");
        
        // Loop para percorrer de 1 a 20
        for (int i = 1; i <= 20; i++) {
            // Verifica se o número é par
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}