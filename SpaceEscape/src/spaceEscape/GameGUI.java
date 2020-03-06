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
import java.awt.BorderLayout;


public class GameGUI {
	private JFrame menu;
	private JFrame start;
	private JFrame investigate;
	private JFrame dontInvestigate;
	private JFrame left1;
	private JFrame right1;
	private JFrame window;
	private JFrame door;
	private JFrame void1;
	private JFrame back2Cell;
	private JFrame run;
	private JFrame wait;
	private JFrame left2;
	private JFrame right2;
	private JFrame left3;
	private JFrame right3;
	private JFrame freeze;
	private JFrame hide;
	private JFrame stay;
	private JFrame reason;
	private JFrame resist;
	private JFrame comply;
	private JFrame robert;
	private JFrame martin;
	private JFrame joe;
	private JFrame joinRob;
	private JFrame noToRob;
	private JFrame left4;
	private JFrame right4;
	private JFrame left5;
	private JFrame right5;
	private JFrame winScreen;
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameGUI window = new GameGUI();
					window.menu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public GameGUI()
	{
		initialize();
	}
	
	public void initialize()
	{
		menu = new JFrame();
		menu.getContentPane().setBackground(new Color(0, 0, 0));
		menu.setUndecorated(true);
		menu.setVisible(true);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Play");
		menu.getContentPane().setLayout(new BorderLayout(0, 0));

		btnNewButton.setFont(new Font("Bodoni 72 Oldstyle", Font.BOLD, 13));
		btnNewButton.setBounds(menu.getWidth(), menu.getHeight(), 120, 30);
		menu.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JTextArea txtrSpaceEscape = new JTextArea();
		txtrSpaceEscape.setFont(new Font("Bodoni 72 Smallcaps", Font.BOLD, 24));
		txtrSpaceEscape.setForeground(Color.WHITE);
		txtrSpaceEscape.setBackground(Color.BLACK);
		txtrSpaceEscape.setText("Space Escape");
		txtrSpaceEscape.setBounds(menu.getHeight(), menu.getWidth(), 125, 30);
		menu.getContentPane().add(txtrSpaceEscape);
		
		JLabel lblNewLabel = new JLabel("Space Escape");
		lblNewLabel.setIcon(new ImageIcon("/Users/mikebehnke/Downloads/SpacePic.jpg"));
		lblNewLabel.setBounds(0, 0, 450, 278);
		menu.getContentPane().add(lblNewLabel);
	}
}
