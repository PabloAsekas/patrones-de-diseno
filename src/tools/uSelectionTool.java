package tools;

import java.awt.event.MouseEvent;
import uHotDrawFigures.IFigure;
import uHotDrawFiguresFramework.uDrawingView;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uSelectionTool extends uAbstractTool{
    private uDrawingView v;
    private uAbstractTool fChild;
    
    public uSelectionTool(uDrawingView v1){
        v = v1;
    }
    
    public IFigure findFigure(int x, int y){
        return v.getDrawing().findFigure(x, y);
    }
    
    @Override
    public void mouseDown(MouseEvent e){
        IFigure figure = findFigure(e.getX(), e.getY());
        if (figure != null) {
            fChild = new uDragTool(v, figure);
        } else {
            fChild = new uSelectAreaTool(v);
        }
        fChild.mouseDown(e);
    }
    
    @Override
    public void mouseUp(MouseEvent e){
        fChild.mouseUp(e);
    }
    
    @Override
    public void mouseDrag(MouseEvent e){
        fChild.mouseDrag(e);
    }
    
    @Override
    public void mouseMove(MouseEvent e){}
}