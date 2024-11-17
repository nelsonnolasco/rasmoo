public class TesteStatic {
    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro","12345678926");

        Conta conta1 = new Conta(4000, 10001, pedro);
        Conta conta2 = new Conta(4000, 10002, pedro);
        Conta conta3 = new Conta(4000, 10003, pedro);
        Conta conta4 = new Conta(4000, 10004, pedro);

        System.out.println("Total de contas: " + Conta.getTotal () + " contas.");

    }
}
