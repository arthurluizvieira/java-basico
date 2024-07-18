public class Livro {
    private String nome;
    private String autor;
    private double preco = 150.00;

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }

    public double getPreco(){
        return preco;
    }
}