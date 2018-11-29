import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculationServlet", urlPatterns = "/calculator")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String des = request.getParameter("description");
        float pri  = Float.parseFloat(request.getParameter("price"));
        float dis = Float.parseFloat(request.getParameter("discount_percent"));
        float discountAmount = pri * dis * 0.01f;
        float discountPrice = pri - discountAmount;

        writer.println("<html>\n" +
                "  <head>\n" +
                "    <title>Calculator</title>\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\" />\n" +
                "  </head>\n" +
                "  <body>\n" +
                "  <div class=\"content\">\n" +
                "    <h1>Calculator</h1>\n" +
                "      <label>Product Description:</label><br/>\n" +
                "      <label>" + des + "</label><br/>\n" +
                "      <label>List Price:</label><br/>\n" +
                "      <label>" + pri + "</label><br/>\n" +
                "      <label>Discount Percent:</label><br/>\n" +
                "      <label>" + dis + "</label><br/>\n" +
                "      <label>Discount Amount:</label><br/>\n" +
                "      <label>" + discountAmount + "</label><br/>\n" +
                "      <label>Discount Price:</label><br/>\n" +
                "      <label>" + discountPrice + "</label><br/>\n" +
                "  </div>\n" +
                "  </body>\n" +
                "</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
