package project.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Sign_up extends JFrame {

	private JPanel contentPane;

	public Sign_up() {
		setTitle("ÀÌº¥Æ® ±â´É ¸ðÀ½");
		setBounds(300, 300, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Retrieve.class.getResource("/image/abc2.jpg")));
		lblNewLabel.setBounds(180, 10, 529, 212);
		panel.add(lblNewLabel);
		
		
		JButton emp = new JButton("");
		emp.setBackground(new Color(255, 215, 0));
		emp.setBorderPainted(false);
		emp.setIcon(new ImageIcon(Sign_up.class.getResource("/image/sign_up.PNG")));
		emp.setBounds(152, 305, 195, 195);
		panel.add(emp);
		emp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				emp.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				emp.setIcon(new ImageIcon(Retrieve.class.getResource("/image/t_d.PNG")));
			}
		});
		emp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.sign_up.emp.Sign_up_main();
			}
		});
		
		JButton dpt = new JButton("");
		dpt.setIcon(new ImageIcon(Event.class.getResource("/image/sign_up.PNG")));
		dpt.setBorderPainted(false);
		dpt.setBackground(new Color(255, 215, 0));
		dpt.setBounds(516, 305, 195, 195);
		panel.add(dpt);
		
		dpt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dpt.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				dpt.setIcon(new ImageIcon(Retrieve.class.getResource("/image/sign_up.PNG")));
			}
		});
		dpt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.sign_up.dpt.Sign_up_main();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("\uC9C1\uC6D0 \uB4F1\uB85D");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(202, 267, 259, 28);
		panel.add(lblNewLabel_1);
		
		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(Event.class.getResource("/image/back1.PNG")));
		back_btn.setBounds(0, 0, 32, 28);
		panel.add(back_btn);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uBD80\uC11C \uB4F1\uB85D");
		lblNewLabel_1_1_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1.setBounds(571, 267, 159, 28);
		panel.add(lblNewLabel_1_1_1);
		back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(Event.class.getResource("/image/back2.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(Event.class.getResource("/image/back1.PNG")));
			}
		});
		
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
