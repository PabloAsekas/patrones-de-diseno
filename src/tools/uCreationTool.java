package tools;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import uHotDrawFigures.*;
import uHotDrawFiguresFramework.*;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uCreationTool extends uAbstractTool {
    protected uAbstractFigure prototype;
    
    public IFigure creationFigure(){
        return prototype.clone();
    }
    
    public uCreationTool (uDrawingView view, uAbstractFigure figure){
        this.view = view;
        this.prototype = figure;
    }
    
    public void setPrototype (uAbstractFigure figure) {
        this.prototype = figure;
    }
    
    public uAbstractFigure getPrototype() {
        return this.prototype;
    }
    
    public void mouseUp(MouseEvent e){
        IFigure f = creationFigure();
        Rectangle r = f.getDisplayBox();
        Point p = new Point(e.getX() - r.x, e.getY() - r.y);
        f.moveBy(p.getX(), p.getY());
        this.view.getDrawing().add(f);
    }
}