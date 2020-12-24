package project.custom.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import project.custom.action.Panel_CustomDelete_Action;
import project.custom.action.Panel_CustomDeleted_Action;
import project.custom.main.Frame01;

public class panelCustomDelete extends JPanel {
	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/custom/image/search.jpg")).getImage().getScaledInstance(65,
			26, Image.SCALE_SMOOTH);
	public static JTextField textSearch = new JTextField(20);
	static Vector<String> columnNames = new Vector<String>(
			Arrays.asList("번호", "이름", "나이", "성별", "핸드폰", "이메일", "주소", "카드번호", "블랙유무"));
	public static DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
	Vector rowData;
	public static JTextArea textArea = new JTextArea(10, 23);

	public panelCustomDelete() {

		setBackground(new Color(255, 160, 122));
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(0, 0, 807, 533);
		setLayout(null);

		
		textSearch.setBounds(78, 150, 250, 26);
		add(textSearch);

		JButton btnSearch = new JButton(new ImageIcon(img_logo));
		btnSearch.setBounds(328, 150, 35, 26);
		btnSearch.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		add(btnSearch);

		btnSearch.addActionListener(new Panel_CustomDelete_Action(this));
		textSearch.addActionListener(new Panel_CustomDelete_Action(this));
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.setForeground(Color.RED);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(667, 497, 65, 26);
		btnDelete.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		add(btnDelete);
		btnDelete.addActionListener(new Panel_CustomDeleted_Action(this));
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(2, 2, 803, 69);
		panelTitle.setBackground(new Color(255, 245, 238));
		add(panelTitle);
		panelTitle.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uC815\uBCF4 \uC0AD\uC81C \uBC0F \uB4F1\uB85D\uD574\uC81C");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 779, 49);
		panelTitle.add(lblNewLabel);

		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setBounds(78, 192, 654, 270);
		add(textArea);

		JLabel lblNewLabel_1 = new JLabel("\uCE74\uB4DC\uBC88\uD638:");
		lblNewLabel_1.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(12, 150, 57, 26);
		add(lblNewLabel_1);

	}
}
