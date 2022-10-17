/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.mavendb;

import br.edu.ifsp.mavendb.TO.TOCity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOUser {
    
    private static final String HOST = "jdbc:mysql://localhost/";
    private static final String DB = "world";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private Connection conn;
    
    public boolean connect() {
        boolean status = false;
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(HOST+DB,USER,PASSWORD);
            status = true;
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return status;
    }
    
    public boolean disconnect() {
        boolean status = false;
        
        try {
       
            conn.close(); 
            status = true;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return status;
        
    }
    
    public void select() {
        final String sqlQuery = 
                "SELECT ID, NAME, POPULATION FROM City "
                + " WHERE CountryCode = ? "
                + " ORDER BY POPULATION desc";
         
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //conn = DriverManager.getConnection(HOST+DB,USER,PASSWORD);
            
            //conn.setAutoCommit(false);
             
            PreparedStatement preparedSelect = conn.prepareStatement(sqlQuery);
            preparedSelect.setString(1, "BRA");

            
            ResultSet rs = preparedSelect.executeQuery();
            
            int i;
            while (rs.next()) {
                i = 0;
                int id = rs.getInt(++i);
                String name = rs.getString(++i);
                int population = rs.getInt(++i);
                System.out.printf("%d\t%s\t%d\n",id,name,population);
            }
             
            //conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }        
 
    }
    
    public TOCity topOnePop(String countryCode) {
        
        TOCity city = new TOCity();
        
        final String sqlQuery
                = "SELECT ID, NAME, POPULATION FROM City "
                + " WHERE CountryCode = ? "
                + " ORDER BY POPULATION desc";

        try {
            
            PreparedStatement preparedSelect = conn.prepareStatement(sqlQuery);
            preparedSelect.setString(1, countryCode);

            ResultSet rs = preparedSelect.executeQuery();

            int i;

            

            while (rs.next()) {
                i = 0;

                int id = rs.getInt(++i);
                city.setId(id);

                String name = rs.getString(++i);
                city.setNome(name);

                int population = rs.getInt(++i);
                city.setPopulation(population);

              
                break;
            }

            //conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return city;
    }
    
    public void updateChar(String cityName) {
        final String sqlQuery = 
                "UPDATE City set name = concat( name, '!') where name = ?  ";
        
        
         
        try {
            
            PreparedStatement preparedSelect = conn.prepareStatement(sqlQuery);
            preparedSelect.setString(1, cityName);

            
            int i = preparedSelect.executeUpdate();
            
            System.out.println("atualizado:" + i);
             
           

        } catch (SQLException e) {
            e.printStackTrace();
        }        
 
    }
    
    
}
