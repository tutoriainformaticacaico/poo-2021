// filha da classe animal
public class Ave extends Animal{
    // construtor necessário, pois Animal também tem um construtor    
    public Ave(String nome) {
        super(nome); // passa o nome pro construtor de Animal
    }
    
    private float tamanhoDaAsa;
    
    // Sobreescrevendo o método locomover da classe Animal
    @Override
    public void locomover(){
        System.out.println(getNome() +": Voando...");
    }

    public void botarOvo(){
        System.out.println(getNome() +": Ovo saindo no capricho...");
    }
    
    public float getTamanhoDaAsa() {
        return tamanhoDaAsa;
    }
    public void setTamanhoDaAsa(float tamanhoDaAsa) {
        this.tamanhoDaAsa = tamanhoDaAsa;
    }

}
