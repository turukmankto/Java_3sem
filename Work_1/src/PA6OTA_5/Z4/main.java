package PA6OTA_5.Z4;

import javax.swing.*;

public class main extends Animation{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("C:\\Users\\Влад\\Desktop\\Гифки для себя\\G51kU.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Влад\\Desktop\\Гифки для себя\\ifritx-the-phoenix.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Влад\\Desktop\\Гифки для себя\\Mine-gif.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Влад\\Desktop\\Гифки для себя\\Избранный.gif").getImage());
        Animation animImg = new Animation();
        while (true)
        {
            for (int i = 0; i < 4; i++)
            {
                image = framlist.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(500);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}