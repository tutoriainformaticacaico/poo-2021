/*
Questão 2:
2- Elabore um programa que leia duas matrizes inteira, A e B, 3 x 3, de REAIS. 
Calcule a multiplicação (armazene em uma matriz C) e a soma (armazene em uma matriz D) 
entre essas matrizes, em seguida, efetue a impressão de todas as matrizes. 

*/

import java.util.Scanner; // Importação do scanner

class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Instanciando o scanner 
        // Definindo o número de linhas e colunas
        int linhas = 3, cols = 3; 
        // Criando as matrizes com base no número de linhas e colunas definidas para as matrizes
        double [][] matrizA = new double[linhas][cols];
        double [][] matrizB = new double[linhas][cols];
        double [][] matrizC = new double[linhas][cols];
        double [][] matrizD = new double[linhas][cols];
        
        // Pedindo valores da matriz usando duplo for
        System.out.println("Matriz A: ");
        for (int linha = 0; linha < matrizA.length; linha++){
            System.out.println("Linha "+ linha +": ");              
            for (int col = 0; col < matrizA[linha].length; col++){
                matrizA[linha][col] = sc.nextDouble();
            }
        }

        // Pedindo valores da matriz B
        System.out.println("Matriz B: ");
        for (int linha = 0; linha < matrizB.length; linha++){
            System.out.println("Linha "+ linha +": ");      
            for (int col = 0; col < matrizB[linha].length; col++){
                matrizB[linha][col] = sc.nextDouble(); // Recebendo os valores
            }
        }

        // Multiplicando
        // System.out.println("Multiplicando");
        for (int linhaA = 0; linhaA < matrizA.length; linhaA++){ // For para percorrer as linhas da matriz A
            for (int colB = 0; colB < matrizB[linhaA].length; colB++){ // For para percorrer as colunas da matriz B
                for (int linha = 0; linha < matrizC[linhaA].length; linha++){ // For para percorrer os índices das matrizes (coluna de A e linhas de B)

                    //Imprimindo como é feita a resolução do cálculo de multiplicação
                    // System.out.print(" + " + matrizA[linhaA][linha] + " * " + matrizB[linha][colB]);
                    
                    matrizC[linhaA][colB] += matrizA[linhaA][linha] * matrizB[linha][colB];
                }
                // System.out.print("   ");
            }
            System.out.println();
        }

        // Somando
        for (int linha = 0; linha < matrizD.length; linha++){
            for (int col = 0; col < matrizD[linha].length; col++){
                // Somando os valores com índices iguais e coloca no índice da mesma numeração
                matrizD[linha][col] = matrizA[linha][col] + matrizB[linha][col]; 
            }
        }
        
        // MOSTRANDO OS RESULTADOS:
        System.out.println("MATRIZ A: ");
        for (int linha = 0; linha < matrizA.length; linha++){
            for (int col = 0; col < matrizA[linha].length; col++){
                System.out.print(matrizA[linha][col] + " ");
            }
            System.out.println();
        }

        System.out.println("MATRIZ B: ");
        for (int linha = 0; linha < matrizB.length; linha++){
            for (int col = 0; col < matrizB[linha].length; col++){
                System.out.print(matrizB[linha][col] + " ");
            }
            System.out.println();
        }

        System.out.println("MATRIZ C (MULTIPLICAÇÃO): ");
        for (int linha = 0; linha < matrizC.length; linha++){
            for (int col = 0; col < matrizC[linha].length; col++){
                System.out.print(matrizC[linha][col] + " ");
            }
            System.out.println();
        }

        System.out.println("MATRIZ D (SOMA): ");
        for (int linha = 0; linha < matrizD.length; linha++){
            for (int col = 0; col < matrizD[linha].length; col++){
                System.out.print(matrizD[linha][col] + " ");
            }
            System.out.println();
        }

    }
}