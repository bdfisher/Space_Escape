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
		
		position = "gameStart";
		
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
		status = "ALIVE";
		statusLabelStatus.setText(status);
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
	
	public void resist()
	{
		position = "resist";
		mainTextArea.setText("The aliens beat you to death for resisting.\n\nGameOver");
		choice1.setText("Back to Start");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		status = "DEAD";
		statusLabelStatus.setText(status);
	}
	
	public void comply()
	{
		position = "comply";
		mainTextArea.setText("The aliens take you to a cafeteria where you see a lot of other captives scattered across the room. You see Robert who appears to be quite strong, Martin who\nis old and has a cane, and Joe who looks afraid and\nweak.");
		choice1.setText("Sit with Robert");
		choice2.setText("Sit with Martin");
		choice3.setText("Sit with Joe");
		choice4.setText("");
	}
	
	public void robert()
	{
		position = "robert";
		mainTextArea.setText("As you sit down, you and Robert start talking. You\nfind out he wants to break out, like you. Robert says he is planning on doing it tonight, and asks if you\nwant to join.");
		choice1.setText("Say yes");
		choice2.setText("Say no");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void martin()
	{
		position = "martin";
		mainTextArea.setText("As you sit down, he becomes agitated and beats you\nto death with his cane\n\nGameOver");
		choice1.setText("Back to Start");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		status = "DEAD";
		statusLabelStatus.setText(status);
	}
	
	public void joe()
	{
		position = "joe";
		mainTextArea.setText("As you get to talking, you find out that he wants to\nescape but wants to go with someone. You get the\nidea to start making a plan to escape. Joe is on board\nwith your plan to escape tonight. ... It is now night.\nYou get out of your cell and go get Joe. As you start\nrunning around the ship you reach the end of the hallway; you can only go left or right");
		choice1.setText("Go left");
		choice2.setText("Go right");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void joinRobert()
	{
		position = "joinRobert";
		mainTextArea.setText("You go about your day and then when the time \ncomes, you and Robert try to escape. You and Robertreach what appears to be an escape hatch, but there\nis only room for one. Robert, beats you to death and escapes.\n\nGameOver");
		choice1.setText("Back to Start");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		status = "DEAD";
		statusLabelStatus.setText(status);
	}
	
	public void noToRobert()
	{
		position = "noToRobert";
		mainTextArea.setText("You go about your day and night time comes. All of a sudden alarms sound and Robert tries to make you come anyways. Guards catch Robert and accuse you of being his accomplice. They come into your cell\nand beat you to death\n\nGameOver");
		choice1.setText("Back to Start");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		status = "DEAD";
		statusLabelStatus.setText(status);
	}
	
	public void joeLeft()
	{
		position = "joeLeft";
		mainTextArea.setText("Guards immediately catch you. \nYou both are beaten to death\n\nGame Over");
		choice1.setText("Back to Start");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		status = "DEAD";
		statusLabelStatus.setText(status);
	}
	
	public void joeRight()
	{
		position = "joeRight";
		mainTextArea.setText("You run down that hallway and reach the end of that hallway; you can only go right or left");
		choice1.setText("Go left");
		choice2.setText("Go right");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void joeLeft2()
	{
		position = "joeLeft2";
		mainTextArea.setText("As you are running you hear the aliens getting closer.You come across a strange hatch, which you pull on, revealing an escape pod. The aliens catch up, and Joe tells you to go shoving you into the pod, and the\naliens beat him to death. You press the red button\nreleasing the pod. You have successfully escaped the aliens, but at the cost of Joe's life.");
		choice1.setText("Back to Start");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void joeRight2()
	{
		position = "joeRight2";
		mainTextArea.setText("Guards immediately catch you. \nYou both are beaten to death\n\nGame Over");
		choice1.setText("Back to Start");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		status = "DEAD";
		statusLabelStatus.setText(status);
	}
	
		
		public void investigateLeft()
		{
			position = "investigateLeft";
			mainTextArea.setText("You encounter strange looking guards and they beat you to death\n\nGame Over");
			choice1.setText("Back to Start");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			status = "DEAD";
			statusLabelStatus.setText(status);
		}
		
		public void investigateRight()
		{
			position = "investigateRight";
			mainTextArea.setText("You walk towards the light. You come across a\nwindow, that the light is emitting from. Also, you seea door on the right");
			choice1.setText("Look through window");
			choice2.setText("Go through door");
			choice3.setText("Turn around to darkness");
			choice4.setText("Back to your cell");
		}
		
		public void backToCell()
		{
			position = "backToCell";
			mainTextArea.setText("You go back into your cell as if nothing happened.\nAfter an hour curiosity strikes you again. You look\nout and see a security camera. Next thing you know, an alarm sounds and alien guards come yell at you in a strange language...They beat you to death\n\nGame Over");
			choice1.setText("Back to Start");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			status = "DEAD";
			statusLabelStatus.setText(status);
		}
		
		public void backToDark()
		{
			position = "backToDark";
			mainTextArea.setText("You encounter strange looking guards and they beat you to death.\n\nGame Over");
			choice1.setText("Back to Start");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			status = "DEAD";
			statusLabelStatus.setText(status);
		}
		
		public void throughDoor()
		{
			position = "throughDoor";
			mainTextArea.setText("An alarm immediately sounds");
			choice1.setText("Freeze in fear");
			choice2.setText("Hide in closet");
			choice3.setText("");
			choice4.setText("");
		}
		
		public void freeze()
		{
			position = "freeze";
			mainTextArea.setText("Strange looking guards come beat you to death\n\nGame Over");
			choice1.setText("Back to Start");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			status = "DEAD";
			statusLabelStatus.setText(status);
		}
		
		public void hideInCloset()
		{
			position = "hideInCloset";
			mainTextArea.setText("You hear commotion outside the closet.");
			choice1.setText("Stay where you are");
			choice2.setText("Try to reason with them");
			choice3.setText("");
			choice4.setText("");
		}
		
		public void reason()
		{
			position = "reason";
			mainTextArea.setText("The guards are pissed you are out of your cell. They beat you to death\n\nGame Over");
			choice1.setText("Back to Start");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			status = "DEAD";
			statusLabelStatus.setText(status);
		}
		
		public void stayPut()
		{
			position = "stayPut";
			mainTextArea.setText("The strange looking guards find you anyways and\nbeat you to death\n\nGame Over");
			choice1.setText("Back to Start");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			status = "DEAD";
			statusLabelStatus.setText(status);
		}
		
		public void window()
		{
			position = "window";
			mainTextArea.setText("As you look through the window, you see what\nappears to be some sort of alien species. As you standthere in awe, you get spotted.");
			choice1.setText("Run away");
			choice2.setText("Wait and talk");
			choice3.setText("");
			choice4.setText("");
		}
		
		public void windowRun()
		{
			position = "windowRun";
			mainTextArea.setText("As you run down the hallway, you reach the end of it.You can only go left or right");
			choice1.setText("Go left");
			choice2.setText("Go right");
			choice3.setText("");
			choice4.setText("");
		}
		
		public void windowStand()
		{
			position = "windowStand";
			mainTextArea.setText("The aliens don't reason with prisoners, they beat you to death.\n\nGame Over");
			choice1.setText("Back to Start");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			status = "DEAD";
			statusLabelStatus.setText(status);
		}
		
		public void runLeft()
		{
			position = "runLeft";
			mainTextArea.setText("Guards immediately catch you. You are beaten to\ndeath.\n\nGame Over");
			choice1.setText("Back to Start");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			status = "DEAD";
			statusLabelStatus.setText(status);
		}
		
		public void runRight()
		{
			position = "runRight";
			mainTextArea.setText("You run down that hallway and reach the end of that hallway; you can only go right or left");
			choice1.setText("Go left");
			choice2.setText("Go right");
			choice3.setText("");
			choice4.setText("");
		}
		
		public void runLeft2()
		{
			position = "runLeft2";
			mainTextArea.setText("As you are running, you can hear the aliens getting\ncloser. You come across a strange hatch. You pull on the hatch and it reveals an escape pod. You get in the escape pod, close the hatch, and press the red button. It just so happens, the red button releases the escape pod and conveniently the location is set to Earth.\nYou have successfully escaped!");
			choice1.setText("Back to Start");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
		}
		
		public void runRight2()
		{
			position = "runRight2";
			mainTextArea.setText("Guards immediately catch you. You are beaten to\ndeath.\n\nGame Over");
			choice1.setText("Back to Start");
			choice2.setText("");
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
				case "c1": investigateLeft(); break;
				case "c2": investigateRight(); break;
				}
				break;
			case "waitInCell":
				switch(yourChoice)
				{
				case "c1": resist(); break;
				case "c2": comply(); break;
				}
				break;
			case "resist":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "comply":
				switch(yourChoice)
				{
				case "c1": robert(); break;
				case "c2": martin(); break;
				case "c3": joe(); break;
				}
				break;
			case "robert":
				switch(yourChoice)
				{
				case "c1": joinRobert(); break;
				case "c2": noToRobert(); break;
				}
				break;
			case "martin":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "joe":
				switch(yourChoice)
				{
				case "c1": joeLeft(); break;
				case "c2": joeRight(); break;
				}
				break;
			case "joinRobert":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "noToRobert":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "joeLeft":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "joeRight":
				switch(yourChoice)
				{
				case "c1": joeLeft2(); break;
				case "c2": joeRight2(); break;
				}
				break;
			case "joeLeft2":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "joeRight2":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "investigateLeft":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "investigateRight":
				switch(yourChoice)
				{
				case "c1": window(); break;
				case "c2": throughDoor(); break;
				case "c3": backToDark(); break;
				case "c4": backToCell(); break;
				}
				break;
			case "backToCell":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "backToDark":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "throughDoor":
				switch(yourChoice)
				{
				case "c1": freeze(); break;
				case "c2": hideInCloset(); break;
				}
				break;
			case "freeze":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "hideInCloset":
				switch(yourChoice)
				{
				case "c1": stayPut(); break;
				case "c2": reason(); break;
				}
				break;
			case "reason":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "stayPut":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "window":
				switch(yourChoice)
				{
				case "c1": windowRun(); break;
				case "c2": windowStand(); break;
				}
				break;
			case "windowRun":
				switch(yourChoice)
				{
				case "c1": runLeft(); break;
				case "c2": runRight(); break;
				}
				break;
			case "windowStand":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "windowRight":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "runLeft":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "runRight":
				switch(yourChoice)
				{
				case "c1": runLeft2(); break;
				case "c2": runRight2(); break;
				}
				break;
			case "runLeft2":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			case "runRight2":
				switch(yourChoice)
				{
				case "c1": cell(); break;
				}
				break;
			}
			
			
		}
	}
}
