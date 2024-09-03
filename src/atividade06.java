import javax.swing.*;
import java.util.Scanner;

public class atividade06 {
    public static void main(String[] args) {

        Double media;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite a nota final:");
        media = sc.nextDouble();

        if (media >= 7)
            System.out.println("aprovado");
        else if (media >=5 && media <7) {
            System.out.println("recuperacao");
        } else if (media <5) {
            System.out.println("reprovado");


        }


    }
}