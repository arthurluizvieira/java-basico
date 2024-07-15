// calcular área de um círculo

import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        int r = scanner.nextInt();

        double area = Math.PI * (r * r);

        System.out.println("A área do círculo é: " + area);
    }
}
