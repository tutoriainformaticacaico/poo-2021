/*
Questão:
3 - Faça uma função que leia um número não determinado 
de valores positivos e retorne a média aritmética dos mesmos
*/

import java.util.Scanner;
class Questao03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // Instanciando o Scanner com nome de "leitor"
        float v1, v2, v3, v4; // Declarando 4 variáveis do tipo float chamadas de: v1, v2, v3, v4
        System.out.println("Digite os valores: "); // Imprimindo uma mensagem para digitar os valores
        // Pegando entrada do teclado 4 vezes e atribuindo os valores às 4 variáveis declaradas
        v1 = leitor.nextFloat();
        v2 = leitor.nextFloat();
        v3 = leitor.nextFloat();
        v4 = leitor.nextFloat();
        
        // Chamando a função fazerMedia e passando como parâmetro os 4 valores já criado e inicializados anteriormente
        System.out.println("A media dos valores eh: " + fazerMedia(v1, v2, v3, v4));
        
    }

    public static float fazerMedia(float valor1, float v2, float valor3, float v4) {        
        float media = (valor1 + v2 + valor3 + v4)/4; // Calculando a média dos 4 valores recebidos como parâmetro e atribuindo à variável media
        return media; // Retornando o resultado da media
        // Ao retorna um valor, esse valor é substituído pela chamada da função
    }
}
