package ar.lavadero;

import ar.lavadero.components.*;
import org.slf4j.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;

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
        ImageIcon logo = new ImageIcon("/opt/codigoFuenteMio/demo1/lavadero/src/main/" +
                "assets/lavarropa.png");
        BarraMenu barraMenu = new BarraMenu();
        ar.lavadero.components.Menu menu = new ar.lavadero.components.Menu("Archivos");
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

        ar.lavadero.components.Menu facturacion = new ar.lavadero.components.Menu("Facturación");
        ItemMenu comprobante = new ItemMenu("Comprobante");
        facturacion.agregar(comprobante);
        comprobante.addActionListener(this);
        barraMenu.add(facturacion);

        ar.lavadero.components.Menu ayuda = new ar.lavadero.components.Menu("Ayuda");
        ItemMenu acercaDe = new ItemMenu("Acerca de");
        ayuda.agregar(acercaDe);
        barraMenu.add(ayuda);

        itemMenuAbrir.addActionListener(this);
        itemMenuGuardar.addActionListener(this);
        itemMenuSalir.addActionListener(this);
        acercaDe.addActionListener(this);

        f.asignarCuadro(barraMenu);
        f.setIconImage(logo.getImage());
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new MainSwing();
    }

    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();
        if (comStr.equals("Salir")) {
            System.exit(0);
        } else if (comStr.equals("Acerca de")) {
            Ayuda cuadroAyuda = new Ayuda("Ayuda");
            cuadroAyuda.crearAyuda(cuadroAyuda);
            ImageIcon logo = new ImageIcon("/opt/codigoFuenteMio/demo1/lavadero/src/main/assets/" +
                    "lavarropa1.png");
            cuadroAyuda.setIconImage(logo.getImage());
            cuadroAyuda.setVisible(true);
        } else if (comStr.equals("Comprobante")){
            try {
                Desktop.getDesktop().browse(new URI("https://auth.afip.gob.ar/contribuyente_/" +
                        "login.xhtml"));
            } catch (Exception e) {
                logger.error(e.getStackTrace().toString());
            }
        }
    }
}
