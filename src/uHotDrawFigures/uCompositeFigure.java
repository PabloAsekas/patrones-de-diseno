package uHotDrawFigures;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uCompositeFigure extends uAbstractFigure {
    ArrayList <IFigure> figures;
    
    public uCompositeFigure() {
        this.figures = new ArrayList<IFigure>();
    }
    
    public void add (IFigure f) {
        this.figures.add(f);
    }
    
    public void remove (IFigure f) {
        this.figures.remove(f);
    }
    
    public ArrayList<IFigure> getFigures () {
        return this.figures;
    }
    
    @Override
    public void draw (Graphics g) {
        for(IFigure figure: this.figures){
            figure.draw(g);
        }
    }
    
    public IFigure findFigure(int x, int y){
        IFigure figure = null;
        for(IFigure f: this.figures){
            if(f.getDisplayBox().contains(new Point(x,y)))
                figure = f;   
        }
        return figure;
    }
    
    public ArrayList<IFigure> findFigures(Rectangle rectangle){
        ArrayList figures = new ArrayList<IFigure>();
        for(IFigure f: this.figures){
            if(rectangle.contains(f.getDisplayBox()))
                figures.add(f);
        }
        return figures;
    }
}