/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;


import java.sql.*;

/**
 *
 * @author luanzy
 */
public class Conexion {
    private final String url = "";
    private final String user = "root";
    private final String pwd =  "";
    
    public Conexion(){}
    
    /**
     * Funcion para crear una conexion a una base de datos y sus tablas para acceder a sus datos 
     * @param Cad
     * @return tbl (es la tabla con los datos)
     */
    public ResultSet Listar(String Cad){
        try{
            Connection cn = DriverManager.getConnection(url, user, pwd); //DriverManager.getConnection es una conexión abierta que se puede utilizar para crear sentencias
            PreparedStatement da = cn.prepareStatement(Cad); //PreparedStatement son plantillas para consultas a sistemas de bases de datos en lenguaje SQL 
            ResultSet tbl = da.executeQuery(); //executeQuery() devuelve una tabla de resultados en un objeto ResultSet
            return tbl;
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
    }
    
    /**
     * Funcion que sirve para cuando se ejecute una accion en la base de datos se vea en que fila se realizo cambios o si hubo errores
     * @param Cad
     * @return mensaje de la fila afectaba o error
     */
    public String Ejecutar(String Cad){
        try{
            Connection cn = DriverManager.getConnection(url,user,pwd);
            PreparedStatement da = cn.prepareStatement(Cad);
            int r =da.executeUpdate(); // executeUpdate(): da un entero que nos da registro de las operaciones
            if(r==0){
                return "NO existe este elemento";
            }
            else{
                return "Se afectaron " + r + "filas";
            }  
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return "Error" + e.getMessage();
        }  
    }
    
    
}
