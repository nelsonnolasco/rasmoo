public class TestaMetodoReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar (1000.00);

        primeiraConta.transferir(segundaConta, 500.00);
        primeiraConta.transferir(segundaConta, 250.00);

        System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
        System.out.println("Saldo da Segunda Conta após transferência: " + segundaConta.saldo);
    }
}
