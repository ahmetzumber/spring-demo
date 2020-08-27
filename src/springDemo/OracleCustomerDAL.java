package springDemo;

public class OracleCustomerDAL implements ICustomerDAL{
	
	String connectionURL;
	
	public String getConnectionURL() {
		return connectionURL;
	}

	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}

	public void add() {
		System.out.println("Connection URL: "+this.connectionURL);
		System.out.println("Oracle veritabanına eklendi.");
	}
}
