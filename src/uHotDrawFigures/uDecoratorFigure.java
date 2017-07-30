package uHotDrawFigures;

import java.awt.Graphics;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uDecoratorFigure extends uAbstractFigure {
    protected uAbstractFigure innerFigure;

    @Override
    public void draw(Graphics g) {
        this.innerFigure.draw(g);
    }
}