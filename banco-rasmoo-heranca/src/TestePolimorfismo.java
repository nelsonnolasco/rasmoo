public class TestePolimorfismo {
    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro", "12345678926" );
        ContaCorrente cc = new ContaCorrente(5643, 10032, pedro);
        ContaPoupanca cp = new ContaPoupanca(5643, 8721, pedro);

        cc.depositar(1000);;
        cp.depositar(10000);;

        cp.transferir(cc, 500);
        cc.transferir(cp, 100); // no valor será descontada a taxa de 2 reais que está no @Override

        cc.sacar(100);
        cp.sacar(1000);


        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

        System.out.println(cc);
        System.out.println(cp);

    }
}
