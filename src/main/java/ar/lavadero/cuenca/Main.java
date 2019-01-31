package ar.lavadero.cuenca;

import javax.swing.*;
import java.awt.*;

public class Main extends JApplet {

    public static void main(String[] args) {
        JFrame f = new JFrame("Aplicación");
        Main ta = new Main();

        f.getContentPane().setLayout(new BorderLayout());
        f.getContentPane().add("Center", ta);
        int width = 400;
        int height = 400;
        f.setSize(width, height);
        ta.init();
        ta.start();
        ta.show();
    }
}
