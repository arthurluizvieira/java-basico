public class Paciente {
    double altura;
    double peso;

    double calcularIMC(){
        double imc = peso / (altura * altura);

        return imc;
    }
}
