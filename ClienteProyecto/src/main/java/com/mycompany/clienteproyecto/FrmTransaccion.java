/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.mycompany.clienteproyecto;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class FrmTransaccion extends javax.swing.JFrame {
    
    /**
     * Creates new form FrmTransaccion
     */
    SocketCliente socketclient;
    DefaultTableModel modelBusqueda = new DefaultTableModel();
    
    
    public FrmTransaccion() {
        initComponents();
        
        
        socketclient = new SocketCliente("172.30.229.182", 4444);
    }
    
    //private Cliente cliente;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        cmbTipoTransaccion = new javax.swing.JComboBox();
        pnlPadre = new javax.swing.JPanel();
        pnlDeposito = new javax.swing.JPanel();
        jDeposito = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDeposito = new javax.swing.JTextField();
        txtSaldoDeposito = new javax.swing.JTextField();
        jlSaldo = new javax.swing.JLabel();
        pnlConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        pnlRetiro = new javax.swing.JPanel();
        jRetiro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRetiro = new javax.swing.JTextField();
        txtSaldoRetiro = new javax.swing.JTextField();
        jlSaldo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("DATOS CLIENTE:");

        jLabel1.setText("Tipo de Transacción");

        txtCI.setText("1716096589");
        txtCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIActionPerformed(evt);
            }
        });

        txtContrasena.setText("password");
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        cmbTipoTransaccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Depósito", "Retiro" }));
        cmbTipoTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoTransaccionActionPerformed(evt);
            }
        });

        pnlPadre.setLayout(new java.awt.CardLayout());

        pnlDeposito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDeposito.setText("REALIZAR DEPÓSITO");
        jDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepositoActionPerformed(evt);
            }
        });

        jLabel4.setText("Monto a depositar");

        txtDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepositoActionPerformed(evt);
            }
        });

        txtSaldoDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoDepositoActionPerformed(evt);
            }
        });

        jlSaldo.setText("Saldo");

        javax.swing.GroupLayout pnlDepositoLayout = new javax.swing.GroupLayout(pnlDeposito);
        pnlDeposito.setLayout(pnlDepositoLayout);
        pnlDepositoLayout.setHorizontalGroup(
            pnlDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDepositoLayout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addGroup(pnlDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDepositoLayout.createSequentialGroup()
                        .addGroup(pnlDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSaldoDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(376, 376, 376))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDepositoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(421, 421, 421))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDepositoLayout.createSequentialGroup()
                        .addGroup(pnlDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDeposito)
                            .addGroup(pnlDepositoLayout.createSequentialGroup()
                                .addComponent(jlSaldo)
                                .addGap(52, 52, 52)))
                        .addGap(414, 414, 414))))
        );
        pnlDepositoLayout.setVerticalGroup(
            pnlDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDepositoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jDeposito)
                .addGap(35, 35, 35)
                .addComponent(jlSaldo)
                .addGap(18, 18, 18)
                .addComponent(txtSaldoDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pnlPadre.add(pnlDeposito, "card2");

        pnlConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FECHA", "TIPO DE TRANSACCIÓN", "MONTO", "SALDO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPacientes);

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pnlPadre.add(pnlConsulta, "card4");

        pnlRetiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jRetiro.setText("REALIZAR RETIRO");
        jRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRetiroActionPerformed(evt);
            }
        });

        jLabel5.setText("Monto a retirar");

        txtRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetiroActionPerformed(evt);
            }
        });

        txtSaldoRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoRetiroActionPerformed(evt);
            }
        });

        jlSaldo1.setText("Saldo");

        javax.swing.GroupLayout pnlRetiroLayout = new javax.swing.GroupLayout(pnlRetiro);
        pnlRetiro.setLayout(pnlRetiroLayout);
        pnlRetiroLayout.setHorizontalGroup(
            pnlRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRetiroLayout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addGroup(pnlRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRetiro)
                    .addComponent(jlSaldo1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRetiroLayout.createSequentialGroup()
                .addContainerGap(394, Short.MAX_VALUE)
                .addGroup(pnlRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRetiroLayout.createSequentialGroup()
                        .addGroup(pnlRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(382, 382, 382))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRetiroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(441, 441, 441))))
        );
        pnlRetiroLayout.setVerticalGroup(
            pnlRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRetiroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRetiro)
                .addGap(18, 18, 18)
                .addComponent(jlSaldo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(txtSaldoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        pnlPadre.add(pnlRetiro, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbTipoTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipoTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoTransaccionActionPerformed
        
        if (cmbTipoTransaccion.getSelectedIndex() == 0) {
            limpiarJPanel();
            agregarPanel(pnlDeposito);
        }
        if (cmbTipoTransaccion.getSelectedIndex() == 1) {
            limpiarJPanel();
            agregarPanel(pnlRetiro);
        }
        
    }//GEN-LAST:event_cmbTipoTransaccionActionPerformed
   
    
    private void jDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepositoActionPerformed
        String mensaje = "";
        String saldo = "";
        //ActualizarSañdoCliente(cliente, BigDecimal.valueOf(Double.parseDouble(txtDeposito.getText())));
        //RealizarDeposito(cliente, new TipoTransaccion(tipoTransaccionID), BigDecimal.valueOf(Double.parseDouble(txtDeposito.getText())));
        
        mensaje += txtCI.getText().trim()+",";
        mensaje += txtContrasena.getText().trim()+ ",";
        mensaje += "1" + ",";
        mensaje += txtDeposito.getText().trim();
        
        socketclient.enviarmensaje(mensaje);
        
        saldo=socketclient.recibemensaje();
        txtSaldoDeposito.setText(saldo);
        //limpiarJPanel();
        
        
        
    }//GEN-LAST:event_jDepositoActionPerformed

    private void jRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRetiroActionPerformed
        
        String mensaje = "";
        String saldo = "";
        //ActualizarSañdoCliente(cliente, BigDecimal.valueOf(Double.parseDouble(txtDeposito.getText())));
        //RealizarDeposito(cliente, new TipoTransaccion(tipoTransaccionID), BigDecimal.valueOf(Double.parseDouble(txtDeposito.getText())));
        
        mensaje += txtCI.getText().trim()+",";
        mensaje += txtContrasena.getText().trim()+ ",";
        mensaje += "2" + ",";
        mensaje += txtRetiro.getText().trim();
        
        socketclient.enviarmensaje(mensaje);
        saldo=socketclient.recibemensaje();
        txtSaldoRetiro.setText(saldo);
        //limpiarJPanel();

    }//GEN-LAST:event_jRetiroActionPerformed

    private void txtCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCIActionPerformed

    private void txtDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepositoActionPerformed

    private void txtRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRetiroActionPerformed

    private void txtSaldoDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoDepositoActionPerformed
                // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSaldoDepositoActionPerformed

    private void txtSaldoRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoRetiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoRetiroActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed
    
    private void limpiarJPanel() {
        pnlPadre.removeAll();
        pnlPadre.repaint();
        pnlPadre.revalidate();
    }
    
    private void agregarPanel(JPanel panel) {
        pnlPadre.add(panel);
        pnlPadre.repaint();
        pnlPadre.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbTipoTransaccion;
    private javax.swing.JButton jDeposito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRetiro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlSaldo;
    private javax.swing.JLabel jlSaldo1;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlDeposito;
    private javax.swing.JPanel pnlPadre;
    private javax.swing.JPanel pnlRetiro;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JTextField txtRetiro;
    private javax.swing.JTextField txtSaldoDeposito;
    private javax.swing.JTextField txtSaldoRetiro;
    // End of variables declaration//GEN-END:variables
}
