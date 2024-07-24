
public class ContaBancaria3 {
    private String nome;
    private String conta;
    private double saldo;

    ContaBancaria3(String nome, String conta, double saldo){
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public String getConta(){
        return conta;
    }

    public void setConta(String conta){
        this.conta = conta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        } else{
            System.out.println("O depósito deve ser um valor maior que zero.");
        }
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        } else{
            System.out.println("Você deve ter um saldo suficiente para sacar.");
        }
    }

}
