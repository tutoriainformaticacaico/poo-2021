public class Problema01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        // Pessoa 1
        p1.nome = "Glau";
        p1.conta.numConta = 8273823;
        p1.conta.depositar(200);
        p1.conta.sacar(201);
        
        p1.conta.mostrarDados();
        // Pessoa 2
        p2.nome = "Jonas";
        p2.conta.numConta = 2747214;

        p2.conta.mostrarDados();
    }
}