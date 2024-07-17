public class TesteJavaBean {
    public static void main(String[] args) {
        PessoaBean pessoa = new PessoaBean();
        
        pessoa.setNome("Luiz");
        pessoa.setIdade((18));

        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
    }
}
