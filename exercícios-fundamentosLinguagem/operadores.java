public class operadores {
    public static void main(String[] args) {
        funcao1();        
    }

    public static void funcao1(){
       // Operações matemáticas
        int soma = 2 + 10;
        int subtracao = 6 - 10;
        int multiplicacao = 5 * 3;
        int divisao = 5 / 2; // Resultado será 2, pois é divisão de inteiros
        int resto = 3 % 2;   // Resultado será 1, pois é o resto da divisão de 3 por 2

        // Saída das operações matemáticas
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto); 

    }

    public static void funcao2(){
        // Cálculo do total das notas
        int nota1 = 77;
        int nota2 = 90;
        int nota3 = 85;
        int total_notas = nota1 + nota2 + nota3;

        // Saída do total das notas
        System.out.println("Total das notas: " + total_notas);

        int media_notas = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é de : " + media_notas);
    }
}

