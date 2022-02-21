// Criar um sistema de agendamentos de consultas de uma clínica
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat; // importando classe para formatar os dados
import java.util.Scanner;

class Data{
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy"); // definindo o formato como: dia/mes/ano
        
        // d = day
        // M = mounth
        // y = year
        Scanner sc = new Scanner(System.in);
        String[] pacientes = new String[1];
        Date[] datas = new Date[1]; // Date = data

        String aux;
        for (int i = 0; i < datas.length; i++) {
            System.out.println("Consulta "+(i+1));
            System.out.println("Digite o nome do paciente: ");
            pacientes[i] = sc.nextLine();



            System.out.println("Digite a data da consulta (dia/mês/ano): "); // dd/MM/yyyy
            // 10/01/2022
            aux = sc.nextLine(); // pega String
            datas[i] = fmt.parse(aux); // passa de String para Date


        }

        for (int i = 0; i < datas.length; i++) {
            System.out.println(datas[i]);
        }
        
    }
}