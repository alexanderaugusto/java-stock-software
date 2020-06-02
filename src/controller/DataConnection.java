/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alexander
 */
public class DataConnection {
    private Connection con; // objeto responsável pela conexão com o servidor do banco de dados

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    private final String database = "central_modas";
    private final String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private final String user = "root";
    private final String password = "";

    public void connectToDb() {
        try {
            con = DriverManager.getConnection(url, user, password);

        } catch (SQLException ex) {

            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
