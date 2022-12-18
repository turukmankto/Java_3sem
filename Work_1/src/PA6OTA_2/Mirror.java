package PA6OTA_2;

public class Mirror {
    public static void main(String[] args)
    {
        String[] A;
        A = new String[5];
        A[0] = "A";
        A[1] = "B";
        A[2] = "C";
        A[3] = "D";
        A[4] = "E";
        A = swapString(5, A);
        System.out.printf("%s %s %s %s %s", A[0],A[1],A[2],A[3],A[4]);
    }
    public static String[] swapString(int n,String[] a)
    {
        String x;
        for (int i = 0; i < (n/2); ++i)
        {
            x = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = x;
        }
        return a;
    }
}
