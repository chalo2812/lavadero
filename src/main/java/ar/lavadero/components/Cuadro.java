package ar.lavadero.components;

import javax.swing.*;

/**
 * Clase con JFrame de Swing
 * @author gsola - Gonzalo Sola
 */
public class Cuadro extends JFrame {

    public Cuadro(String nombre){
        super(nombre);
    }

    public void asignarCuadro(BarraMenu barraMenu) {
        this.setJMenuBar(barraMenu);
    }

}
