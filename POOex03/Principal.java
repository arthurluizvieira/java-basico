package POOex03;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "A saga do Java";
        livro1.autor = "Arthur Yokomizo";
        livro1.preco = 19.99;
        livro1.exibirDetalhes();
    }
}
