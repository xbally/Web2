/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.servlets;

import com.ufpr.tads.web2.beans.ClienteBean;
import com.ufpr.tads.web2.beans.ErroBean;
import com.ufpr.tads.web2.beans.LoginBean;
import com.ufpr.tads.web2.classes.Usuario;
import com.ufpr.tads.web2.dao.ClienteDAO;
import com.ufpr.tads.web2.dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "NovoClienteServlet", urlPatterns = {"/NovoClienteServlet"})
public class NovoClienteServlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
           ClienteBean client = new ClienteBean();
           ClienteDAO dao = new ClienteDAO();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String str = request.getParameter("data");
            Date data = null;
            data = format.parse(str);    
                      
            client.setCpf(request.getParameter("cpf"));
            client.setNome(request.getParameter("nome"));
            client.setEmail(request.getParameter("email"));
            client.setData(data);
            client.setRua(request.getParameter("rua"));
            client.setNumero(Integer.parseInt(request.getParameter("numero")));
            client.setCep(request.getParameter("cep"));
            client.setCidade(request.getParameter("cidade"));
            client.setUf(request.getParameter("uf"));
            dao.Inserir(client);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NovoClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(NovoClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }   RequestDispatcher rd = getServletContext().getRequestDispatcher("/ClienteServlet.jsp");
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
