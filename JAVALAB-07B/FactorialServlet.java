package com.factorial;
//7b. Build a servlet program to find the factorial of a number
//using HTML with step by step procedure.


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
    
@WebServlet("/factorial")

public class FactorialServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        try {

            int n = Integer.parseInt(
                    request.getParameter("number"));

            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            out.println("<html><body>");
            out.println("<h2>Factorial of "
                    + n + " = " + fact + "</h2>");
            out.println("<a href='index.html'>Back</a>");
            out.println("</body></html>");

        } catch (Exception e) {

            out.println("<html><body>");
            out.println("<h2>Invalid Input</h2>");
            out.println("</body></html>");
        }
    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect("index.html");
    }
}