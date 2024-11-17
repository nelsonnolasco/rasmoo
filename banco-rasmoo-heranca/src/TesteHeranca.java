public class TesteHeranca {
    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro", "12345678926");
        ContaCorrente cc = new ContaCorrente(1298, 8734,pedro);

        cc.depositar(1000);
        cc.sacar(233.76);

        ContaPoupanca cp = new ContaPoupanca(1298, 4368, pedro);
        cc.transferir(cp, 500);
        cp.depositar(5000);

        System.out.println("O saldo da CC: " +cc.getSaldo());
        System.out.println("O saldo da CP: " +cp.getSaldo());
    }
}