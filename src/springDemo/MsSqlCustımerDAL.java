package springDemo;

public class MsSqlCustımerDAL implements ICustomerDAL{
	
	@Override
	public void add() {
		System.out.println("MSSQL veritabanına eklendi.");
	}
	
}
