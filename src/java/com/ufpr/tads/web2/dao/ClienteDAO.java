/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.classes.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class ClienteDAO {
    private Connection conn;
    
    public ClienteDAO() throws SQLException, ClassNotFoundException
    {
            this.conn = (Connection) new com.ufpr.tads.web2.dao.ConnectionFactory().getConnection();
    }
    
    public List<Cliente> BuscaCliente() throws SQLException {
    ResultSet rs = null;    
    List<Cliente> clientes = new ArrayList<>();
    Statement stmt = conn.createStatement();
    String query= "Select * from tb_cliente";
       rs = stmt.executeQuery(query);
        while (rs.next()){
        Cliente clients= new Cliente();
        clients.setId(rs.getInt("id_cliente"));
        clients.setCpf(rs.getString("cpf_cliente"));
        clients.setNome(rs.getString("nome_cliente"));
        clients.setEmail(rs.getString("email_cliente"));
        clientes.add(clients);
        }
        return clientes;
    }
    
    public List<Cliente> BuscaId(int id) throws SQLException{
        ResultSet rs = null;
        List<Cliente> clientes = new ArrayList<>();
            Statement stmt = conn.createStatement();
        String query= "Select * from tb_cliente WHERE id_cliente = (?)";
       
        rs = stmt.executeQuery(query);
             
        while (rs.next()){
        Cliente clients= new Cliente();
        clients.setId(rs.getInt("id_cliente"));
        clientes.add(clients);
        }
        return clientes;
    }
    
    public List<Cliente> Visualizar(int id) throws SQLException{
      ResultSet rs = null;    
    List<Cliente> clientes = new ArrayList<>();
        Statement stmt = conn.createStatement();
        String query= "Select * from tb_cliente";
         rs = stmt.executeQuery(query);
        while (rs.next()){
        Cliente clients= new Cliente();
        clients.setId(rs.getInt("id_cliente"));
        clients.setCpf(rs.getString("cpf_cliente"));
        clients.setNome(rs.getString("nome_cliente"));
        clients.setEmail(rs.getString("email_cliente"));
        clients.setData(rs.getDate("data_cliente"));
        clients.setRua(rs.getString("rua_cliente"));
        clients.setNumero(rs.getInt("nr_cliente"));
        clients.setCep(rs.getString("cep_cliente"));
        clients.setCidade(rs.getString("cidade_cliente"));
        clients.setUf(rs.getString("uf_cliente"));
        clientes.add(clients);
        }
        return clientes;
    }
    
    public void Inserir(Cliente inserir){
    String Query = "INSERT INTO tb_cliente VALUES ((?),(?),(?),(?),(?),(?),(?),(?),(?))";
    PreparedStatement stmt = null;
    try{
        stmt = conn.prepareStatement(Query);
        stmt.setString(1, inserir.getCpf());
        stmt.setString(2, inserir.getNome());
        stmt.setString(3, inserir.getEmail());
        stmt.setDate(4, (Date) inserir.getData());
        stmt.setString(5, inserir.getRua());
        stmt.setInt(6, inserir.getNumero());
        stmt.setString(7, inserir.getCep());
        stmt.setString(8, inserir.getCidade());
        stmt.setString(9, inserir.getUf());
        stmt.executeUpdate();
    }   catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Deletar(int id){
        String Query="DELETE FROM tb_cliente WHERE id_cliente = ?";
        PreparedStatement stmt = null;
        try{
        stmt = conn.prepareStatement(Query);
        stmt.setInt(1,id);
        stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Alterar(Cliente clientes){
        String  Query = "UPDATE tb_cliente SET  cpf_cliente = ?, nome_cliente = ?, email_cliente = ?, data_cliente = ?, rua_cliente = ?, nr_cliente = ?, cep_clientes = ?, cidade_cliente = ?, uf_cliente = ?";
        PreparedStatement stmt = null;
        try{
        stmt = conn.prepareStatement(Query);
        stmt.setString(1, clientes.getCpf());
        stmt.setString(2, clientes.getNome());
        stmt.setString(3, clientes.getEmail());
        stmt.setDate(4, (Date) clientes.getData());
        stmt.setString(5, clientes.getRua());
        stmt.setInt(6, clientes.getNumero());
        stmt.setString(7, clientes.getCep());
        stmt.setString(8, clientes.getCidade());
        stmt.setString(9, clientes.getUf());
        stmt.executeUpdate();
    
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

   }
