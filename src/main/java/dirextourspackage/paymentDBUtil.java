package dirextourspackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;




public class paymentDBUtil {
	private static Connection con = null;
	private static Statement stat = null; 
	private static ResultSet rs = null;
	
	public static payment validate( String paymentid){
		
		payment tourguid = null;
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "select * from payment where paymentid = '"+paymentid+"' ";
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				payment payment = new payment();
				
				String paymentid1 = rs.getString(1);
				String customerid = rs.getString(2);
				String customername = rs.getString(3);
				String accprice = rs.getString(4);
				String transprice = rs.getString(5);
				String tourprice = rs.getString(6);
				String total = rs.getString(7);
				String paymentdate = rs.getString(8);
				
				
				
				
			
				
				
				
				payment.setpaymentid(paymentid1);
				payment.setcustomerid(customerid);
				payment.setcustomername(customername);
				payment.setaccprice(accprice);
				payment.settransprice(transprice);
				payment.settourprice(tourprice);
				payment.settotal(total);
				payment.setpaymentdate(paymentdate);

			}
			
			
			
		}
				
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return tourguid;
		
	}
	
	
	
	
	@SuppressWarnings("null")
	public static payment getTourguidById(String paymentid){
		
		payment payment = null;
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
		
			String sql = "select * from payment where paymentid = '"+paymentid+"'";
			
			System.out.println(sql);
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				payment = new payment();
				
			
				
				String paymentid1 = rs.getString(1);
				String customerid = rs.getString(2);
				String customername = rs.getString(3);
				String accprice = rs.getString(4);
				String transprice = rs.getString(5);
				String tourprice = rs.getString(6);
				String total = rs.getString(7);
				String paymentdate = rs.getString(8);
				

				
				payment.setpaymentid(paymentid1);
				payment.setcustomerid(customerid);
				payment.setcustomername(customername);
				payment.setaccprice(accprice);
				payment.settransprice(transprice);
				payment.settourprice(tourprice);
				payment.settotal(total);
				payment.setpaymentdate(paymentdate);
	
			}
			
		}
				
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return payment;
		
	}
	
	
	

}
