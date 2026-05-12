package lk.jiat.bcd.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/profile")
public class ProfileController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        if (session.getAttribute("email") != null) {

            resp.getWriter().write("<h1>Welcome to your profile, " + session.getAttribute("name") + "!</h1>");
            resp.getWriter().write("<h1>Your Email - , " + session.getAttribute("email") + "!</h1>");
            resp.getWriter().write("<h1>Your Mobile Number, " + session.getAttribute("mobile") + "!</h1>");


        }else{
            resp.sendRedirect("signin");
        }

    }
}
