
public class TesteContaBancaria3 {
    public static void main(String[] args) {
        ContaBancaria3 conta1 = new ContaBancaria3("arthur", "12345", 1000);

        System.out.println(conta1.getNome());
        System.out.println(conta1.getConta());
        System.out.println(conta1.getSaldo());
        conta1.setNome("Arthur Luiz Vieira Yokomizo");
        conta1.setConta("000");
        conta1.depositar(2000);
        conta1.sacar(500);
        System.out.println("------------");
        System.out.println("Informações Atualizadas");
        System.out.println(conta1.getNome());
        System.out.println(conta1.getConta());
        System.out.println(conta1.getSaldo());

    }
}
