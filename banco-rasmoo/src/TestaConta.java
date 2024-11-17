public class TestaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 1525.40;
        primeiraConta.agencia = 1;
        primeiraConta.numero = 100;


        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;

        System.out.println("O titular da primeira conta é: " + primeiraConta.titular);
        System.out.println("Agência: " + primeiraConta.agencia + " Número: " + primeiraConta.numero);
        System.out.println("Saldo atual é: " + primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("As duas variáveis apontam para o mesmo local");
        } else {
            System.out.println("são diferentes");

        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
