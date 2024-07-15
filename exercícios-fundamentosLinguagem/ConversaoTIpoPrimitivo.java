// public class ConversaoTIpoPrimitivo {
//     public static void main(String[] args) {
//         long x = 9300000035L;

//         // casting
//         int y = (int)x;
//         System.out.println(y);
//     }
// }

// public class ConversaoTIpoPrimitivo {
//     public static void main(String[] args) {
//         int y = 102344;

//         long x = y;
//         System.out.println(x);
//     }
// }

public class ConversaoTIpoPrimitivo {
    public static void main(String[] args) {
        double largura = 100.37;
        
        int tamanho = (int) largura;
        System.out.println(tamanho); // vai truncar os números decimais pois haverá imprecisão!
    }
}