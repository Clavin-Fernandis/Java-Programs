// 8b. Build a servlet program to create a cookie to get your
// name through text box and press submit button (through HTML)
// to display Welcome back your name!, you have visited this
// page n times along with list of cookies and set values
// and demonstrate expiry of cookie also.

package cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/")

public class CookieServlet2
        extends HttpServlet {

    int count = 0;

    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
                   IOException {

        response.setContentType(
                "text/html");

        PrintWriter out =
                response.getWriter();

        String userName =
            request.getParameter(
            "userName");

        if (userName != null &&
            !userName.isEmpty()) {

            Cookie c1 =
                new Cookie(
                "user",
                userName);

            c1.setMaxAge(30);

            response.addCookie(c1);
        }

        Cookie[] cookies =
            request.getCookies();

        String user = null;

        out.println("<html><body>");

        if (cookies != null) {

            out.println(
              "<h3>List of Cookies</h3>");

            for (Cookie c : cookies) {

                out.println(
                  c.getName()
                + " = "
                + c.getValue()
                + "<br>");

                if (c.getName()
                        .equals("user")) {

                    user =
                        c.getValue();
                }
            }
        }

        if (user != null &&
            !user.equals("")) {

            count++;

            out.println(
              "<h2 style='color:blue;'>"
            + "Welcome back "
            + user
            + " !</h2>");

            out.println(
              "<h2 style='color:magenta;'>"
            + "You have visited this page "
            + count
            + " times</h2>");

            out.println(
              "<form action='CookieServlet2' "
            + "method='post'>");

            out.println(
              "<input type='submit' "
            + "value='Logout'>");

            out.println("</form>");

        } else {

            out.println(
              "<h2 style='color:red;'>"
            + "Welcome Guest! "
            + "you have been logged out "
            + "or kindly login first time"
            + "</h2>");

            out.println(
              "<form action='CookieServlet2' "
            + "method='get'>");

            out.println(
              "Enter your name: ");

            out.println(
              "<input type='text' "
            + "name='userName'>");

            out.println(
              "<input type='submit' "
            + "value='Submit'>");

            out.println("</form>");
        }

        out.println("</body></html>");
    }

    public void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
                   IOException {

        Cookie c =
            new Cookie(
            "user", "");

        c.setMaxAge(0);

        response.addCookie(c);

        response.sendRedirect(
                "CookieServlet2");
    }
}