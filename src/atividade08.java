import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args) {

        double temperatura;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a temperatura:");
        temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("quente");
        }
        else if (temperatura >=15 && temperatura <30) {
            System.out.println("agradavel");
        } else if (temperatura <15) {
            System.out.println("frio");

        }


    }
}