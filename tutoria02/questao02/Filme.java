import java.util.Scanner; // Importação do Scanner
class Filme { // Assinatura da classe
    // Declaração dos atributos  
    String nome;
    String autor;
    int ano;
    float preco;
    // Instância do Scanner, chamado de leitor
    Scanner leitor = new Scanner(System.in);

    public void lerDados(){ // Assinatura da função lerDados, a qual não retorna nada
        System.out.println("Digite os dados do filme: "); // Imprime uma mensagem pedindo para inserir os dados
        System.out.print("Nome: "); // Pede o nome
        nome = leitor.nextLine(); // Recebe um valor digitado do teclado e atribui o valor ao nome
        
        System.out.print("Autor: "); // Pede o autor
        autor = leitor.nextLine(); // Recebe um valor digitado do teclado e atribui o valor ao autor

        System.out.print("Ano: "); // Pede o ano
        ano = leitor.nextInt(); // Recebe um valor digitado do teclado e atribui o valor ao ano 

        System.out.print("Preco: "); // Pede o preço 
        preco = leitor.nextFloat(); // Recebe um valor digitado do teclado e atribui o valor ao preco

    }

    public void mostrarDados() { // Assinatura da função mostrarDados, a qual não retorna nada
        // Série de impressões dos dados do filme
        System.out.println("---------- Dados do filme ----------")
        System.out.println("O nome do filme é "+nome);
        System.out.println("O autor do filme é "+autor);
        System.out.println("O ano de lançamento do filme é "+ano);
        System.out.println("O preco do filme é R$ "+preco);
    }

}