/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luanzy
 */
public class ReservaCumpleaños extends Reserva {

    private String nombreEvento;

    public ReservaCumpleaños(int id, String nombreCliente, String hora, String mesa, String fecha, String estado, String nombreEvento) {
        super(id, nombreCliente, hora, mesa, fecha, estado);
        this.nombreEvento = nombreEvento;
    }

    @Override
    public String crearReserva() {
        Conexion objmod = new Conexion();
        String cad = "insert into Reserva values(" + this.getId() + ",'" + this.getNombreCliente() + "','" + this.getHora() + "','" + this.getMesa()+ "','" + this.getFecha()  + "','" + this.getEstado() + "','" + this.getNombreEvento() + "')";
        return objmod.Ejecutar(cad);
    }

    @Override
    public String editarReserva() {
        Conexion objmod = new Conexion();
        String cad = "Update Reserva set nombreCliente='" + this.getNombreCliente() + "',hora=' " + this.getHora() + "',mesa=' " + this.getMesa() + "',fecha=' " + "' where id='" + this.getId() + "'";
        return objmod.Ejecutar(cad);
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    @Override
    public ArrayList<ReservaAniversario> listaReserva() {
        ArrayList lista1 = new ArrayList();
        try {
            Conexion objmod = new Conexion();
            ResultSet tabla = objmod.Listar("select * from Reserva");
            ReservaAniversario reserva;

            while (tabla.next()) {
                reserva = new ReservaAniversario(
                        tabla.getInt("id"),
                        tabla.getString("nombreCliente"),
                        tabla.getString("hora"),
                        tabla.getString("mesa"),
                        tabla.getString("fecha"),
                        tabla.getString("estado"),
                        tabla.getString("tipoReverva")
                );

                lista1.add(reserva);
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista1;
    }

}
