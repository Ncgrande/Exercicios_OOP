import java.util.Scanner; 

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

      
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble(); 

       
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0); 
     
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble(); 

        double resultado = 0; 
        
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                    scanner.close();
                    return; 
                }
                break;
            default:
                System.out.println("Operação inválida!");
                scanner.close();
                return; 
        }

    
        System.out.println("Resultado: " + resultado);

        scanner.close(); 
    }
}