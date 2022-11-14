/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintcontrols;

/**
 *
 * @author claua
 */

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import painttools.Tool;

public abstract class ToolOptionPanel extends JPanel {

    Tool tool;
    Color color;

    public ToolOptionPanel(Tool tool) {
        this.tool = tool;

        setPreferredSize(new Dimension(164, 256));
        setBackground(Color.darkGray);
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public Color getColor() {
        return color;
    }
}
