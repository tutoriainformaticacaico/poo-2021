public class Gato extends Felino{
    // construtor necessário, pois Felino também tem um construtor
    public Gato(String nome) {
        super(nome);
    }
    
    private String dono;
    public void cuspirBolaPelo(){
        System.out.println(getNome() +": Pfft!");
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
}
