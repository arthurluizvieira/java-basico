public class ContaBancaria2 {
    private String nome;
    private String numero;
    private double saldo;

    ContaBancaria2(String nome, String numero) {
    
        this.nome = nome;
    
        this.numero = numero;
    
        this.saldo = 0.00;
    }


    public String getNome(){
        return nome;
    }


    public void setNome(String novoNome){
        nome = novoNome;
    }

    public String getNumero(){
        return numero;
    }


    public void setNumero(String novoNumero){
        this.numero = novoNumero;
    }


    public double getSaldo(){
        return saldo;
    }


    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        } else{
            System.out.println("Não é possível depositar zero ou menos!");
        }
    }


    public void sacar(double valor){
        if (valor <= saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}