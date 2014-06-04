import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Jake on 04/06/2014.
 */
public class Boot extends JFrame {

    private Image loadingImage;

    public Boot() {
        try {
            loadingImage = Toolkit.getDefaultToolkit().createImage(new URL("http://i.imgur.com/LcWmfbD.gif"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        getContentPane().setBackground(Color.BLACK);
        getContentPane().add(new JLabel(new ImageIcon(loadingImage)));
    }

    public static void main(String[] args) {
        final Boot boot = new Boot();
        boot.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        boot.pack();
        boot.setVisible(true);
    }
}
