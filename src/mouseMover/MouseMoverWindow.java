package mouseMover;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Robot;

import javax.swing.SwingConstants;

public class MouseMoverWindow {

	private JFrame frmMouseMover;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseMoverWindow window = new MouseMoverWindow();
					window.frmMouseMover.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		
		new MouseMover().run();
		
	}

	/**
	 * Create the application.
	 */
	public MouseMoverWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMouseMover = new JFrame();
		frmMouseMover.setResizable(false);
		frmMouseMover.setTitle("Mouse Mover");
		frmMouseMover.setBounds(100, 100, 325, 124);
		frmMouseMover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Mouse Mover");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		frmMouseMover.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}
