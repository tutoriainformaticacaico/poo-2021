public class ContrutoresMain {
    public static void main(String[] args) {
        // criando um construtor passando os parâmetros de nome, cpf e função
        Construtor cnt = new Construtor("Fhellipe", 1010101010, "Pedreiro");
        Construtor cnt2 = new Construtor("Kaique", 123123123, "Arquiteto");
        
        // System.out.println(cnt.nome);
        // System.out.println(cnt2.nome);
        

        // Usando split
        String string = "004-034-556";
        String[] parts = string.split("-"); // criando um vetor com base na string, onde cada posição guarda um pedaço da string
        
        // mostrando o vetor com foreach
        for (String part : parts) {
            System.out.println(part);
        }

        // mostrando o vetor com for
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);;
        }
        
    }    
}
