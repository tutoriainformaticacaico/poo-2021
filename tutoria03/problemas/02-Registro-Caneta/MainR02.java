class MainR02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // Instancia um objeto do tipo Caneta, chamado de c1
        c1.lerDados(); // Chama a função lerDados() que está dentro da classe Caneta
        // Na linha acima, os dados lidos serão pertencentes da caneta c1

        Caneta c2 = new Caneta(); // Instancia outro objeto do tipo Caneta, chamado de c2
        c2.lerDados(); // Chama a função lerDados() que está dentro da classe Caneta
        // Na linha acima, os dados lidos serão pertencentes da caneta c2

        c2.imprimirDados(); // Imprime os dados da caneta c2
        c1.imprimirDados(); // Imprime os dados da caneta c1

        // Conclusão:
        // Usando objetos podemos criar quantas canetas quisermos sem precisar reescrever e repetir código
        
    }
}