public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(300);
        conta.depositar(500);
        conta.depositar(50.30);

        boolean conseguiuRealizarSaque = conta.sacar(850.30);
        if (conseguiuRealizarSaque) {
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("não foi possível realizar o saque.");
        }

        System.out.println("Seu saldo atual é de: " + conta.saldo);

    }
}
