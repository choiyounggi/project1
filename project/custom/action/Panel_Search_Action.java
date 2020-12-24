package project.custom.action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;

import project.custom.contoller.Custom_Select_Controller;
import project.custom.panel.panelSearch;

public class Panel_Search_Action implements ActionListener {

	Container card_panel;
	Vector rowData;
	JTextField textSearch;
	JTable table;
	ArrayList<String> custom_info = new ArrayList<String>();

	public Panel_Search_Action(Container card_panel, Vector rowDate, JTextField textSearch, JTable table) {
		this.card_panel = card_panel;
		this.rowData = rowDate;
		this.textSearch = textSearch;
		this.table = table;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (textSearch.getText().equals("")) {
			System.out.println("공백");
			new Custom_Select_Controller().allSelect();
		} else if (!textSearch.getText().equals("")) {
			new Custom_Select_Controller().allSelect();

			for (int i = 0; i < Custom_Select_Controller.mo.size(); i++) {
				if (Custom_Select_Controller.mo.get(i).equals(textSearch.getText())) {
					custom_info.addAll(Custom_Select_Controller.mo);
					Custom_Select_Controller.mo.removeAll(custom_info);
					break;
				}
			}
		}
		for (int i = panelSearch.dtm.getRowCount() - 1; i >= 0; i--) {
			panelSearch.dtm.removeRow(i);
		}
		new Custom_Select_Controller().Custom_Card_select(textSearch.getText());
		new Custom_Select_Controller().Custom_Name_Select(textSearch.getText());
		rowData = new Vector();

		for (int i = 0; i < Custom_Select_Controller.mo.size();) {
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			System.out.println("i의 수" + i);
			if (i != 0 && i % 9 == 0) {
				panelSearch.dtm.addRow(rowData);
				rowData = new Vector();
				continue;
			}
			panelSearch.dtm.addRow(rowData);
		}
		custom_info.addAll(Custom_Select_Controller.mo);
		Custom_Select_Controller.mo.removeAll(custom_info);
		table.revalidate();
		table.repaint();
		textSearch.setText("");
	}
}
