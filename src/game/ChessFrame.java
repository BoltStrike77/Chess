package game;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class ChessFrame extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChessFrame frame = new ChessFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

    public ChessFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new ChessPanel());
        setTitle("Chess");
        setResizable(false);
        pack();
    }    
}

