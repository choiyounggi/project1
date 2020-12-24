package project.custom.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import project.mainFrame.Main_frame;
import project.custom.action.ComboBoxInput_Action;
import project.custom.contoller.Custom_Registration_Controller;
import project.custom.main.Frame01;
import main.MainFrame;

public class panelInput extends JPanel implements ItemListener {
	public static JTextField tName;
	private panelSearch panelSearch;
//	private Frame01 Frame01;

	private JTextField ponclean;
	private JTextField ponfirst;
	private JTextField ponlast;
	private JTextField tAddr;
	private JComboBox eMailBox;
	private JComboBox ponBox;
//	public static ArrayList<String> peple = new ArrayList<String>();
	JTextField tGender = new JTextField(5);
	public static JCheckBox checkMan = new JCheckBox("남");
	public static JCheckBox checkWomen = new JCheckBox("여");
	private JTextField tEmail01;
	private JTextField tEmail02;
	private JTextField textAge;
	JButton btnExit;
	ButtonGroup bg = new ButtonGroup();
	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/custom/image/abc01.jpg")).getImage().getScaledInstance(335,
			529, Image.SCALE_SMOOTH);
	private Image img_logo1 = new ImageIcon(Frame01.class.getResource("/project/custom/image/two.jpg")).getImage().getScaledInstance(803,
			526, Image.SCALE_SMOOTH);
	
	String[] ponlist = { "010", "011", "019" };
	String[] maillist = { "naver.com", "hanmail", "nate.com", "empas.com", "yahoo.co.kr", "hotmail.com", "gmail.com",
			"직접입력", "" };
	private JLabel lblNewLabel_2;

	public panelInput() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		setBounds(0, 0, 807, 533);
		panelSearch = new panelSearch();
		setBackground(new Color(255, 160, 122));
		setLayout(null);

		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(255, 160, 122));
		panelMenu.setBounds(2, 3, 803, 528);
		add(panelMenu);
		panelMenu.setLayout(null);

		JLabel lblName = new JLabel("\uC774\uB984: ");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setBounds(48, 112, 41, 24);
		lblName.setFont(new Font("휴먼편지체", Font.BOLD, 16));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		panelMenu.add(lblName);

		JLabel lblGender = new JLabel("\uC131\uBCC4:");
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setBounds(48, 214, 41, 24);
		lblGender.setToolTipText("");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("휴먼편지체", Font.BOLD, 16));
		panelMenu.add(lblGender);

		JLabel lblPhone = new JLabel("\uD578\uB4DC\uD3F0: ");
		lblPhone.setForeground(new Color(255, 255, 255));
		lblPhone.setBounds(33, 265, 60, 24);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("휴먼편지체", Font.BOLD, 15));
		panelMenu.add(lblPhone);

		JLabel lblEmeail = new JLabel("Email:");
		lblEmeail.setForeground(new Color(255, 255, 255));
		lblEmeail.setBounds(41, 316, 48, 21);
		lblEmeail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmeail.setFont(new Font("휴먼편지체", Font.BOLD, 16));
		panelMenu.add(lblEmeail);

		JLabel lblAddr = new JLabel("\uC8FC\uC18C:");
		lblAddr.setForeground(new Color(255, 255, 255));
		lblAddr.setBounds(48, 367, 41, 24);
		lblAddr.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddr.setFont(new Font("휴먼편지체", Font.BOLD, 16));
		panelMenu.add(lblAddr);

		tName = new JTextField();
		tName.setBounds(100, 110, 73, 26);
		panelMenu.add(tName);
		tName.setColumns(10);
		checkMan.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		checkMan.setBounds(100, 211, 43, 26);
		checkMan.setBackground(Color.WHITE);
		checkWomen.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		checkWomen.setBounds(153, 211, 43, 26);
		checkWomen.setBackground(Color.WHITE);
		panelMenu.add(checkMan);
		panelMenu.add(checkWomen);
		
		
		

		ponfirst = new JTextField();
		ponfirst.setBounds(189, 263, 73, 26);
		ponfirst.setColumns(10);
		panelMenu.add(ponfirst);

		ponclean = new JTextField(10);
		ponclean.setBounds(0, 0, 0, 0);
		panelMenu.add(ponclean);

		ponlast = new JTextField();
		ponlast.setBounds(277, 263, 73, 26);
		ponlast.setColumns(10);
		panelMenu.add(ponlast);

		tAddr = new JTextField();
		tAddr.setBounds(100, 363, 250, 26);
		tAddr.setColumns(10);
		panelMenu.add(tAddr);

		DefaultComboBoxModel<String> ponDe = new DefaultComboBoxModel<String>(ponlist);
		 ponBox = new JComboBox(ponDe);
		 ponBox.setBounds(100, 263, 73, 26);
		ponBox.setSelectedItem(ponlist[0]);
		panelMenu.add(ponBox);
		ponBox.addActionListener(new ComboBoxInput_Action(panelMenu, ponclean, ponlist));
//		ponclean.setText(ponBox.getSelectedItem().toString());

		tEmail01 = new JTextField();
		tEmail01.setBounds(100, 313, 90, 26);
		tEmail01.setColumns(10);
		panelMenu.add(tEmail01);

		tEmail02 = new JTextField();
		tEmail02.setBounds(211, 313, 90, 26);
		tEmail02.setColumns(10);

		panelMenu.add(tEmail02);
		JLabel eMailGol = new JLabel("@");
		eMailGol.setBounds(188, 313, 23, 25);
		eMailGol.setHorizontalAlignment(SwingConstants.CENTER);

		panelMenu.add(eMailGol);

		DefaultComboBoxModel<String> eMdef = new DefaultComboBoxModel<String>(maillist);

		 eMailBox = new JComboBox(eMdef);
		 eMailBox.setBounds(312, 313, 90, 26);
		panelMenu.add(eMailBox);
		eMailBox.addActionListener(new ComboBoxInput_Action(panelMenu, tEmail02, maillist));
//		tEmail02.setText(eMailBox.getSelectedItem().toString());
		
		JLabel lblYear = new JLabel("\uB098\uC774:");
		lblYear.setForeground(new Color(255, 255, 255));
		lblYear.setBounds(48, 163, 41, 24);
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setFont(new Font("휴먼편지체", Font.BOLD, 16));
		panelMenu.add(lblYear);

	

	

		textAge = new JTextField();
		textAge.setBounds(100, 161, 73, 26);
		textAge.setColumns(10);
		panelMenu.add(textAge);

		JButton btnInput = new JButton("\uB4F1\uB85D");
		btnInput.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		btnInput.setBounds(131, 487, 88, 32);
		btnInput.setForeground(Color.PINK);
		btnInput.setBackground(Color.WHITE);
		panelMenu.add(btnInput);
		btnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Custom_Registration_Controller().Custom_insert_create_table_info(tName.getText(),
						Integer.parseInt(textAge.getText()),
						tGender.getText(),
						ponclean.getText() + "-" + ponfirst.getText() + "-" + ponlast.getText(),
						tEmail01.getText() + "@" + tEmail02.getText(), tAddr.getText());
				tName.setText("");
				textAge.setText("");
				tEmail01.setText("");
				tEmail02.setText("");
				eMailBox.setSelectedItem(maillist[0]);
				ponBox.setSelectedItem(ponlist[0]);
				ponfirst.setText("");
				ponlast.setText("");
				tAddr.setText("");
				System.out.println(tGender.getText());
				if(tGender.getText().equals("남")) {
					checkMan.setSelected(false);		
					
				}else {		
					checkWomen.setSelected(false);
					
				}
				

			}
		});
		
	
		btnExit = new JButton("\uCDE8\uC18C");
		btnExit.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		btnExit.setBounds(223, 487, 88, 32);
		btnExit.setForeground(Color.RED);
		btnExit.setBackground(Color.WHITE);
		panelMenu.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("\uC138");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(177, 163, 20, 26);
		panelMenu.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("ABC\uB9C8\uD2B8 \uD68C\uC6D0 \uB4F1\uB85D");
		lblNewLabel_2.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 26, 446, 51);
		panelMenu.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(img_logo1));
		lblNewLabel_3.setBounds(0, 1, 803, 526);
		panelMenu.add(lblNewLabel_3);
//		bg.add(checkMan);
//		bg.add(checkWomen);
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					new MainFrame().menuClicked(MainFrame.home);
				InputCleanSet();
			}
		});
		
		checkMan.addItemListener(this);
		checkWomen.addItemListener(this);
	}
	
	public void InputCleanSet() {
		tName.setText("");
		textAge.setText("");
		tEmail01.setText("");
		tEmail02.setText("");
		eMailBox.setSelectedItem(maillist[0]);
		ponBox.setSelectedItem(ponlist[0]);
		tAddr.setText("");
		ponfirst.setText("");
		ponlast.setText("");
		checkMan.setSelected(false);
		checkWomen.setSelected(false);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int selected = 0;
		// getStateChange()의미는 체크가 되있다면 SELECTED:체크 / DESELECTED
		if (e.getStateChange() == ItemEvent.SELECTED) {
			selected = 1;
			if(e.getSource() == checkMan) {
				checkWomen.setSelected(false);
			}else {
				checkMan.setSelected(false);
			}
		}
		else
			selected = -1;
		if(e.getSource() == checkMan) {
			tGender.setText("남");
			System.out.println("남");
		} else if(e.getSource() == checkWomen){
			tGender.setText("여");	
			System.out.println("여");
		}

	}
}
