/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author luanzy
 */
public class ReservaAniversario extends Reserva {
    private String mensajeAniversario;  // Atributo adicional específico para esta reserva

    public ReservaAniversario(int id, String nombreCliente, String hora, String mesa, String fecha, String mensajeAniversario) {
        super(id, nombreCliente, hora, mesa, fecha);
        this.mensajeAniversario = mensajeAniversario;
    }

    @Override
    public ReservaAniversario clone() {
        return new ReservaAniversario(id, nombreCliente, hora, mesa, fecha, mensajeAniversario);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(", Mensaje Aniversario: " + mensajeAniversario);
    }
}