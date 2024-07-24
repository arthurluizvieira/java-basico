public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Arthur Yokomizo", "Estagiário", 1000);

        System.out.println(funcionario.getSalario());

        funcionario.aumentoSalario(10);
        System.out.println(funcionario.getSalario());
    }
}
