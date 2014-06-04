import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Jake on 04/06/2014.
 */
public class Boot extends JFrame {

    private Image loadingImage;
    private final JButton button;

    public Boot() {
        super("Click me!");

        try {
            loadingImage = Toolkit.getDefaultToolkit().createImage(new URL("http://i.imgur.com/LcWmfbD.gif"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        button = new JButton();
        button.setBorder(null);

        final ImageIcon imageIcon = new ImageIcon(loadingImage);
        button.setIcon(imageIcon);
        button.setSelectedIcon(imageIcon);
        button.setRolloverIcon(imageIcon);
        button.setRolloverSelectedIcon(imageIcon);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(getContentPane(), "Jake is a nub");
            }
        });

        getContentPane().setBackground(Color.BLACK);
        getContentPane().add(button);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new WindowsLookAndFeel());
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        });

        final Boot boot = new Boot();
        boot.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        boot.pack();
        boot.setVisible(true);
    }
}
