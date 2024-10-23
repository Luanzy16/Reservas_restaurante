/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author luanzy
 */
public class ReservaBuilder {
    private int id;
    private String nombreCliente;
    private String hora;
    private String mesa;
    private String fecha;
    private String estado;
    private String nombreEvento;

    public ReservaBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public ReservaBuilder setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        return this;
    }

    public ReservaBuilder setHora(String hora) {
        this.hora = hora;
        return this;
    }

    public ReservaBuilder setMesa(String mesa) {
        this.mesa = mesa;
        return this;
    }

    public ReservaBuilder setFecha(String fecha) {
        this.fecha = fecha;
        return this;
    }
    
    public ReservaBuilder setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public ReservaBuilder setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
        return this;
    }

    public ReservaAniversario buildAniversario() {
        return new ReservaAniversario(id, nombreCliente, hora, mesa, fecha, estado, nombreEvento);
    }

    public ReservaCumpleaños buildCumpleaños() {
        return new ReservaCumpleaños(id, nombreCliente, hora, mesa, fecha,estado, nombreEvento);
    }
}


