public class Operadores02 {
    public static void main(String[] args) {
        int n = 10;
        n++; // n = n +1 -----> n = 11
        boolean teste = (n == 11);
        System.out.println(teste); // true
        n *= 2; // n = n * 2 -----> n = 22
        teste = (n != 22); 
        System.out.println(teste); // false
    }
}
