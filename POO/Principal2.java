// Composição de Objetos
// Composição de Objetos
// Composição de Objetos

public class Principal2 {
    
    public static void main(String[] args) {
        ex01();

   
    }
    public static void ex01(){
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        
        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "Joao da Silva";
        meuCarro.dono.bairro = "Centro";
        
    }

    public static void ex02(){
        Proprietario dono1   = new Proprietario();
        dono1.nome = "João da Silva";
        dono1.cpf = "406.817.980-87";
        dono1.idade = 20;
        dono1.logradouro = "Rua João Pinheiro, 10";
        dono1.bairro = "Uberlandia";
    
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "prata";
        meuCarro.fabricante = "honda";
        meuCarro.modelo = "civic";
        meuCarro.dono = dono1;
    
    }

    public static void ex03(){
        Proprietario dono1 = new Proprietario();
        dono1.nome = "João da Silva";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Palio";

        meuCarro.dono = dono1; // >> aponta para dono1 como proprietario do carro
    
    
    }




}



  


 