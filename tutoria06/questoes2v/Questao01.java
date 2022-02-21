/*
Desenvolva um programa que primeiro utilize uma função 
para gerar um vetor com tamanho definido pelo usuário 
e valores aleatórios dentro de um intervalo [min, max] 
determinado pelo usuário.

Em seguida, uma outra função deve receber o vetor gerado.
Retorne o maior e menor valores respectivamente do vetor. 

Dica1: use apenas uma estrutura de repetição para achar o menor e maior elemento
*/
import java.util.Scanner;
import java.util.Random;
public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        int tamVetor = sc.nextInt(); // Recebendo tamanho do vetor e guardando em "tamVetor"
        System.out.println("Digite um intervalo de numeros");
        System.out.println("Digite o valor minimo");
        int valorMin = sc.nextInt(); // Recebendo o valor mínimo do intervalo de números aleatórios
        System.out.println("Digite o valor maximo");
        int valorMax = sc.nextInt(); // Recebendo o valor máximo do intervalo de números aleatórios
        maiorMenor(gerarVetor(tamVetor, valorMin, valorMax)); // chama o método maiorMenor() e passa o retorno de gerarVetor() como parâmetro
        
    }
    
    // Método que gera o vetor com base nos dados passado por parâmetro
    static int[] gerarVetor(int tam, int min, int max){
        int [] vetor = new int[tam]; // lista, vetor ou array
        // vetor tamanho 10
        // contagem de 0 a 9
        // i[0] => primeiro int do vetor
        // i[9] => último int do vetor
        Random rd = new Random();
        for (int i = 0; i < vetor.length; i++) {
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
    static void maiorMenor(int vet[]){
        // inicialmente atribuindo o primeiro valor do vetor a maior e menor
        int maior = vet[0];
        int menor = vet[0];

        for (int i = 0; i < vet.length; i++) {
            maior = Math.max(maior, vet[i]); // verificando se a atual posição i do vetor é maior que o valor de "maior" 
            menor = Math.min(menor, vet[i]); // verificando se a atual posição i do vetor é menor que o valor de "menor" 
            
            // Math.max(x, y) -> retorna o maior valor entre x ou y
            // Math.min(x, y) -> retorna o menor valor entre x ou y
            
        }

        System.out.println("O valor maior eh "+maior);
        System.out.println("O valor menor eh "+menor);

    }
}
