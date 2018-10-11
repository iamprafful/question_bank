import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Scribble {
    // Main entry point
    public static void main(String[] args) {
        JFrame frame = new DrawFrame();
        // The window size is set in the constructor for DrawFrame
        frame.show();
    }
}

class DrawFrame extends JFrame {
    public DrawFrame() {
        setTitle("Scribble");
        setSize(600, 400);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        } );
        
        // Components that will appear on a JFrame
        // are added to the content pane.
        Container contentPane = getContentPane();
        
        DisplayArea da = new DisplayArea();
        contentPane.add(da,BorderLayout.CENTER);
    }
}

// A JPanel is a component you can draw on.
// Our panel is listening for mouse events
class DisplayArea extends JPanel implements MouseMotionListener, MouseListener {
    
    public DisplayArea() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // --------------------------------------------------------
    // There are two mothods in the MouseMotionListener (move, drag) interface.
    public void mouseMoved(MouseEvent evt) {
    }
    
    public void mouseDragged(MouseEvent evt) {
        int new_x = evt.getX();
        int new_y = evt.getY();

        Point old = (Point)currentLine.lastElement();

        Graphics g = getGraphics();
        g.drawLine(old.x,old.y,new_x,new_y);
        currentLine.addElement(new Point(new_x,new_y));         
    }
    
    // --------------------------------------------------------
    // There are 5 methods in the MouseListener (click, double click, etc) interface.
    public void mousePressed(MouseEvent evt) {
        int x = evt.getX();
        int y = evt.getY();

        currentLine = new Vector();
        currentLine.addElement(new Point(x,y));
    }
                
    public void mouseReleased(MouseEvent evt) {
        int x = evt.getX();
        int y = evt.getY();
        currentLine.addElement(new Point(x,y));

        if (onScreenLines == null)
            onScreenLines = new Vector();

        onScreenLines.add(currentLine);
    }

    // We don't process these events but must declare the methods
    // here because we are obliged to implement all methods in
    // the interface.
    public void mouseClicked(MouseEvent evt) {
    }
    public void mouseEntered(MouseEvent evt) {
    }
    public void mouseExited(MouseEvent evt) {
    }

    // This method is responsible for painting the component.
    public void paintComponent(Graphics g) {
        // This will repaint the background
        super.paintComponent(g);

        if (onScreenLines == null)
            return;

        for (Enumeration e = onScreenLines.elements() ; e.hasMoreElements() ;) {
            Vector lines = (Vector)e.nextElement();

            Enumeration e2 = lines.elements();
            Point start = (Point)e2.nextElement();
            for (; e2.hasMoreElements() ;) {
                Point end = (Point)e2.nextElement();
                g.drawLine(start.x,start.y,end.x,end.y);
                start = end;
            }
        }
    }

    private Vector onScreenLines = null;
    private Vector currentLine = null;
}