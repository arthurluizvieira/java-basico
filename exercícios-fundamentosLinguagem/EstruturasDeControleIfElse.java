import java.util.Scanner;

public class EstruturasDeControleIfElse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu peso: ");
        int peso = entrada.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("IMC de " + nome + ": " + imc);
        
        if (imc < 18.5) {
            System.out.println("Peso está abaixo do ideal!");
        } else if (imc < 25) {
            System.out.println("Peso ideal!");
        } else if (imc < 30){
            System.out.println("Está acima do peso!");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau 1 ou Grau 2"); 
        } else {
            System.out.println("Obesidade grau 3!");
        }
        System.out.println("Muito cuidado com seu peso!!!");

    }
}