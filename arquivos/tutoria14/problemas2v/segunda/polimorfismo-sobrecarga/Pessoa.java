public class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(){
        nome = "Sem nome";
        idade = 0;
    }

    public Pessoa(String nome){
        this.nome = nome;
        idade = 0;
    }

    public Pessoa(int idade){
        this.nome = "Sem nome";
        this.idade = idade;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setValores(String nome){

    }

    public void setValores(String nome, int idade){

    }
    
}