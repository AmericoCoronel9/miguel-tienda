/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tiendasmiguelito;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


/**
 *
 * @author CORONEL
 */
public class NewJFrame extends javax.swing.JFrame {

  DefaultTableModel modelo = new DefaultTableModel();
  ArrayList<String> productoss = new ArrayList<String>();
  
    public NewJFrame() {
        initComponents();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO");
        refra();
        
        
       
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        preciof = new javax.swing.JTextField();
        tallaf = new javax.swing.JTextField();
        nombref = new javax.swing.JTextField();
        colorf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        codigof = new javax.swing.JTextField();
        cantidadf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        agre = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        preciof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciofActionPerformed(evt);
            }
        });
        jPanel1.add(preciof, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 170, -1));

        tallaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tallafActionPerformed(evt);
            }
        });
        jPanel1.add(tallaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, -1));

        nombref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrefActionPerformed(evt);
            }
        });
        jPanel1.add(nombref, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        colorf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorfActionPerformed(evt);
            }
        });
        jPanel1.add(colorf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 170, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setText("TIENDAS MIGUELITO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 50));

        codigof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigofActionPerformed(evt);
            }
        });
        jPanel1.add(codigof, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 170, -1));

        cantidadf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadfActionPerformed(evt);
            }
        });
        jPanel1.add(cantidadf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 170, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Talla:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setText("Color:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel5.setText("Codigo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel6.setText("Cantidad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel7.setText("Precio:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 370, 390));

        agre.setText("AGREGAR");
        agre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreActionPerformed(evt);
            }
        });
        jPanel1.add(agre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 100, -1));

        Eliminar.setText("ELIMINAR");
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preciofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciofActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciofActionPerformed

    private void tallafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tallafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tallafActionPerformed

    private void nombrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrefActionPerformed

    private void colorfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorfActionPerformed

    private void codigofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigofActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigofActionPerformed

    private void cantidadfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadfActionPerformed

    private void agreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreActionPerformed
       caract cara = new caract();
       cara.setNombre(nombref.getText());
       cara.setCodigo(codigof.getText());
       cara.setCantidad(cantidadf.getText());
       cara.setPrecio(preciof.getText());
       productoss.add(cara.toString());
       
       
    }//GEN-LAST:event_agreActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    public void refra(){
        
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        for (caract cara : productoss){
            objet
            
        }
        tabla.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton agre;
    private javax.swing.JTextField cantidadf;
    private javax.swing.JTextField codigof;
    private javax.swing.JTextField colorf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombref;
    private javax.swing.JTextField preciof;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tallaf;
    // End of variables declaration//GEN-END:variables
}
