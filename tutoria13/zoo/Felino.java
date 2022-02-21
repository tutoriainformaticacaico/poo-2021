public class Felino extends Animal{
    // construtor necessário, pois Animal também tem um construtor
    public Felino(String nome) {
        super(nome); // passa o nome pro construtor de Animal
    }

    public void cacar(){
        System.out.println(getNome() +": Caçando...");
    }
    public void ronronar(){
        System.out.println(getNome() +": rrrrrr!");
    }
}
