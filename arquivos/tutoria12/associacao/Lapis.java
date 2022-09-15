class Lapis {
    // atributos ou características
    Marca marca;
    String cor;

    // construtor
    Lapis(String mc){
        marca = new Marca(); // criando uma marca
        marca.nome = mc; // atribuindo o valor recebido como parâmetro ao nome da marca
        System.out.println(marca.nome); // imprimindo o nome da marca
    }

    // comportamentos ou ações
    void escrever(){
        System.out.println("Lapis escrevendo...");
    }
    
}
