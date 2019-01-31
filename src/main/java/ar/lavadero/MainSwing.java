package ar.lavadero;

import ar.lavadero.components.*;
import org.slf4j.*;
import javax.swing.*;
import java.awt.event.*;

public class MainSwing implements ActionListener {

    public static Logger logger = LoggerFactory.getLogger(MainSwing.class);

    public MainSwing() {
        Cuadro f = new Cuadro("Lavadero 1.0 Swing");
        f.setSize(800, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BarraMenu barraMenu = new BarraMenu();

        Menu jmFile = new Menu("Archivos");
        ItemMenu itemMenuAbrir = new ItemMenu("Abrir");
        ItemMenu itemMenuCerrar = new ItemMenu("Cerrar");
        ItemMenu itemMenuGuardar = new ItemMenu("Guardar");
        ItemMenu itemMenuSalir = new ItemMenu("Salir");
        jmFile.add(itemMenuAbrir);
        jmFile.add(itemMenuCerrar);
        jmFile.add(itemMenuGuardar);
        jmFile.addSeparator();
        jmFile.add(itemMenuSalir);
        itemMenuAbrir.addActionListener(this);
        itemMenuCerrar.addActionListener(this);
        itemMenuGuardar.addActionListener(this);
        itemMenuSalir.addActionListener(this);
        barraMenu.add(jmFile);

        /*JMenu jmOptions = new JMenu("Options");
        JMenu a = new JMenu("A");
        JMenuItem b = new JMenuItem("B");
        JMenuItem c = new JMenuItem("C");
        JMenuItem d = new JMenuItem("D");
        a.add(b);
        a.add(c);
        a.add(d);
        jmOptions.add(a);
        JMenu e = new JMenu("E");
        e.add(new JMenuItem("F"));
        e.add(new JMenuItem("G"));
        jmOptions.add(e);
        jmb.add(jmOptions);
        JMenu jmHelp = new JMenu("Help");
        JMenuItem jmiAbout = new JMenuItem("About");
        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);
        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        jmiAbout.addActionListener(this);*/

        f.setJMenuBar(barraMenu);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();
        logger.info(comStr + " Selected");
    }
    public static void main(String args[]) {
        new MainSwing();
    }

}
