import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {

        double nota = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do aluno (de 0 a 10): ");
        nota = sc.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        } else {

            if (nota >= 9) {
                System.out.println("Classificação: Excelente");
            } else if (nota >= 7) {
                System.out.println("Classificação: Bom");
            } else if (nota >= 5) {
                System.out.println("Classificação: Satisfatório");
            } else {
                System.out.println("Classificação: Insatisfatório");
            }
        }
    }
}