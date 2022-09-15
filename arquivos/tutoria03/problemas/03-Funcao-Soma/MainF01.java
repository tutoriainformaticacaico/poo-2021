import java.util.Scanner; // Importando o Scanner
class MainF01 { 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // Instanciando um objeto do Scanner e o chamando de leitor
        float n1, n2; // Declarando duas variáveis float chamadas de n1 e n2

        System.out.println("Digite um numero: "); // Imprime uma mensagem pedindo para digitar um número
        n1 = leitor.nextFloat(); // Usando o Scanner para ler o que foi digitado no teclado e colocar na variável n1
        
        System.out.println("Digite outro numero: "); // Imprime uma mensagem pedindo para digitar outro número
        n2 = leitor.nextFloat(); // Usando o Scanner para ler o que foi digitado no teclado e colocar na variável n2
        
        System.out.println("Os valores digitados foram " + n1 + " e " + n2); // Imprime uma mensagem dizendo qual foram os valores digitados pelo usuário
        System.out.println("A soma dos valores acima eh: " + soma(n1, n2)); // Usa a função soma para somar os valores digitados e retorna o resultado para ser imprimido
    }

    // Na próxima linha: assinatura da função soma, onde há modificador static (pois só funções estáticas podem ser chamadas dentro do main, que é estático)
    // onde há também o tipo do retorno, que é float, e o nome da função, que é "soma". Em seguida, dentro dos parênteses, há os 2 parâmetros que serão recebidos.
    public static float soma(float n1, float num2){ 
        float resultado = n1 + num2; // O resultado da soma dos valores que foram recebidos é atribuído à variável resultado
        return resultado; // Retorna o resultado. Isso significa que onde a soma for chamada será substituída por esse valor do resultado.
    }

}