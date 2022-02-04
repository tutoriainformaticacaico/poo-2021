class Vetor{
    public static void main(String[] args) {
        String[] tarefas = new String[3];
        tarefas[0] = "Acordar";
        tarefas[1] = "Tomar café";
        tarefas[2] = "Se exercitar";
        tarefas[3] = "Ler livros";
        tarefas[4] = "Ser feliz";
        // Alternativa: 
        // String[] tarefas = {"Acordar", "Tomar café", "Se exercitar", "Ler livros", "Ser feliz"};
        for (int i = 0; i < tarefas.length; i++) {
            System.out.print(tarefas[0]);            
        }
    }
}