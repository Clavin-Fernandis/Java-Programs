// 8a. Build a servlet program to create a cookie to get your
// name through text box and press submit button to display
// Welcome back your name!, you have visited this page n times
// and demonstrate expiry of cookie also.

package cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/")

public class CookieServlet
        extends HttpServlet {

    private static final long
        serialVersionUID = 1L;

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

            Cookie userCookie =
                new Cookie(
                "user",
                userName);

            userCookie.setMaxAge(
                    30);

            response.addCookie(
                    userCookie);
        }

        Cookie[] cookies =
            request.getCookies();

        String existingUser =
                null;

        if (cookies != null) {

            for (Cookie cookie
                    : cookies) {

                if (cookie.getName()
                        .equals("user")) {

                    existingUser =
                        cookie.getValue();

                    break;
                }
            }
        }

        out.println("<html>");
        out.println("<body>");

        if (existingUser != null &&
            !existingUser.equals("")) {

            count++;

            out.println(
              "<font color=blue>"
            + "<h2>Welcome back, "
            + existingUser
            + " !</h2></font>");

            out.println(
              "<font color=magenta>"
            + "<h2>You have visited this page "
            + count
            + " times!</h2></font>");

            out.println(
              "<a href='CookieServlet'>Refresh</a>");

        } else {

        	 out.println(
        		      "<h2 style='color:red;'>"
        		    + "Welcome Guest! you have been logged out "
        		    + "or kindly login first time"
        		    + "</h2>");

            out.println(
              "<form action='CookieServlet' method='get'>");

            out.println(
              "Enter your name: ");

            out.println(
              "<input type='text' "
            + "name='userName'>");

            out.println(
              "<input type='submit' "
            + "value='Submit'>");

            out.println(
              "</form>");
        }

        out.println("</body>");
        out.println("</html>");
    }

    public void doPost(
            HttpServletRequest request,
            HttpServletResponse response)

            throws ServletException,
                   IOException {

        Cookie cookie =
            new Cookie(
            "user", "");

        cookie.setMaxAge(0);

        response.addCookie(
                cookie);

        response.sendRedirect(
                "CookieServlet");
    }
}