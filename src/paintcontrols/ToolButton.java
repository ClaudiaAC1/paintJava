package paintcontrols;

/**
 *
 * @author claua
 */

import painttools.Tool;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import paintapplication.*;

public class ToolButton extends JButton implements ActionListener {

    JLabel label;
    Tool tool;

    public ToolButton(String text, Tool tool) {
        label = new JLabel(text);
        add(label);
        this.tool = tool;
        addActionListener(this);
    }

    public ToolButton(Icon icon, Tool tool) {
        label = new JLabel(icon);
        add(label);
        this.setContentAreaFilled(false);
        this.tool = tool;
        this.setHorizontalTextPosition(CENTER);
        this.setBorderPainted(false);

        addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Main.paint.drawPanel.setTool(tool);
        System.out.println("Se a cambiado la herramienta " + this.tool);
        Main.paint.repaint();
    }
}
