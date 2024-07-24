public class Funcionario1 {
    private String nome;
    private String cargo;
    private double salario;

    Funcionario1(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setterNome(String nome){
        this.nome = nome;
    }

    public String getCargo(){
        return cargo;
    }

    public void setterCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentarSalario(int porcentagem){
        double aumento = (porcentagem / 100) * salario;
        this.salario = this.salario + aumento;
    }


}

