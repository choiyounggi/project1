package project.mainFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.main.ABC_emp_dpt_main;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Main_frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_frame frame = new Main_frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_frame() {
		setTitle("abc마트 메인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1700, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main_frame.class.getResource("/image/abc2.jpg")));
		lblNewLabel.setBounds(544, 10, 482, 121);
		panel.add(lblNewLabel);
		
		JButton brand_btn = new JButton("");
		brand_btn.setBackground(Color.WHITE);
		brand_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		brand_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/brand.png")));
		brand_btn.setBounds(95, 400, 200, 200);
		panel.add(brand_btn);
		
		brand_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				brand_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				brand_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/brand.PNG")));
			}
		});
		
		JButton payment_btn = new JButton("");
		payment_btn.setBackground(Color.WHITE);
		payment_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/payment.png")));
		payment_btn.setBounds(530, 400, 200, 200);
		panel.add(payment_btn);
		
		payment_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				payment_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				payment_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/payment.PNG")));
			}
		});
		
		JButton client_btn = new JButton("");
		client_btn.setBackground(Color.WHITE);
		client_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/client.png")));
		client_btn.setBounds(955, 400, 200, 200);
		panel.add(client_btn);
		
		client_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				client_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				client_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/client.PNG")));
			}
		});
		
		JButton emp_btn = new JButton("");
		emp_btn.setBackground(Color.WHITE);
		emp_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/emp.png")));
		emp_btn.setBounds(1380, 400, 200, 200);
		panel.add(emp_btn);
		
		emp_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				emp_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/click.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				emp_btn.setIcon(new ImageIcon(Main_frame.class.getResource("/image/emp.PNG")));
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("store");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel_1.setBounds(159, 345, 193, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("payment");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(574, 345, 193, 45);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("clinet");
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(1016, 345, 193, 45);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("emp or dpt");
		lblNewLabel_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel_1_3.setBounds(1398, 345, 193, 45);
		panel.add(lblNewLabel_1_3);
	}
}
