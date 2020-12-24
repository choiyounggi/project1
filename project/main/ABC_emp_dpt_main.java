package project.main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuBar;


public class ABC_emp_dpt_main extends JFrame {
	private JPanel contentPane;

	public ABC_emp_dpt_main() {	
		setTitle("Á÷¿ø, ºÎ¼­ ±â´É ¸ðÀ½");
		setBounds(300, 300, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("abc_mart");
		lblNewLabel.setBounds(195, 0, 501, 200);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/abc2.jpg")));
		
		JButton btn1 = new JButton("");
		btn1.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/attendance.PNG")));
		btn1.setForeground(new Color(255, 255, 0));
		btn1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		btn1.setBackground(new Color(255, 215, 0));
		btn1.setBorderPainted(false);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/attendance.PNG")));
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new project.attendance.Attendance_main();
			}
		});
		
		
		btn1.setBounds(57, 301, 231, 200);
		panel.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/search.PNG")));
		btn2.setForeground(new Color(255, 215, 0));
		btn2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		btn2.setBorderPainted(false);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/search.PNG")));
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Retrieve();
			}
		});
		btn2.setBackground(new Color(255, 215, 0));
		btn2.setBounds(338, 301, 221, 200);
		panel.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/event.PNG")));
		btn3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 20));
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setBorderPainted(false);
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn3.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn3.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/event.PNG")));
			}
		});
		
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Event();
			}	
		});
		btn3.setBackground(new Color(255, 215, 0));
		btn3.setBounds(603, 301, 231, 200);
		panel.add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uC11D \uCCB4\uD06C");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(140, 261, 70, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC870\uD68C");
		lblNewLabel_1_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(435, 261, 70, 30);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uC774\uBCA4\uD2B8");
		lblNewLabel_1_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(693, 261, 70, 30);
		panel.add(lblNewLabel_1_2);
		
		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/back1.PNG")));
		back_btn.setBounds(0, 0, 32, 28);
		panel.add(back_btn);
		
		back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/back2.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/image/back1.PNG")));
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

	
