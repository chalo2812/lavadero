package ar.lavadero;

import ar.lavadero.components.*;
import ar.lavadero.components.Menu;
import org.slf4j.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase Principal con Swing
 * @author gsola - Gonzalo Sola
 */

public class MainSwing extends JFrame implements ActionListener {

    public static Logger logger = LoggerFactory.getLogger(MainSwing.class);

    public MainSwing() {

        Cuadro f = new Cuadro("Lavadero 1.0 Swing");
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setMinimumSize(new Dimension(400,400));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BarraMenu barraMenu = new BarraMenu();
        Menu menu = new Menu("Archivos");
        ItemMenu itemMenuAbrir = new ItemMenu("Abrir");
        ItemMenu itemMenuGuardar = new ItemMenu("Guardar");
        ItemMenu itemMenuSalir = new ItemMenu("Salir");
        menu.agregar(itemMenuAbrir);
        menu.agregar(itemMenuGuardar);
        menu.agregarSeparador();
        menu.agregar(itemMenuSalir);
        itemMenuAbrir.addActionListener(this);
        itemMenuGuardar.addActionListener(this);
        itemMenuSalir.addActionListener(this);

        barraMenu.add(menu);
        Menu a = new Menu("A");
        ItemMenu b = new ItemMenu("B");
        ItemMenu c = new ItemMenu("C");
        ItemMenu d = new ItemMenu("D");
        a.add(b);
        a.add(c);
        a.add(d);

        Menu ayuda = new Menu("Ayuda");
        ItemMenu acercaDe = new ItemMenu("Acerca de");
        ayuda.add(acercaDe);
        barraMenu.add(ayuda);

        itemMenuAbrir.addActionListener(this);
        itemMenuGuardar.addActionListener(this);
        itemMenuSalir.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        acercaDe.addActionListener(this);

        f.asignarCuadro(barraMenu);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new MainSwing();
    }

    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();
        if (comStr.equals("Salir")) {
            System.exit(0);
        }
        /*else if (comStr.equals("Abrir")) {
            JOptionPane.showMessageDialog(this,"You hit Open");
        }*/
    }
}
