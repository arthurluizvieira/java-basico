public class ContaBancaria {
    private String nome;
    private String conta;
    private int saldo;

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
    

    public int getSaldo(){
        return saldo;
    }


    public void depositar(int valor){
        this.saldo = saldo += valor;
    }

    public void sacar(int valor){
        if (valor < saldo){
            this.saldo = saldo -= valor;
        } else{
            System.out.println("Quantia insuficiente!");
        }
    }



}
