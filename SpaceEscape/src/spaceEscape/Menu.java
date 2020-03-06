package spaceEscape;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setFont(new Font("Bodoni 72", Font.BOLD, 13));
		btnNewButton.setBounds(frame.getWidth() / 2 - 60, 195, 120, 30);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Space Escape");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bodoni 72", Font.BOLD, 24));
		lblNewLabel.setBounds(frame.getWidth() / 2 - 60, 30, 135, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		frame.getContentPane().add(lblNewLabel_1);
	}

}
