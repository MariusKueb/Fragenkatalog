package de.bkbocholt.wwm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HauptmenueGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HauptmenueGUI frame = new HauptmenueGUI();
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
	public HauptmenueGUI() {
		setTitle("Wer wird Million\u00E4r");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFrageErstellen = new JButton("Fragen erstellen");
		btnFrageErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fenster=new FrageErstellenGUI();
				fenster.setVisible(true);
				HauptmenueGUI.this.dispose();
			}
		});
		btnFrageErstellen.setBounds(50, 183, 200, 62);
		contentPane.add(btnFrageErstellen);
		
		JButton btnFragenBearbeiten = new JButton("Fragen bearbeiten");
		btnFragenBearbeiten.setBounds(296, 183, 200, 62);
		contentPane.add(btnFragenBearbeiten);
		
		JButton btnSpielstart = new JButton("Spiel starten");
		btnSpielstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fenster=new SpielGUI();
				fenster.setVisible(true);
				HauptmenueGUI.this.dispose();
			}
		});
		btnSpielstart.setBounds(50, 99, 446, 57);
		contentPane.add(btnSpielstart);
	}
}
