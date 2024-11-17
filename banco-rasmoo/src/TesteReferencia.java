public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // Conta@5f184fc6

        System.out.println(primeiraConta);

        Conta segundaConta = primeiraConta; // Conta@5f184fc6

        primeiraConta.saldo = 1000;
        System.out.println(segundaConta.saldo);


        segundaConta.saldo = 450;
        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("As duas variáveis apontam para o mesmo local");
        } else {
            System.out.println("são diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }

}
