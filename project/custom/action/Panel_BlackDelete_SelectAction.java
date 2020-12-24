package project.custom.action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;

import project.custom.contoller.Black_Controller;
import project.custom.panel.panelBlackDelete;

public class Panel_BlackDelete_SelectAction implements ActionListener {
	Container card_panel;
	JTextField textSearch;
	Vector rowData;
	JTable table;
	ArrayList<String> custom_info = new ArrayList<String>();

	public Panel_BlackDelete_SelectAction(Container card_panel, Vector rowDate, JTextField textSearch, JTable table) {
		this.card_panel = card_panel;
		this.rowData = rowDate;
		this.textSearch = textSearch;
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (textSearch.getText().equals("")) {
			System.out.println("공백");
			new Black_Controller().BlackSelect_All();
		}
//		} else if (!textSearch.getText().equals("")) {
//			new Black_Controller().BlackSelect_All();
//
//			for (int i = 0; i < Black_Controller.mo.size(); i++) {
//				if (Black_Controller.mo.get(i).equals(textSearch.getText())) {
//					custom_info.addAll(Custom_Select_Controller.mo);
//					Black_Controller.mo.removeAll(custom_info);
//					break;
//				}
//			}
//		}

		for (int i = panelBlackDelete.dtm.getRowCount() - 1; i >= 0; i--) {
			panelBlackDelete.dtm.removeRow(i);
		}
		new Black_Controller().BlackCard_Select(textSearch.getText());
		new Black_Controller().BlackName_Select(textSearch.getText());
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
			System.out.println("i의 수" + i);
			if (i != 0 && i % 10 == 0) {
				panelBlackDelete.dtm.addRow(rowData);
				rowData = new Vector();
				continue;
			}
			panelBlackDelete.dtm.addRow(rowData);
		}
		custom_info.addAll(Black_Controller.mo);
		Black_Controller.mo.removeAll(custom_info);
		table.revalidate();
		table.repaint();
		textSearch.setText("");
	}
}
