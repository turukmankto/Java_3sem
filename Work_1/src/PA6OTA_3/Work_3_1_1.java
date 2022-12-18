package PA6OTA_3;

import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Work_3_1_1 {
    public static void main(String[] args)
    {
        double[] A = new double[5];
        double[] B = new double[5];
        Random random = new Random();
        for (int i = 0; i < 5; ++i)
        {
            A[i] = (double)(Math.random());
            System.out.printf("Math [%s]: %s%n",i,A[i]);
            B[i] = random.nextDouble();
            System.out.printf("Random [%s]: %s%n",i,B[i]);
        }
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println();
        for (int i = 0; i < 5; ++i)
        {
            System.out.printf("Math [%s]: %s%n",i,A[i]);
            System.out.printf("Random [%s]: %s%n",i,B[i]);
        }
    }
}