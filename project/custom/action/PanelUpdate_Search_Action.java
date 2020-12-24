package project.custom.action;

import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import project.custom.contoller.Custom_Select_Controller;
import project.custom.panel.panelUpdate;

public class PanelUpdate_Search_Action implements ActionListener{

	Container panel;
	private JTextField cardNumber = new JTextField(30);
	private JTextField tName = new JTextField(30);
	private JTextField tGender = new JTextField(5);
	private JTextField tAge;
	 private JTextField tPon01;
	 private JTextField tPon02;
	 private JTextField tEmail01;
	 private JTextField tEmail02;
	 private JTextField tAddr;

	 
	 
	public PanelUpdate_Search_Action(Container panel, JTextField cardNumber, JTextField tName, JTextField tAge, JTextField tGender, JTextField tPon01, JTextField tPon02, JTextField tEmail01, JTextField tEmail02, JTextField tAddr) {
		this.panel = panel;
		this.cardNumber = cardNumber;
		this.tName = tName;
		this.tAge = tAge;
		this.tGender = tGender;
		this.tPon01 = tPon01;
		this.tPon02 = tPon02;
		this.tEmail01 = tEmail01;
		this.tEmail02 = tEmail02;
		this.tAddr = tAddr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		new Custom_Select_Controller().Custom_Card_select(cardNumber.getText());
		tName.setText(Custom_Select_Controller.c_name);
		tAge.setText(Custom_Select_Controller.c_age+"");
		tGender.setText(Custom_Select_Controller.c_gender);
		
		
		
		panelUpdate.ponBox.setSelectedItem(Custom_Select_Controller.c_phone.substring(0, 3));
		tPon01.setText(Custom_Select_Controller.c_phone.substring(4, 8));
		tPon02.setText(Custom_Select_Controller.c_phone.substring(9, 13));
		int idx = Custom_Select_Controller.c_email.lastIndexOf("@");
		
		tEmail01.setText(Custom_Select_Controller.c_email.substring(0, idx));
		tEmail02.setText(Custom_Select_Controller.c_email.substring(idx+1));		
		tAddr.setText(Custom_Select_Controller.c_addr);
		panelUpdate.eMailBox.setSelectedItem(tEmail02.getText());
		
		if(tGender.getText().equals("남")) {
			panelUpdate.checkMan.setSelected(true);
		}else if(tGender.getText().equals("여")) {
			panelUpdate.checkWomen.setSelected(true);
		}else {
			System.err.println("입력 잘못받음");
		}
		
	}
}
