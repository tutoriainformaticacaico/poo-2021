//Escreva um modelo Empregado que represente um empregado de uma empresa qualquer. Considere que os atributos nome, departamento, horasTrabalhadasNoMês e salárioPorHora devam ser representados, e que ao menos as operações mostraDados e calculaSalárioMensal sejam implementadas. 
public class Empregado {
    String nome;
    String departamento;
    int horasTrabalhadasNoMês;
    float salarioPorHora;

    void mostrarDados() {
        System.out.println(nome);
        System.out.println(departamento);
        System.out.println(horasTrabalhadasNoMês);
        System.out.println(salarioPorHora);
    }

    void calcularSalarioMensal() {
        System.out.println("O seu salário mensal é: " + (horasTrabalhadasNoMês * salarioPorHora));
    }
}