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
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, statusPanel;
	JLabel titleNameLabel, statusLabel, statusLabelStatus;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 84);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	String status, position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	
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
		
		mainTextArea = new JTextArea();
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
		
		choice1 = new JButton();
		choice1.setBackground(Color.white);
		choice1.setForeground(Color.black);
		choice1.setFont(normalFont);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		choice2 = new JButton();
		choice2.setBackground(Color.white);
		choice2.setForeground(Color.black);
		choice2.setFont(normalFont);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		choice3 = new JButton();
		choice3.setBackground(Color.white);
		choice3.setForeground(Color.black);
		choice3.setFont(normalFont);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		choice4 = new JButton();
		choice4.setBackground(Color.white);
		choice4.setForeground(Color.black);
		choice4.setFont(normalFont);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
		statusPanel = new JPanel();
		statusPanel.setBounds(100, 15, 600, 50);
		statusPanel.setBackground(Color.black);
		statusPanel.setLayout(new GridLayout(1, 2));
		con.add(statusPanel);
		statusLabel = new JLabel("STATUS: ");
		statusLabel.setFont(normalFont);
		statusLabel.setForeground(Color.white);
		statusPanel.add(statusLabel);
		statusLabelStatus = new JLabel();
		statusLabelStatus.setFont(normalFont);
		statusLabelStatus.setForeground(Color.white);
		statusPanel.add(statusLabelStatus);
		
		playerSetup();
		
	}
	
	public void playerSetup()
	{
		status = "ALIVE";
		statusLabelStatus.setText(status);
		
		cell();
	}
	
	public void cell()
	{
		position = "cell";
		mainTextArea.setText("You wake up, head pounding, in a dark small cellin an unknown place. You are hungry and afraid.\nYou can hear weird voices, in a language you've\nnever heard before. \n\nDo you investigate or not?");
		choice1.setText("Investigate");
		choice2.setText("Wait in cell");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void investigate()
	{
		position = "investigate";
		mainTextArea.setText("You get up and walk towards your cell door. You see light down the hallway. Your cell door is unlocked. Do you choose to go right or left?");
		choice1.setText("Left, towards darkness");
		choice2.setText("Right, towards voices");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void waitInCell()
	{
		position = "waitInCell";
		mainTextArea.setText("After what feels like hours of sitting in your cell,\nstrange looking aliens are come and try to take you\nsomewhere. \n\nWhat do you do?");
		choice1.setText("Resist");
		choice2.setText("Comply");
		choice3.setText("");
		choice4.setText("");
	}
	
	public class TitleScreenHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			createGameScreen();
		}
	}
	
	public class ChoiceHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String yourChoice = event.getActionCommand();
			
			switch(position)
			{
			case "cell":
				switch(yourChoice)
				{
				case "c1": investigate(); break;
				case "c2": waitInCell(); break;
				}
				break;
			case "investigate":
				switch(yourChoice)
				{
				case "c1": break;
				case "c2": break;
				}
				break;
			case "waitInCell":
				switch(yourChoice)
				{
				case "c1": break;
				case "c2": break;
				}
			}
		}
	}
}
