package main.java.View;

import javax.swing.*;
import java.awt.*;

/**
 * @Author : Sitnikov Alexey
 * @e-Mail : lewkosmos@mail.ru
 * @Description : Starting Frame of an Application
 */

public class MainFrame {
    private static final JFrame frame = new JFrame("MainFrame");
    private final StartPanelView panel = new StartPanelView();

    private void mainFrameCreation()
    {
        mainFrameSettings(frame);
        frame.setJMenuBar(menuBarCreation(frame, 4, 3));
        frame.add(panel);
        frame.setVisible(true);
    }
    private void mainFrameSettings(JFrame mainFrame)
    {
        mainFrame.setSize(new Dimension(800, 600));
        mainFrame.setLocation(300, 300);
        mainFrame.setUndecorated(true);
    }
    private MenuBarView menuBarCreation(JFrame frame, int menuBarViewOption, int menuBarOption)
    {
        return new MenuBarView(frame, menuBarViewOption, menuBarOption, Color.BLACK);
    }
    public void getMainFrameCreation()
    {
        mainFrameCreation();
    }
}
