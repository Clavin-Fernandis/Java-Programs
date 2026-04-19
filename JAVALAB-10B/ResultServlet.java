// 10.b Build an Application to get Rollno, Studentname,
// Sub1, Sub2, Sub3, Sub4 and Sub5 through JSP called
// index.jsp with client side validation and submit to
// servlet ResultServlet and process all fields with
// server side validation and display all data along
// with result (Pass if all subjects greater than 40)
// and Average marks through result.jsp.

package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;

@WebServlet("/")

public class ResultServlet
        extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
                   IOException {

        try {

            String rollno =
                request.getParameter(
                "rollno");

            String name =
                request.getParameter(
                "studentname");

            int s1 = Integer.parseInt(
                request.getParameter("sub1"));

            int s2 = Integer.parseInt(
                request.getParameter("sub2"));

            int s3 = Integer.parseInt(
                request.getParameter("sub3"));

            int s4 = Integer.parseInt(
                request.getParameter("sub4"));

            int s5 = Integer.parseInt(
                request.getParameter("sub5"));

            String result = "Pass";

            if (s1 < 40 || s2 < 40 ||
                s3 < 40 || s4 < 40 ||
                s5 < 40) {

                result = "Fail";
            }

            double avg =
                (s1+s2+s3+s4+s5)/5.0;

            request.setAttribute(
                "rollno", rollno);

            request.setAttribute(
                "studentname", name);

            request.setAttribute(
                "sub1", s1);

            request.setAttribute(
                "sub2", s2);

            request.setAttribute(
                "sub3", s3);

            request.setAttribute(
                "sub4", s4);

            request.setAttribute(
                "sub5", s5);

            request.setAttribute(
                "result", result);

            request.setAttribute(
                "average", avg);

            RequestDispatcher rd =
                request.getRequestDispatcher(
                "/result.jsp");

            rd.forward(
                request, response);

        } catch (Exception e) {

            response.sendRedirect(
                "index.jsp");
        }
    }
}