package uHotDrawFigures;

import java.awt.Graphics;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/
 
public class uBorderDecoratorFigure extends uDecoratorFigure{
    
    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.drawRect((int) innerFigure.getDisplayBox().getX(), (int) innerFigure.getDisplayBox().getY(), (int) innerFigure.getDisplayBox().getWidth(), (int) innerFigure.getDisplayBox().getHeight());
    }
}
