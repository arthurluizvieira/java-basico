public class PrincipalContaBancaria2 {
    public static void main(String[] args) {
        ContaBancaria2 conta = new ContaBancaria2("Arthur", "123");

        conta.depositar(1000);
        System.out.println(conta.getSaldo());
        conta.sacar(999);
        System.out.println(conta.getSaldo());


    }

    
}

