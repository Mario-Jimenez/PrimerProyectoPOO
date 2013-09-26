package firstproyect;

import gui.Login;
import javax.swing.UIManager;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
        
        new Login().show(true);
        
    }
}
