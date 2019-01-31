package ar.lavadero;

import javax.swing.*;
import java.awt.*;
//import org.slf4j.*;

public class Main extends JApplet {

    //public static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        JFrame f = new JFrame("Aplicación");
        Main ta = new Main();
      //  logger.info("entre");
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
