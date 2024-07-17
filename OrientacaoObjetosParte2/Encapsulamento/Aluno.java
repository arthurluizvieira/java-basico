// public class Aluno {
//     String nome;
//     String matricula;
//     int nota1;
//     int nota2; 
//     int nota3;

//     double calcularMedia(){
//         int media = (nota1 + nota2 + nota3) / 3;
//         return media;
//     }

//     void  verificar(){
//         if (media > 7){
//             System.out.println("Aluno " + nome + " passou com média " + media);
//         }
//     }
// }


public class Aluno {
    private String nome;
    private String matricula;
    private int nota1;
    private int nota2; 
    private int nota3;

    public Aluno(String nome, String matricula, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        double media = (nota1 + nota2 + nota3) / 3.0; // Usar 3.0 para garantir a divisão decimal
        return media;
    }

    public void verificar() {
        double media = calcularMedia(); // Calcular a média usando o método calcularMedia()
        
        if (media >= 7.0) { // Verificar se a média é maior ou igual a 7.0
            System.out.println("Aluno " + nome + " passou com media " + media);
        } else {
            System.out.println("Aluno " + nome + " não passou com media " + media);
        }
    }
}
