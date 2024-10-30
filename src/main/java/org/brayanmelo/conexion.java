package org.brayanmelo;
import java.sql.*;
public class conexion {

    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectomusica", "root", "Peppa2108");
            if(conection != null){
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conection;
    }

}
