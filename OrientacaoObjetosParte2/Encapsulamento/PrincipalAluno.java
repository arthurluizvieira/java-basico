// public class PrincipalAluno {
//     public static void main(String[] args) {
//         Aluno aluno1 = new Aluno();

//         aluno1.nome = "Afonso";
//         aluno1.matricula = "12345";
//         aluno1.nota1 = 7;
//         aluno1.nota2 = 6;
//         aluno1.nota3 = 8;
//         aluno1.calcularMedia();
//         aluno1.verificar();
//     }
// }


public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Afonso", "12345", 7, 6, 8);

        // Utilizando getters para acessar informações do aluno
        System.out.println("Nome do Aluno: " + aluno1.getNome());
        System.out.println("Matricula do Aluno: " + aluno1.getMatricula());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        
        // Chamando os métodos encapsulados
        aluno1.calcularMedia();
        aluno1.verificar();
        
        // Exemplo de modificação utilizando setters
        aluno1.setNota1(6);
        aluno1.setNota2(5);
        aluno1.setNota3(7);
        
        aluno1.calcularMedia();
        aluno1.verificar();
    }
}
