import java.util.Scanner;

/*se nota for maior ou igual 7 = aprovado
se não se, nota for maior ou igual a 5 e menor que 7 = recuperação
se não, reprovado.*/
public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o valor da Nota: ");
        double nota = entrada.nextDouble();

        if(nota >=7) {
            System.out.println("Parabéns!!");
            System.out.println("Você está aprovado!!");
        } else if(nota >=5) {
            System.out.println("Você está de recuperação.");
        }else System.out.println("Infelizmente você está reprovado.");
    }
}
