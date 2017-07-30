package uHotDrawFiguresFramework;

import listeners.IFigureListener;
import uHotDrawFigures.uCompositeFigure;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uDrawing extends uCompositeFigure implements IFigureListener{
    protected uDrawing uDrawing;
    
    public uDrawing() {
        super();
    }
    
    public void setDrawing(uDrawing d) {
        this.uDrawing = d;
    }
    
    public uDrawing getDrawing() {
        return this.uDrawing;
    }

    @Override
    public void figureChanged() {}
}