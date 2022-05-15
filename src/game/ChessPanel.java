package game;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class ChessPanel extends JPanel {
    private final int HEIGHT = 800;
    private final int WIDTH = 700;
    private Dimension SIZE = new Dimension(HEIGHT, WIDTH);
    private JLabel boardLBL;
    private JPanel boardPanel, infoPanel, logPanel;
    private ImageIcon boardIcon = new ImageIcon("src/images/board.png");
    
    public ChessPanel() {
        // set up panel
        this.setPreferredSize(SIZE);

        

        // set up board
        boardPanel = new JPanel();
        boardLBL = new JLabel(boardIcon);
        boardPanel.add(boardLBL);

        // order the panels
        this.add(boardPanel, BorderLayout.CENTER);
        this.add(infoPanel, BorderLayout.WEST);
        this.add(logPanel, BorderLayout.EAST);
    }

    
}
