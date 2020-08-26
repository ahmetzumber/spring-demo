package springDemo;

public class MySqlCustomerDAL implements ICustomerDAL{
	@Override
	public void add() {
		System.out.println("MySQL veritabanına eklendi.");
	}
}
