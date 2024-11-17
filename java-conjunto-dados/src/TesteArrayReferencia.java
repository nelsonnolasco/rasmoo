public class TesteArrayReferencia {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[4];

        produtos[0] = new Produto("Iphone13", 6299.99);
        produtos[1] = new Produto("Notebook I7", 4000.00);
        produtos[2] = new Produto("Iphone13", 6299.99);
        produtos[3] = new Produto("Iphone13", 6299.99);

        System.out.println(produtos[0].getNome());

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto: " + produtos[i].getNome() + ", Preço " + produtos[i].getPreco());

        }





    }
}
