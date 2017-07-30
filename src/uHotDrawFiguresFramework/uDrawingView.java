package uHotDrawFiguresFramework;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import listeners.IDrawingListener;
import tools.uAbstractTool;
import uHotDrawFigures.IFigure;
import uHotDrawFigures.uRectangleFigure;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uDrawingView extends JPanel implements MouseListener,MouseMotionListener, IDrawingListener {
    protected uDrawing drawing;
    protected uDrawingEditor editor;
    protected ArrayList<IFigure> list;
    
    public uDrawingView() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.list = new ArrayList<IFigure>();
    }
    
    public void setDrawing(uDrawing d) {
        this.drawing = d;
    }
    
    public uDrawing getDrawing() {
        return this.drawing;
    }
    
    public void setEditor(uDrawingEditor e) {
        this.editor = e;
    }
    
    public uDrawingEditor getEditor() {
        return this.editor;
    }
    
    @Override
    public void paint (Graphics g) {
        g.setColor(Color.green); //fijamos el color del primer cuadrdado que se pinta
        this.drawing.draw(g);
        g.setColor(Color.red);
        for(IFigure f : this.list){
            uRectangleFigure aux = new uRectangleFigure((int)f.getDisplayBox().getX(), (int)f.getDisplayBox().getY(), (int)f.getDisplayBox().getWidth(), (int)f.getDisplayBox().getHeight());
            aux.draw(g);
        }
    }

    @Override
    public void mousePressed(MouseEvent aEvent){
        tool().mouseDown(aEvent);
        this.editor.repaint();
    }
    
    @Override
    public void mouseReleased(MouseEvent aEvent){
        tool().mouseUp(aEvent);
        this.editor.repaint();
    }
    
    @Override
    public void mouseMoved(MouseEvent aEvent){
        tool().mouseMove(aEvent);
        this.editor.repaint();
    }
    
    @Override
    public void mouseDragged(MouseEvent aEvent){
        tool().mouseDrag(aEvent);
        this.editor.repaint();
    }
 
    public uAbstractTool tool(){
        return editor.getCurrentTool();
    }

    @Override
    public void mouseClicked(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
    
    public void clearSelection() {
        this.list = new ArrayList<IFigure>();
    }
    
    public void addToSelection(IFigure f) {
        this.list.add(f);
    }

    @Override
    public void drawingChanged() {
        this.editor.repaint();
    }
}