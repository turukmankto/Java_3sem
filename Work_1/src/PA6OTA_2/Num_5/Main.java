package PA6OTA_2.Num_5;

public class Main {
    public static void main(String[] args)
    {
        DogKennel A = new DogKennel(4);
        A.getSpisok();
        A.setAge(2, 7);
        A.setName(2, "Jim");
        A.getSpisok();
        A.getHumanAge(2);
    }
}