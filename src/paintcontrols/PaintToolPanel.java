/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintcontrols;

/**
 *
 * @author claua
 */

import painttools.Tool;
import javax.swing.*;
import java.awt.*;

public class PaintToolPanel extends JPanel {

    protected ToolButton[] buttons;

 public ToolOptionPanel toolOptionPanel;

    public PaintToolPanel(){//ToolOptionPanel toolOptionPanel) {
        setBackground(new Color(255,204,153));
        setPreferredSize(new Dimension(100, 100));

        JPanel toolPanel = new JPanel();
        toolPanel.setLayout(new GridLayout(7, 1));
        toolPanel.setBackground(new Color(255,204,153));
        toolPanel.setPreferredSize(new Dimension(100, 530));

        buttons = new ToolButton[7];

        Icon[] icons = new ImageIcon[7];
        
        Icon pencil = new ImageIcon(getClass().getResource("lapiz.png"));
        Icon eraser = new ImageIcon(getClass().getResource("borrador.png"));
        Icon rectangle = new ImageIcon(getClass().getResource("rectangulo.png"));
        Icon oval = new ImageIcon(getClass().getResource("circulo.png"));
        Icon paintBucket = new ImageIcon(getClass().getResource("bote.png"));
        Icon polygon = new ImageIcon(getClass().getResource("poligono.png"));
        Icon lineTool = new ImageIcon(getClass().getResource("linea.png"));

        buttons[0] = new ToolButton(pencil, Tool.PENCIL);
        buttons[1] = new ToolButton(eraser, Tool.ERASER);
        buttons[2] = new ToolButton(paintBucket, Tool.FILLER);
        buttons[3] = new ToolButton(rectangle, Tool.RECTANGLE);
        buttons[4] = new ToolButton(oval, Tool.OVAL);
        buttons[5] = new ToolButton(lineTool, Tool.LINE);
        buttons[6] = new ToolButton(polygon, Tool.ROUND_RECT);

        for (ToolButton button : buttons) {
            toolPanel.add(button);
        }

        add(toolPanel);

    }

    public void setToolOptionPanel(ToolOptionPanel panel) {
        revalidate();
        repaint();
    }
}
