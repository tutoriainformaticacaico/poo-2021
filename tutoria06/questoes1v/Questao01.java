/*
Desenvolva um programa que primeiro utilize uma função 
para gerar um vetor com tamanho definido pelo usuário 
e valores aleatórios dentro de um intervalo [min, max] 
determinado pelo usuário.

Em seguida, uma outra função deve receber o vetor gerado.
Retorne o maior e menor valores respectivamente elemento do vetor. 

Dica1: use apenas uma estrutura de repetição para achar o menor e maior elemento
*/

import java.util.Scanner;
import java.util.Random;
class Questao01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor");
        int tamanho = sc.nextInt(); // Recebendo tamanho do vetor e guardando em "tamanho"
        System.out.println("Digite um intervalo de numeros");
        System.out.println("Digite o valor minimo");
        int minimo = sc.nextInt(); // Recebendo o valor mínimo do intervalo de números aleatórios
        System.out.println("Digite o valor maximo");
        int maximo = sc.nextInt(); // Recebendo o valor máximo do intervalo de números aleatórios
        maiorMenor(gerarVetor(tamanho, minimo, maximo)); // chama o método maiorMenor() e passa o retorno de gerarVetor() como parâmetro
    }

    // Método que gera o vetor com base nos dados passado por parâmetro
    static int[] gerarVetor(int t, int min, int max) {
        Random rd = new Random();      
        int[] vetor = new int[t];
        System.out.println(" ----- Numeros sorteados -----");
        for(int i = 0; i < vetor.length; i++){            
            vetor[i] = rd.nextInt(max + 1 - min) + min; // sorteando um número aleatório de min até max
            // rd.nextInt(max) -> sortearia um número aleatório de 0 até (max - 1)
            // rd.nextInt(max + 1) -> sortearia um número aleatório de 0 até max
            // rd.nextInt(max + 1) + min -> sortearia um número aleatório de min até (max + min)
            // rd.nextInt(max + 1 - min) + min -> sorteia um número aleatório de min até max

            System.out.print(vetor[i]+" \t ");
        }
        System.out.println();
        return vetor;
    }


    // Método que descobre o maior e menor valor do vetor
    static void maiorMenor(int[] vetor){
        // inicialmente atribuindo o primeiro valor do vetor a maior e menor
        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            maior = Math.max(maior, vetor[i]); // verificando se a atual posição i do vetor é maior que o valor de "maior" 
            menor = Math.min(menor, vetor[i]); // verificando se a atual posição i do vetor é menor que o valor de "menor" 
            
            // Math.max(x, y) -> retorna o maior valor entre x ou y
            // Math.min(x, y) -> retorna o menor valor entre x ou y
      
        }

        System.out.println("O maior valor eh "+maior);
        System.out.println("O menor valor eh "+menor);
    }

}