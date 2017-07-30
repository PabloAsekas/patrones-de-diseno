package uHotDrawFigures;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public interface IFigure {
    public void draw (Graphics g);
    public void containsPoint (Graphics g);
    public void moveBy (Graphics g);
    public void moveBy (double x, double y);
    public void displayBox (Graphics g);
    public IFigure clone();
    public Rectangle getDisplayBox();
}