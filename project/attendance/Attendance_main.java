package project.attendance;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.main.Event;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Attendance_main extends JFrame {

	private JPanel contentPane;

	public Attendance_main() {
		setTitle("Ãâ±Ù, Åð±Ù Ã¼Å©");
		setBounds(300, 300, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC0AC\uC6D0 \uBC88\uD638 : ");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(36, 122, 86, 15);
		panel.add(lblNewLabel);
		
		JTextField id = new JTextField();
		id.setBounds(122, 119, 63, 23);
		panel.add(id);
		id.setColumns(10);
		
		JButton check_i = new JButton("\uCD9C\uADFC");
		check_i.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 14));
		check_i.setBounds(36, 165, 397, 34);
		panel.add(check_i);
	
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 198, 397, 128);
		panel.add(scrollPane);
		
		JTextArea check_i_ta = new JTextArea();
		scrollPane.setViewportView(check_i_ta);
		
		check_i.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String emp_id = id.getText();
				int employee_id = Integer.parseInt(emp_id);
				check_i_ta.append(new Attendance_check_in(employee_id).result());
			}
		});
		
		JButton check_o = new JButton("\uD1F4\uADFC");
		check_o.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 14));
		check_o.setBounds(36, 357, 397, 34);
		panel.add(check_o);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(36, 390, 397, 128);
		panel.add(scrollPane_1);
		
		JTextArea check_o_ta = new JTextArea();
		scrollPane_1.setViewportView(check_o_ta);	
		
		check_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String emp_id = id.getText();
				int employee_id = Integer.parseInt(emp_id);
				check_o_ta.append(new Update_result(employee_id).result());				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uADFC, \uD1F4\uADFC \uCCB4\uD06C");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(149, 32, 196, 59);
		panel.add(lblNewLabel_1);
		
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
