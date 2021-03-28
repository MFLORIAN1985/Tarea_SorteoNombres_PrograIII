/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaal_azar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MOORIS FLORIAN
 */
public class ClsConexion {

    //Connection tiene el id  con la conexion que se realiza a la base de datos
    public Connection conexion;
    private final String servidor_conexion = "jdbc:mysql://localhost/bd_lista";
    static private final String usuario = "root";

    //cuando hay clave
    static private final String clave = "";

    private void AbrirConexion() {
        try {
            conexion = (Connection) DriverManager.getConnection(servidor_conexion, usuario, clave);
        } catch (SQLException ex) {

        }
    }

    private void CerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {

        }
    }

    public List<lista> nombres() {
        AbrirConexion();
        lista persona = new lista();
        List<lista> todos = new ArrayList();

        try {
            String sql = "SELECT * FROM lista";
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                persona.setNombre(rs.getString("nombres"));
                todos.add(persona);
                persona = new lista();
            }//end while
            CerrarConexion();

        } catch (SQLException e) {
            System.out.println(e);
        }// ent try cath
        return todos;
    }

}
