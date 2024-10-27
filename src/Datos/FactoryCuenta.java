/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.Objects;

/**
 *
 * @author luanzy
 */
public class FactoryCuenta {
    
    /**
     * Crea un objeto Empleado o cliente 
     * @param tipoCuenta
     * @return Empleado o Cliente
     */
    public Cuenta getCuenta(String tipoCuenta){
        if(Objects.equals(tipoCuenta, "empleado")){
            return new Empleado();
        }
        
        if(Objects.equals(tipoCuenta, "cliente")){
            return new Cliente();
        }
        
        return null;
    }
}
