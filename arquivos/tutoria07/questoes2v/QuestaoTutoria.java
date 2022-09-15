/*
Desenvolva um programa que tenha uma função que leia 
uma matriz de textos de dimensões desconhecidas. 
O seu programa irá ler os textos e salvá-los, exceto quando 
ele for igual a y e z. Se o texto lido for y, considere-o como 
um delimitador que diz o final da linha. Se for z, a matriz 
completa foi lida. Além de ler a matriz, a função deve retornar 
a quantidade de colunas e a quantidade de linhas. As variáveis 
da matriz, do número de colunas e do número de linhas devem ser 
passadas por valor. Declare sua matriz utilizando um valor de 
tamanho máximo.

Exemplo de entrada: a b c y a b c z
Colunas: 3, Linhas: 2

*/

/* 
Dica: para códigos mais complexos, execute o código para ver o resultado, depois
tente ler o código cuidadosamente do começo ao fim se explicando o que acontece. 
*/
import java.util.Scanner;
class QuestaoTutoria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[][] textos; // declaro a matriz
        
        System.out.println("Digite a quantidade maxima de linhas da matriz: ");
        int linhas = leitor.nextInt();
        
        System.out.println("Digite a quantidade maxima de colunas da matriz: ");
        int colunas = leitor.nextInt();

        // cria, efetivamente, a matriz com os tamanhos e associa à variável textos
        textos = new String[linhas][colunas];
        
        preencherMatriz(textos, linhas, colunas);

    }
    
    
    static void preencherMatriz(String[][] txts, int linhas, int colunas){
        Scanner leitor = new Scanner(System.in);
        String aux;    
        int qtdLinhas = 0;    
        int qtdColunas = 0;    

        // laço que percorre as linhas da matriz
        for (int l = 0; l < linhas; l++) {

            // laço que percorre as colunas da matriz
            for (int c = 0; c < colunas; c++) {

                // Recebendo um valor para ser adicionado à matriz
                System.out.println("Coluna "+c+" || Linha: "+l);
                aux = leitor.next(); 
                
                // condicional que retorna verdadeiro quando a variável aux for diferente de z ou y
                if(!(aux.equals("z") || aux.equals("y"))){
                    txts[l][c] = aux;
                    // condicional para descobrir se está na última linha e última coluna
                    if (l+1 == linhas && c+1 == colunas) {
                        qtdLinhas = l+1;
                    }

                    // Condicional para contar a quantidade máxima de colunas que houve na matriz
                    if (qtdColunas < c) {
                        qtdColunas = c+1;
                    }      
                    
                } else if(aux.equals("y")){ // y pula a linha
                    // Condicional para contar a quantidade máxima de colunas que houve na matriz
                    if (qtdColunas < c) {
                        qtdColunas = c+1;

                    }        
                    qtdLinhas = l+1;
                    
                    c = txts[l].length;
                    
                } else {
                    // Condicional para contar a quantidade máxima de colunas que houve na matriz
                    if (qtdColunas < c) {
                        qtdColunas = c+1;
                    }        
                    qtdLinhas = l+1;

                    c = txts[l].length;
                    l = txts.length;
                    
                }
            }
        }

        // Imprimindo a matriz no terminal
        System.out.println("--- MATRIZ ---");
        for (int l = 0; l < qtdLinhas; l++) {
            for (int c = 0; c < qtdColunas; c++) {
                if (txts[l][c] == null) {
                    System.out.print("? ");
                } else {
                    System.out.print(txts[l][c]+" ");                    

                }
            }            
            System.out.println();
        }
        System.out.println("? indica que nao ha valor preenchido para aquela posicao");
        System.out.println("--- FIM DA MATRIZ ---");
        System.out.println("Quantidade de colunas da maior coluna: "+qtdColunas);
        System.out.println("Quantidade de linhas: "+qtdLinhas);

    }
}

