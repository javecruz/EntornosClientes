/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import static ejercicio2.Clientes.r;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fabricantes extends javax.swing.JFrame {

    static public ResultSet r;
    int control;

    /**
     * Creates new form Fabricantes
     */
    public Fabricantes() throws SQLException {
        initComponents();
        String url = "jdbc:mysql://localhost:3306/bases";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user, pass);

        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); //es otra clase
        String query = "select * from fabricantes"; // arterisco es que selecciona todo
        r = s.executeQuery(query);
        r.first(); // es para que se coloque en el primero, no es necesario pero Victor lo hace
        codigo.setText(r.getString("COD_FABRICANTE"));
        nombre.setText(r.getString("NOMBRE"));
        pais.setText(r.getString("PAIS"));
        cancelar.setVisible(false);
        confirmar.setVisible(false);
        borrar.setVisible(true);
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
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        primero = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código Fabricante");
        jLabel1.setFocusable(false);

        jLabel2.setText("Nombre");
        jLabel2.setFocusable(false);
        jLabel2.setMaximumSize(new java.awt.Dimension(87, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(87, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(87, 14));

        jLabel3.setText("País");
        jLabel3.setFocusable(false);

        codigo.setEditable(false);
        codigo.setNextFocusableComponent(nombre);

        nombre.setNextFocusableComponent(pais);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        pais.setNextFocusableComponent(primero);
        pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisActionPerformed(evt);
            }
        });

        primero.setText("Primero");
        primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeroActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.setNextFocusableComponent(siguiente);
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.setNextFocusableComponent(ultimo);
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        ultimo.setText("Último");
        ultimo.setNextFocusableComponent(nuevo);
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo");
        nuevo.setNextFocusableComponent(modificar);
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.setNextFocusableComponent(borrar);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FABRICANTES");
        jLabel4.setFocusable(false);

        confirmar.setText("Confirmar");
        confirmar.setNextFocusableComponent(cancelar);
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.setNextFocusableComponent(codigo);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.setNextFocusableComponent(confirmar);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        salir.setText("MENU");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(primero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ultimo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salir))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(primero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroActionPerformed
        try {
            r.first();
            codigo.setText(r.getString("COD_FABRICANTE"));
            nombre.setText(r.getString("NOMBRE"));
            pais.setText(r.getString("PAIS"));
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_primeroActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        try {
            if (r.previous()) {
                codigo.setText(r.getString("COD_FABRICANTE"));
                nombre.setText(r.getString("NOMBRE"));
                pais.setText(r.getString("PAIS"));
            }        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        try {
            if (r.next()) {
                codigo.setText(r.getString("COD_FABRICANTE"));
                nombre.setText(r.getString("NOMBRE"));
                pais.setText(r.getString("PAIS"));
            }        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
        try {
            r.last();
            codigo.setText(r.getString("COD_FABRICANTE"));
            nombre.setText(r.getString("NOMBRE"));
            pais.setText(r.getString("PAIS"));        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ultimoActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        codigo.setEditable(false);
        confirmar.setVisible(true);
        cancelar.setVisible(true);
        primero.setEnabled(false);
        anterior.setEnabled(false);
        siguiente.setEnabled(false);
        ultimo.setEnabled(false);
        nuevo.setEnabled(false);
        borrar.setEnabled(false);
        control = 2;
    }//GEN-LAST:event_modificarActionPerformed

    private void paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        codigo.setEditable(true);
        codigo.setText("");
        nombre.setText("");
        pais.setText("");
        confirmar.setVisible(true);
        cancelar.setVisible(true);
        primero.setEnabled(false);
        anterior.setEnabled(false);
        siguiente.setEnabled(false);
        ultimo.setEnabled(false);
        modificar.setEnabled(false);
        borrar.setEnabled(false);
        control = 1;
    }//GEN-LAST:event_nuevoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        codigo.setEditable(false);
        codigo.setText("");
        nombre.setText("");
        pais.setText("");
        confirmar.setVisible(false);
        cancelar.setVisible(false);
        primero.setEnabled(true);
        anterior.setEnabled(true);
        siguiente.setEnabled(true);
        ultimo.setEnabled(true);
        modificar.setEnabled(true);
        nuevo.setEnabled(true);
        borrar.setEnabled(true);
        control = 0;  // reinicio variable control a un valor neutro
    }//GEN-LAST:event_cancelarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed

        if (control == 1) {     // NUEVO
            try {
                String vCodigo, vNombre, vPais;
                vCodigo = codigo.getText();
                vNombre = nombre.getText();
                vPais = pais.getText();
                String url = "jdbc:mysql://localhost:3306/bases";
                String user = "root";
                String pass = "";
                Connection connection = DriverManager.getConnection(url, user, pass);
                Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                String query = "insert into fabricantes values ('" + vCodigo + "','" + vNombre + "','" + vPais + "')";  //se pone " y ' porque se hace asi cuanto trabajamos en base de datos. 2. los + se ponen antes y despues de cada dato que se meta, sirve para concatenar y los datos se meten en la base de datos y sabe donde meterlos porque si no pones donde meterlo se pone por orden en funcion de la primera columnaa, segunda..
                int resultado = s.executeUpdate(query);
                r.refreshRow();
                String query2 = "select * from fabricantes"; // arterisco es que selecciona todo
                r = s.executeQuery(query2);
                r.first(); // es para que se coloque en el primero, no es necesario pero Victor lo hace
                codigo.setText(r.getString("COD_FABRICANTE"));
                nombre.setText(r.getString("NOMBRE"));
                pais.setText(r.getString("PAIS"));
            } catch (SQLException ex) {
                Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

        if (control == 2) {    //MODIFICARRRRRRRRRR
            try {
                String vCodigo, vNombre, vPais;
                vCodigo = codigo.getText();
                vNombre = nombre.getText();
                vPais = pais.getText();
                String url = "jdbc:mysql://localhost:3306/bases";
                String user = "root";
                String pass = "";
                Connection connection = DriverManager.getConnection(url, user, pass);
                Statement s = connection.createStatement();
                String query = "update fabricantes set NOMBRE='" + vNombre + "', PAIS='" + vPais + "' WHERE COD_FABRICANTE='" + vCodigo + "'";
                int resultado = s.executeUpdate(query);
                r.refreshRow();
            } catch (SQLException ex) {
                Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (control == 3) {    //       BORRARRRRRR
            try {
                String vCodigo;
                vCodigo = codigo.getText();
                String url = "jdbc:mysql://localhost:3306/bases";
                String user = "root";
                String pass = "";
                Connection connection = DriverManager.getConnection(url, user, pass);
                Statement s = connection.createStatement();
                String query = "DELETE FROM fabricantes WHERE COD_FABRICANTE='" + vCodigo + "'";
                int resultado = s.executeUpdate(query);
                // r.refreshRow();
                String query2 = "select * from fabricantes"; // arterisco es que selecciona todo
                r = s.executeQuery(query2);
                r.first(); // es para que se coloque en el primero, no es necesario pero Victor lo hace
                codigo.setText(r.getString("COD_FABRICANTE"));
                nombre.setText(r.getString("NOMBRE"));
                pais.setText(r.getString("PAIS"));
            } catch (SQLException ex) {
                Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_confirmarActionPerformed
        primero.setEnabled(true);
        anterior.setEnabled(true);
        siguiente.setEnabled(true);
        ultimo.setEnabled(true);
        modificar.setEnabled(true);
        nuevo.setEnabled(true);
        borrar.setEnabled(true);  
        confirmar.setVisible(false);
        cancelar.setVisible(false);
        control = 0;
        try {
            r.refreshRow();
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed

        codigo.setEditable(false);
        confirmar.setVisible(true);
        cancelar.setVisible(true);
        primero.setEnabled(false);
        anterior.setEnabled(false);
        siguiente.setEnabled(false);
        ultimo.setEnabled(false);
        nuevo.setEnabled(false);
        modificar.setEnabled(false);
        borrar.setEnabled(true);
        control = 3;
    }//GEN-LAST:event_borrarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       MenuPrincipal ped = new MenuPrincipal();
        ped.setLocationRelativeTo(null);
        this.setVisible(false);
        ped.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Fabricantes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField pais;
    private javax.swing.JButton primero;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
