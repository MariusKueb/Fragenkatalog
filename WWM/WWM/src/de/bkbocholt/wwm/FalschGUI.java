package de.bkbocholt.wwm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FalschGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FalschGUI frame = new FalschGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FalschGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFalsch = new JLabel("Leider Falsch :(");
		lblFalsch.setBounds(42, 11, 200, 41);
		contentPane.add(lblFalsch);
		
		JButton btnNewButton = new JButton("n\u00E4chste Frage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fenster=new SpielGUI();
				fenster.setVisible(true);
				FalschGUI.this.dispose();
			}
		});
		btnNewButton.setBounds(42, 65, 133, 23);
		contentPane.add(btnNewButton);
	}
}
