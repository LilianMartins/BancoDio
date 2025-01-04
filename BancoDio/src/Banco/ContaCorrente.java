package Banco;

public class ContaCorrente extends Conta {

    @Override
    public void exibirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}
