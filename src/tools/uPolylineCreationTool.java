package tools;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import uHotDrawFigures.IFigure;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFigures.uPolylineFigure;
import uHotDrawFiguresFramework.uDrawingView;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uPolylineCreationTool extends uCreationTool {
    
    public uPolylineCreationTool (uDrawingView view, uAbstractFigure figure) {
        super(view, figure);
    }
    
    public IFigure creationFigure(){
        uPolylineFigure prototype = (uPolylineFigure) this.getPrototype();
        uPolylineFigure figure = new uPolylineFigure();
        if (!(prototype.getPolyline().isEmpty())){
            figure = (uPolylineFigure) prototype.clone();
            return figure;
        }
        return figure;
    }
    
    @Override
    public void mouseUp(MouseEvent e){
        IFigure f = creationFigure();
        Rectangle r = f.getDisplayBox();
        Point p = new Point(e.getX(), e.getY());
        this.view.getDrawing().add(f);
    }
    
    @Override
    public void mouseDown(MouseEvent e) {
        uPolylineFigure prototype = (uPolylineFigure) getPrototype();
        prototype.addPoint(new Point(e.getPoint()));
    }
  
    @Override
    public void mouseMove(MouseEvent e) {}
  
    @Override
    public void mouseDrag(MouseEvent me) {}
}