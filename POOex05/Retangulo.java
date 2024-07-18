package POOex05;

public class Retangulo {
    double largura;
    double altura;

    double calcularArea(){
        return largura * altura;
    }

    double calcularPerimetro(){
        return 2 * (altura + largura);
    }

    void exibirInformacoes(){
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
