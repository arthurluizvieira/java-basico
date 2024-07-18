package POOex05;

public class Principal {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();

        retangulo1.altura = 5;
        retangulo1.largura = 3;
        
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        retangulo1.exibirInformacoes();

}}