import java.util.Scanner;
import java.util.Locale;

public class Ex_06 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int cod1, cod2, numPcs1, numPcs2;
        double valor1, valor2, tot1, tot2, totGeral;

        cod1 = sc.nextInt();
        numPcs1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        numPcs2 = sc.nextInt();
        valor2 = sc.nextDouble();

        tot1 = numPcs1 * valor1;
        tot2 = numPcs2 * valor2;
        totGeral = tot1 + tot2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totGeral);


        sc.close();
    }
}
