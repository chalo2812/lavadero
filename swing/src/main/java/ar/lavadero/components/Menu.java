package ar.lavadero.components;

import javax.swing.*;

/**
 * Clase con JMenu de Swing
 * @author gsola - Gonzalo Sola
 */
public class Menu extends JMenu {

    public Menu(String nombre){
        super(nombre);
    }

    public void agregar(ItemMenu itemMenuAbrir) {
        this.add(itemMenuAbrir);
    }

    public void agregarSeparador() {
        this.addSeparator();
    }

}
