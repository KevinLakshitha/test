package dirextourspackage;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class adminLoginDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null; 
	private static ResultSet rs = null;

	
	public static boolean validate(String adminid, String adminPw) {
		try {
			
		
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from admin where adminID='"+adminid+"' and adminPw='"+adminPw+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				
		
				isSuccess = true;
			}else {
				
	
				isSuccess = false;	
			}
			
		} catch (Exception e) {
			

			e.printStackTrace();
		}
		
		return isSuccess;
	}
	


public static List<admin> getadmin(String adminID) {
	
	ArrayList<admin> admi = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from admin where adminID='"+adminID+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
		
			String adminid = rs.getString(1);
			String adminPw = rs.getString(2);
		
			
			admin ad = new admin(adminid,adminPw);
			admi.add(ad);
			
		
		}
		
	}catch (Exception e) {}
	
	
	return admi;
	
}




//insert data

public static boolean addmanager(String managerID , String nic , String name , String email , String phoneno , String section) {
	
	boolean isSuccess = false;
	
	
	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		//insert values
		
		String sql = "insert into manager values ('"+managerID+"' ,'"+nic+"', '"+name+"','"+email+"','"+phoneno+"', '"+section+"')";
		
		int rs = stmt.executeUpdate(sql);
		
		if(rs>0) {
			isSuccess = true ;
		}
		else {
			isSuccess = false;
		}
	}
	catch (Exception e) {
		e.printStackTrace();
		
	}
	
	
	
	return isSuccess;
 }
 







}

	
	