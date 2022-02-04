public class Matriz {
    public static void main(String[] args) {
        int[][] tabela = {{2, 15}, {5, 19}};
        for (int lin = 0; lin < 2; lin++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(tabela[lin][col]+" ");
            }
            System.out.println();
        }
    }
}
