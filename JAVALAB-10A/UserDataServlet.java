// 10.a Build an Application to get Username, Email and
// Designation through JSP called index.jsp with client side
// validation and submit to servlet UserDataServlet.
// Process all fields with server side validation and display
// data through result.jsp with link to move to client side.

package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;

@WebServlet("/")

public class UserDataServlet
        extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
                   IOException {

        String username =
            request.getParameter(
            "username");

        String email =
            request.getParameter(
            "email");

        String designation =
            request.getParameter(
            "designation");

        String message;

        if (username == null ||
            username.trim().isEmpty()) {

            message =
            "Username is required";

        } else if (email == null ||
            !email.contains("@")) {

            message =
            "Invalid Email";

        } else if (designation == null ||
            designation.trim().isEmpty()) {

            message =
            "Designation is required";

        } else {

            message =
            "User data processed successfully";

            request.setAttribute(
                "username",
                username);

            request.setAttribute(
                "email",
                email);

            request.setAttribute(
                "designation",
                designation);
        }

        request.setAttribute(
            "message",
            message);

        RequestDispatcher rd =
            request.getRequestDispatcher(
            "/result.jsp");

        rd.forward(
            request,
            response);
    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
                   IOException {

        response.sendRedirect(
            "index.jsp");
    }
}