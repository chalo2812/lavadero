package ar.lavadero;

import javax.swing.*;
import java.awt.*;
import org.slf4j.*;

public class MainApplet extends JApplet {

    public static Logger logger = LoggerFactory.getLogger(MainApplet.class);

    public static void main(String[] args) {
        JFrame f = new JFrame("Aplicación");
        MainApplet ta = new MainApplet();
        logger.info("entre");
        f.getContentPane().setLayout(new BorderLayout());
        f.getContentPane().add("Center", ta);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 800;
        f.setSize(width, height);
        ta.init();
        ta.start();
        f.show();
    }
}
