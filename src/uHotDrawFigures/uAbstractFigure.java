package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uAbstractFigure implements IFigure {
    
    protected Rectangle displayBox;
    
    /*public uAbstractFigure() {
        displayBox.setSize(30, 30);
        displayBox.setLocation(20, 20);
    }*/
    
    public uAbstractFigure () {
        this.displayBox = new Rectangle(20, 20, 30, 30);
    }
    
    @Override
    /*public void draw(Graphics g) {
        g.drawOval(10, 10, 50, 50);
        g.setColor(Color.red);
    }*/
    
    public void draw(Graphics g) {
        g.setColor(Color.yellow);
        g.drawOval((int) displayBox.getX(), (int) displayBox.getY(), (int) displayBox.getWidth(), (int) displayBox.getHeight());
    }
    
    @Override
    public void containsPoint (Graphics g){}
    
    @Override
    public void displayBox (Graphics g){}
    
    @Override
    public void moveBy (Graphics g){}
    
    public void setDisplayBox (Rectangle a){
        this.displayBox = a;
    }

    @Override
    public Rectangle getDisplayBox () {
        return displayBox;
    }
    
    @Override
    public void moveBy (double dx, double dy) {
        int x = (int) dx;
        int y = (int) dy;
        this.displayBox.translate(x, y);
    }
    
    public boolean containsPoint (double dx, double dy) {
        return (this.displayBox.contains(dx, dy));
    }

    @Override
    public IFigure clone() {
        return this;
    }
}