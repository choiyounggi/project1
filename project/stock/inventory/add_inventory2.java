package project.stock.inventory;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class add_inventory2 extends JFrame {
   JTextField tf = new JTextField(20);
   JTextArea ta = new JTextArea(7, 20);

   public add_inventory2() {
      setTitle("재고수량 조회 및 추가 주문 조회");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.add(new JLabel("재고수량 조회/시리얼넘버입력<Enter>"));
      c.add(tf);
      c.add(new JScrollPane(ta));

      tf.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JTextField t = (JTextField) e.getSource();

            ta.append("[" + t.getText() + "]재고조회\n" + new add_inventory(t.getText()).info());
            t.setText("");
         }
      });
      setSize(300, 300);
      setVisible(true);
   }

   public static void main(String[] args) {
      new add_inventory2();
   }
}