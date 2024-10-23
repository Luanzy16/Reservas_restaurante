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
    
    public Cuenta getCuenta(String tipoCuenta){
        if(Objects.equals(tipoCuenta, "Empleado")){
            return new Empleado();
        }
        
        if(Objects.equals(tipoCuenta, "Cliente")){
            return new Cliente();
        }
        
        return null;
    }
}
