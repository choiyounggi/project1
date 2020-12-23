package project.sign_up.emp;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Sign_up_main extends JFrame {

	private JPanel contentPane;
	JTextField emp_age, salary, job_position, emp_name, emp_phone, division;

	public Sign_up_main() {
		setBounds(300, 300, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		emp_age = new JTextField();
		emp_age.setColumns(10);
		emp_age.setBounds(118, 198, 126, 21);
		panel.add(emp_age);
		
		JLabel lblNewLabel_4 = new JLabel("\uC0AC\uC6D0 \uB4F1\uB85D");
		lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_4.setBounds(189, 37, 104, 89);
		panel.add(lblNewLabel_4);
		
		JLabel e_n = new JLabel("\uC774\uB984");
		e_n.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		e_n.setBounds(31, 136, 127, 21);
		panel.add(e_n);
		
		salary = new JTextField();
		salary.setColumns(10);
		salary.setBounds(118, 229, 126, 21);
		panel.add(salary);
		
		job_position = new JTextField();
		job_position.setColumns(10);
		job_position.setBounds(118, 265, 126, 21);
		panel.add(job_position);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 327, 406, 201);
		panel.add(scrollPane);
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JLabel e_p = new JLabel("\uC804\uD654\uBC88\uD638");
		e_p.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		e_p.setBounds(31, 167, 127, 21);
		panel.add(e_p);
		
		JLabel e_age = new JLabel("\uB098\uC774");
		e_age.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		e_age.setBounds(31, 198, 127, 21);
		panel.add(e_age);
		
		JLabel s = new JLabel("\uC6D4\uAE09");
		s.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		s.setBounds(31, 229, 127, 21);
		panel.add(s);
		
		emp_name = new JTextField();
		emp_name.setColumns(10);
		emp_name.setBounds(118, 136, 126, 21);
		panel.add(emp_name);
		
		emp_phone = new JTextField();
		emp_phone.setColumns(10);
		emp_phone.setBounds(118, 167, 126, 21);
		panel.add(emp_phone);
		
		JLabel j_position = new JLabel("\uC9C1\uAE09");
		j_position.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		j_position.setBounds(31, 265, 127, 21);
		panel.add(j_position);
		
		division = new JTextField();
		division.setColumns(10);
		division.setBounds(118, 296, 126, 21);
		panel.add(division);
		
		JLabel d = new JLabel("\uBE44\uACE0");
		d.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		d.setBounds(31, 296, 127, 21);
		panel.add(d);
		
		JButton sign_up = new JButton("\uB4F1\uB85D");
		sign_up.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		sign_up.setBounds(256, 136, 181, 181);
		panel.add(sign_up);
		sign_up.setEnabled(true);
		
		// emp_name, emp_phone, emp_age, salary, job_position, division
		ActionListener s_u = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String e_name = emp_name.getText();
				String e_phone = emp_phone.getText();
				int e_age = Integer.parseInt(emp_age.getText());
				int e_salary = Integer.parseInt(salary.getText());
				String j_position = job_position.getText();
				String e_division = division.getText();
				ta.append(new Update_result(e_name, e_phone, e_age, e_salary, j_position, e_division).result());
			}	
		};
		
		sign_up.addActionListener(s_u);
	
		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(Sign_up_main.class.getResource("/image/back1.PNG")));
		back_btn.setBounds(0, 0, 32, 28);
		panel.add(back_btn);
		
		back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(Sign_up_main.class.getResource("/image/back2.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(Sign_up_main.class.getResource("/image/back1.PNG")));
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
