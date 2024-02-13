package main.java.Controller;

import main.java.Model.DragListenerModel;
import main.java.Model.MenuBarModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBarController {

    public static void dragListenerController(JFrame frame, JMenuBar menuBar)
    {
        DragListenerModel dl = new DragListenerModel(frame);
        menuBar.addMouseListener(dl);
        menuBar.addMouseMotionListener(dl);
    }
    public static void hideButtonListener(JFrame frame, JButton button)
    {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                MenuBarModel.hideButtonModel(frame);
            }
        });
    }
    public static void extensionButtonListener(JFrame frame, JButton button, Icon icon1, Icon icon2)
    {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                MenuBarModel.extensionButtonModel(frame, button, icon1, icon2);
            }
        });
    }
    public static void closeButtonListener(JFrame frame, JButton button, String frameName)
    {
        button.setAction(new MenuBarController().abstractCloseButton(frame, frameName));
    }
    public static void closeMenuItemListener(JFrame frame, JMenuItem menuItem, String frameName)
    {
        menuItem.setAction(new MenuBarController().abstractCloseButton(frame, frameName));
    }
    private Action abstractCloseButton(JFrame frame, String frameName)
    {
        Action exit = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuBarModel.closeButtonModel(frame, frameName);
            }
        };
        return exit;
    }




}
