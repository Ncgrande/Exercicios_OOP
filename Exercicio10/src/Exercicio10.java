import java.util.Arrays; 

public class Exercicio10 {
    public static void main(String[] args) {
        int[] numeros = {42, 7, 13, 29, 3, 18, 90};

        System.out.println("Array original:");
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println("\nArray em ordem crescente:");
        System.out.println(Arrays.toString(numeros));
    }
}