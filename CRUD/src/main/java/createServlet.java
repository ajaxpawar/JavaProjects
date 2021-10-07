import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class createServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String country=req.getParameter("country");
		
		Emp e=new Emp();
		e.setName(name);
		e.setPassword(password);
		e.setEmail(email);
		e.setCountry(country);
		
		int status=EmpDao.create(e);
		if(status>0) {
			out.print("<b>Record Saved..!</b>");
		}
		else {
			out.print("<b>Not Saved ..!</b>");
		}
	} 
}
