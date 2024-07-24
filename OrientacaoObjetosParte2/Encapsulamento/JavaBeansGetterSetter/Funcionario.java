public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalario(){
        return this.salario;
    }

    // public double aumentoSalario(int porcentagem) {
    //     double aumento = (porcentagem / 100.0) * this.salario; // Ensure correct division
    //     this.salario = this.salario + aumento;
    //     return this.salario;
    // }

    public void aumentoSalario(int porcentagem) {
        double aumento = (porcentagem / 100.0) * this.salario; // Ensure correct division
        this.salario = this.salario + aumento;
        
    }

    
}