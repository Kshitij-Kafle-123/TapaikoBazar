package product.dao;

import java.util.List;

import product.dto.Customer;

public interface CustomerDao {
	
	public  void saveCustomerInfo(Customer customer); 
	public List<Customer> getAllCustomerInfo();
	

}
