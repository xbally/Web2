package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gabri
 */
public class UsuarioDAO {

    private Connection con;

    public UsuarioDAO() throws SQLException, ClassNotFoundException {
        this.con = ConnectionFactory.getConnection();
    }

    public Usuario selectUsuarioEsp(String login, String senha) throws SQLException {

        String sql = "SELECT * FROM tb_usuario WHERE login_usuario = (?) AND senha_usuario = (?) LIMIT 1;";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, login);
        st.setString(2, senha);

        ResultSet rs = st.executeQuery();
        Usuario usuario = new Usuario();

        while (rs.next()) {
            usuario.setIdusuario(rs.getInt(1));
            usuario.setLoginusuario(rs.getString(2));
            usuario.setSenhausuario(rs.getString(3));
            usuario.setNomeusuario(rs.getString(4));
            return usuario;
        }
        return null;
    }
    
    public List<Usuario> selectUsuario() throws SQLException {
        
        List<Usuario> resultados = new ArrayList<>();
        
        String sql = "SELECT * FROM tb_usuario";
        PreparedStatement st = con.prepareStatement(sql);
        
        ResultSet rs = st.executeQuery();
        
        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setIdusuario(rs.getInt("id_usuario"));
            usuario.setLoginusuario(rs.getString("login_usuario"));
            usuario.setSenhausuario(rs.getString("senha_usuario"));
            usuario.setNomeusuario(rs.getString("nome_usuario"));
            resultados.add(usuario);
        }
        return resultados;
    }
    
    public void insertUsuario(Usuario usuario) throws SQLException {
        
        String sql = "INSERT INTO tb_usuario (nome_usuario, login_usuario, senha_usuario) VALUES ((?), (?), (?))";
        PreparedStatement st = con.prepareStatement(sql);
        
        st.setString(1, usuario.getNomeusuario());
        st.setString(2, usuario.getLoginusuario());
        st.setString(3, usuario.getSenhausuario());
        st.executeUpdate();
    }

}
