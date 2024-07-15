package POOex03;

public class Livro {
    String titulo;
    String autor;
    double preco;

    void exibirDetalhes(){
        System.out.println("Título do Livro: " + titulo);
        System.out.println("Autor do Livro: " + autor);
        System.out.println("Preço do Livro: R$" + preco);
    }
}
