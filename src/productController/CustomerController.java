package productController;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.dao.CustomerDao;
import product.dao.CustomerDaoImpl;
import product.dto.Customer;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerDao customerDao = new CustomerDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getParameter("actions");
		if(action.equals("message")) {
			RequestDispatcher rd = request.getRequestDispatcher("about.jsp");
			rd.forward(request, response);

		}else if(action.equals("customer_list")) {
			
			request.setAttribute("customer", customerDao.getAllCustomerInfo());
			RequestDispatcher rd = request.getRequestDispatcher("customer.jsp");
			rd.forward(request, response);
			
			
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		

		Customer customer = new Customer();

		customer.setFirstName(request.getParameter("fname"));
		customer.setLastName(request.getParameter("lname"));
		customer.setAddress(request.getParameter("address"));
		customer.setEmail(request.getParameter("email"));
		customer.setPhoneNo(request.getParameter("phone"));
		
		String customerID = request.getParameter("ccid");
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
		
		

		if (customerID == null || customerID.isEmpty()) {

			customerDao.saveCustomerInfo(customer);
		}

		

		response.sendRedirect("CustomerController?actions=message");

	}
		
		
	}


