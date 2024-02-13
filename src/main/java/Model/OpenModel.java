package main.java.Model;

import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class OpenModel {

    public void openItemListener(JFileChooser fileChooser, JFrame frame)
    {
        fileChooser.showOpenDialog(frame);
    }

    /*DocumentBuilderFactory OpenFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder OpenBuilder;

    {
        try {
            OpenBuilder = OpenFactory.newDocumentBuilder();

            org.w3c.dom.Document document = OpenBuilder.parse(new File("saveFile.xml"));
            document.getDocumentElement().normalize();
            document.getElementsByTagName("title");


        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }*/

}
