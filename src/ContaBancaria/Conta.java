package ContaBancaria;

public class Conta {

    private String titular;
    private double saldo;

    // Construtor
    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Metodo para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para exibir dados
    public void exibirDados() {
        System.out.println("\nTitular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}


