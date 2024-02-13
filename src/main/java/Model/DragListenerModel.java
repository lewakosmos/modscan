package main.java.Model;

import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class DragListenerModel extends MouseInputAdapter {
    private final Component component;
    private Point location;
    MouseEvent pressed;
    public DragListenerModel(Component component)
    {
        this.component = component;
    }
    @Override
    public void mousePressed(MouseEvent me)
    {
        pressed = me;
    }
    @Override
    public void mouseDragged(MouseEvent me)
    {
        location = component.getLocation(location);
        int x = location.x - pressed.getX() + me.getX();
        int y = location.y - pressed.getY() + me.getY();
        component.setLocation(x, y);
    }

}
