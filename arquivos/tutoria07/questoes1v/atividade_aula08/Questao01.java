/* Escreva uma classe cujos objetos representam alunos 
matriculados em uma disciplina. Cada objeto dessa classe 
deve guardar dados do aluno: matricula, nome, 2 notas de 
prova e 1 nota de trabalho. Escreva os seguintes métodos 
para esta classe:
*media* calcula a média final do aluno (cada prova tem peso 
2,5 e o trabalho tem peso 2).
*final* calcula quanto o aluno precisa para a prova final
(retorna zero se ele não for para a final).
*/

public class Questao01 {
    public static void main(String[] args) {
        Aluno a01 = new Aluno();
        a01.prova1 = 10;
        a01.prova2 = 7;
        a01.trabalho = 5;
        System.out.println("A media do aluno eh "+a01.calcMedia());
        System.out.println("A nota que o aluno precisa tirar na prova final eh "+a01.notaFinal());

    }    
}
