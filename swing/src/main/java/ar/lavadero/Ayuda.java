package ar.lavadero;

import ar.lavadero.components.Cuadro;
import javax.swing.*;
import java.awt.*;

public class Ayuda extends Cuadro {

    Ayuda(String titulo){
        super(titulo);
    }

    public Cuadro crearAyuda(Cuadro f){
        f.setExtendedState(JFrame.NORMAL);
        Dimension ubicacion = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(ubicacion.width/2 - this.getSize().width/2, ubicacion.height/2 - this.getSize().height/2);
        f.setSize(400,400);


        return f;
    }

}