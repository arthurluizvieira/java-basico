public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.depositar(1500);
        conta1.sacar(1000);
        conta1.sacar(1500);
        System.out.println(conta1.getSaldo());
    }
    
}
