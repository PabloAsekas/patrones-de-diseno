package uHotDrawFigures;

import java.awt.Dimension;
import java.awt.Rectangle;
import uHotDrawFiguresFramework.uDrawing;
import uHotDrawFiguresFramework.uDrawingEditor;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class EjercicioMP {

    public static void main(String[] args) {
        //uDrawingView v = new uDrawingView();
        uDrawing d = new uDrawing();
        uRectangleFigure f1 = new uRectangleFigure();
        uEllipseFigure f2 = new uEllipseFigure();
        Rectangle r2 = new Rectangle(50, 50, 60, 60);
        f2.setDisplayBox(r2);
        Rectangle r1 = new Rectangle(10, 10, 30, 30);
        f1.setDisplayBox(r1);
        d.add(f1);
        d.add(f2);
        //v.setDrawing(d);
        //v.setPreferredSize(new Dimension(320,240));
        uDrawingEditor e = new uDrawingEditor();
        e.getView().setDrawing(d);
        e.getView().setPreferredSize(new Dimension(320, 240));
        e.setVisible(true);
        e.pack();        
    }
}