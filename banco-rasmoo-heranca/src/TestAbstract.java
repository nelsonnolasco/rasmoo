public class TestAbstract {
    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro Henrique","12345678926");
        //Conta conta = new Conta(1678, 4873, pedro);

        ContaCorrente cc = new ContaCorrente(1932, 3521, pedro);
        ContaPoupanca cp = new ContaPoupanca(1932, 4325, pedro);

        cc.gerarExtrato();
        cp.gerarExtrato();
    }
}
