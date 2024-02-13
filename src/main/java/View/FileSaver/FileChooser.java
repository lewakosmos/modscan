package main.java.View.FileSaver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileChooser extends JFrame {
    private JTextField fileName = new JTextField(), dir = new JTextField();

    private JButton open = new JButton("Open"), save = new JButton("Save");

    public FileChooser(int width, int height)
    {
        JPanel pan = new JPanel();
        open.addActionListener(new OpenL());
        pan.add(open);
        save.addActionListener(new SaveL());
        pan.add(save);
        Container container = getContentPane();
        container.add(pan, BorderLayout.SOUTH);
        dir.setEditable(false);
        fileName.setEditable(false);
        pan = new JPanel();
        pan.setLayout(new GridLayout(2, 1));
        pan.add(fileName);
        pan.add(dir);
        container.add(pan, BorderLayout.NORTH);
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class OpenL implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            //вызов диалогового окна открытия
            int rVal = fileChooser.showOpenDialog(FileChooser.this);
            if(rVal == JFileChooser.APPROVE_OPTION)
            {
                fileName.setText(fileChooser.getSelectedFile().getName());
                dir.setText((fileChooser.getCurrentDirectory().getName()));
            }
            if(rVal == JFileChooser.CANCEL_OPTION)
            {
                fileName.setText("You pressed cancel");
                dir.setText("");
            }
        }
    }

    class SaveL implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            //вызов диалогового окна сохранения
            int rVal = fileChooser.showSaveDialog(FileChooser.this);
            if(rVal == JFileChooser.APPROVE_OPTION)
            {
                fileName.setText(fileChooser.getSelectedFile().getName());
                dir.setText(fileChooser.getCurrentDirectory().getName());
            }
            if(rVal == JFileChooser.CANCEL_OPTION)
            {
                fileName.setText("You pressed cancel");
                dir.setText("");
            }
        }
    }
}
