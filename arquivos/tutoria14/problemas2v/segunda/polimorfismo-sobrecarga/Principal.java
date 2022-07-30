public class Principal {
    public static void main(String[] args) {
        Pessoa ps = new Pessoa();
        System.out.println(ps.nome);

        Pessoa ps2 = new Pessoa("Vanesa");
        System.out.println(ps2.nome);

        Pessoa ps3 = new Pessoa("Vanesa", 5);
        System.out.println(ps3.idade);

    }
}
