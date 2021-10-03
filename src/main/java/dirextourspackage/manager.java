package dirextourspackage;

public class manager {
	
    private String managerID;
    private String nic;
    private String name;
    private String email;
    private String phoneno;
    private String section;
	
    public manager() {
  	  
    }
    
    public manager( String managerID, String nic, String name,String email, String phoneno, String section) {
		
		this.managerID = managerID;
		this.nic = nic;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.section = section;

    }

	
		public String getmanagerID() {
			return managerID;
		}
	
		public String getnic() {
			return nic;
		}
	
		public String getname() {
			return name;
		}
		
		public String getemail() {
			return email;
		}
		public String getphoneno() {
			return phoneno;
		}
		public String getsection() {
			return section;
		}
		
		
		
		
		

		public void setmanagerID(String managerID) {
			this.managerID = managerID;
		}

		
		public void setnic(String nic) {
			this.nic = nic;
		}
		public void setname(String name) {
			this.name = name;
		}
		
		public void setemail(String email) {
			this.email = email;
		}

		public void setphoneno(String phoneno) {
			this.phoneno = phoneno;
		}
		public void setsection(String section) {
			this.section = section;
		}

	
	
		
}
