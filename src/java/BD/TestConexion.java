/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Seba
 */
public class TestConexion {
    public static void main(String[]args){
        try {
            Connection con = Conexion.getConnection();
            System.out.println("LOGUED?"+con.isValid(10));
            if (con != null) {
                System.out.println("Conectado");
            } else {
                System.out.println("Error de conexion");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de clase");
        } catch (SQLException ex) {
            Logger.getLogger(TestConexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de conexion");
        }
    }
}
