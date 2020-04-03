import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
	
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 84);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	
	public static void main(String [] args)
	{
		new Game();
	}
	
	public Game()
	{
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("SPACE ESCAPE");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.white);
		startButton.setForeground(Color.black);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		
		window.setVisible(true);
	}
	
	public void createGameScreen()
	{
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("You wake up, head pounding, in a dark small cell in an unknown place. You are hungry and afraid. You can hear weird voices, in a language you've never heard before. Do you investigate or not?");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4, 1));
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Investigate");
		choice1.setBackground(Color.white);
		choice1.setForeground(Color.black);
		choice1.setFont(normalFont);
		choiceButtonPanel.add(choice1);
		choice2 = new JButton("Don't Investigate");
		choice2.setBackground(Color.white);
		choice2.setForeground(Color.black);
		choice2.setFont(normalFont);
		choiceButtonPanel.add(choice2);
		
		/*
		choice3 = new JButton();
		choice3.setBackground(Color.white);
		choice3.setForeground(Color.black);
		choice3.setFont(normalFont);
		choiceButtonPanel.add(choice3);
		choice4 = new JButton();
		choice4.setBackground(Color.white);
		choice4.setForeground(Color.black);
		choice4.setFont(normalFont);
		choiceButtonPanel.add(choice4);
		*/
		
		
	}
	
	public class TitleScreenHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			createGameScreen();
		}
	}
}
