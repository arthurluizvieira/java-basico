
import java.util.Scanner;

public class condicionais {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        byte idade = scanner.nextByte();

        if (idade >= 18){
            System.out.println("Você é maior de idade!");
        }   else if (idade > 13){
            System.out.println("Você é adolescente!");
        }   else{
            System.out.println("Você é criança!");
        }
    }
}
