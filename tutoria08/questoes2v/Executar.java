import java.util.*;

public class Executar {
    public static void main(String[] args) {
        Empregado ep = new Empregado();
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do empregado");
        ep.nome = in.nextLine();
        System.out.println("Digite o nome do departamento");
        ep.departamento = in.nextLine();
        System.out.println("Digite quantas horas você trabalhou no mês");
        ep.horasTrabalhadasNoMês = in.nextInt();
        System.out.println("Digite o salário por hora");
        ep.salarioPorHora = in.nextFloat();

        ep.mostrarDados();
        ep.calcularSalarioMensal();

    }
}
