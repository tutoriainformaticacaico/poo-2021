/*
02 - Elabore um programa contendo uma função que receba três 
notas de um aluno e uma letra como parâmetros. 
Se a letra for A, a função deverá calcular a 
média aritmética das notas do aluno; se for P, 
deverá calcular a média ponderada, com pesos 5, 3 e 2. 
A média calculada deverá ser devolvida ao programa 
principal para ser mostrada.
*/

import java.util.Scanner;
class Questao02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float nt1, nt2, nt3; // Declarando variáveis para as notas        
        System.out.println("Digite as 3 notas: "); // Imprimindo mensagem para o usuário
        nt1 = leitor.nextFloat(); // pedindo um float como entrada do teclado e atribuindo à variável nt1
        nt2 = leitor.nextFloat(); // pedindo um float como entrada do teclado e atribuindo à variável nt2
        nt3 = leitor.nextFloat(); // pedindo um float como entrada do teclado e atribuindo à variável nt3       
        System.out.println("Digite letra A para media aritmetica e P para ponderada: "); // Mensagem para o usuário
    
        char c = leitor.next().toUpperCase().charAt(0); // pegando o primeiro caracter digitado e o transformando em maiúsculo
    // variável = leitura.maiusculo.coletarCharNaPosicao(0)

        if ((nt1 >= 0 && nt2 >= 0 && nt3 >= 0) && (nt1 <= 10 && nt2 <= 10 && nt3 <= 10)) { // Condicional caso a nota seja positiva ou menor que 10
            System.out.println("A media eh: " + media(nt1, nt2, nt3, c));
        } else { 
            // se alguma nota for negativa ou maior que 10, não ocorrerá a média
            System.out.println("Alguma das notas eh negativa ou maior que 10!");
        }
        
    }

    // função chamada media que recebe QUATRO valores como parâmetro e retorna UM FLOAT
    static float media(float n1, float n2, float n3, char letra) {
        float resultado = -1; // variavel resultado declarada e inicializada com o valor -1

        // condicional para decidir qual foi o tipo de media escolhido
        if (letra == 'P') {
            resultado = (n1 * 5 + n2 * 3 + n3 * 2) / 10; // calculo da media ponderada
        } else if (letra == 'A') {
            resultado = (n1 + n2 + n3)/3; // calculo da media aritmetica
        } else {
            System.out.println("Letra nao combina! "); // Mensagem caso a letra digitada não seja nem P, nem A
        }
        
        return resultado; // retornando o resultado do tipo float
    }
}