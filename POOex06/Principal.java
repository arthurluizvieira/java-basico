package POOex06;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Arthur";
        aluno1.nota1 = 5;
        aluno1.nota2 = 6;
        aluno1.nota3 = 7;
        aluno1.calcularMedia();
        aluno1.exibirAprovacao();
    }
}
