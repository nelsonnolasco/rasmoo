import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Produto p1 = new Produto("Celular", 1999.90);
        Produto p2 = new Produto("Geladeira", 2499);
        Produto p3 = new Produto("Notebook", 3000);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        Produto celular = (Produto) lista.get(0);// Cast Produto por causa do Object

        System.out.println(celular.getNome());
        System.out.println(celular.getPreco());

    }
}
