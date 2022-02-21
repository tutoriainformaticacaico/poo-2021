public class Empregado {
    String nome;
    String departamento;
    float horasTrabalhadasNoMes;
    float salarioPorHora;

    void mostrarDados(){
        System.out.println("O nome do empregado eh "+nome);
        System.out.println("O departamento do empregado eh "+departamento);
        System.out.println("O empregado trabalhou "+horasTrabalhadasNoMes+" horas nesse mes");
        System.out.println("O salario por hora do empregado eh "+salarioPorHora+" reais");
    }

    void calcularSalarioMensal(){
        float salario =  (float) ((horasTrabalhadasNoMes * salarioPorHora)*0.992);
        System.out.println("O salario do empregado "+nome+" eh "+salario+" reais");
    }
}
