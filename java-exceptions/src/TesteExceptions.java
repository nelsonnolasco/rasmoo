public class TesteExceptions {
    public static void main(String[] args) {
//        Conta conta = null;
//        conta.depositar(1000);
//
//        System.out.println("Chegamos aqui");

        try {
            int resultado = 10 / 2; //5/0;
            System.out.println(resultado);

            Cliente cliente = new Cliente("Pedro", "12345678926");
            Conta conta = new Conta(3242, 8732, cliente);
            conta.depositar(1000);
            conta.sacar(1100);

            System.out.println("O saldo da minha conta é: " + conta.getSaldo());

        } catch (ArithmeticException ex) { // Poderia colocar os dois aqui com operador "ou" |
            System.out.println("O motivo do erro foi: " + ex.getMessage());

        } catch (NullPointerException ex) {
            System.out.println("Ocorreu um NullPointer. O motivo foi: " + ex.getMessage());
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());

        } finally {
            System.out.println("Esse bloco sempre será executado");
        }

        System.out.println("Opa! Agora eu sou chamado!");


    }

}
