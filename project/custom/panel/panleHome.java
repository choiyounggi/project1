package project.custom.panel;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Image;

import javax.swing.border.LineBorder;

import project.custom.main.Frame01;

public class panleHome extends JPanel {
	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/custom/image/abclogo.jpg")).getImage().getScaledInstance(803,
			111, Image.SCALE_SMOOTH);
	
	private Image img_main = new ImageIcon(Frame01.class.getResource("/project/custom/image/abcclss.jpg")).getImage().getScaledInstance(803,
			421, Image.SCALE_SMOOTH);
	
	public panleHome() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBackground(new Color(255, 160, 122));
		setBounds(0, 0, 807, 533);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(img_logo));
		lblNewLabel.setBounds(2, 2, 803, 111);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(img_main));
		lblNewLabel_1.setBounds(2, 112, 803, 421);
		add(lblNewLabel_1);
	}
}
