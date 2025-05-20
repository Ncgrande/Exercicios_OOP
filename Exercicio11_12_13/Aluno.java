public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marcela", 21, "A2023123");
        aluno1.exibirDados();
    }
}
