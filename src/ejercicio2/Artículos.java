/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import static ejercicio2.Clientes.r;
import static ejercicio2.Fabricantes.r;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author Entornos
 */
public class Artículos extends javax.swing.JFrame {

    static public ResultSet r;
    static Connection connection;
    int control;
     
    public Artículos() throws SQLException {
        initComponents();
        String url = "jdbc:mysql://localhost:3306/bases";
        String user = "root";
        String pass = "";
        connection = DriverManager.getConnection(url, user,pass);
        
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); //es otra clase
        String query = "select * from articulos"; // arterisco es que selecciona todo
        r = s.executeQuery(query);
        r.first(); // es para que se coloque en el primero, no es necesario pero Victor lo hace
        codigo.setText(r.getString("COD_ARTICULO"));
        articulo.setText(r.getString("ARTICULO"));
        //fabricante.setText(r.getString("FABRICANTE"));
        peso.setText(r.getString("PESO"));
        categoria.setText(r.getString("CATEGORIA"));
        precio_venta.setText(r.getString("PRECIO_VENTA"));
        precio_coste.setText(r.getString("PRECIO_COSTE"));
        existencias.setText(r.getString("EXISTENCIAS"));
        cancelar.setVisible(false);
        confirmar.setVisible(false);
        //COMBOOOOOOOOOO
        connection = DriverManager.getConnection(url,user,pass);    
        String query2 = "select * from fabricantes";
        ResultSet r2;
        Statement s2 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        r2 = s2.executeQuery(query2);
        DefaultComboBoxModel value1 = new DefaultComboBoxModel();

        while (r2.next()){
            value1.addElement(r2.getString("NOMBRE"));
        }
        fabri.setModel(value1);
        fabri.setSelectedItem(getNomFabricante(r.getInt("fabricante")));

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        articulo = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        categoria = new javax.swing.JTextField();
        precio_venta = new javax.swing.JTextField();
        precio_coste = new javax.swing.JTextField();
        existencias = new javax.swing.JTextField();
        primero = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        fabri = new javax.swing.JComboBox<>();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código Artículo");
        jLabel1.setFocusable(false);

        jLabel2.setText("Artículo");
        jLabel2.setFocusable(false);

        jLabel3.setText("Fabricante");
        jLabel3.setFocusable(false);

        jLabel4.setText("Peso");
        jLabel4.setFocusable(false);

        jLabel5.setText("Categoria");
        jLabel5.setFocusable(false);

        jLabel6.setText("Precio Venta");
        jLabel6.setFocusable(false);

        jLabel7.setText("Precio Coste");
        jLabel7.setFocusable(false);

        jLabel8.setText("Existencias");
        jLabel8.setFocusable(false);

        codigo.setEditable(false);
        codigo.setNextFocusableComponent(articulo);
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articuloActionPerformed(evt);
            }
        });

        peso.setNextFocusableComponent(categoria);
        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        categoria.setNextFocusableComponent(precio_venta);

        precio_venta.setNextFocusableComponent(precio_coste);

        precio_coste.setNextFocusableComponent(existencias);

        existencias.setNextFocusableComponent(primero);

        primero.setText("Primero");
        primero.setNextFocusableComponent(anterior);
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

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ARTÍCULOS");
        jLabel9.setFocusable(false);

        cancelar.setText("Cancelar");
        cancelar.setNextFocusableComponent(codigo);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        confirmar.setText("Confirmar");
        confirmar.setNextFocusableComponent(cancelar);
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.setNextFocusableComponent(confirmar);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        fabri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        salir.setText("MENU");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(primero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(codigo))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(existencias, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                                .addComponent(precio_venta)
                                                .addComponent(precio_coste)
                                                .addComponent(peso)
                                                .addComponent(articulo)
                                                .addComponent(fabri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addComponent(ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fabri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_coste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(existencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ultimo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(primero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int getCodFabricante(String nombre){
        
        int codigo=0;
        
        try {
            
            Statement s = connection.createStatement();
            String query2 = "select cod_fabricante "
                            + "FROM fabricantes "
                            + "where nombre='"+nombre+"'";
            ResultSet r2;
            r2=s.executeQuery(query2);
            r2.first();
            codigo=r2.getInt("COD_FABRICANTE");
        } catch (SQLException ex) {
            Logger.getLogger(Artículos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigo;
    }
  
    
    
    
    
    public String getNomFabricante(int cod_fabricante){
        
        String nombre="";

        try{
        Statement s = connection.createStatement();
            String query2 = "select nombre "
                            + "FROM fabricantes "
                            + "where cod_fabricante="+cod_fabricante;
            ResultSet r2;
            r2=s.executeQuery(query2);
            r2.first();
            nombre=r2.getString("NOMBRE");
        } catch (SQLException ex) {
            Logger.getLogger(Artículos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre;
        }
    
    
    
    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_articuloActionPerformed

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        try {
            if(r.previous()){ // es para que se coloque en el primero, no es necesario pero Victor lo hace
            codigo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            //fabricante.setText(r.getString("FABRICANTE")); ANTIGUO antes del combo box
            fabri.setSelectedItem(getNomFabricante(r.getInt("fabricante")));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precio_venta.setText(r.getString("PRECIO_VENTA"));
            precio_coste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));}        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Artículos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroActionPerformed
        try {
            r.first(); // es para que se coloque en el primero, no es necesario pero Victor lo hace
            codigo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            //fabricante.setText(r.getString("FABRICANTE"));
            fabri.setSelectedItem(getNomFabricante(r.getInt("fabricante")));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precio_venta.setText(r.getString("PRECIO_VENTA"));
            precio_coste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Artículos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_primeroActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        try {
            if(r.next()); // es para que se coloque en el primero, no es necesario pero Victor lo hace
            codigo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            fabri.setSelectedItem(getNomFabricante(r.getInt("fabricante")));
            //fabricante.setText(r.getString("FABRICANTE"));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precio_venta.setText(r.getString("PRECIO_VENTA"));
            precio_coste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Artículos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
        try {
            r.last(); // es para que se coloque en el primero, no es necesario pero Victor lo hace
            codigo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            fabri.setSelectedItem(getNomFabricante(r.getInt("fabricante")));
            //fabricante.setText(r.getString("FABRICANTE"));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precio_venta.setText(r.getString("PRECIO_VENTA"));
            precio_coste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Artículos.class.getName()).log(Level.SEVERE, null, ex);
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

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
            codigo.setEditable(true);
            codigo.setText("");
            articulo.setText("");
            //fabricante.setText("");
            fabri.setSelectedItem("");
            peso.setText("");
            categoria.setText("");
            precio_venta.setText("");
            precio_coste.setText("");
            existencias.setText("");
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
        articulo.setText("");
        //fabricante.setText("");
        fabri.setSelectedItem("");
        peso.setText("");
        categoria.setText("");
        precio_venta.setText("");
        precio_coste.setText("");
        existencias.setText("");
        confirmar.setVisible(false);
        cancelar.setVisible(false);
        primero.setEnabled(true);
        anterior.setEnabled(true);
        siguiente.setEnabled(true);
        ultimo.setEnabled(true);
        modificar.setEnabled(true);
        nuevo.setEnabled(true);
        borrar.setEnabled(true);
        control = 0;
    }//GEN-LAST:event_cancelarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if (control == 1) {
            try {
                String vCodigo, vArticulo, vFabricante, vPeso, vCategoria, vPrecioVenta, vPrecioCoste, vExistencias;
                vCodigo = codigo.getText();
                vArticulo = articulo.getText();
                //vFabricante = fabricante.getText();
                vFabricante = (String) fabri.getSelectedItem ();
                vPeso = peso.getText();
                vCategoria = categoria.getText();
                vPrecioVenta = precio_venta.getText();
                vPrecioCoste = precio_coste.getText();
                vExistencias = existencias.getText();
                String url = "jdbc:mysql://localhost:3306/bases";
                String user = "root";
                String pass = "";
                connection = DriverManager.getConnection(url, user,pass);
                Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                String query = "insert into articulos values ('" + vCodigo + "','" + vArticulo + "','" + getCodFabricante(vFabricante) + "','" + vPeso + "','" + vCategoria + "','" + vPrecioVenta + "','" + vPrecioCoste + "','" + vExistencias + "')";  //se pone " y ' porque se hace asi cuanto trabajamos en base de datos. 2. los + se ponen antes y despues de cada dato que se meta, sirve para concatenar y los datos se meten en la base de datos y sabe donde meterlos porque si no pones donde meterlo se pone por orden en funcion de la primera columnaa, segunda..
                int resultado = s.executeUpdate(query); 
                r.refreshRow();
                String query2 = "select * from articulos"; // arterisco es que selecciona todo
                r = s.executeQuery(query2);
                r.first(); // es para que se coloque en el primero, no es necesario pero Victor lo hace
                codigo.setText(r.getString("COD_ARTICULO"));
                articulo.setText(r.getString("ARTICULO"));
                //fabricante.setText(r.getString("FABRICANTE"));
                fabri.setSelectedItem(r.getString("fabricante"));
                peso.setText(r.getString("PESO"));
                categoria.setText(r.getString("CATEGORIA"));
                precio_venta.setText(r.getString("PRECIO_VENTA"));
                precio_coste.setText(r.getString("PRECIO_COSTE"));
                existencias.setText(r.getString("EXISTENCIAS"));
            } catch (SQLException ex) {
                Logger.getLogger(Artículos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        if (control == 2) {
            try {
                String vCodigo, vArticulo, vFabricante, vPeso, vCategoria, vPrecioVenta, vPrecioCoste, vExistencias;
                vCodigo = codigo.getText();
                vArticulo = articulo.getText();
                //vFabricante = fabricante.getText();
                vFabricante = (String) fabri.getSelectedItem ();
                int cod = getCodFabricante(vFabricante);
                vPeso = peso.getText();
                vCategoria = categoria.getText();
                vPrecioVenta = precio_venta.getText();
                vPrecioCoste = precio_coste.getText();
                vExistencias = existencias.getText();
                String url = "jdbc:mysql://localhost:3306/bases";
                String user = "root";
                String pass = "";
                connection = DriverManager.getConnection(url, user,pass);
                Statement s = connection.createStatement();
                String query = "update articulos set ARTICULO='" + vArticulo + "', FABRICANTE='" + cod + "', PESO='" + vPeso + "', CATEGORIA='" + vCategoria + "', PRECIO_VENTA='" + vPrecioVenta +  "', PRECIO_COSTE='" + vPrecioCoste +  "', EXISTENCIAS='" + vExistencias +  "' WHERE COD_ARTICULO='" + vCodigo + "'";
                int resultado = s.executeUpdate(query);
                r.refreshRow();
            } catch (SQLException ex) {
                Logger.getLogger(Artículos.class.getName()).log(Level.SEVERE, null, ex);
            }       
        }
        
        if (control == 3) {
            try {
                String vCodigo;
                vCodigo = codigo.getText();
                String url = "jdbc:mysql://localhost:3306/bases";
                String user = "root";
                String pass = "";
                connection = DriverManager.getConnection(url, user, pass);
                Statement s = connection.createStatement();
                String query = "DELETE FROM articulos WHERE COD_ARTICULO='" + vCodigo + "'";
                int resultado = s.executeUpdate(query);
                // r.refreshRow();
                String query2 = "select * from articulos"; // arterisco es que selecciona todo
                r = s.executeQuery(query2);
                r.first(); // es para que se coloque en el primero, no es necesario pero Victor lo hace
                codigo.setText(r.getString("COD_ARTICULO"));
                articulo.setText(r.getString("ARTICULO"));
                //fabricante.setText(r.getString("FABRICANTE"));
                fabri.setSelectedItem(r.getString("fabricante"));
                peso.setText(r.getString("PESO"));
                categoria.setText(r.getString("CATEGORIA"));
                precio_venta.setText(r.getString("PRECIO_VENTA"));
                precio_coste.setText(r.getString("PRECIO_COSTE"));
                existencias.setText(r.getString("EXISTENCIAS"));
            } catch (SQLException ex) {
                Logger.getLogger(Artículos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        
    }//GEN-LAST:event_confirmarActionPerformed

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
        control = 3;        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Artículos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Artículos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Artículos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Artículos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Artículos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Artículos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JTextField articulo;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField existencias;
    private javax.swing.JComboBox<String> fabri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField precio_coste;
    private javax.swing.JTextField precio_venta;
    private javax.swing.JButton primero;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
