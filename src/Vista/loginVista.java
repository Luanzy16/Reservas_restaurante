/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Datos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luanzy
 */
public class loginVista extends javax.swing.JFrame {
    
    /**
     * Creates new form loginVista
     */
    public loginVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IngresarBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuarioJT = new javax.swing.JTextPane();
        registrarBT = new javax.swing.JButton();
        contrasenaJT = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BIENVENIDOS A CLUB RESTAURANT");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");

        IngresarBoton.setText("Ingresar");
        IngresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarBotonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(usuarioJT);

        registrarBT.setText("Registrarse");
        registrarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBTActionPerformed(evt);
            }
        });

        contrasenaJT.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IngresarBoton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(registrarBT)
                                .addGap(19, 19, 19))
                            .addComponent(jScrollPane1)
                            .addComponent(contrasenaJT))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contrasenaJT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarBoton)
                    .addComponent(registrarBT))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarBotonActionPerformed
        Cliente cliente = new Cliente();
         Empleado empleado = new Empleado();

         // Obtenemos el nombre de usuario ingresado en el campo de texto
         String nombreBuscado = this.usuarioJT.getText();

         // Buscamos en la lista de clientes y empleados
         String nombreCliente = buscarCliente(cliente.ListaCliente(), nombreBuscado);
         String nombreEmpleado = buscarEmpleado(empleado.ListaEmpleado(), nombreBuscado);

         // Si se encuentra el nombre en la lista de empleados, abrimos la vista de empleados
         if (nombreEmpleado != null) {
             EmpleadoVista b = new EmpleadoVista();
             b.setVisible(true);
         } 
         // Si se encuentra el nombre en la lista de clientes, abrimos la vista de clientes
         else if (nombreCliente != null) {
             ClienteVisTa a = new ClienteVisTa();
             a.setVisible(true);
         } 
         // Si no se encuentra en ninguna lista, mostramos un mensaje
         else {
        JOptionPane.showMessageDialog(this, "Usuario no encontrado en la lista de empleados ni clientes.");
    }
         
       
    }//GEN-LAST:event_IngresarBotonActionPerformed

    private void registrarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBTActionPerformed

        RegistrarVista a = new RegistrarVista();
        a.setVisible(true);

        
    }//GEN-LAST:event_registrarBTActionPerformed

    public static String buscarCliente(ArrayList<Cliente> lista, String nombreBuscado) {
        for (Cuenta persona : lista) {
            if (persona.getNombreUsuario().equalsIgnoreCase(nombreBuscado)) {
                return persona.getNombreUsuario();
            }
        }
        return null;
    }
    
    
    public static String buscarEmpleado(ArrayList<Empleado> lista, String nombreBuscado) {
        for (Cuenta persona : lista) {
            if (persona.getNombreUsuario().equalsIgnoreCase(nombreBuscado)) {
                return persona.getNombreUsuario();
            }
        }
        return null;
    }


    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IngresarBoton;
    private javax.swing.JPasswordField contrasenaJT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrarBT;
    private javax.swing.JTextPane usuarioJT;
    // End of variables declaration//GEN-END:variables
}
