package product.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bazar.util.DbUtil;

import product.dto.Customer;

public class CustomerDaoImpl implements CustomerDao{
	PreparedStatement ps = null;
	@Override
	public void saveCustomerInfo(Customer customer) {
		
		
		String sql = "insert into customer_table(first_name, last_name, address, email, phone)values(?,?,?,?,?)";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			
			ps.setString(1, customer.getFirstName());
			ps.setString(2, customer.getLastName());
			ps.setString(3, customer.getAddress());
			ps.setString(4, customer.getEmail());
			ps.setString(5, customer.getPhoneNo());
			
			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Customer> getAllCustomerInfo() {
	
		
		
		String sql = "select * from customer_table";

		List<Customer> customerList = new ArrayList<>();

		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Customer customer=new Customer();
				customer.setCid(rs.getInt("cid"));
				customer.setFirstName(rs.getString("first_name"));
				customer.setLastName(rs.getString("last_name"));
				customer.setEmail(rs.getString("email"));
				customer.setPhoneNo(rs.getString("phone"));
				customer.setAddress(rs.getString("address"));
				customerList.add(customer);

			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return customerList;

	
	
	}
	
}
