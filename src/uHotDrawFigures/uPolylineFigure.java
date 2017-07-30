package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uPolylineFigure extends uAbstractFigure {
    protected ArrayList<Point> polyline;
    
    public uPolylineFigure () {
        this.polyline = new ArrayList<>();
    }
    
    public uPolylineFigure (uPolylineFigure p) {
        this.polyline = p.polyline;
    }
    
    public void setPolyline (ArrayList<Point> l) {
        this.polyline = l;
    }
    
    public ArrayList<Point> getPolyline () {
        return this.polyline;
    }
    
    @Override
    public IFigure clone() {
        uPolylineFigure copy = new uPolylineFigure(this);
        return copy;
    }
    
    @Override
    public void draw (Graphics g) {
        g.setColor(Color.red);
        for (Point p : this.polyline) {
            if (!(this.polyline.indexOf(p) == this.polyline.size() - 1)) {
                g.drawLine((int) p.getX(), (int) p.getY(), (int) this.polyline.get(this.polyline.indexOf(p) + 1).getX(), (int) this.polyline.get(this.polyline.indexOf(p) + 1).getY());
            }
        }
    }
    
    public void addPoint (Point p) {
        this.polyline.add(p);
    }
}