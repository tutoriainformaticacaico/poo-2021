class Marca {
    // atributos ou características    
    String nome, dono;
    boolean status = false; // se a empresa da marca está funcionando (aberta) ou não
    
    // construtor
    Marca(){
        nome = "Sem nome";
        dono = "Sem dono";
    }
    
    // comportamentos ou ações
    void abrir(){
        status = true;
    }

    void fechar(){
        status = false;
    }
}
