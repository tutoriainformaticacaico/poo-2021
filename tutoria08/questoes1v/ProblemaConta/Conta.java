public class Conta {
    int numConta;
    double saldo;
    int agencia;

    public Conta(int agencia) {
        System.out.println("CONTA CRIADA AUTOMATICAMENTE"); 
        this.agencia = agencia;  
        saldo = 10;
    }

    void mostrarDados() {
        System.out.println("N da conta: "+numConta);
        System.out.println("Saldo: "+saldo);
        System.out.println("Agencia: "+agencia);
    }

    void depositar(double valorDepositar) {
        saldo += valorDepositar;
    }

    void sacar(double valorRetirar) {
        if (saldo > valorRetirar) {
            saldo -= valorRetirar;
        } else {
            System.out.println("Voce nao pode sacar tudo isso, meu! Escolha um valor mais baixo!");
        }
    }
}
