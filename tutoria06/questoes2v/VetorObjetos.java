import java.util.Scanner;

public class VetorObjetos {
    public static void main(String[] args) {
        Produto[] pdts = new Produto[4]; // vetor (lista) de objetos de 4

        Scanner sc = new Scanner(System.in);
        // laço de repetição para pedir os valores dos atributos dos produtos
        for (int i = 0; i < pdts.length; i++) {
            pdts[i] = new Produto(); // instanciando um Produto para os produtos em cada uma das posições
            pdts[i].nome = sc.nextLine();
            pdts[i].marca = sc.next();
            pdts[i].quantidade = sc.nextInt();
            pdts[i].preco = sc.nextDouble();

        }

        // laço de repetição para mostrar os valores dos atributos dos produtos
        for (int i = 0; i < pdts.length; i++) {
            System.out.println("Produto " + (i + 1) + ": ");
            System.out.print(pdts[i].nome + " ");
            System.out.println();
            System.out.print(pdts[i].marca + " ");
            System.out.println();
            System.out.print(pdts[i].quantidade + " ");
            System.out.println();
            System.out.print(pdts[i].preco + " ");
            System.out.println(" ------------------ ");
        }

    }
}
