import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList();


        Produto p1 = new Produto("Celular", 1999.90);
        Produto p2 = new Produto("Geladeira", 2499);
        Produto p3 = new Produto("Notebook", 3000);
        Produto p4 = new Produto("Notebook", 3000);


        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println(lista.contains(p4)); // true
        System.out.println(lista.indexOf(p4));//2

        System.out.println("Ref P3; " + p3);
        System.out.println("Ref P4; " + p4);

        if (p3.equals(p4)) { // verificará se os nomes são iguais
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

    }

}
