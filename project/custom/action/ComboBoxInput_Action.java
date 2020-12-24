package project.custom.action;

import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;



public class ComboBoxInput_Action implements ActionListener{

	Container panel;
	JTextField type = new JTextField(10);
	String[] sum;
	public ComboBoxInput_Action(Container panel, JTextField type, String[] sum) {
		this.panel = panel;
		this.type = type;
		this.sum = sum;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<String> t = (JComboBox<String>)e.getSource();
		int idx = t.getSelectedIndex();
		type.setText(sum[idx]);
		System.out.println(type.getText());
		if(type.getText().equals("직접입력")) {
			type.setText("");
			project.custom.panel.panelUpdate.textEmail02.setEditable(true);
		}
		
	}
	
}
