import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S2 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String filas = request.getParameter("f");
        String columnas = request.getParameter("c");
        System.out.println("filas: " + filas);
        System.out.println("columnas: " + columnas);
        String salida2 = C2.salidaHTML(filas, columnas);
        out.println(salida2);
    }
}