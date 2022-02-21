/*
Escreva uma classe Retangulo para representar um retângulo. A classe deve conter:

a) Dois campos de dados do tipo double chamados largura e altura que especificam a largura e a altura do retângulo. Os valores padrões são 1 tanto para a largura quanto para a altura.

b) Um campo de dado do tipo String chamado cor que especifica a cor do retângulo. Para este exercício em particular, assuma que TODOS os retângulos possuirão a mesma cor. A cor padrão é branco.

c) Um construtor sem argumentos que cria um retângulo padrão.

d) Um construtor que cria um retângulo com a largura e altura especificadas.

e) Métodos get() e set() para os três campos de dados da classe.

f) Um método chamado getArea() que retorna a área do retângulo.

g) Um método chamado getPerimetro() que retorna o perímetro do retângulo.
*/
public class Retangulo {
    // atributos do Retangulo
    private double alt;
    private double lar;
    private String cor;

    // construtor (opção sem parâmetros)
    public Retangulo(){
        alt = 1;
        lar = 1;
        cor = "branco";
    }

    // construtor (opção com parâmetros)
    public Retangulo(double alt, double lar, String cor){
        this.alt = alt;
        this.lar = lar;
        this.cor = cor;
    }

    // getters (acessores ou de retorno)
    public double getAlt(){
        return alt;
    }
    public double getLar(){
        return lar;
    }
    public String getCor(){
        return cor;
    }
    
    // setters (modificadores ou atribuidores)
    public void setAlt(double alt){
        this.alt = alt;
    }
    public void setLar(double lar){
        this.lar = lar;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    // métodos para calcular área e perímetro
    public double getArea(){
        double area = lar*alt;
        return area;
    }
    public double getPerimetro(){
        double per = (lar*2)+(alt*2); 
        return per;
    }

    // sobreescrevendo o toString para mostrar as informações da classe
    public String toString(){
        return "Largura: " + lar + "\nAltura: " + alt + "\nCor: " + cor + "\nÁrea: " + getArea() + "\nPerímetro: " + getPerimetro();
    }
}
