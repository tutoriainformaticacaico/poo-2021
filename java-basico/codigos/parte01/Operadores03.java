public class Operadores03 {
    public static void main(String[] args) {
        int n1 = 11;
        int n2 = 10;
        
        boolean teste = (n1 == 10 || n2 == 10); // false OU true
        System.out.println(teste); // true

        teste = (n1 == 10 && n2 == 10); // false E true
        System.out.println(teste); // false
    }
}
