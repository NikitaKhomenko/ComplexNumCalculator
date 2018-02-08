
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame {

	public MainFrame() {
		setTitle("Complex Numbers Calculator");
		setSize(new Dimension(660, 200));
		setLocationRelativeTo(null);
		
		setContentPane(new MainPanel());
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog (MainFrame.this, 
						"Tired of math?", "Exit", JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.YES_OPTION)
					System.exit(0);	
			}
		
		});
		setVisible(true);
	}

}


//
