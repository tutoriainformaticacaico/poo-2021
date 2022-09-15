public class Episodio {
    private String nome;
    private int tempo;
    
    public Episodio(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
    }

    public Episodio(String nome){
        this.nome = nome;
        this.tempo = 60;
    }

    public void iniciarEpisodio(){
        System.out.println("O episodio "+nome+" comecou...");
    }
    
    public void pararEpisodio(){
        System.out.println("O episodio "+nome+" parou...");
    }


    public String getNome() {
        return nome;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

}