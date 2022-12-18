package PA6OTA_4.W_4_1.Z_4;

public class Main {
    public static void main(String[] args)
    {
        Matrix A = new Matrix(3,3);
        Matrix B = new Matrix(3,3);
        System.out.println(A.toString());
        System.out.println(B.toString());
        A.PlusMatrix(B);
        System.out.println(A.toString());
        A.Multiplication(3);
        System.out.println(A.toString());
    }
}