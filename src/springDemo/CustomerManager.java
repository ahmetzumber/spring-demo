package springDemo;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDAL customerDAL;
	
	// contructor injection
	//	public CustomerManager(ICustomerDAL customerDAL) {
	//		this.customerDAL = customerDAL;
	//	}

	// setter injection 
	public void setCustomerDAL(ICustomerDAL customerDAL) {
		this.customerDAL = customerDAL;
	}

	public void add() {
		customerDAL.add();
	}
}
