package product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bazar.util.DbUtil;
import product.dto.Login;

public class LoginDaoImpl implements LoginDao{
java.sql.PreparedStatement ps=null;
	@Override
	public List<Login> getUserPass() {
		
		String sql = "select * from login_table";

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
	}
}
