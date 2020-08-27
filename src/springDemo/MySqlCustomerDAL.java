package springDemo;

public class MySqlCustomerDAL implements ICustomerDAL{
	
	String connectionURL;
	
	public String getConnectionURL() {
		return connectionURL;
	}

	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}
	
	@Override
	public void add() {
		System.out.println("Connection URL: "+this.connectionURL);
		System.out.println("MySQL veritabanına eklendi.");
	}
}
