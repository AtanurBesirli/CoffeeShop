package CoffeeShop;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {
CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException{
		
		if(customerCheckService.CheckIfRealPerson(customer)){
			super.save(customer);
		}else {
			System.out.println("Hatalı kullanıcı girişi");
		}		
		
	}
	
	
}
