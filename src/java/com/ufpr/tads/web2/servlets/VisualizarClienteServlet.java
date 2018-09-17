/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.servlets;

import com.ufpr.tads.web2.beans.ErroBean;
import com.ufpr.tads.web2.beans.LoginBean;
import com.ufpr.tads.web2.classes.Cliente;
import com.ufpr.tads.web2.classes.Usuario;
import com.ufpr.tads.web2.dao.ClienteDAO;
import com.ufpr.tads.web2.dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gabri
 */
@WebServlet(name = "VisualizarClienteServlet", urlPatterns = {"/VisualizarClienteServlet"})
public class VisualizarClienteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
           
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usuario = new Usuario();
            ClienteDAO daoC = new ClienteDAO();
            Cliente client = new Cliente();
            HttpSession session = request.getSession();
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            
            
            int id = Integer.parseInt(request.getParameter("id"));
            List<Cliente> clientes = daoC.Visualizar(id);
            request.setAttribute("visualizarcliente", clientes);
           } catch (SQLException ex) {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/erro.jsp");
                rd.forward(request, response);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(VisualizarClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/clientesVisualizar.jsp");
            rd.forward(request, response);
               
                      
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}