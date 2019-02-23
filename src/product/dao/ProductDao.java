package product.dao;

import java.util.List;
import product.dto.Product;

public interface ProductDao {

	public void saveProductInfo(Product product);

	public void saveInfo(int id, String productName);

	public void updateProductInfo(Product product);

	public List<Product> getAllProductInfo();

	public void deleteProductInfo(int id);

	public void saveToCart(int id);

	public List<Product> getProductInfoByName(String productName);

	public Product getProductInfoById(int id);

	public List<Product> search(String params);

	public List<Product> getFood();

	public List<Product> getCloth();

	public List<Product> getElectronic();

	public List<Product> getBook();
	public List<Product> getSells();

}
