package main.java.Controller;

import main.java.Model.MenuBarModel;
import main.java.Model.OpenModel;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OpenController {
    public void openListener(JFrame frame, JMenuItem item, String format)
    {
        //String path = "";
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XML FILES", format);
        fileChooser.setFileFilter(filter);
        fileChooser.showOpenDialog(frame);
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                OpenModel om = new OpenModel();
                om.openItemListener(fileChooser, frame);
            }
        });
    }
}
