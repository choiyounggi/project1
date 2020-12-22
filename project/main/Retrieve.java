package project.main;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Retrieve extends JFrame {

	private JPanel contentPane;

	public Retrieve() {
		setTitle("Á¶È¸ ±â´É ¸ðÀ½");
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
		btn1.setIcon(new ImageIcon(Retrieve.class.getResource("/image/search.PNG")));
		btn1.setBounds(74, 305, 195, 195);
		panel.add(btn1);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setIcon(new ImageIcon(Retrieve.class.getResource("/image/search.PNG")));
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.retrieve.employees.Retrieve_emp_main();
			}
		});
		
		JButton btn2 = new JButton("");
		btn2.setBorderPainted(false);
		btn2.setIcon(new ImageIcon(Retrieve.class.getResource("/image/search.PNG")));
		btn2.setBackground(new Color(255, 215, 0));
		btn2.setBounds(336, 305, 195, 195);
		panel.add(btn2);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setIcon(new ImageIcon(Retrieve.class.getResource("/image/search.PNG")));
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.retrieve.departments.Retrieve_dpt_main();
			}
		});
		
		JButton btn3 = new JButton("");
		btn3.setBorderPainted(false);
		btn3.setIcon(new ImageIcon(Retrieve.class.getResource("/image/search.PNG")));
		btn3.setBackground(new Color(255, 215, 0));
		btn3.setBounds(615, 305, 195, 195);
		panel.add(btn3);
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn3.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn3.setIcon(new ImageIcon(Retrieve.class.getResource("/image/search.PNG")));
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.retrieve.attandance.Gai_main();
			}
		});
		
		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(Event.class.getResource("/image/back1.PNG")));
		back_btn.setBounds(0, 0, 32, 28);
		panel.add(back_btn);
		back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(Retrieve.class.getResource("/image/back2.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(Retrieve.class.getResource("/image/back1.PNG")));
			}
		});
		
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("\uC9C1\uC6D0 \uC815\uBCF4 \uC870\uD68C");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(103, 267, 180, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBD80\uC11C \uC815\uBCF4 \uC870\uD68C");
		lblNewLabel_1_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(367, 267, 180, 28);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uCD9C\uC11D \uC5EC\uBD80 \uC870\uD68C");
		lblNewLabel_1_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(639, 267, 180, 28);
		panel.add(lblNewLabel_1_2);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}
