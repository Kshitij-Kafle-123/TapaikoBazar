package productController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import product.dao.ProductDao;
import product.dao.ProductDaoImpl;
import product.dto.Product;

@WebServlet("/ProductController")
//@MultipartConfig
public class ProductController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	ProductDao productDao = new ProductDaoImpl();
	/*private static final String PRODUCT_LIST = "adminView.jsp";
	private static final String PRODUCT_NEW = "add.jsp";
	private static final String PRODUCT_VIEW = "product.jsp";
	private static final String PRODUCT_NAME = "show.jsp";
	private static final String FOOD="food.jsp";
	private static final String BOOK="book.jsp";
	private static final String ELECTRONIC="electronic.jsp";
	private static final String CLOTH="cloth.jsp";*/
	/*private static final String ADD_CART="cart.jsp";*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("actions");
		//String forward = "";
		if (action.equals("add")) {
			RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
			rd.forward(request, response);

			

		} else if (action.equals("product_edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			request.setAttribute("product", productDao.getProductInfoById(id));
			RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
			rd.forward(request, response);

			
			
			
		} else if (action.equals("product_delete")) {

			int id = Integer.parseInt(request.getParameter("id"));
			productDao.deleteProductInfo(id);
			request.setAttribute("product", productDao.getAllProductInfo());
			RequestDispatcher rd = request.getRequestDispatcher("adminView.jsp");
			rd.forward(request, response);

			
			
		} else if (action.equals("product_list")) {

			request.setAttribute("product", productDao.getAllProductInfo());
			RequestDispatcher rd = request.getRequestDispatcher("adminView.jsp");
			rd.forward(request, response);

			
			
		}else if(action.equals("product_view")) {
			/*String identity= request.getParameter("id");
			if(!identity.equals(null)) {
				int id=Integer.parseInt(identity);
				request.setAttribute("product", productDao.getProductInfoById(id));
				RequestDispatcher rd = request.getRequestDispatcher("cart.jsp");
				rd.forward(request, response);
				
				
			}else {*/
				
			
			
			
			request.setAttribute("product", productDao.getAllProductInfo());
			RequestDispatcher rd = request.getRequestDispatcher("product.jsp");
			rd.forward(request, response);
		

			
		}else if(action.equals("food")) {
			
			request.setAttribute("product", productDao.getFood());
			RequestDispatcher rd = request.getRequestDispatcher("food.jsp");
			rd.forward(request, response);

			
		}else if(action.equals("cloth")) {
			
			request.setAttribute("product", productDao.getCloth());
			RequestDispatcher rd = request.getRequestDispatcher("cloth.jsp");
			rd.forward(request, response);

			
			
		}else if(action.equals("electronic")) {
			
			request.setAttribute("product", productDao.getElectronic());
			RequestDispatcher rd = request.getRequestDispatcher("electronic.jsp");
			rd.forward(request, response);

		}else if(action.equals("book")) {
			request.setAttribute("product", productDao.getBook());
			RequestDispatcher rd = request.getRequestDispatcher("book.jsp");
			rd.forward(request, response);

			
		}else if(action.equals("search")) {
			
			
			String productName = request.getParameter("ppname");
			
			request.setAttribute("product", productDao.getProductInfoByName(productName));
			
			RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
			rd.forward(request, response);

			
		}else if(action.equals("add_cart")) {
			int id = Integer.parseInt(request.getParameter("id"));
			
			
			request.setAttribute("product", productDao.getProductInfoById(id));
			
			RequestDispatcher rd = request.getRequestDispatcher("cart.jsp");
			rd.forward(request, response);
			
			
		}else if(action.equals("shop")) {
			
			int id = Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("pname");
			productDao.saveInfo(id, name);
			productDao.deleteProductInfo(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("customerFile.jsp");
			rd.forward(request, response);
			
			
		}else if(action.equals("sells_list")) {
			
			
			request.setAttribute("product", productDao.getSells());
			RequestDispatcher rd= request.getRequestDispatcher("sells.jsp");
			rd.forward(request, response);
		}
		

		/*RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);*/

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Product product = new Product();

		product.setProductName(request.getParameter("pname"));
		//product.setId(Integer.parseInt(request.getParameter("pid")));
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		product.setCategory(request.getParameter("category"));
		//product.setImgUrl(request.getParameter("image"));
		product.setDescription(request.getParameter("description"));

		
		String productId = request.getParameter("pid");
	/*//-----for image----------------------------	
		Part part=request.getPart("image");

		String fileName=ImageUtil.getFileName(part);
		String imageUrl="";
		if(!fileName.isEmpty()) {
			imageUrl=ImageUtil.writeImageFile(ImageUtil.IMAGE_UPLOAD_PATH+fileName,  part);
			
			
		}else {
			
			imageUrl=productDao.getImageUrlById(Integer.parseInt(productId));
			
		}
		product.setImgUrl(imageUrl);
		
		
	//-------------------------------------------------	
		*/
		
		

		if (productId == null || productId.isEmpty()) {

			productDao.saveProductInfo(product);
		}

		else {
			product.setId(Integer.parseInt(productId));
			productDao.updateProductInfo(product);
		}

		response.sendRedirect("ProductController?actions=product_list");

	}

}
