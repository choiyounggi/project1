package project.custom.contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.TimeZone;
import java.sql.ResultSet;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;


public class CustomTable_Select_Controller  {
	
	public static Integer sales_number;
	public static String name;
	public static Integer count;
	public static Integer size;
	public static Integer price;
	public static String purchaseDay;
	public static Integer currentPoint;

	public static Integer sh_Id;
	public static Integer sh_serialNum;
	public static ArrayList<String> mo = new ArrayList<String>();
	HikariDataSource ds = null;
	
	public CustomTable_Select_Controller() {
		ds = new Hikariconfig().config();
	}

	public void ShowCustom(String card) {
	     
			try {
				Connection conn = ds.getConnection();
				String sql = "SELECT * FROM ABC" +card;
				
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.printf("결제번호%d\n이름%s\n재고%d\n사이즈%d\n가격%d\n구매일%s\n포인트%d\nd신발시리얼%d\n신발ID%d",
						this.sales_number = rs.getInt("SALES_NUMBER"),
						this.name = rs.getString("SH_NAME"),
						this.count = rs.getInt("SH_COUNT"),
						this.size = rs.getInt("SH_SIZE"),
						this.price = rs.getInt("SH_PRICE"),
						this.purchaseDay = rs.getString("Purchase_day"),
						this.currentPoint = rs.getInt("CURRENT_POINT"),	
						this.sh_serialNum = rs.getInt("shoes_serial_number"),
						this.sh_Id = rs.getInt("SH_ID"),
						this.mo.add(sales_number.toString()),				
						this.mo.add(name),				
						this.mo.add(count.toString()),					
						this.mo.add(size.toString()),					
						this.mo.add(price.toString()),					
						this.mo.add(purchaseDay),				
						this.mo.add(currentPoint.toString()),
						this.mo.add(sh_serialNum.toString()),
						this.mo.add(sh_Id.toString())
							);
//					System.out.println(mo);
				}			
				
				if(rs != null) 
					rs.close();				
				if(pstmt != null) 
					pstmt.close();				
				if(conn != null) 
					conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
}
		public void ShowCustomNumber(String card, int number) {		
		    try {
				Connection conn = ds.getConnection();
				String sql = "SELECT * FROM ABC" +card +" where sales_number = ?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, number);
				
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.printf("결제번호%d\n이름%s\n재고%d\n사이즈%d\n가격%d\n구매일%s\n포인트%d\nd신발시리얼%d\n신발ID%d",
						this.sales_number = rs.getInt("SALES_NUMBER"),
						this.name = rs.getString("SH_NAME"),
						this.count = rs.getInt("SH_COUNT"),
						this.size = rs.getInt("SH_SIZE"),
						this.price = rs.getInt("SH_PRICE"),
						this.purchaseDay = rs.getString("Purchase_day"),
						this.currentPoint = rs.getInt("CURRENT_POINT"),	
						this.sh_serialNum = rs.getInt("shoes_serial_number"),
						this.sh_Id = rs.getInt("SH_ID"),
						this.mo.add(sales_number.toString()),				
						this.mo.add(name),				
						this.mo.add(count.toString()),					
						this.mo.add(size.toString()),					
						this.mo.add(price.toString()),					
						this.mo.add(purchaseDay),				
						this.mo.add(currentPoint.toString()),
						this.mo.add(sh_serialNum.toString()),
						this.mo.add(sh_Id.toString())
							);
//					System.out.println(mo);
				}			
								
				if(rs != null) 
					rs.close();				
				if(pstmt != null) 
					pstmt.close();				
				if(conn != null) 
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}



	
}
