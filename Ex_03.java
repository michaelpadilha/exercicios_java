import java.util.Scanner;
import java.util.Locale;

public class Ex_03 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, pi, area;

        pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);


        System.out.printf("RESULTADO = %.4f%n", area);

        sc.close();
    }
}
