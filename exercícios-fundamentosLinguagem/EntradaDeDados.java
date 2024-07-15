import java.util.Scanner;

public class EntradaDeDados {
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
    }
}