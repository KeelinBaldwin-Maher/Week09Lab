package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class UserServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // test populate table
        int[] users = {1, 2, 3, 4};
       
        
        // set the attribute
        request.setAttribute("users", users);
        
        // Send to users.jsp
        getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       // Send to users.jsp
        getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
        
    }



}
