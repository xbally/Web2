/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.servlets;

import com.ufpr.tads.web2.classes.Usuario;
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
 * @author Gabriel
 */
@WebServlet(name = "PortalServlet", urlPatterns = {"/PortalServlet"})
public class PortalServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {

            Usuario usuario = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();

            int id;
            String nome, login, senha;
            List<Usuario> lista = dao.selectUsuario();

            HttpSession session = request.getSession();

            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"pt-br\">");
            out.println("<head>");

            out.println("<title>Servlet PortalServlet</title>");
            out.println("</head>");
            out.println("<body>");

            if (session.getAttribute("nome") != null) {

                out.println("<form action=\"CadastrarUsuarioServlet\" method=\"POST\">");
                out.println("Nome <input type=\"text\" name=\"nome\" value=\"\"><br>");
                out.println("Login <input type=\"text\" name=\"login\" value=\"\"><br>");
                out.println("Senha <input type=\"password\" name=\"senha\" value=\"\"><br>");
                out.println("<input type=\"submit\" value=\"Cadastrar usuário\">");
                out.println("</form><br><br>");

                out.println("<table style = \"border: 1px solid black; border-collapse: collapse;\">");
                out.println("<tr><th style = \"border: 1px solid black;\">ID</th>"
                        + "<th style = \"border: 1px solid black;\">Nome</th>"
                        + "<th style = \"border: 1px solid black;\">Login</th>"
                        + "<th style = \"border: 1px solid black;\">Senha</th>");
                for (Usuario x : lista) {
                    id = x.getIdusuario();
                    nome = x.getNomeusuario();
                    login = x.getLoginusuario();
                    senha = x.getSenhausuario();
                    out.println("<tr><td style = \"color: blue; border: 1px solid black;\">" + id + "</td>"
                            + "<td style = \"color: blue; border: 1px solid black;\">" + nome + "</td>"
                            + "<td style = \"color: blue; border: 1px solid black;\">" + login + "</td>"
                            + "<td style = \"color: blue; border: 1px solid black;\">" + senha + "</td></tr>");
                }
                out.println("</table><br><br>");
            } else {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/ErroBean");
                request.setAttribute("msg", "Usuário não está logado");
                request.setAttribute("page", "Voltar para a página de login");
                rd.forward(request, response);
            }
            out.println("<a href=\"LogoutServlet\">Log out</a>");

            out.println("</body>");
            out.println("</html>");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PortalServlet.class.getName()).log(Level.SEVERE, null, ex);
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
