package tools;

import java.awt.event.MouseEvent;
import uHotDrawFiguresFramework.uDrawingView;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public abstract class uAbstractTool {
    protected uDrawingView view;

    public void mouseUp(MouseEvent e) {}
    public void mouseDown(MouseEvent e) {}
    public void mouseMove(MouseEvent aEvent) {}
    public void mouseDrag(MouseEvent aEvent) {}
}