class OperadorTernario{
    public static void main(String[] args) {
        int numeroDias = 16; //valor entre 1 e 30
        String quinzena;

        // Ternário
        quinzena = (numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena";
        // Equivalente       
        if (numeroDias <= 15) {
            quinzena = "Primeira quinzena";
        } else {
            quinzena = "Segunda quinzena";
        }
    }
}