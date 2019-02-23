package productController;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		
		HttpSession session=request.getSession();
		session.invalidate();
		
		RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
		request.setAttribute("LogOutMsg", "You are successfully Logged out!!!");
		rd.include(request, response);
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		
		
		
		

		/*String sql = "select * from login_table";

		List<Login> loginn = new ArrayList<>();
		
		try {
		ps = DbUtil.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Login login = new Login();
		 login.setUsername(rs.getString("username"));
		login.setPassword(rs.getString("password"));

		loginn.add(login);

		}
		
		}catch(SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}

		return loginn;
		*/
		
		
		if(user.equals("kshitij")&&pass.equals("kafle")) {
			
			
			HttpSession session=request.getSession();
			session.setAttribute("username", user);
			RequestDispatcher rd = request.getRequestDispatcher("adminView.jsp");
			rd.forward(request, response);

			
		}else if(user.equals("hari")&&pass.equals("abcd")) {

			HttpSession session=request.getSession();
			session.setAttribute("username", user);
			
			RequestDispatcher rd = request.getRequestDispatcher("adminView.jsp");
			rd.forward(request, response);

			
		}else if(user.equals("ramesh")&&pass.equals("xyzabc")) {

			HttpSession session=request.getSession();
			session.setAttribute("username", user);
			
			RequestDispatcher rd = request.getRequestDispatcher("adminView.jsp");
			rd.forward(request, response);

			
		}else {
			
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			rd.forward(request, response);
			
		}
		
		
	
		
		
		
		
	}

}
