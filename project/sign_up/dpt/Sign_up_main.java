package project.sign_up.dpt;

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
	private JTextField department_name;
	private JTextField manager_id;


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
		
		
		
		JLabel lblNewLabel_4 = new JLabel("\uBD80\uC11C \uB4F1\uB85D");
		lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_4.setBounds(189, 37, 104, 89);
		panel.add(lblNewLabel_4);
		
		JLabel d_n = new JLabel("\uBD80\uC11C\uBA85");
		d_n.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		d_n.setBounds(31, 136, 127, 21);
		panel.add(d_n);
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 327, 406, 201);
		panel.add(scrollPane);
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JLabel m_i = new JLabel("\uB9E4\uB2C8\uC800 ID");
		m_i.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		m_i.setBounds(31, 167, 127, 21);
		panel.add(m_i);
		
		JButton sign_up = new JButton("\uB4F1\uB85D");
		sign_up.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		sign_up.setBounds(256, 136, 181, 181);
		panel.add(sign_up);
		sign_up.setEnabled(true);
		
		// emp_name, emp_phone, emp_age, salary, job_position, division
		ActionListener s_u = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String d_name = department_name.getText();
				int m_id = Integer.parseInt(manager_id.getText());
				ta.append(new Update_result(d_name, m_id).result());
			}	
		};
		
		sign_up.addActionListener(s_u);
	
		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(Sign_up_main.class.getResource("/image/back1.PNG")));
		back_btn.setBounds(0, 0, 32, 28);
		panel.add(back_btn);
		
		department_name = new JTextField();
		department_name.setBounds(105, 137, 116, 21);
		panel.add(department_name);
		department_name.setColumns(10);
		
		manager_id = new JTextField();
		manager_id.setColumns(10);
		manager_id.setBounds(105, 168, 116, 21);
		panel.add(manager_id);
		
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
