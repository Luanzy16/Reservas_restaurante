/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luanzy
 */
public class Empleado extends Cuenta{
    private int salario = 2000000;
    private final boolean admin = true;
    
    //Getters & Setters
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public boolean isAdmin() {
        return admin;
    }

    @Override
    public String nuevaCuenta() {
        Conexion objmod = new Conexion();
        String cad = "insert into Empleado values("+ this.getId()+",'"+this.getNombreUsuario()+"','"+this.getContraseña()+"','"+this.getEmail()+"','"+this.getSalario()+"')";
        return objmod.Ejecutar(cad);
    }  
    
    public ArrayList<Empleado> ListaEmpleado(){
        ArrayList<Empleado> empleados = new ArrayList<>();
        String query = "SELECT * FROM Empleado";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombreUsuario");
                String contrasena = rs.getString("contrasena");
                String email = rs.getString("email");

                Empleado cliente = new Empleado();
                cliente.setId(id);
                cliente.setNombreUsuario(nombre);
                cliente.setContraseña(contrasena);
                cliente.setEmail(email);
                empleados.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empleados;
    }
    
}
