package PA6OTA_3.Num_3_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Conventor A = new Conventor();
        Scanner scanner = new Scanner(System.in);
        String V1 = scanner.nextLine();
        String V2 = scanner.nextLine();
        double N = scanner.nextDouble();
        System.out.println(A.getXtoY(V1,V2,N));
    }
}