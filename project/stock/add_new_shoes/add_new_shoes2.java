package project.stock.add_new_shoes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import project.custom.main.Frame01;

import javax.swing.JTextArea;

public class add_new_shoes2 extends JFrame{
	private JTextField textNumber;
	private JTextField textProductName;
	private JTextField textQuantity;
	private JTextField textSize;
	private JTextField textPrice;
	private JTextField textStorage;
	private JPanel contentPane;
	
	
	
	public static JPanel panel = new JPanel();
	
	public add_new_shoes2() {
		
		setTitle("직원, 부서 기능 모음");
		
//		setBounds(265, 15, 807, 533);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		panel.setBackground(new Color(255, 165, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		textNumber = new JTextField();
		textNumber.setColumns(10);
		textNumber.setBounds(110, 186, 116, 26);
		panel.add(textNumber);

		JLabel lblNumber = new JLabel("\uC2DC\uB9AC\uC5BC\uB118\uBC84:");
		lblNumber.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblNumber.setBounds(24, 193, 91, 15);
		panel.add(lblNumber);

		textProductName = new JTextField();
		textProductName.setColumns(10);
		textProductName.setBounds(110, 288, 116, 26);
		panel.add(textProductName);

		JLabel lblproductName = new JLabel("\uC81C\uD488\uBA85:");
		lblproductName.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblproductName.setBounds(54, 295, 54, 15);
		panel.add(lblproductName);

		textStorage = new JTextField();
		textStorage.setColumns(10);
		textStorage.setBounds(110, 237, 116, 26);
		panel.add(textStorage);

		JLabel lblStorage = new JLabel("창고 위치:");
		lblStorage.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblStorage.setBounds(35, 240, 99, 21);
		panel.add(lblStorage);

		JLabel lblSize = new JLabel("사이즈:");
		lblSize.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblSize.setBounds(54, 345, 54, 15);
		panel.add(lblSize);

		JTextField textSize = new JTextField();
		textSize.setColumns(10);
		textSize.setBounds(110, 339, 116, 26);
		panel.add(textSize);

		JLabel lblQuantity = new JLabel("수량:");
		lblQuantity.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblQuantity.setBounds(68, 390, 41, 26);
		panel.add(lblQuantity);

		JTextField textQuantity = new JTextField(20);
		textQuantity.setBounds(110, 390, 116, 26);
		panel.add(textQuantity);

		JLabel lblPrice = new JLabel("가격:");
		lblPrice.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblPrice.setBounds(68, 448, 62, 15);
		panel.add(lblPrice);

		JTextField textPrice = new JTextField(20);
		textPrice.setBounds(110, 441, 116, 26);
		panel.add(textPrice);

		JButton btnInput = new JButton("등록");
		btnInput.setBounds(126, 486, 100, 26);
		panel.add(btnInput);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(0, 0, 484, 69);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC0C1\uD488 \uB4F1\uB85D");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 460, 49);
		panel_1.add(lblNewLabel);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(275, 132, 197, 345);
		panel.add(textArea);
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setFont(new Font("SansSerif", Font.BOLD, 18));
		btnInput.addActionListener(new ActionListener() {
//    	  textStorage
			@Override
			public void actionPerformed(ActionEvent e) {

//			new add_new_shoes().storageInput(Integer.parseInt(textSize. getText()));
				new add_new_shoes().storageInput(textNumber.getText(), textProductName.getText(),
						Integer.parseInt(textSize.getText()), Integer.parseInt(textQuantity.getText()),
						Integer.parseInt(textPrice.getText()), textStorage.getText());
				textArea.append("[상품 등록 정보]\n\n");
				textArea.append("[시리얼넘버]: " + textNumber.getText() +"\n\n");
				textArea.append("[창고위치]: " + textStorage.getText()+"\n\n");
				textArea.append("[제품명]: " + textProductName.getText()+"\n\n");
				textArea.append("[사이즈]: " + textSize.getText()+"\n\n");
				textArea.append("[수량]: " + textQuantity.getText()+"\n\n");
				textArea.append("[가격]: " + textPrice.getText());
//				
//			
				new add_new_shoes().add_new_shoess(textNumber.getText(), textStorage.getText(),
						textProductName.getText(),
						Integer.parseInt(textSize.getText()), Integer.parseInt(textQuantity.getText()),
						Integer.parseInt(textPrice.getText()));
				
				textNumber.setText("");
				textProductName.setText("");
				textSize.setText("");
				textPrice.setText("");
				textQuantity.setText("");
				textStorage.setText("");
			}
			
		});
		setBounds(200,200, 500, 600);
		setVisible(true);
		setLocationRelativeTo(null);
	}
public static void main(String[] args) {
	new add_new_shoes2();
}
}