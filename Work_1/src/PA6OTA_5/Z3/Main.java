package PA6OTA_5.Z3;
import javax.swing.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class Main extends JFrame{
    public Main (String a) throws IOException{
        super("Image");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BufferedImage img = ImageIO.read(new File(a));
        JLabel label = new JLabel(new ImageIcon(img));
        add(label);
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        new Main(scanner.nextLine()).setVisible(true);
    }
}