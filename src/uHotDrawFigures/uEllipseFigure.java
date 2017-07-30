package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uEllipseFigure extends uAbstractFigure {
    
    public uEllipseFigure (int x, int y, int w, int h) {
        super();
        this.getDisplayBox().setRect(x, y, w, h);
    }
    
    public uEllipseFigure() {
        super();
    }
    
    @Override
    /*public void draw(Graphics e) {
      e.drawOval(30, 40, 50, 50);
      e.setColor(Color.blue);
    }*/
    
    public void draw(Graphics g) {
        g.setColor(Color.blue);
        g.drawOval((int) this.getDisplayBox().getX(), (int) this.getDisplayBox().getY(), (int) this.getDisplayBox().getWidth(), (int) this.getDisplayBox().getHeight());
    }
    
    @Override
    public IFigure clone() {
        uEllipseFigure copy = new uEllipseFigure((int) this.getDisplayBox().getX(), (int) this.getDisplayBox().getY(), (int) this.getDisplayBox().getWidth(), (int) this.getDisplayBox().getHeight());
        return copy;
    }   
}