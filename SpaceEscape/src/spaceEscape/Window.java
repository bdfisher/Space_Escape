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
import javax.swing.JTextArea;

public class Window {

	private JFrame frame;

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
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setFont(new Font("Bodoni 72 Oldstyle", Font.BOLD, 13));
		btnNewButton.setBounds(175, 180, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea txtrSpaceEscape = new JTextArea();
		txtrSpaceEscape.setFont(new Font("Bodoni 72 Smallcaps", Font.BOLD, 24));
		txtrSpaceEscape.setForeground(Color.WHITE);
		txtrSpaceEscape.setBackground(Color.BLACK);
		txtrSpaceEscape.setText("Space Escape");
		txtrSpaceEscape.setBounds(161, 19, 122, 29);
		frame.getContentPane().add(txtrSpaceEscape);
		
		JLabel lblNewLabel = new JLabel("Space Escape");
		lblNewLabel.setIcon(new ImageIcon("/Users/mikebehnke/Downloads/SpacePic.jpg"));
		lblNewLabel.setBounds(0, 6, 450, 266);
		frame.getContentPane().add(lblNewLabel);
	}
}
