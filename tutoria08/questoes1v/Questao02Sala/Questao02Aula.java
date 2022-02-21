// Escreva um modelo Empregado que represente um empregado 
// de uma empresa qualquer. Considere que os atributos nome, 
// departamento, horasTrabalhadasNoMês e salárioPorHora devam 
// ser representados, e que ao menos as operações mostraDados 
// e calculaSalárioMensal sejam implementadas. 
class Questao02Aula {
    public static void main(String[] args) {
        Empregado emp = new Empregado();
        emp.nome = "Glaucyrlei";
        emp.departamento = "TI";
        emp.horasTrabalhadasNoMes = 60;
        emp.salarioPorHora = 5;
        emp.mostrarDados();
        emp.calcularSalarioMensal();
    }
}