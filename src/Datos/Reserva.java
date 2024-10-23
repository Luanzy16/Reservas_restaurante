/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author luanzy
 */
public abstract class Reserva implements Cloneable {
    protected int id;
    protected String nombreCliente;
    protected String hora;
    protected String mesa;
    protected String fecha;

    public Reserva(int id, String nombreCliente, String hora, String mesa, String fecha) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.hora = hora;
        this.mesa = mesa;
        this.fecha = fecha;
    }

    // Método clonar para implementar el patrón Prototype
    @Override
    public abstract Reserva clone();

    // Método para mostrar los detalles de la reserva
    public void mostrar() {
        System.out.println("ID: " + id + ", Cliente: " + nombreCliente + ", Hora: " + hora +
                           ", Mesa: " + mesa + ", Fecha: " + fecha);
    }
}