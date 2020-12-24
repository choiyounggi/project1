package project.custom.action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTextField;

import project.custom.contoller.CustomTable_Select_Controller;
import project.custom.panel.panelCustomCheck;

public class Panel_Check_Numer_Action implements ActionListener{
	Container card_panel;
	JTextField tTitle;
	JTextField tNameTitle;
	Vector rowData;
	ArrayList<String> custom_info = new ArrayList<String>();
	ArrayList<String> custom_info_copy = new ArrayList<String>();
	public Panel_Check_Numer_Action(Container card_panel, Vector rowData) {
		this.card_panel = card_panel;
		this.rowData = rowData;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.tTitle = panelCustomCheck.textCardSearch;
		this.tNameTitle = panelCustomCheck.textNameSearch;
		
		
		new CustomTable_Select_Controller().ShowCustomNumber(tTitle.getText(), Integer.parseInt(tNameTitle.getText()));
	
		for (int i = 0; i < CustomTable_Select_Controller.mo.size(); i++) {
			custom_info.add(CustomTable_Select_Controller.mo.get(i));
		}
		
		for(int i = panelCustomCheck.dtm.getRowCount() -1; i>=0; i--) {
			panelCustomCheck.dtm.removeRow(i);
		}
		
		rowData = new Vector();
		for(int i = 0; i < custom_info.size();) {
		System.out.println("iÀÇ ¼ö" + i);
		rowData.add(CustomTable_Select_Controller.mo.get(i));
		i++;
		rowData.add(CustomTable_Select_Controller.mo.get(i));
		i++;
		rowData.add(CustomTable_Select_Controller.mo.get(i));
		i++;
		rowData.add(CustomTable_Select_Controller.mo.get(i));
		i++;
		rowData.add(CustomTable_Select_Controller.mo.get(i));
		i++;
		rowData.add(CustomTable_Select_Controller.mo.get(i));
		i++;
		rowData.add(CustomTable_Select_Controller.mo.get(i));
		i++;
		rowData.add(CustomTable_Select_Controller.mo.get(i));
		i++;
		rowData.add(CustomTable_Select_Controller.mo.get(i));
		i++;
		
		if(i != 0 && i%9 == 0) {
			panelCustomCheck.dtm.addRow(rowData);
			rowData = new Vector();
			continue;
		}
		panelCustomCheck.dtm.addRow(rowData);
	}
	panelCustomCheck.table.revalidate();
	panelCustomCheck.table.repaint();

	custom_info_copy.addAll(CustomTable_Select_Controller.mo);
	CustomTable_Select_Controller.mo.removeAll(custom_info_copy);
		
	}

}
