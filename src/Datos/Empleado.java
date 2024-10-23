/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import conexion.Conexion;

/**
 *
 * @author luanzy
 */
public class Empleado extends Cuenta{
    private int salario = 2000000;
    private boolean admin = true;
    
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

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String nuevaCuenta() {
        Conexion objmod = new Conexion();
        String cad = "insert into Empleado values('"+ this.getId()+"','"+this.getNombreUsuario()+"','"+this.getContraseña()+"','"+this.getEmail()+"','"+this.getSalario()+"','"+this.isAdmin()+"')";
        return objmod.Ejecutar(cad);
    }

    @Override
    public String buscarCuenta() {
       Conexion objmod = new Conexion();
       String cad = "SELECT * FROM Empleado WHERE id ="+this.getId();
        return objmod.Ejecutar(cad);
    }
    
    
}
