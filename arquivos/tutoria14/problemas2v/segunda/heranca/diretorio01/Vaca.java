public class Vaca extends Animal{
    private float peso;
    private String cor;

    public void exibirDados() {
        // return "Esta vaca se chama "+getNome()+" tem "+getPeso()+" kg e tem a cor "+getCor();
        System.out.println("Esta vaca se chama "+nome+" tem "+getPeso()+" kg e tem a cor "+getCor());
    }
    public void mugir(){

    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getPeso() {
        return peso;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
