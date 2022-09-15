public class Papagaio extends Ave{
    // construtor necessário, pois Ave também tem um construtor
    public Papagaio(String nome) {
        super(nome);
    }

    public void falar(){
        System.out.println(getNome() +": Seu corno!");
    }
}
