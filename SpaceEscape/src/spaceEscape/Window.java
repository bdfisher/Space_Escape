package spaceEscape;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Window {

	private JFrame frame;
	private JTextField txtSpaceEscape;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtSpaceEscape = new JTextField();
		txtSpaceEscape.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpaceEscape.setForeground(Color.WHITE);
		txtSpaceEscape.setBackground(Color.BLACK);
		txtSpaceEscape.setFont(new Font("Bodoni 72 Oldstyle", Font.BOLD, 24));
		txtSpaceEscape.setText("Space Escape");
		txtSpaceEscape.setBounds(140, 6, 191, 49);
		frame.getContentPane().add(txtSpaceEscape);
		txtSpaceEscape.setColumns(10);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setFont(new Font("Bodoni 72 Oldstyle", Font.BOLD, 13));
		btnNewButton.setBounds(175, 180, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/mikebehnke/Downloads/SpacePic.jpg"));
		lblNewLabel.setBounds(0, 6, 450, 266);
		frame.getContentPane().add(lblNewLabel);
	}
}
