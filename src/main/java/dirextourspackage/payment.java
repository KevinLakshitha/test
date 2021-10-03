package dirextourspackage;

public class payment{
	
    private String paymentid;
    private String customerid;
    private String customername;
    private String accprice;
    private String transprice;
    private String tourprice;
    private String total;
    private String paymentdate;
    
    
    public payment() {
    	
  	  
    }
    
    public payment( String paymentid, String customerid, String customername,String accprice, String transprice, String tourprice, String total, String paymentdate) {
		
		this.paymentid = paymentid;
		this.customerid = customerid;
		this.customername = customername;
		this.accprice = accprice;
		this.transprice = transprice;
		this.tourprice = tourprice;
		this.total = total;
		this.paymentdate = paymentdate;

    }

	
		public String getpaymentid() {
			return paymentid;
		}
	
		public String getcustomerid() {
			return customerid;
		}
	
		public String getcustomername() {
			return customername;
		}
		
		public String getaccprice() {
			return accprice;
		}
		public String gettransprice() {
			return transprice;
		}
		public String gettourprice() {
			return tourprice;
		}
		public String gettotal() {
			return total;
		}
		public String getpaymentdate() {
			return paymentdate;
		}
		

		

		public void setpaymentid(String paymentid) {
			this.paymentid = paymentid;
		}
		public void setcustomerid(String customerid) {
			this.customerid = customerid;
		}
		public void setcustomername(String customername) {
			this.customername = customername;
		}
		public void setaccprice(String accprice) {
			this.accprice = accprice;
		}
		
		public void settransprice(String transprice) {
			this.transprice = transprice;
		}

		public void settourprice(String tourprice) {
			this.tourprice = tourprice;
		}
		public void settotal(String total) {
			this.total = total;
		}
		public void setpaymentdate(String paymentdate) {
			this.paymentdate = paymentdate;
		}

	
	
		
}
