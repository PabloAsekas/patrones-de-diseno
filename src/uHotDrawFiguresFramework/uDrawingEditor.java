package uHotDrawFiguresFramework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import tools.*;
import uHotDrawFigures.uEllipseFigure;
import uHotDrawFigures.uPolylineFigure;
import uHotDrawFigures.uRectangleFigure;

/**
 *
 * Pablo Bermejo
 * https://github.com/PabloAsekas/
 *
 **/

public class uDrawingEditor extends JFrame implements ActionListener {
    protected uDrawingView view;
    protected ArrayList<uAbstractTool> tools;
    protected uAbstractTool currentTool;
    protected JButton b4, b5, b6, b7;
    protected uAbstractTool rT, eT, pT, sT;
    
    public uDrawingEditor() {
        super();
        JPanel barraHerramientas = new JPanel();
        
        b4 = new JButton("Rectángulo");
        b4.setActionCommand("r");
        b4.addActionListener(this);
        barraHerramientas.add(b4);
        
        b5 = new JButton("Elipse");
        b5.setActionCommand("e");
        b5.addActionListener(this);
        barraHerramientas.add(b5);
        
        b6 = new JButton("Línea poligonal");
        b6.setActionCommand("p");
        b6.addActionListener(this);
        barraHerramientas.add(b6);
        
        b7 = new JButton("Seleccionar");
        b7.setActionCommand("s");
        b7.addActionListener(this);
        barraHerramientas.add(b7);
        
        this.view=new uDrawingView();
        this.view.setEditor(this);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(barraHerramientas, BorderLayout.NORTH);
        this.getContentPane().add((uDrawingView)view, BorderLayout.CENTER);
        this.setVisible(true);
        this.pack();
        
        rT = new uCreationTool(this.getView(), new uRectangleFigure(0, 0, 10, 10));
        eT = new uCreationTool(this.getView(), new uEllipseFigure(0, 0, 10, 10));
        pT = new uPolylineCreationTool(this.getView(), new uPolylineFigure());
        sT = new uSelectionTool(this.getView());
        currentTool = rT;
    }
    
    public uDrawingView getView () {
        return this.view;
    }
    
    public void setView (uDrawingView v) {
        this.view = v;
        this.setContentPane(v);
    }
    
    public ArrayList<uAbstractTool> getTool() {
        return this.tools;
    }
    
    public void setTools(ArrayList<uAbstractTool> a) {
        this.tools = a;
    }
    
    public uAbstractTool getCurrentTool() {
        return this.currentTool;
    }
    
    public void setCurrentTool(uAbstractTool a) {
        this.currentTool = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if ("e".equals(e.getActionCommand())) {
           setCurrentTool(eT);
       }
       if ("r".equals(e.getActionCommand())) {
           setCurrentTool(rT);
       }
       if ("p".equals(e.getActionCommand())) {
           setCurrentTool(pT);
       }
       if ("s".equals(e.getActionCommand())) {
            setCurrentTool(sT);
       }
    }
}