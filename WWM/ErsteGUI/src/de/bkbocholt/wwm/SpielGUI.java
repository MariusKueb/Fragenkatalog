package de.bkbocholt.wwm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SpielGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpielGUI frame = new SpielGUI();
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
	public SpielGUI() {
		setTitle("Wer wird Million\u00E4r");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Frage");
		lblNewLabel.setBounds(10, 62, 564, 74);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Antwort 1");
		btnNewButton.setBounds(10, 230, 270, 50);
		contentPane.add(btnNewButton);
		
		JButton btnAntwort = new JButton("Antwort  2");
		btnAntwort.setBounds(304, 230, 270, 50);
		contentPane.add(btnAntwort);
		
		JButton btnAntwort_1 = new JButton("Antwort 3");
		btnAntwort_1.setBounds(10, 291, 270, 50);
		contentPane.add(btnAntwort_1);
		
		JButton btnAntwort_2 = new JButton("Antwort 4");
		btnAntwort_2.setBounds(304, 291, 270, 50);
		contentPane.add(btnAntwort_2);
		
		JButton btnNewButton_1 = new JButton("Hauptmen\u00FC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fenster=new ErsteGUI();
				fenster.setVisible(true);
				SpielGUI.this.dispose();
			}
		});
		btnNewButton_1.setBounds(482, 0, 102, 23);
		contentPane.add(btnNewButton_1);
	}

}
