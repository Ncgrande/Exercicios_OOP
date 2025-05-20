import java.util.Scanner;  

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite uma frase ou palavra: ");
        String texto = scanner.nextLine(); 

        int contadorVogais = 0; 

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i); 


            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVogais++; 
            }
        }
  
        System.out.println("Número de vogais: " + contadorVogais);

        scanner.close(); 
    }
}