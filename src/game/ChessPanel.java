package game;

import javax.swing.JPanel;
import java.awt.Dimension;

public class ChessPanel extends JPanel {
    private final int HEIGHT = 800;
    private final int WIDTH = 700;
    private Dimension SIZE = new Dimension(HEIGHT, WIDTH);

    public ChessPanel() {
        setPreferredSize(SIZE);
    }
}
