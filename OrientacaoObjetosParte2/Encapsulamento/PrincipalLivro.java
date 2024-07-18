public class PrincipalLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.setNome("As relíquias de Java and Python!");
        livro1.setAutor("dev th");
        livro1.getPreco();
        System.out.println(livro1.getAutor());
        System.out.println(livro1.getNome());
        System.out.println(livro1.getPreco());
    }
}
