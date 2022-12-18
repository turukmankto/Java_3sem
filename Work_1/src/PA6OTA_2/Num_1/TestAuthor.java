package PA6OTA_2.Num_1;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author A = new Author("Eva","Eva@gmail.com",'w');
        System.out.println(A.toString());
        A.setEmail("Eva2003@gmail.com");
        System.out.println(A.getEmail());
    }
}
