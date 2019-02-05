package ar.lavadero;

import ar.lavadero.components.*;
//import org.slf4j.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Clase Principal con Swing
 * @author gsola - Gonzalo Sola
 */

public class MainSwing implements ActionListener {

  //  public static Logger logger = LoggerFactory.getLogger(MainSwing.class);

    public MainSwing() {
        Cuadro f = new Cuadro("Lavadero 1.0 Swing");
        f.setSize(800, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BarraMenu barraMenu = new BarraMenu();

        Menu menu = new Menu("Archivos");
        ItemMenu itemMenuAbrir = new ItemMenu("Abrir");
        ItemMenu itemMenuCerrar = new ItemMenu("Cerrar");
        ItemMenu itemMenuGuardar = new ItemMenu("Guardar");
        ItemMenu itemMenuSalir = new ItemMenu("Salir");
        menu.add(itemMenuAbrir);
        menu.add(itemMenuCerrar);
        menu.add(itemMenuGuardar);
        menu.addSeparator();
        menu.add(itemMenuSalir);
        itemMenuAbrir.addActionListener(this);
        itemMenuCerrar.addActionListener(this);
        itemMenuGuardar.addActionListener(this);
        itemMenuSalir.addActionListener(this);

        barraMenu.add(menu);

        f.setJMenuBar(barraMenu);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();
        //logger.info(comStr + " Selected");
    }
    public static void main(String args[]) {
        new MainSwing();
    }

}
