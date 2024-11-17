public class TesteEncapsulamento {
    public static void main(String[] args) {
//        Cliente clientePedro = new Cliente();
//        clientePedro.nome = "Pedro";
//        clientePedro.cpf = "123.589.326-68";
//        clientePedro.profissao = "Programador";
//        clientePedro.salario = 5000.00;
//
//        Conta conta = new Conta();
//        conta.titular = clientePedro;

//        Cliente cliente = new Cliente();
//        cliente.setNome("Gustavo");
//        cliente.setCpf("12345678926");
//        cliente.setProfissao("Desenvolvedor");
//        cliente.setSalario(10000);

        Conta conta = new Conta(2370, 10025, new Cliente("Pedro","12345678926"));
        conta.depositar(1000);
        conta.sacar(1500);
        conta.setAgencia(10);

        conta.setTitular(new Cliente("Pedro", "12345678926"));
        conta.getTitular().setNome("Gustavo");
        conta.getTitular().setCpf("12345678926");
        conta.getTitular().setProfissao("Desenvolvedor");
        conta.getTitular().setSalario(10000);


        // conta.titular.nome
        System.out.println(conta.getTitular());
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());
        System.out.println(conta.getTitular().getSalario());
        System.out.println(conta.getSaldo());
    }
}
