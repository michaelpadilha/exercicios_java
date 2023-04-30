import java.util.Locale;
import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a;
        int b;
        int soma;

        a = sc.nextInt();
        b = sc.nextInt();
        soma = a + b;

        System.out.printf("SOMA = %d%n", soma);

        sc.close();
    }

}
