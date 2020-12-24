package project.stock.find_br_day;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class find_br_day2 extends JFrame {
   JTextField tf = new JTextField(20);
   JTextArea ta = new JTextArea(7, 20); 

   public find_br_day2() {
      setTitle("브랜드 별 행사 조회");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.add(new JLabel("브랜드별 행사조회/브랜드 입력 후<Enter>"));
      c.add(tf);
      c.add(new JScrollPane(ta));

      tf.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JTextField t = (JTextField)e.getSource();
            
            ta.append("[" + t.getText() + "]행사 조희 정보\n" + new find_br_day(t.getText()).imfo()); 
            System.out.println(new find_br_day(t.getText()).imfo());
            t.setText(""); 
         }
      });
      setSize(300, 300);
      setVisible(true);
   }
   public static void main(String[] args) {
      new find_br_day2();
}
}