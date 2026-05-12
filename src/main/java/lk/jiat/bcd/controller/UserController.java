package lk.jiat.bcd.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.bcd.dao.UserDAO;
import lk.jiat.bcd.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/submit")
public class UserController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");

        User user = new User();
        user.setName(name);
        user.setMobile(mobile);

       try{

           UserDAO userDAO = new UserDAO();
           boolean isSaved = userDAO.saveUser(user);

           resp.setContentType("text/plain");
           PrintWriter out = resp.getWriter();

           if (isSaved) {
               out.print("Success: User saved to Database!");
           } else {
               out.print("Error: Could not save user.");
           }

       }catch(Exception e){
           e.printStackTrace();
           resp.getWriter().print("Error: " + e.getMessage());
       }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{

            UserDAO userDAO = new UserDAO();
            List<User> userList = userDAO.getAllUsers();

            req.setAttribute("users", userList);

            req.getRequestDispatcher("user-list.jsp").forward(req, resp);

        }catch(Exception e){
            e.printStackTrace();
            resp.getWriter().print("Error: " + e.getMessage());
        }

    }
}
