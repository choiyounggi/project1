package project.retrieve.attandance;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.main.Event;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Gai_main extends JFrame {

	private JPanel contentPane;
	JTextField id, year, month, day;

	public Gai_main() {
		setBounds(300, 300, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC870\uD68C\uD560 \uC0AC\uC6D0\uBC88\uD638 : ");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		lblNewLabel.setBounds(31, 120, 127, 21);
		panel.add(lblNewLabel);
		
		id = new JTextField();
		id.setBounds(154, 121, 46, 21);
		id.setColumns(10);
		panel.add(id);
		
		year = new JTextField();
		year.setBounds(124, 166, 46, 21);
		year.setColumns(10);
		panel.add(year);
		
		month = new JTextField();
		month.setBounds(193, 166, 29, 21);
		month.setColumns(10);
		panel.add(month);
		
		day = new JTextField();
		day.setBounds(245, 166, 29, 21);
		day.setColumns(10);
		panel.add(day);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 217, 406, 292);
		panel.add(scrollPane);
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JLabel lblNewLabel_1 = new JLabel("\uB144");
		lblNewLabel_1.setBounds(173, 169, 21, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC6D4");
		lblNewLabel_2.setBounds(224, 169, 21, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC77C");
		lblNewLabel_3.setBounds(276, 169, 21, 15);
		panel.add(lblNewLabel_3);
		
		JButton button = new JButton("\uC870\uD68C");
		button.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 16));
		button.setBounds(333, 120, 104, 68);
		panel.add(button);
		button.setEnabled(true);
		
		ActionListener gai = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String emp_id = id.getText();
				String y = year.getText();
				String m = month.getText();
				String d = day.getText();
				String date = String.format("%s³â%s¿ù%sÀÏ", y, m, d);
				ta.append(new Attendance_information(Integer.parseInt(emp_id), date).result() + "\n");
			}	
		};
		
		button.addActionListener(gai);
		
		JLabel lblNewLabel_4 = new JLabel("\uD574\uB2F9 \uC0AC\uC6D0\uC758 \uB0A0\uC9DC\uBCC4 \uCD9C\uC11D\uC5EC\uBD80 \uC870\uD68C");
		lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(80, 21, 322, 89);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC870\uD68C\uD560 \uB0A0\uC9DC : ");
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(31, 165, 127, 21);
		panel.add(lblNewLabel_5);
		
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
		
		setVisible(true);
		setLocationRelativeTo(null);
	}

}
