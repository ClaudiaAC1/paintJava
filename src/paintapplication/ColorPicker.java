/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintapplication;

/**
 *
 * @author claua
 */

import painttools.Tool;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ColorPicker extends JPanel {

    protected ColorOptionBox[] colorOptions;
    protected ArrayList points;

    protected JPanel currentClrPanel;

    protected Color[] colors;

    protected Color color;

    public ColorPicker() {
        //setBackground(Color.red);
        setPreferredSize(new Dimension(90, 70));
        setLayout(new BorderLayout());

        color = Color.black;

        currentClrPanel = new JPanel();
        currentClrPanel.setBackground(Color.pink);
        currentClrPanel.setPreferredSize(new Dimension(90, 70));

        currentClrPanel.addMouseListener(
                new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                if (Main.paint.drawPanel.getTool() != Tool.ERASER) {
                    currentClrPanel.setBackground(
                            JColorChooser.showDialog(Main.paint, "Change Color",
                                    Main.paint.drawPanel.brushColor));
                    color = currentClrPanel.getBackground();
                    Main.paint.drawPanel.tool.setColor(currentClrPanel.getBackground());
                    Main.paint.drawPanel.setBrushColor(color);

                }
            }
        }
        );

        this.add(currentClrPanel, BorderLayout.WEST);
    }

    public void deselectAll() {
        for (int i = 0; i < colorOptions.length; i++) {
            colorOptions[i].selected = false;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
