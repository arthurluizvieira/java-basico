package POOex04;


public class ContaBancaria {
    String numeroConta;
    int saldo;

    void depositar(double valor){
        saldo += valor;
    }

    void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
        } else{
            System.out.println("Saldo Insuficiente. Tente outro valor!");
        }
    }

    void exibirSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }


}
