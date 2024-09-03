import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {

        double numeroUm;
        double numeroDois;
        String operacao;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero:");
        numeroUm = sc.nextDouble();
        System.out.println("digite outro numero:");
        numeroDois = sc.nextDouble();
        System.out.println("digite a operacao:");
        operacao = sc.next();

        switch (operacao) {
            case "+":
                System.out.println(numeroUm + numeroDois);
                break;
            case "-":
                System.out.println(numeroUm - numeroDois);
                break;
            case "*":
                System.out.println(numeroUm * numeroDois);
                break;
            case "/":
                System.out.println(numeroUm / numeroDois);
                break;
            default:
                System.out.println("coisa");
                break;
        }


    }
}