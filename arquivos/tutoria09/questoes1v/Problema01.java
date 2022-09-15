import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.text.ParseException;

class Problema01 {
    public static void main(String[] args) throws ParseException  {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy"); // definindo o formato como: dia/mes/ano

        System.out.println("Digite uma data (dia/mês/ano): "); // dd/MM/yyyy
        // 10/01/2022    
        // 10 de 01 de 2022
        String aux = sc.nextLine();
        Date data = fmt.parse(aux);
        
        Calendar cal = Calendar.getInstance(); // criando um calendário

        cal.setTime(data); // defino o "tempo" do calendário de acordo com a data

        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); 
        System.out.println(cal.get(Calendar.MONTH) + 1); 
        System.out.println(cal.get(Calendar.YEAR)); 

        // 18 = 2022 - 2004
        
        // se mesAtual (01) < mesAniv (01)
        // 18 - 1
        // senao se mesAtual (01) == mesAniv (01) e diaAtual (10) < diaAniv (11)
            // 18 - 1
            
    }
}