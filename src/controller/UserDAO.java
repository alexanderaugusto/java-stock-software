/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.User;

/**
 *
 * @author Alexander
 */
public class UserDAO{

    private PreparedStatement pst; // objeto responsável por preparar as consultas DINAMICAS
    private Statement st; // objeto responsável por executar as consultas STATICAS
    private ResultSet rs; // objeto responsável por referencia a tabela resultante da busca
    private Connection con;

    private boolean success;
    private User userTemp;

    private boolean userDAO(String method, User user) {
        
        DataConnection connection = new DataConnection();
        connection.connectToDb();
        con = connection.getCon();

        try {
            pst.execute();
            success = true;

        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            success = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }

        return success;
    }
}
