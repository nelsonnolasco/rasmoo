public class TesteComposicao {

    public static void main(String[] args) {
        Cliente clientePedro = new Cliente();
        clientePedro.nome = "Pedro";
        clientePedro.cpf = "123.589.326-68";
        clientePedro.profissao = "Programador";
        clientePedro.salario = 5000.00;

        Conta conta = new Conta();
        conta.titular = clientePedro;

        System.out.println(clientePedro);
        System.out.println(conta.titular);
        System.out.println(conta.titular.nome);
        System.out.println(conta.titular.cpf);
        System.out.println(conta.titular.profissao);

    }
}
