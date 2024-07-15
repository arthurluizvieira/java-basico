package POOex01;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2012;

        carro1.exibirDetalhes();
    }
}
