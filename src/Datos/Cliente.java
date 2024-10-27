/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import conexion.Conexion;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luanzy
 */
public class Cliente extends Cuenta{
    


    @Override
    public String nuevaCuenta() {
        Conexion objmod = new Conexion();
        String cad = "insert into cliente values('"+ this.getId()+"','"+this.getNombreUsuario()+"','"+this.getContraseña()+"','"+this.getEmail()+"')";
        return objmod.Ejecutar(cad);
    }
    
    
    /**
     * Funcion que crea una lista con todas los objetos clientes que esten en la tabla 'cliente'
     * @return lista de clientes
     */
     public ArrayList<Cliente> ListaCliente(){
        ArrayList<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM cliente";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombreUsuario");
                String contrasena = rs.getString("contrasena");
                String email = rs.getString("email");

                Cliente cliente = new Cliente();
                cliente.setId(id);
                cliente.setNombreUsuario(nombre);
                cliente.setContraseña(contrasena);
                cliente.setEmail(email);
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }

}
