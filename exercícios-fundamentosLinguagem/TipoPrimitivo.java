// double = números reais , números com casas decimais
// boolean = não verdadeiro ou verdadeiro
// char = armazena caracteres 
// int = cabe no máximo 2bi
// long = cabe mais de 2bi (L no final pop. mundial pra representar que é do tipo long)
// float =  ufixo f ou F: É importante notar que literalmente números de ponto flutuante em Java são do tipo double por padrão. 
// Para indicar que um literal numérico é do tipo float, você deve anexar o sufixo f ou F ao valor numérico, como mostrado no exemplo acima (3500.75f).

public class TipoPrimitivo {
    public static void main(String[] args) {
        double precoProduto = 9.43;
        
        boolean alunoMatriculado = true;
        boolean clienteBloqueado = false; 

        char turmaAluno1 = 'A';
        char tipoCliente = '2';
        char simbolo = '@';

        long populacaoUberlandia = 650000;    
        System.out.println(populacaoUberlandia);
    
        long populacaoMundial = 7000000000L;
        System.out.println(populacaoMundial);

        float  saldoConta = 1030.43f;
        System.out.println(saldoConta);
    }
}
