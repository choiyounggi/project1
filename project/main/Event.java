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

public class Event extends JFrame {

	private JPanel contentPane;

	public Event() {
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
		lblNewLabel.setBounds(189, 10, 529, 212);
		panel.add(lblNewLabel);
		
		
		JButton btn1 = new JButton("");
		btn1.setBackground(new Color(255, 215, 0));
		btn1.setBorderPainted(false);
		btn1.setIcon(new ImageIcon(Event.class.getResource("/image/t_d.PNG")));
		btn1.setBounds(148, 305, 195, 195);
		panel.add(btn1);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setIcon(new ImageIcon(Retrieve.class.getResource("/image/t_d.PNG")));
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.event.cut_back.Cut_back_main();
			}
		});
		
		JButton btn2 = new JButton("");
		btn2.setBorderPainted(false);
		btn2.setIcon(new ImageIcon(Event.class.getResource("/image/t_u.PNG")));
		btn2.setBackground(new Color(255, 215, 0));
		btn2.setBounds(549, 305, 195, 195);
		panel.add(btn2);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setIcon(new ImageIcon(Retrieve.class.getResource("/image/t_u.PNG")));
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.event.raise.raise_main();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("\uC6D4\uAE09 \uC0AD\uAC10 (\uC9C0\uAC01\uC790 \uC218)");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(150, 267, 259, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC6D4\uAE09 \uC778\uC0C1 (\uC815\uC0C1 \uCD9C\uC11D\uC790 \uC218)");
		lblNewLabel_1_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(526, 267, 295, 28);
		panel.add(lblNewLabel_1_1);
		
		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(Event.class.getResource("/image/back1.PNG")));
		back_btn.setBounds(0, 0, 32, 28);
		panel.add(back_btn);
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
