/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.servlets;

import com.ufpr.tads.web2.classes.Cliente;
import com.ufpr.tads.web2.dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gabri
 */
@WebServlet(name = "FormAlterarClienteServlet", urlPatterns = {"/FormAlterarClienteServlet"})
public class FormAlterarClienteServlet extends HttpServlet {

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
            ClienteDAO daoC = new ClienteDAO();            
            Cliente client = new Cliente();
      
            
            int id = Integer.parseInt(request.getParameter("id"));
            client.setId(id);
            
            
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String str = request.getParameter("data_cliente");
            Date data = null;
            data = format.parse(str); 


            client.setCpf(request.getParameter("cpf_cliente"));
            client.setNome(request.getParameter("nome_cliente"));
            client.setEmail(request.getParameter("email_cliente"));
            client.setData(request.getParameter(data));
            client.setRua(request.getParameter("rua_cliente"));
            client.setNumero(Integer.parseInt(request.getParameter("nr_cliente")));
            client.setCep(request.getParameter("cep_cliente"));
            client.setCidade(request.getParameter("cidade_cliente"));
            client.setUf(request.getParameter("uf_cliente"));
            daoC.Alterar(client);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/clientesListar.jsp");
        rd.forward(request, response);
        return;  
            
        } catch (SQLException ex) {
            Logger.getLogger(FormAlterarClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormAlterarClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(FormAlterarClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
