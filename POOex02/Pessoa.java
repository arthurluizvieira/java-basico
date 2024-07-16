package POOex02;

public class Pessoa {
        String nome;
        byte idade;
        double altura;

        void exibir_informacoes(){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
        }

        public static void main(String[] args) {
            Pessoa pessoa1 = new Pessoa();
            pessoa1.nome = "Arthur";
            pessoa1.idade = 18;
            pessoa1.altura = 1.77;
            pessoa1.exibir_informacoes();
        }


}
