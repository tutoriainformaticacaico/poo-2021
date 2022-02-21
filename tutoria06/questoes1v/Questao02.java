// Mesma coisa da questão01, apenas alterando o método maiorMenor() para o inverterVetor()
import java.util.Scanner;
import java.util.Random;

class Questao02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Pede os valores de: tamanho do vetor, valor mínimo e máximo sorteados
        System.out.println("Digite o tamanho do vetor");
        int tamanho = sc.nextInt();
        System.out.println("Digite um intervalo de numeros");
        System.out.println("Digite o valor minimo");
        int minimo = sc.nextInt();
        System.out.println("Digite o valor maximo");
        int maximo = sc.nextInt();
        int[] array = inverterVetor(gerarVetor(tamanho, minimo, maximo));
        
        System.out.println(" ----- Vetor invertido -----");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i]+" \t ");
        }
    }

    // Método que gera o vetor com base nos dados passado por parâmetro
    static int[] gerarVetor(int t, int min, int max) {
        Random rd = new Random();
        int[] vetor = new int[t];
        System.out.println(" ----- Vetor gerado com numeros sorteados -----");
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

    // Método para inverter as posições dos valores no vetor
    static int[] inverterVetor(int[] vetor) {
        
        for (int i = 0; i < vetor.length / 2; i++) {
            int temp = vetor[i]; // Pega o valor atual do array e guarda na variável temporariamente. Ex: i = 0, depois i = 1, depois i = 2
            vetor[i] = vetor[vetor.length - i - 1]; // guarda o valor da posição espelhada de forma descrecente no valor atual. Ex: i = 9, depois i = 8, depois i = 7
            vetor[vetor.length - i - 1] = temp; // guarda a variável temporária na posição espelhada de forma descrecente.
        }
        return vetor;
    }

}