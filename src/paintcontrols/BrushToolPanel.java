/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintcontrols;

/**
 *
 * @author claua
 */

import painttools.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BrushToolPanel extends PencilToolPanel {

    protected JButton[] strokeStyles;
    protected ButtonHandler handler;

    public BrushToolPanel(Tool tool, int stroke) {
        super(tool, stroke);

        setLayout(new FlowLayout());

        strokeStyles = new JButton[3];

        handler = new ButtonHandler();

    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            for (JButton strokeStyle : strokeStyles) {
                if (event.getSource() == strokeStyle) {
                    repaint();
                }
            }
        }
    }
}
