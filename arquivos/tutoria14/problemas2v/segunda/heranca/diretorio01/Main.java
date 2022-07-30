public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.nome = "Regina";
        a.comer();
        System.out.println(a.getNome());

        Vaca vk = new Vaca();
        vk.setNome("Momoquinha");
        vk.nome = "";
        vk.setCor("Azul");
        // System.out.println(vk.exibirDados());
        vk.exibirDados();

    }
}
