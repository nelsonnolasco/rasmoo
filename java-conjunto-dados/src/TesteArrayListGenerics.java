import java.util.ArrayList;

public class TesteArrayListGenerics {

    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList();
        ArrayList<String> nomes = new ArrayList();

        Produto p1 = new Produto("Celular", 1999.90);
        Produto p2 = new Produto("Geladeira", 2499);
        Produto p3 = new Produto("Notebook", 3000);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        Produto celular = lista.get(0);// Não precisa fazer cast

        System.out.println(celular.getNome());
        System.out.println(celular.getPreco());

        lista.remove(2);
        //lista.clear(); // Remove tudo
        System.out.println(lista.isEmpty()); // Verifica se limpou tudo
        System.out.println(lista); // apresenta a referência dos dois produtos existentes

        System.out.println("Tamanho do array: " + lista.size()); // Metodo Size, não Lenght

    }
}
