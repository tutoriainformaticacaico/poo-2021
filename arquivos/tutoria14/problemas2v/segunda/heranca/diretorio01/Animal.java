// package diretorio01; // certifique-se que o nome da sua pasta é diretorio01 quando for executar a classe Secundaria
// quando executar a classe Main, remova o package
public class Animal {
    protected String nome;

    public void comer(){
        System.out.println("nham nham");
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}