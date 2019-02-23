package product.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bazar.util.DbUtil;

import product.dto.Product;

public class ProductDaoImpl implements ProductDao {

	PreparedStatement ps = null;

	
	
	@Override
	public void updateProductInfo(Product product) {

		String sql = "update product_table set product_name=?, price=?, type=?, description=? where id=?";

		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, product.getProductName());

			ps.setInt(2, product.getPrice());
			ps.setString(3, product.getCategory());
			// ps.setString(5, product.getImgUrl());
			ps.setString(4, product.getDescription());
			ps.setInt(5, product.getId());

			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	
	
	
	
	@Override
	public void saveProductInfo(Product product) {
		String sql = "insert into product_table(product_name, price, type, description)values(?,?,?,?)";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, product.getProductName());
			/*ps.setInt(2, product.getId());*/
			ps.setInt(2, product.getPrice());
			ps.setString(3, product.getCategory());
			// ps.setString(5, product.getImgUrl());
			ps.setString(4, product.getDescription());
			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	
	@Override
	public List<Product> getAllProductInfo() {
		String sql = "select * from product_table";

		List<Product> productList = new ArrayList<>();

		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setProductName(rs.getString("product_name"));
				product.setCategory(rs.getString("type"));
				product.setDescription(rs.getString("description"));
				// product.setImgUrl(rs.getString("image"));
				product.setPrice(rs.getInt("price"));

				productList.add(product);

			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return productList;
	}

	@Override
	public void deleteProductInfo(int id) {
		String sql = "delete from product_table where id=?";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Product> getProductInfoByName(String productName) {

		String sql = "select * from product_table where product_name=?";
		List<Product> pList = new ArrayList<>();
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, productName);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();

				product.setId(rs.getInt("id"));
				product.setProductName(rs.getString("product_name"));
				product.setPrice(rs.getInt("price"));
				product.setDescription(rs.getString("description"));
				// product.setImgUrl(rs.getString("image"));
				product.setCategory(rs.getString("type"));
				pList.add(product);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return pList;
	}

	@Override
	public List<Product> search(String params) {
		return null;
	}

	@Override
	public Product getProductInfoById(int id) {
		String sql = "select * from product_table where id=?";
		Product product = new Product();
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				product.setId(rs.getInt("id"));
				product.setProductName(rs.getString("product_name"));
				product.setPrice(rs.getInt("price"));
				product.setDescription(rs.getString("description"));
				// product.setImgUrl(rs.getString("image"));
				product.setCategory(rs.getString("type"));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return product;
	}

	/*
	 * @Override public String getImageUrlById(int id) { String sql =
	 * "select * from product_table where id=?"; String imageUrl = ""; try { ps =
	 * DbUtil.getConnection().prepareStatement(sql); ps.setInt(1, id); ResultSet rs
	 * = ps.executeQuery(); if (rs.next()) { imageUrl = rs.getString("image");
	 * 
	 * }
	 * 
	 * } catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	 * 
	 * return null; }
	 */

	@Override
	public List<Product> getFood() {

		String sql = "select * from product_table where type='food'";

		List<Product> productList = new ArrayList<>();

		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setProductName(rs.getString("product_name"));
				product.setCategory(rs.getString("type"));
				product.setDescription(rs.getString("description"));
				// product.setImgUrl(rs.getString("image"));
				product.setPrice(rs.getInt("price"));

				productList.add(product);

			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return productList;

	}

	@Override
	public List<Product> getCloth() {

		String sql = "select * from product_table where type='cloth'";

		List<Product> productList = new ArrayList<>();

		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setProductName(rs.getString("product_name"));
				product.setCategory(rs.getString("type"));
				product.setDescription(rs.getString("description"));
				// product.setImgUrl(rs.getString("image"));
				product.setPrice(rs.getInt("price"));

				productList.add(product);

			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return productList;

	}

	@Override
	public List<Product> getElectronic() {
		String sql = "select * from product_table where type='electronic'";

		List<Product> productList = new ArrayList<>();

		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setProductName(rs.getString("product_name"));
				product.setCategory(rs.getString("type"));
				product.setDescription(rs.getString("description"));
				// product.setImgUrl(rs.getString("image"));
				product.setPrice(rs.getInt("price"));

				productList.add(product);

			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return productList;

	}

	@Override
	public List<Product> getBook() {

		String sql = "select * from product_table where type='book'";

		List<Product> productList = new ArrayList<>();

		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setProductName(rs.getString("product_name"));
				product.setCategory(rs.getString("type"));
				product.setDescription(rs.getString("description"));
				// product.setImgUrl(rs.getString("image"));
				product.setPrice(rs.getInt("price"));

				productList.add(product);

			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return productList;

	}





	@Override
	public void saveToCart(int id) {

		
		String sql = "insert into cart_table(product_name,  product_type, product_price, description)values(?,?,?,?)";
		try {
			Product product = new Product();
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, product.getProductName());
			/*ps.setInt(2, product.getId());*/
			ps.setInt(2, product.getPrice());
			ps.setString(3, product.getCategory());
			// ps.setString(5, product.getImgUrl());
			ps.setString(4, product.getDescription());
			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}





	@Override
	public void saveInfo(int id, String productName) {
		String sql = "insert into sells_table(productName, id)values(?,?)";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, productName);
			ps.setInt(2, id);
		
			
			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}





	@Override
	public List<Product> getSells() {

		String sql = "select * from sells_table";

		List<Product> productList = new ArrayList<>();

		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setProductName(rs.getString("productName"));
				

				productList.add(product);

			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return productList;
		
		
	}

}
