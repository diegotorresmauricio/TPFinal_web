package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Index", urlPatterns = {"/Index"})
public class Index extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
            
            String nombre = request.getParameter("Usuario");
            String contra = request.getParameter("palabraSecreta");
            
            request.getSession().setAttribute("Usuario", nombre);
            request.getSession().setAttribute("palabraSecreta", contra);
            
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
