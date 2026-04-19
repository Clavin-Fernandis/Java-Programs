// 7c. Build a servlet program to check the given number is
// prime number or not, using HTML with Error Code
// when an invalid number is entered.

package com.prime;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/prime")

public class PrimeServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out =
                response.getWriter();

        try {

            int n = Integer.parseInt(
                    request.getParameter(
                    "number"));

            if (n <= 0) {
                throw new Exception();
            }

            boolean prime = true;

            if (n == 1) {
                prime = false;
            }

            for (int i = 2;
                    i <= n / 2; i++) {

                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            out.println("<html><body>");

            if (prime) {

                out.println("<h2>"
                        + n
                        + " is Prime Number"
                        + "</h2>");

            } else {

                out.println("<h2>"
                        + n
                        + " is Not Prime Number"
                        + "</h2>");
            }

            out.println(
              "<a href='index.html'>Back</a>");

            out.println("</body></html>");

        } catch (Exception e) {

            response.setStatus(400);

            out.println("<html><body>");

            out.println(
              "<h2 style='color:red;'>"
              + "Error Code 400"
              + "<br>Invalid Number Entered"
              + "</h2>");

            out.println(
              "<a href='index.html'>Try Again</a>");

            out.println("</body></html>");
        }
    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect(
                "index.html");
    }
}