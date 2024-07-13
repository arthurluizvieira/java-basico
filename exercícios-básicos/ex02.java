
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;
        System.out.println("A soma dos números é: " + soma);

    }
}
