/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gabriel
 */
public class Conexion {
    public static Connection conect;


    private Conexion() {
    }
    public static Connection conectar(){
        if (conect==null){
             String url= "jdbc:oracle:thin:@localhost:1521:xe";
             String user="system";
             String pass="gabriel";
             System.out.println("Proceso de Conexión...");
             
             try {
                 conect= DriverManager.getConnection(url, user, pass);
                 System.out.println("Base de datos Conectada!!");
                 
             }catch (SQLException e) {
                 System.out.println(e.getMessage());
                 e.printStackTrace();    
             }  
        }
        return conect;
    }    
}
