/*
1- Dada uma matriz 5 x 5, elabore um programa que escreva: 	

a) A diagonal principal 	
b) O triângulo superior à diagonal principal 	
c) O triângulo inferior à diagonal principal	
d) Tudo, exceto a diagonal principal


NOTA: Como a questão não especificou muita coisa, 
decidi escrever um X onde fosse pedido para ser identificado (diagonais ou triângulos)

*/
class Questao01 {
    public static void main(String[] args) {
        //criação da matriz 5 x 5 
        int [][] matriz = new int[5][5];
        System.out.println("Matriz 5 x 5: ");
        //Percorre toda a matriz
        System.out.println("     Colunas");
        for (int linha = 0; linha < matriz.length; linha++){ //Percorre a lista externa
            System.out.print(linha + " || ");
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){ //Percorre a lista interna
                System.out.print(coluna + " "); 
                // Considerando as linhas e colunas como vetores
                // a variável "linha" é o índice da coluna e a variável "coluna" é o índice da linha
            }
            System.out.println("(linha)");
            
        }
        System.out.println("- - - - -");

        // Letra A
        System.out.println("Letra A: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if (coluna == linha) { 
                    System.out.print("X ");                    
                } else {
                    System.out.print(coluna + " ");
                }
            }
            System.out.println("");        
        }
        System.out.println("- - - - -");

        // Letra B
        System.out.println("Letra B: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if (coluna > linha) { 
                    System.out.print("X ");                    
                } else {
                    System.out.print(coluna + " ");
                }
            }
            System.out.println("");        
        }
        System.out.println("- - - - -");

        // Letra C
        System.out.println("Letra C: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if (coluna < linha) { 
                    System.out.print("X ");                    
                } else {
                    System.out.print(coluna + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("- - - - -");

        // Letra D
        System.out.println("Letra D: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if (coluna != linha) { 
                    System.out.print("X ");                    
                } else {
                    System.out.print(coluna + " ");
                }
            }
            System.out.println("");
        }
    }
}