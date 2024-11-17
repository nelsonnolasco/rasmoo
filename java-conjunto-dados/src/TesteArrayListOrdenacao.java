import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayListOrdenacao {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Marcelo");
        nomes.add("Vanessa");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        Collections.sort(nomes);// ordena em ordem alfabética
        // Ou ForEach
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("---------------------------------------------");

        ArrayList<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto("Celular", 1999.90);
        Produto p2 = new Produto("Geladeira", 2499);
        Produto p3 = new Produto("Notebook", 3000);
        Produto p4 = new Produto("Armário", 15000);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        //Collections.sort(produtos);

        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
        System.out.println("---------------------------------------------");

        Collections.sort(produtos, new PrecoProdutoComparator());

    }
}

class PrecoProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return (int) (p1.getPreco() - p2.getPreco());
    }

}
