/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import db.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class ListarModelo {

    public ArrayList listar(){
        ResultSet resultSet = null;
        String sql="SELECT ";
        try {
            
            PreparedStatement preparedStatement = Conexion.conectar().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();        
           
            
            
        } catch (SQLException ex) {
            
        }        
        
        
        
        return resultSet;
    }


    
}
