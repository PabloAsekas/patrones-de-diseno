package tools;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import uHotDrawFigures.IFigure;
import uHotDrawFiguresFramework.uDrawingView;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uDragTool extends uAbstractTool {
    
    private uDrawingView v;
    private IFigure figure;
    
    public uDragTool(uDrawingView dv, IFigure f){
        v = dv;
        figure = f;
    }
    
    public void mouseDown(MouseEvent e){
        this.v.addToSelection(this.figure);
    }
    
    public void mouseUp(MouseEvent e){}
    
    public void mouseDrag(MouseEvent e){
        Rectangle r = figure.getDisplayBox();
        Point p = new Point(e.getX()-r.x,e.getY()-r.y);
        figure.moveBy(p.getX(), p.getY());
    }
    
    public void mouseMove(MouseEvent e){}
}