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

public class RectShapeToolPanel extends DragShapeToolPanel {

    public RectShapeToolPanel(Tool tool, int stroke) {
        super(tool, stroke);

        repaint();
    }
}
