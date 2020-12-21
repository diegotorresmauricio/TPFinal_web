package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HorarioServlet", urlPatterns = {"/HorarioServlet"})
public class HorarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String inicio = request.getParameter("inicio");
        String fin = request.getParameter("final");
        
        response.sendRedirect("menu");
        
        Controladora control = new Controladora ();
        control.crearHorario(inicio,fin);
        control.eliminarHorario(inicio,fin);
        control.editarHorario(inicio,fin);
        control.buscarHorario(inicio,fin);
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
