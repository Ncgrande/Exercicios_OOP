import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha para validação: ");
        String senha = scanner.nextLine();

        if (validarSenha(senha)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida! A senha deve ter:");
            System.out.println("- Pelo menos 8 caracteres");
            System.out.println("- Pelo menos uma letra maiúscula");
            System.out.println("- Pelo menos uma letra minúscula");
            System.out.println("- Pelo menos um número");
        }

        scanner.close();
