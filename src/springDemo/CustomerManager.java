package springDemo;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDAL customerDAL;
	
	public CustomerManager(ICustomerDAL customerDAL) {
		this.customerDAL = customerDAL;
	}

	public void add() {
		customerDAL.add();
	}
}
