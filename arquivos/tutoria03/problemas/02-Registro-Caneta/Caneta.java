import java.util.Scanner;
// Estrutura de dados (ou atributos) com várias ações (ou funções)
class Caneta { 
    // Declaração de vários atributos para a caneta
    String cor;
    String marca;
    float ponta;
    String material;

    public void lerDados() { // Assinatura da função lerDados, a qual nem recebe nem retorna nada
        Scanner leitor = new Scanner(System.in); // Instancia um objeto do tipo Scanner chamado de leitor

        System.out.println("Digite os dados da caneta"); // Imprime uma mensagem pedindo os dados da caneta
        System.out.print("Cor: "); // Imprime uma mensagem pedindo a cor
        cor = leitor.nextLine(); // Recebe um valor digitado de teclado e o atribui á variável cor

        System.out.print("Marca: "); // Imprime uma mensagem pedindo a marca
        marca = leitor.nextLine(); // Recebe um valor digitado de teclado e o atribui á variável marca

        System.out.print("Ponta: "); // Imprime uma mensagem pedindo a ponta
        ponta = leitor.nextFloat(); // Recebe um valor digitado de teclado e o atribui á variável ponta
        
        System.out.print("Material: "); // Imprime uma mensagem pedindo a material
        material = leitor.next(); // Recebe um valor digitado de teclado e o atribui á variável material

    }

    public void imprimirDados(){ // Assinatura da função imprimirDados, a qual nem recebe nem retorna nada
        // Sequência de impressões mostrando as informações da caneta
        System.out.println("Os atributos da caneta "+cor+" sao: ");
        System.out.println("Marca: "+marca);
        System.out.println("Ponta: "+ponta);
        System.out.println("Material: "+material);

    }

}