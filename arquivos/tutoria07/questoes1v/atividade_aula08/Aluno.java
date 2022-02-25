public class Aluno {
    // atributos do aluno / variáveis globais
    int matricula;
    String nome;
    double prova1;
    double prova2;
    double trabalho;

    // método para calcular a média ponderada do aluno
    double calcMedia(){
        double media = (((prova1 * 2.5) + (prova2 * 2.5) + (trabalho * 2.0))/7);;
        return media;
    } 
    // método para calcular a nota que precisa na prova final
    double notaFinal(){
        double notaFinal = 0;
        double media = calcMedia();
        if (media < 3) { // reprovou
            return 0;
        } else if(media < 7){ // recuperação
            notaFinal = 10 - media;
            return notaFinal;
        } else { // passou de ano
            return 0;
        }
        
    }
    
}
