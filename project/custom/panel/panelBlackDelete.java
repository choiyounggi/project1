package project.custom.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import project.custom.action.Panel_BlackDelete_SelectAction;
import project.custom.contoller.Black_Controller;
import project.custom.contoller.Custom_BlackDelete_Contoller;
import project.custom.main.Frame01;


public class panelBlackDelete extends JPanel {
	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/custom/image/search.jpg")).getImage().getScaledInstance(65,
			26, Image.SCALE_SMOOTH);
	static Vector<String> columnNames = new Vector<String>(
			Arrays.asList("번호", "이름", "나이", "성별", "핸드폰", "이메일", "주소", "카드번호", "블랙사유", "등록일"));
	public static DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
	JTable table = new JTable(dtm);
	Vector rowData;
	JPanel panelTtile = new JPanel();
	JLabel lblTitle = new JLabel("\uBE14\uB799\uD68C\uC6D0 \uD574\uC81C");
	JTextField textSearch = new JTextField();
	private final JLabel lblNewLabel = new JLabel("\uCE74\uB4DC\uBC88\uD638:");

	public panelBlackDelete() {

		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(0, 0, 807, 533);
		setLayout(null);
		setBackground(new Color(255, 160, 122));

		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(12, 158, 783, 332);
		add(scrollpane);
		scrollpane.setViewportView(table);

		textSearch.setBounds(76, 122, 250, 26);

		textSearch.addActionListener(new Panel_BlackDelete_SelectAction(this, rowData, textSearch, table));
		add(textSearch);

		JButton btnSearch = new JButton(new ImageIcon(img_logo));
		btnSearch.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		btnSearch.addActionListener(new Panel_BlackDelete_SelectAction(this, rowData, textSearch, table));

		btnSearch.setBounds(328, 122, 35, 26);
		add(btnSearch);

		panelTtile.setBackground(new Color(255, 245, 238));
		panelTtile.setBounds(2, 2, 803, 69);
		add(panelTtile);
		panelTtile.setLayout(null);

		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 779, 49);
		panelTtile.add(lblTitle);

		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.setForeground(Color.RED);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		btnDelete.setBounds(730, 500, 65, 26);
		add(btnDelete);
		table.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 13));
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Custom_BlackDelete_Contoller().BlackDelte(textSearch.getText());
				ShowTable();
				textSearch.setText("");
			}
		});

		ShowTable();

		table.setCellSelectionEnabled(true);
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		lblNewLabel.setBounds(12, 122, 65, 26);
		
		add(lblNewLabel);

		ListSelectionModel select = table.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}

	public void ShowTable() {
		new Black_Controller().BlackSelect_All();
		ArrayList<String> custom_info = new ArrayList<String>();
		for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
			dtm.removeRow(i);
		}

		rowData = new Vector();
		for (int i = 0; i < Black_Controller.mo.size();) {
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			if (i != 0 && i % 10 == 0) {
				dtm.addRow(rowData);
				rowData = new Vector();
				continue;
			}
			dtm.addRow(rowData);
		}
		custom_info.addAll(Black_Controller.mo);
		Black_Controller.mo.removeAll(custom_info);
		table.revalidate();
		table.repaint();

	}
}
