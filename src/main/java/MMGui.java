import javax.swing.*;
import java.awt.*;

/**
 * Created by Artur on 2017-03-20.
 */
public class MMGui extends JFrame {
    public static void main(String[] args) {
        new MMGui();
    }

    public MMGui() throws HeadlessException {
        setTitle("Manager aut");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 550);
        setLayout(null);
        secretCodePanel = new secretCodePanel(this);

        secretCodePanel.setLocation(230, 30);
        add(secretCodePanel);
    }
}

