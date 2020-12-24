package project.stock;

import java.awt.BorderLayout;
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

import project.main.Event;
import project.main.Retrieve;

import java.awt.Color;

public class stock extends JFrame {

	private JPanel contentPane;
	public stock() {
		setTitle("ºê·£µå ±â´É ¸ðÀ½");
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
		
		
		JButton add = new JButton("");
		add.setBackground(new Color(255, 215, 0));
		add.setBorderPainted(false);
		add.setIcon(new ImageIcon(stock.class.getResource("/image/add.PNG")));
		add.setBounds(29, 305, 195, 195);
		panel.add(add);
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				add.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				add.setIcon(new ImageIcon(Retrieve.class.getResource("/image/add.PNG")));
			}
		});
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.stock.add_new_shoes.add_new_shoes2();
			}
		});
		
		JButton search1 = new JButton("");
		search1.setBorderPainted(false);
		search1.setIcon(new ImageIcon(stock.class.getResource("/image/search.PNG")));
		search1.setBackground(new Color(255, 215, 0));
		search1.setBounds(236, 305, 195, 195);
		panel.add(search1);
		search1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				search1.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				search1.setIcon(new ImageIcon(Retrieve.class.getResource("/image/search.PNG")));
			}
		});
		search1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.stock.find_br_day.find_br_day2();
			}
		});
		
		JButton check = new JButton("");
		check.setIcon(new ImageIcon(stock.class.getResource("/image/inventory.PNG")));
		check.setBorderPainted(false);
		check.setBackground(new Color(255, 215, 0));
		check.setBounds(443, 305, 195, 195);
		panel.add(check);
		
		check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				check.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				check.setIcon(new ImageIcon(Retrieve.class.getResource("/image/inventory.PNG")));
			}
		});
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.stock.inventory.add_inventory2();
			}
		});
		
		JButton search2 = new JButton("");
		search2.setIcon(new ImageIcon(stock.class.getResource("/image/search.PNG")));
		search2.setBorderPainted(false);
		search2.setBackground(new Color(255, 215, 0));
		search2.setBounds(650, 305, 195, 195);
		panel.add(search2);
		
		search2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				search2.setIcon(new ImageIcon(Retrieve.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				search2.setIcon(new ImageIcon(Retrieve.class.getResource("/image/search.PNG")));
			}
		});
		
		search2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new project.stock.sh_name.sh_name2();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("\uC0C1\uD488 \uCD94\uAC00");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(80, 267, 100, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE0C\uB79C\uB4DC \uB370\uC774 \uC870\uD68C");
		lblNewLabel_1_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(257, 267, 159, 28);
		panel.add(lblNewLabel_1_1);
		
		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(Event.class.getResource("/image/back1.PNG")));
		back_btn.setBounds(0, 0, 32, 28);
		panel.add(back_btn);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uC7AC\uACE0 \uD655\uC778");
		lblNewLabel_1_1_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1.setBounds(489, 267, 100, 28);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("\uC81C\uD488\uBA85\uC73C\uB85C \uC870\uD68C");
		lblNewLabel_1_1_1_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1_1.setBounds(668, 267, 159, 28);
		panel.add(lblNewLabel_1_1_1_1);
		
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
