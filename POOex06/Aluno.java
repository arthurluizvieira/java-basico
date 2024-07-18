package POOex06;

public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2; 
    double nota3;

    double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;

    }

    void exibirAprovacao(){
        if (calcularMedia() >= 7){
            System.out.println("Aluno Aprovado com " + calcularMedia());
        } else{
            System.out.println("Aluno Reprovado com " + calcularMedia());
        }
    }
}
