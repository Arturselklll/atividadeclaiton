import java.util.Scanner;

public class atividade09 {
    public static void main(String[] args) {

        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero:");
        numero = sc.nextInt();

        if (numero >=1){
            System.out.println("positivo");
        } else if (numero <0) {
            System.out.println("negativo");
        }
        else
            System.out.println("zero");





    }
}