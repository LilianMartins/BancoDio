package Banco;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente();
        Conta conta2 = new ContaCorrente();

        conta1.depositar(500);
        conta1.exibirExtrato();

        conta1.transferir(200, conta2);
        conta1.exibirExtrato();
        conta2.exibirExtrato();

        conta2.sacar(100);
        conta2.exibirExtrato();
    }
}
