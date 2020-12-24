package project.custom.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Create_card {
	int count = 5;
	String[] su = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	ArrayList<String> t1 = new ArrayList<String>();
	LinkedList<String> link = new LinkedList<String>();

	public Create_card() {

		for (int j = 0; j < count;) {
			String arr = "";
			for (int i = 0; i < 16; i++) {
				int rn = (int) (Math.random() * 9);
				arr += su[rn];				
			}
			if (t1.size() == 0) {
				t1.add(arr);
				++j;
				continue;
			} else {

				for (int i = 0; i < t1.size();) {
					if (arr.equals(t1.get(i))) {
						break;
					} else {
						t1.add(arr);
						j++;
						break;
					}
				}
			}
		}		
		linkList();
	}


	public void linkList() {
		for (int i = 0; i < t1.size(); i++) {
			link.add(t1.get(i));
		}
	}
	public String inputCard() {
		return link.poll();
	}
	
	
	
	
	
	public static void main(String[] args) {
		Create_card c = new Create_card();

	}

}
