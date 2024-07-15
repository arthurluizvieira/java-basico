// public class Principal {
    
//     // Instanciando Objetos
//     public static void main(String[] args) { 
//         Carro meuCarro; // declaramos a variável
//         meuCarro = new Carro(); // Instanciamos a variável com um objeto do tipo Carro
//         Carro seuCarro = new Carro();

//     }
// }


public class Principal {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		Carro seuCarro = new Carro();
        

        // Acessando atributos de objetos 
        
        meuCarro.anoDeFabricacao = 2006;
        meuCarro.modelo = "Palio Weekend";
        meuCarro.fabricante = "Fiat";
        meuCarro.cor = "Vermelho";

        seuCarro.anoDeFabricacao = 2009;
        seuCarro.modelo = "Honda Civic";
        seuCarro.fabricante = "Honda";
        seuCarro.cor = "prateado";

        System.out.println("------------------");


        System.out.println("Meu Carro");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoDeFabricacao);
        System.out.println("Fabricante: " + meuCarro.fabricante);
        System.out.println("Cor: " + meuCarro.cor);

        System.out.println("------------------");

        System.out.println("Seu Carro");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoDeFabricacao);
        System.out.println("Fabricante: " + seuCarro.fabricante);
        System.out.println("Cor: " + seuCarro.cor);

	}
	
}