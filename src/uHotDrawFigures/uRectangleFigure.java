package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uRectangleFigure extends uAbstractFigure {
   
    public uRectangleFigure (int x, int y, int w, int h) {
        super();
        this.getDisplayBox().setRect(x, y, w, h);
    }
    
    public uRectangleFigure() {
        super();
    }
    
    @Override
    /*public void draw(Graphics r) {
        r.drawRect(20, 20, 50, 50);
        r.setColor(Color.green);
    }*/
    
    public void draw(Graphics g) {
        //g.setColor(Color.green); quitamos el color para que se note la selección
        g.drawRect((int) this.getDisplayBox().getX(), (int) this.getDisplayBox().getY(), (int) this.getDisplayBox().getWidth(), (int) this.getDisplayBox().getHeight());
    }
    
    public IFigure clone() {
        uRectangleFigure copy = new uRectangleFigure ((int) this.getDisplayBox().getX(), (int) this.getDisplayBox().getY(), (int) this.getDisplayBox().getWidth(), (int) this.getDisplayBox().getHeight());
        return copy;
    }
}