

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ncrservlet
 */
@WebServlet("/ncrservlet")
public class ncrservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ncrservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(request.getParameter("n"));
		int r=Integer.parseInt(request.getParameter("r"));
		int x=factorial(n);
		int y=factorial(r);
		int z=factorial(n-r);
		/*PrintWriter pw=response.getWriter();
		pw.println("NCR= "+(x/(y*z)));
		pw.close();*/
		RequestDispatcher d=request.getRequestDispatcher("ncr_form.jsp");
		request.setAttribute("NCR_Ans", (x/(y*z)));
		d.include(request, response);

		}
	public int factorial(int n) {
		if (n==1 || n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
}
