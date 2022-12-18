package PA6OTA_1;

import java.util.Scanner;

public class Work_1_1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A= new int[N];
        float Sum = 0;
        for (int i = 0; i < N; ++i)
        {
            A[i] = scanner.nextInt();
            Sum += A[i];
        }
        float Aver = Sum / N;
        for (int i = 0; i < N; ++i)
        {
            System.out.printf("%s ",A[i]);
        }
        System.out.printf("%nСумма: %s%nСреднее арифметическое: %s",Sum, Aver);
    }
}




