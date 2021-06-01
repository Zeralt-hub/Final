/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class ConexionSQL {

    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/colegio", "root", "");
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());

        }
        return conectar;
    }

}
