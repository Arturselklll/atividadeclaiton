import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {

        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero:");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {

            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}