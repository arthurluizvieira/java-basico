package POOex04;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = "12345";
        conta1.depositar(1500);
        conta1.sacar(1000);
        conta1.exibirSaldo();
    }
}
