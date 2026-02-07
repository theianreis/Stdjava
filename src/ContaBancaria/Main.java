package ContaBancaria;

public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta("Ian", 1000.0);

        conta.exibirDados();

        conta.depositar(500.0);
        conta.sacar(300.0);
        conta.sacar(1500.0); // tentativa inválida

        conta.exibirDados();
    }
}
