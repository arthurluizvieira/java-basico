// escreva um programa que verifica se um número é par ou ímpar!

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
