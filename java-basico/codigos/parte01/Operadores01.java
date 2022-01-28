import java.util.Scanner;
public class Operadores01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // atribuindo valores de duas notas
        int nota1 = sc.nextInt(); // 91  
        int nota2 = sc.nextInt(); // 100
        // calculando a média
        int mediaInt = (nota1 + nota2)/2; // resultado inteiro
        float mediaDec = (nota1 + nota2)/2f; // resultado decimal
        System.out.println(mediaInt); // 95
        System.out.println(mediaDec); // 95.5
    }
}