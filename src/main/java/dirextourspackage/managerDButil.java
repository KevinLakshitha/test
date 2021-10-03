package dirextourspackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class managerDButil {
	private static Connection con = null;
	private static Statement stat = null; 
	private static ResultSet rs = null;
	
	private static boolean isSuccess;

	private static Statement stmt = null; 

	

	
	public static manager validate( String managerID){
		
		manager tourguide = null;
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "select * from manager where managerID = '"+managerID+"' ";
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				manager manager = new manager();
				
				String managerID1 = rs.getString(1);
				String nic = rs.getString(2);
				String name = rs.getString(3);
				String email = rs.getString(4);
				String phoneno = rs.getString(5);
				String section = rs.getString(6);
				
				
				
				manager.setmanagerID(managerID1);
				manager.setnic(nic);
				manager.setname(name);
				manager.setemail(email);
				manager.setphoneno(phoneno);
				manager.setsection(section);

			}
			
			
			
		}
				
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return tourguide;
		
	}
	
	
	
	
	

	public static boolean validatee(String managerid, String nic) {
		try {
			
		
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from manager where managerID='"+managerid+"' and nic='"+nic+"'";
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
	
	
	
	
	


public static List<manager> getmanager(String managerID) {
	
	ArrayList<manager> admi = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from manager where managerID='"+managerID+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
		
			String managerid = rs.getString(1);
			String nic = rs.getString(2);
			String name = rs.getString(3);
			String email = rs.getString(4);
			String phoneno = rs.getString(5);
			String section = rs.getString(6);
		
			
			manager ad = new manager(managerid, nic, name, email, phoneno, section);
			admi.add(ad);
			
		
		}
		
	}catch (Exception e) {}
	
	
	return admi;
	
}


	
	
	
	
	
	
	
	
	
		
	@SuppressWarnings("null")
	public static manager getTourguideById(String managerID){
		
		manager manager = null;
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
		
			String sql = "select * from manager where managerID = '"+managerID+"'";
			
			System.out.println(sql);
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				manager = new manager();
				String managerID1 = rs.getString(1);
				String nic = rs.getString(2);
				String name = rs.getString(3);
				String email = rs.getString(4);
				String phoneno = rs.getString(5);
				String section = rs.getString(6);

				
				manager.setmanagerID(managerID1);
				manager.setnic(nic);
				manager.setname(name);
				manager.setemail(email);
				manager.setphoneno(phoneno);
				manager.setsection(section);
	
			}
			
		}
				
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return manager;
		
	}
		
	public static boolean inserttourguide (String managerID, String nic, String name,String email, String phoneno, String section) {
		
		boolean isSuccess = false;
		System.out.println(managerID);
		
		try {
		
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "insert into manager (managerID, nic, name, email, phoneno, section) values ('"+managerID+"', '"+nic+"', '"+name+"', '"+email+"','"+phoneno+"','"+section+"')";
			int rs = stat.executeUpdate(sql);
			System.out.println(rs);
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean updatetourguide  (String managerID, String nic, String name,String email, String phoneno, String section) {
		
		boolean isSuccess = false;
			
		try {
		
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "UPDATE manager SET managerID = '"+managerID+"', nic = '"+nic+"',name = '"+name+"', email = '"+email+"' , phoneno = '"+phoneno+"', section = '"+section+"' WHERE managerID ='"+managerID+"'";
			int rs = stat.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean deleteTourguide(String managerID){
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
		
			String sql  = "DELETE FROM manager WHERE managerID = '" +managerID+"'";
			int rs = stat.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}

		}
				
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}



}
