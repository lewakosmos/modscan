package main.java.Model;

import main.java.View.MenuBarView;

import javax.swing.*;
import java.awt.*;

public class SaveAsRequestFrame {
    private static JFrame saveAsRequestFrame = new JFrame();
    private JPanel saveAsRequestPanel = new JPanel();

    private void saveAsRequestFrameCreation()
    {
        saveAsRequestFrame.setSize(new Dimension(300, 200));
        saveAsRequestPanel.setBackground(Color.BLACK);
        saveAsRequestFrame.setLocation(300, 300);
        saveAsRequestFrame.setJMenuBar(new MenuBarView(saveAsRequestFrame, 0 ,1, Color.BLACK));
        saveAsRequestFrame.setUndecorated(true);
        saveAsRequestFrame.setLayout(null);
        saveAsRequestFrame.add(saveAsRequestPanelCreation());
        saveAsRequestFrame.setVisible(true);
    }
    private JPanel saveAsRequestPanelCreation()
    {
        Font font = new Font("Arial", Font.BOLD, 12);
        saveAsRequestPanel.setLayout(null);
        saveAsRequestPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        saveAsRequestPanel.setPreferredSize(new Dimension(300, 180));
        JLabel text = new JLabel("Do you want to save your project?");
        text.setFont(font);
        text.setLocation(10, 10);
        saveAsRequestPanel.add(text);

        JButton yesButton = new JButton("Yes");
        yesButton.setLocation(10, 50);
        yesButton.setFont(font);
        saveAsRequestPanel.add(yesButton);

        JButton noButton = new JButton("No");
        noButton.setLocation(100, 50);
        noButton.setFont(font);
        saveAsRequestPanel.add(noButton);

        return saveAsRequestPanel;
    }

    public void getSaveAsRequestFrameCreation()
    {
        saveAsRequestFrameCreation();
    }
}
