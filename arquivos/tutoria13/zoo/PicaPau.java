public class PicaPau extends Ave{    
    private String time;
    private float salario;
        
    // construtor necessário, pois Ave também tem um construtor
    public PicaPau(String nome, String time){
        super(nome);
        this.time = time;
    }

    public void jogarBola(){
        System.out.println(getNome() +": Jogando bola pro "+this.time);
    }

}
