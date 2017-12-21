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
        String sql="SELECT VENTA.ID_VENTA, VENTA.FECHA_CONTRATACION, VENTA.FECHA_TERMINO_OPCIONAL, VENTA.FECHA_TERMINO_CONTRATO, TIPO_VENTA.NOMBRE_TIPO, VENTA.VALOR_VENTA, VENTA.RUT, PRODUCTO.NOMBRE_PRODUCTO, PRODUCTO.PRECIO, RELATION_2V1.CANTIDAD, RELATION_2V1.PRECIO FROM VENTA JOIN TIPO_VENTA ON VENTA.TIPO_VENTA_ID_TIPO=TIPO_VENTA.ID_TIPO JOIN RELATION_2V1 ON RELATION_2V1.VENTA_ID_VENTA=VENTA.ID_VENTA JOIN PRODUCTO ON RELATION_2V1.PRODUCTO_ID_PRODUCTO=PRODUCTO.ID_PRODUCTO";
        try {
            
            PreparedStatement preparedStatement = Conexion.conectar().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();        
           
            
            
        } catch (SQLException ex) {
            
        }        
        
        
        
        return resultSet;
    }


    
}
