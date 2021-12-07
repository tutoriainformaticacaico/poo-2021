/*
01 - Faça um programa que leia um número positivo e maior que zero, 
calcule e mostre (usando uma função para cada item):
a) O número digitado ao quadrado
b) O número digitado ao cubo
c) A raiz quadrada do número digitado
d) A raiz cúbica do número digitado
*/

import java.util.Scanner;
class Questao01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double num = leitor.nextDouble(); // pedindo um número como entrada do teclado e atribuindo à variável num
        System.out.println("O quadrado de " + num + " eh " + quadradoNum(num));
        System.out.println("O cubo de " + num + " eh " + cuboNum(num));
        System.out.println("A raiz quadrada de " + num + " eh " + raizQuadrada(num));
        System.out.println("A raiz cubica de " + num + " eh " + raizCubica(num));
    }

    // ----- Funções -----
    // Abaixo, quatro funções estáticas que retornam UM DOUBLE e recebem UM DOUBLE
    static double quadradoNum(double num){
        return Math.pow(num, 2); // Calcula a potência de num elevado a 2 e retorna 
    }
    
    static double cuboNum(double num){
        return Math.pow(num, 3); // Calcula a potência de num elevado a 3 e retorna
    }
    
    static double raizQuadrada(double num){
        return Math.sqrt(num); // Calcula a raiz quadrada de num e retorna
    }
    
    static double raizCubica(double num){
        return Math.cbrt(num); // Calcula a raiz cubica de num e retorna
    }
    // OBS: Math é uma classe que já vem com o java com varias funções disponíveis 
    // que facilitam o uso da calculos matematicos
}