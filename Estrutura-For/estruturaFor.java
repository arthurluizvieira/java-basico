import java.util.Scanner;

public class estruturaFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ultimo numero: ");
		int numeroFinal = entrada.nextInt();
		
		// for (iniciacao; condicao; incremento)
		for (int i = 1; i <= numeroFinal; i += 1) { // ou i++
			System.out.println(i);
		}
		
		
		
	}


}