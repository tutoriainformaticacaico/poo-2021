public class MetodoRetorno {
    public static void main(String[] args) {
        System.out.println("Fora do metodo");
        System.out.println(darValor());
        System.out.println(darValor());
        System.out.println(darValor());

    }

    static String darValor(){
        return "Dentro do metodo";
    }
}
