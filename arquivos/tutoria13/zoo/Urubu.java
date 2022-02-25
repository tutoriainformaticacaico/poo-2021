public class Urubu extends Ave{
    // construtor necessário, pois Ave também tem um construtor
    public Urubu(String nome) {
        super(nome); 
    }

    public void torcerProMengo(){
        System.out.println(getNome() +": Faz gol, mengao");
    }
}
