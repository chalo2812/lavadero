package ar.lavadero;

import ar.lavadero.components.Cuadro;
import org.slf4j.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.*;

public class Ayuda extends Cuadro {

    public static Logger logger = LoggerFactory.getLogger(Ayuda.class);

    Ayuda(String titulo){
        super(titulo);
    }

    public Cuadro crearAyuda(Cuadro f){
        f.setExtendedState(JFrame.NORMAL);
        Dimension ubicacion = Toolkit.getDefaultToolkit().getScreenSize();
        logger.info("height es " + ubicacion.height + ", width es " + ubicacion.width);
        f.setLocation(ubicacion.width/2 - this.getSize().width/2, ubicacion.height/2 - this.getSize().height/2);
        f.setSize(400,400);


        return f;
    }

}