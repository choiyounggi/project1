package project.event.cut_back;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Cut_back_main extends JFrame {

	private JPanel contentPane;	
	Absent_get_count agc = new Absent_get_count();
	
	public Cut_back_main() {
		setTitle("결석자 수에 따른 월급 삭감");
		setBounds(300, 300, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(45, 148, 384, 133);
		panel.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(45, 377, 384, 133);
		panel.add(ta2);
		
		JButton btn1 = new JButton("\uC870\uD68C");
		btn1.setBounds(45, 74, 384, 64);
		panel.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ta1.append(agc.max_dpt_nav());
			}
		});
		
		JButton btn2 = new JButton("\uC6D4\uAE09 \uC0AD\uAC10");
		btn2.setForeground(new Color(255, 0, 0));
		btn2.setBounds(45, 303, 384, 64);
		panel.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < agc.indexs.size(); ++i) {
					new Update_result(agc.dpt_names.get(agc.indexs.get(i)));
					ta2.append("[" + agc.dpt_names.get(agc.indexs.get(i)) + "] 직원들의 월급이 50000 삭감되었습니다.\n");
				}				
			}
		});
		
		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(Cut_back_main.class.getResource("/image/back1.PNG")));
		back_btn.setBounds(0, 0, 32, 28);
		panel.add(back_btn);
		
		JLabel lblNewLabel = new JLabel("\uACB0\uC11D\uC790 \uC218\uC5D0 \uB530\uB978 \uC6D4\uAE09 \uC0AD\uAC10");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(114, 19, 265, 45);
		panel.add(lblNewLabel);
		back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(Cut_back_main.class.getResource("/image/back2.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(Cut_back_main.class.getResource("/image/back1.PNG")));
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
