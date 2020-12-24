package project.custom.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import project.custom.action.Panel_BlackIn_BtnAction;

public class panelBlackIn extends JPanel {
	public static JTextField textcard = new JTextField(20);
	public static JTextField reason = new JTextField(20);
	public static JTextArea textArea = new JTextArea(10, 23);

	public panelBlackIn() {
		setBackground(new Color(255, 160, 122));
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(0, 0, 807, 533);
		setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\uCE74\uB4DC\uBC88\uD638:");
		lblNewLabel_1.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(12, 139, 64, 27);
		add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("\uB4F1\uB85D\uC0AC\uC720:");
		lblNewLabel_1_1.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(12, 176, 64, 27);
		add(lblNewLabel_1_1);

		textcard.setBounds(78, 140, 250, 26);
		add(textcard);
		reason.setBounds(78, 177, 250, 26);
		add(reason);

		JButton btnNewButton = new JButton("등록");
		btnNewButton.setForeground(new Color(250, 128, 114));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		btnNewButton.addActionListener(new Panel_BlackIn_BtnAction(this));

		btnNewButton.setBounds(667, 497, 65, 26);
		add(btnNewButton);

		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(new Color(255, 245, 238));
		panelTitle.setBounds(2, 2, 803, 69);
		add(panelTitle);
		panelTitle.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uBE14\uB799\uD68C\uC6D0 \uB4F1\uB85D");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 779, 49);
		panelTitle.add(lblNewLabel);
		add(textArea);
		textArea.setEnabled(false);
		textArea.setBounds(78, 230, 654, 249);
	}
}
