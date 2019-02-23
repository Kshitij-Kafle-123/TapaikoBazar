/*package productController;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.dao.ProductDao;
import product.dao.ProductDaoImpl;

@WebServlet("/ImageDisplayController")

public class ImageDisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int DEFAULT_BUFFER_SIZE = 1024;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductDao productDao = new ProductDaoImpl();
		String productId = request.getParameter("productId");
		String filePath = "";

		if (productId != null) {
			int id = Integer.parseInt(productId);
			filePath = productDao.getImageUrlById(id);

		}
		File file = new File(filePath);
		String contentType = getServletContext().getMimeType(filePath);
		if (contentType == null) {

			contentType = "application/octet-stream";

		}
		response.reset();
		response.setContentType(contentType);
		response.setBufferSize(DEFAULT_BUFFER_SIZE);
		response.setHeader("Content-Length", String.valueOf(file.length()));
		response.setHeader("Content-Disposition", "attachement; filename=\"" + file.getName() + "\"");

		BufferedInputStream in = new BufferedInputStream(new FileInputStream(filePath));
		BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
		byte[] bytes = new byte[1024];
		int len;
		while ((len = in.read(bytes)) != -1) {
			out.write(bytes, 0, len);
		}
		in.close();
		out.flush();
		out.close();

	}

}

//<td><img src="ImageDisplayController?ProductId=${p.id}" alt="pic" height="50px" width="50px"> 
*/