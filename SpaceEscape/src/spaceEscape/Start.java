package spaceEscape;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Start {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 784, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lblNewLabel.setIcon(new ImageIcon("/Users/mikebehnke/Desktop/ProjectPics/prison_cell_3d_model_c4d_max_obj_fbx_ma_lwo_3ds_3dm_stl_2167791_o.jpg"));
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}
