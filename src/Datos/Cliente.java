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
public class Cliente extends Cuenta{
    


    @Override
    public String nuevaCuenta() {
        Conexion objmod = new Conexion();
        String cad = "insert into cliente values('"+ this.getId()+"','"+this.getNombreUsuario()+"','"+this.getContraseña()+"','"+this.getEmail()+"')";
        return objmod.Ejecutar(cad);
    }

    @Override
    public String buscarCuenta() {
        Conexion objmod = new Conexion();
        String cad = "SELECT * FROM cliente WHERE id ="+this.getId();
        return objmod.Ejecutar(cad);
    }
}
