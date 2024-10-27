/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import conexion.Conexion;
import java.util.ArrayList;

/**
 *
 * @author luanzy
 */
public abstract class Reserva {
    protected int id;
    protected String nombreCliente;
    protected String hora;
    protected String mesa;
    protected String fecha;
    protected String estado;

    public Reserva(int id, String nombreCliente, String hora, String mesa, String fecha, String estado) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.hora = hora;
        this.mesa = mesa;
        this.fecha = fecha;
        this.estado = estado;
    }
    
    /**
     * Funcion que crea un reserva por medio de una sentencia sql en la base de datos
     * @return String con la sentecia
     */
    public abstract String crearReserva();
    
    /**
     * Funcion que crea una lista con todas los objetos Reserva que esten en la tabla 'Reserva'
     * @return lista de Reserva
     */
    public abstract ArrayList<ReservaAniversario> listaReserva();
    
    
    /**
     * Funcion que Editar un reserva por medio de una sentencia sql en la base de datos
     * @return string con la sentencia
     */
    public abstract String editarReserva();
    
    
    /**
     * Funcion que Editar un reserva por medio de una sentencia sql en la base de datos
     * @return string con la sentencia
     */
    public String eliminarReserva(){
        Conexion objmod = new Conexion();
        String cad = "delete from Reserva where id='"+ this.getId()+"'";
        return objmod.Ejecutar(cad);
    }
    
    
  
    
    
    //Getters
    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getHora() {
        return hora;
    }

    public String getMesa() {
        return mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}