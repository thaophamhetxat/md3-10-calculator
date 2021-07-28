import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "Servlet", value = "/index")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        float txtFOperand = Float.parseFloat(request.getParameter("txtFOperand"));
        float txtSOperand = Float.parseFloat(request.getParameter("txtSOperand"));
        char operator  = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result: </h1>");
        try {
           float Result = Calculator.calculator(txtFOperand,txtSOperand,operator);
            writer.println("<h1>First operand :" + txtFOperand +"</h1>");
            writer.println("<h1>Operator :" + operator+"</h1>");
            writer.println("<h1>Second operand: " + txtSOperand+"</h1>");

            writer.println("<h1> Result = " + Result+"</h1>");
        }catch (Exception e){
            writer.println("Error: " +e.getMessage());
        }
        writer.println("</html>");

    }
}
