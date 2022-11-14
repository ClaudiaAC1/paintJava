package paintapplication;

/**
 *
 * @author claua
 */

import paintcontrols.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class PaintApplication extends JFrame
{
    public ObjectOutputStream output;
    public ObjectInputStream input;

    public DrawPanel drawPanel;
    protected ColorPicker colorPicker;
    public PaintToolPanel paintTools;

    public PaintApplication()
    {
        this.
        setSize(1024, 768);
        setLayout(new BorderLayout());
        
        drawPanel   = new DrawPanel();        
        colorPicker = new ColorPicker();
        paintTools  = new PaintToolPanel();
        
        add(colorPicker,BorderLayout.SOUTH); //panel de colores
        add(paintTools, BorderLayout.WEST); //panel de botones
        paintTools.add(colorPicker);
        add(drawPanel,  BorderLayout.CENTER); //panel de hoja
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        synchronizeStartingColor();
    }
    
    public void synchronizeStartingColor()
    {
        colorPicker.currentClrPanel.setBackground(Color.black); //color de incio del panel de colores
        colorPicker.color = colorPicker.currentClrPanel.getBackground();
        drawPanel.tool.setColor(colorPicker.currentClrPanel.getBackground());
        drawPanel.setBrushColor(colorPicker.color);
    }


}
