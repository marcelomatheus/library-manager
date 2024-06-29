/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author marce
 */
public class DBSingleton {
   
    private Connection connection;
    private static DBSingleton instance = null;
    
    private DBSingleton() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
    }
    
    public static DBSingleton getInstance() throws SQLException {
        if (instance == null)
            instance = new DBSingleton();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
    
    public void close() throws SQLException {
        connection.close();
    }
}
