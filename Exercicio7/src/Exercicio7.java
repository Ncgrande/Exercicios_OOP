public class Exercicio7 {
    public static void main(String[] args) {

        int[] numeros = {12, 45, 7, 89, 23, 90, 34};


        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número no array é: " + maior);
    }
}