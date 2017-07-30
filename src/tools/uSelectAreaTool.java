package tools;

import java.awt.event.MouseEvent;
import uHotDrawFigures.IFigure;
import uHotDrawFigures.uRectangleFigure;
import uHotDrawFiguresFramework.uDrawingView;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uSelectAreaTool extends uAbstractTool {
    uDrawingView v;
    uRectangleFigure rf;
    
    public uSelectAreaTool(uDrawingView dv){
        v = dv;
    }
    
    public void mouseDown(MouseEvent e){
        rf = new uRectangleFigure(e.getX(), e.getY(), 0, 0);
        v.getDrawing().add(rf);
    }
    
    public void mouseUp(MouseEvent e){
        v.getDrawing().remove(rf);
        v.clearSelection();
        for (IFigure f : v.getDrawing().findFigures(rf.getDisplayBox())) {
            v.addToSelection(f);
        }
    }
    
    public void mouseDrag(MouseEvent e){
        int rx = rf.getDisplayBox().x;
        int ry = rf.getDisplayBox().y;
        int w = e.getX() - rx;
        int h = e.getY() - ry;
        rf.getDisplayBox().setSize(w,h);
    }
    
    public void mouseMove(MouseEvent e){}
}