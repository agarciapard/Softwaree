import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S1 extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

PrintWriter out=response.getWriter();
String dim=request.getParameter("dim");
String salida= C1.salidaHTML(dim);
out.println(salida);
}

}
