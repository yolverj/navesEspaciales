package javaapplication1.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar() throws Exception{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\yolve\\OneDrive\\Documentos\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\Conexion\\BaseNaves.db");
        return con;
    }
}

