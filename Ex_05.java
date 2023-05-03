import java.util.Scanner;
import java.util.Locale;

public class Ex_05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        int numF, horas;
        double valorHora, salario;

        Scanner sc = new Scanner(System.in);

        numF = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();
        salario = horas * valorHora;

        System.out.printf("NUMBER = %d%n", numF);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
