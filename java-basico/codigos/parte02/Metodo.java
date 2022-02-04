public class Metodo {
    public static void main(String[] args) {
        String texto = "Fora do metodo";
        System.out.println(texto);
        metodo();
        System.out.println(texto);
    }

    static void metodo(){
        // System.out.println(texto); ERRO, pois texto não existe
        System.out.println("Dentro do metodo");
    }
}
