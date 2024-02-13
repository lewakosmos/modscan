package main.java.View;

import main.java.Controller.MenuBarController;
import main.java.Controller.OpenController;
import main.java.Model.SaveAsRequestFrame;
import main.java.View.FileSaver.FileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBarView extends JMenuBar {

    public MenuBarView(JFrame frame, int menuViewOption, int menuBarOption, Color color)
    {
        setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, color));
        MenuBarController.dragListenerController(frame, this);

        Font font = new Font("Arial", Font.BOLD, 10);
        add(menuView(frame, this, font, menuViewOption));

        JSeparator separator = new JSeparator();
        add(separator);

        switch(menuBarOption) {
            case 1:
                add(createCloseButton(frame, "C:/Users/lewak/IdeaProjects/MFPScan/Icons/exit.png"));
                break;
            case 2:
                add(createHideButton(frame, "C:/Users/lewak/IdeaProjects/MFPScan/Icons/hidden.png"));
                add(createCloseButton(frame, "C:/Users/lewak/IdeaProjects/MFPScan/Icons/exit.png"));
                break;
            case 3:
                add(createHideButton(frame, "C:/Users/lewak/IdeaProjects/MFPScan/Icons/hidden.png"));
                add(createExtensionButton(frame, "C:/Users/lewak/IdeaProjects/MFPScan/Icons/fullscreen.png",
                        "C:/Users/lewak/IdeaProjects/MFPScan/Icons/lowscreen.png"));
                add(createCloseButton(frame, "C:/Users/lewak/IdeaProjects/MFPScan/Icons/exit.png"));
                break;
            default:
        }
    }
    private JButton createHideButton(JFrame frame, String path)
    {
        JButton hideButton = new JButton();
        ImageIcon firstIcon = new ImageIcon(path);
        Image firstImage =  firstIcon.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH);
        ImageIcon firstImageIcon = new ImageIcon(firstImage);
        hideButton.setIcon(firstImageIcon);
        hideButton.setPreferredSize(new Dimension(18, 12));
        hideButton.setBackground(Color.WHITE);
        MenuBarController.hideButtonListener(frame, hideButton);
        return hideButton;
    }
    private JButton createExtensionButton(JFrame frame, String path1, String path2)
    {
        JButton extensionButton = new JButton();
        ImageIcon firstIcon = new ImageIcon(path1);
        Image firstImage =  firstIcon.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH);
        ImageIcon firstImageIcon = new ImageIcon(firstImage);
        ImageIcon secondIcon = new ImageIcon(path2);
        Image secondImage =  secondIcon.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH);
        ImageIcon secondImageIcon = new ImageIcon(secondImage);
        extensionButton.setIcon(firstImageIcon);
        extensionButton.setPreferredSize(new Dimension(18, 12));
        extensionButton.setBackground(Color.WHITE);
        MenuBarController.extensionButtonListener(frame, extensionButton, firstImageIcon, secondImageIcon);
        return extensionButton;
    }
    private JButton createCloseButton(JFrame frame, String path)
    {
        JButton closeButton = new JButton();
        ImageIcon firstIcon = new ImageIcon(path);
        Image firstImage = firstIcon.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH);
        ImageIcon firstImageIcon = new ImageIcon(firstImage);
        closeButton.setIcon(firstImageIcon);
        closeButton.setPreferredSize(new Dimension(18, 12));
        closeButton.setBackground(Color.WHITE);
        MenuBarController.closeButtonListener(frame, closeButton, frame.getTitle());
        return closeButton;
    }

    private JMenu menuView(JFrame frame, JMenuBar menuBar, Font font, int menuViewOption)
    {
        JMenu menu = new JMenu();
        menu.setFont(font);
        switch(menuViewOption)
        {
            case 1:
                menu.setText("Menu");
                menu.add(exitItemCreation(frame, font, frame.getTitle()));
                break;
            case 3:
                menu.setText("Menu");
                menu.add(openItemCreation(frame, font));
                menu.add(saveItemCreation(font));
                menu.add(exitItemCreation(frame, font, frame.getTitle()));
                break;
            case 4:
                menu.setText("Menu");
                menu.add(openItemCreation(frame, font));
                menu.add(saveItemCreation(font));
                menu.add(saveAsItemCreation(font));
                menu.add(exitItemCreation(frame, font, frame.getTitle()));
                break;
            default:
        }
        return menu;
    }
    private JMenuItem openItemCreation(JFrame frame, Font font)
    {
        JMenuItem openItem = new JMenuItem("Open");
        openItem.setFont(font);
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.SHIFT_MASK));
        OpenController oc = new OpenController();
        oc.openListener(frame, openItem, "xml");
        return openItem;
    }
    private JMenuItem saveItemCreation(Font font)
    {
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.setFont(font);
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.SHIFT_MASK));
        //actionListener for simple fileSaving
        //xml i guess
        //menu.add(saveItem);
        return saveItem;
    }
    private JMenuItem saveAsItemCreation(Font font)
    {
        JMenuItem saveAsItem = new JMenuItem("Save As");
        saveAsItem.setFont(font);
        saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S + KeyEvent.VK_A, ActionEvent.SHIFT_MASK));

        return saveAsItem;
    }
    private JMenuItem exitItemCreation(JFrame frame, Font font, String frameTitle)
    {
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.SHIFT_MASK));
        MenuBarController.closeMenuItemListener(frame, exitItem, frameTitle);
        return exitItem;
    }
}
