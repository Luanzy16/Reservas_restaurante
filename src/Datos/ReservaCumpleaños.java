/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author luanzy
 */
public class ReservaCumpleaños extends Reserva {
    private String mensajeCumpleaños;  // Atributo adicional específico para esta reserva

    public ReservaCumpleaños(int id, String nombreCliente, String hora, String mesa, String fecha, String mensajeCumpleaños) {
        super(id, nombreCliente, hora, mesa, fecha);
        this.mensajeCumpleaños = mensajeCumpleaños;
    }

    @Override
    public ReservaCumpleaños clone() {
        return new ReservaCumpleaños(id, nombreCliente, hora, mesa, fecha, mensajeCumpleaños);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(", Mensaje Cumpleaños: " + mensajeCumpleaños);
    }
}
