public class Principal3 {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.peso = 66.5;
        paciente1.altura = 1.77;

        double imcCAlculado = paciente1.calcularIMC();
        System.out.println("IMC do Paciente: " + imcCAlculado);

    }
}
