public class MetodoPassagem {
    public static void main(String[] args) {
        String texto = "Fora do metodo";
        System.out.println(texto);
        mostrarAlgo(texto);
        System.out.println(texto);
    }
    
    static void mostrarAlgo(String txt){
        System.out.println(txt);
    }
}
