package main.java.Model;

import javax.swing.*;
import java.awt.*;

public class MenuBarModel {
    public static void hideButtonModel(JFrame frame)
    {
        frame.setVisible(false);
    }
    public static void extensionButtonModel(JFrame frame, JButton button, Icon icon1, Icon icon2)
    {
        if(button.getIcon().equals(icon1)){
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setSize((int) screenSize.getWidth(), (int) screenSize.getHeight());
            frame.setLocation(0, 0);
            button.setIcon(icon2);
            frame.repaint();
        }
        else
        {
            frame.setSize(new Dimension(800, 600));
            frame.setLocation(300, 300);
            button.setIcon(icon1);
            frame.repaint();
        }
    }
    public static void closeButtonModel(JFrame frame, String frameName)
    {
        if(frame.getTitle().equals(frameName))
        {
            new SaveAsRequestFrame().getSaveAsRequestFrameCreation();
        }
        else
        {
            frame.dispose();
        }
    }
}
