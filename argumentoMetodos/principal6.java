public class principal6 {
    public static void main(String[] args) {
        notas nota1 = new notas();

        nota1.aluno = "Arthur";

        double media = nota1.calcularNotas(10, 10, 7);

        System.out.println("A média do aluno " + nota1.aluno + " é de: " + media);
    }
}
