import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char primeiraLetra = teclado.next().charAt(0);
        char segundaLetra = "Gato gordo".charAt(1);

        switch (primeiraLetra) { 
            case 'a':
                System.out.println("Letra A de \"Amo Cuscuz\"");
                break;
            case 'b':
                System.out.println("Letra B de \"Bora comer cuscuz?\"");                
                break;
            case 'c':
                System.out.println("Letra C de \"Comi Cuscuz\"");                
                break;                    
            default:
                System.out.println("Ueh, o caractere nao eh: A, B ou C");
                break;
        }
    }
}
