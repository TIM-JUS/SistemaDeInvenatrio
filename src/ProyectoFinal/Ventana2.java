/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import  java.awt. *;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

import javax.swing.ListSelectionModel;

import javax.swing.table.DefaultTableModel;



public class Ventana2 extends javax.swing.JFrame {

    
DefaultTableModel modelo;
 
    
    
public Ventana2() {
       
         
setResizable(false);
         
setTitle("MANTENIMIENTO DE CLIENTES");
        
initComponents();
        
SNumeros(txt_mclientecodigo);
        
SLetras(txt_mclientenombre);
        
SLetras(txt_mclienteapellidos);
        
SNumeros(txt_mclientedni);
        
SNumeros(txt_mclientetelefono);
        
SNumeros(txt_mclienteruc);
        
        
         
desabilitartodo();
       
btn_mclienteagregar.setEnabled(false);
       
btn_mclientemodificar.setEnabled(false);
       
btn_mclienteeliminar.setEnabled(false);
       datos();
      
    }

   
    
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmb_mclientesexo = new javax.swing.JComboBox();
        txt_mclientecodigo = new javax.swing.JTextField();
        txt_mclientenombre = new javax.swing.JTextField();
        txt_mclienteapellidos = new javax.swing.JTextField();
        txt_mclientetelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_mclienteruc = new javax.swing.JTextField();
        txt_mclienteemail = new javax.swing.JTextField();
        txt_mclientedireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_mclientedni = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_mclientenuevo = new javax.swing.JButton();
        btn_mclienteagregar = new javax.swing.JButton();
        btn_mclientemodificar = new javax.swing.JButton();
        btn_mclienteeliminar = new javax.swing.JButton();
        btn_mclientecancelar = new javax.swing.JButton();
        btn_mclientesalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mclientedatos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 0, 255))); // NOI18N

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("E_mail:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("Apellidos:");

        cmb_mclientesexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Seleccione>>", "M", "F" }));

        txt_mclientecodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mclientecodigoActionPerformed(evt);
            }
        });

        txt_mclientenombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mclientenombreActionPerformed(evt);
            }
        });

        jLabel8.setText("Ruc:");

        jLabel9.setText("DNI: ");

        txt_mclientedni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mclientedniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_mclientetelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_mclientenombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(cmb_mclientesexo, 0, 1, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_mclienteapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_mclientedni, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_mclienteruc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_mclientecodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_mclientedireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_mclienteemail, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(107, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_mclientecodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_mclientenombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_mclienteapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_mclientesexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_mclientedni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_mclientetelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_mclienteruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_mclienteemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_mclientedireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 9, 440, 310);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_mclientenuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.jpg"))); // NOI18N
        btn_mclientenuevo.setText("Nuevo");
        btn_mclientenuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mclientenuevoActionPerformed(evt);
            }
        });

        btn_mclienteagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.jpg"))); // NOI18N
        btn_mclienteagregar.setText("Agregar");
        btn_mclienteagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mclienteagregarActionPerformed(evt);
            }
        });

        btn_mclientemodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.jpg"))); // NOI18N
        btn_mclientemodificar.setText("Modificar");
        btn_mclientemodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mclientemodificarActionPerformed(evt);
            }
        });

        btn_mclienteeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.jpg"))); // NOI18N
        btn_mclienteeliminar.setText("Eliminar");
        btn_mclienteeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mclienteeliminarActionPerformed(evt);
            }
        });

        btn_mclientecancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.jpg"))); // NOI18N
        btn_mclientecancelar.setText("Cancelar");
        btn_mclientecancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mclientecancelarActionPerformed(evt);
            }
        });

        btn_mclientesalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.jpg"))); // NOI18N
        btn_mclientesalir.setText("Salir");
        btn_mclientesalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mclientesalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_mclientesalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_mclienteeliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_mclientecancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_mclientemodificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_mclienteagregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_mclientenuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_mclientenuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_mclienteagregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_mclientemodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mclienteeliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mclientecancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mclientesalir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(490, 30, 130, 240);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbl_mclientedatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Apellidos", "Sexo", "Dni", "Teléfono", "RUC", "E_mail", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_mclientedatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_mclientedatosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_mclientedatosMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_mclientedatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 330, 630, 96);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.bp.blogspot.com--qPqClGS2luM-TXbv9OfEZ3I-AAAAAAAABmw-ys7IJ4dku9Q-s1600-Atomic_Ice_by_saretta1.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-37, -20, 690, 500);

        setSize(new java.awt.Dimension(666, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mclientecodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mclientecodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mclientecodigoActionPerformed

    private void txt_mclientedniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mclientedniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mclientedniActionPerformed

    private void btn_mclientesalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mclientesalirActionPerformed

        
        
        Principal OBJ=new Principal();
        OBJ.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_mclientesalirActionPerformed

    private void btn_mclientenuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mclientenuevoActionPerformed
  btn_mclientenuevo.setEnabled(false);
        btn_mclienteagregar.setEnabled(true); 
     btn_mclientecancelar.setEnabled(true);
    btn_mclientesalir.setEnabled(true);
       txt_mclientecodigo.setEnabled(true); 
       txt_mclientenombre.setEnabled(true);
       txt_mclienteapellidos.setEnabled(true);
       cmb_mclientesexo.setEnabled(true);
       txt_mclientedni.setEnabled(true);
       txt_mclientetelefono.setEnabled(true);
       txt_mclienteruc.setEnabled(true);
       txt_mclienteemail.setEnabled(true);
       txt_mclientedireccion.setEnabled(true);
       
       
       
       
    }//GEN-LAST:event_btn_mclientenuevoActionPerformed

    private void btn_mclienteagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mclienteagregarActionPerformed
    
        
       
        
        modelo=(DefaultTableModel) tbl_mclientedatos.getModel();
        String cod,nom,ape,sexo,dni,tel,ruc,emil, dir;
        cod=txt_mclientecodigo.getText();
        nom=txt_mclientenombre.getText();
        ape=txt_mclienteapellidos.getText();
        sexo=cmb_mclientesexo.getSelectedItem().toString();
        dni=txt_mclientedni.getText();
        tel=txt_mclientetelefono.getText();
        ruc=txt_mclienteruc.getText();
        emil=txt_mclienteemail.getText();
        dir=txt_mclientedireccion.getText();
        String[] datos=new String[10];
   datos[0]=cod;
   datos[1]=nom;
   datos[2]=ape;
   datos[3]=sexo;
   datos[4]=dni;
   datos[5]=tel;
   datos[6]=ruc;
   datos[7]=emil;
   datos[8]=dir;

   modelo.addRow(datos);
    
  
   
      btn_mclientenuevo.setEnabled(true);
        btn_mclienteagregar.setEnabled(false); 
 
  
     btn_mclientecancelar.setEnabled(true);
    btn_mclientesalir.setEnabled(true);
     desabilitartodo();
     limpiartodo();
        
    }//GEN-LAST:event_btn_mclienteagregarActionPerformed

    private void btn_mclienteeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mclienteeliminarActionPerformed
btn_mclientenuevo.setEnabled(true);
btn_mclientemodificar.setEnabled(false);
btn_mclienteeliminar.setEnabled(false);
        limpiartodo();
        desabilitartodo();
        try{        
         modelo=(DefaultTableModel) tbl_mclientedatos.getModel();
    modelo.removeRow(tbl_mclientedatos.getSelectedRow());}

catch(Exception e){
    JOptionPane.showMessageDialog(null, "No hay que eliminar");
}
   
        
    }//GEN-LAST:event_btn_mclienteeliminarActionPerformed

    private void btn_mclientecancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mclientecancelarActionPerformed
      btn_mclienteagregar.setEnabled(false);
           btn_mclientenuevo.setEnabled(true);
          
          
       limpiartodo();
        desabilitartodo();
            
        
    }//GEN-LAST:event_btn_mclientecancelarActionPerformed

    private void btn_mclientemodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mclientemodificarActionPerformed
btn_mclientenuevo.setEnabled(true);
btn_mclientemodificar.setEnabled(false);
btn_mclienteeliminar.setEnabled(false);
           
           
        
        String []datos=new String [9];
   datos[0]=txt_mclientecodigo.getText();
   datos[1]=txt_mclientenombre.getText();
   datos[2]=txt_mclienteapellidos.getText();
  datos[3]=cmb_mclientesexo.getSelectedItem().toString();
   datos[4]=txt_mclientedni.getText();
   datos[5]=txt_mclientetelefono.getText();
   datos[6]=txt_mclienteruc.getText();
   datos[7]=txt_mclienteemail.getText();
   datos[8]=txt_mclientedireccion.getText();
   
   for(int i=0;i<tbl_mclientedatos.getColumnCount();i++){
       
       modelo.setValueAt(datos[i],filas, i);
       
       
   }
         desabilitartodo();
         limpiartodo();
    }//GEN-LAST:event_btn_mclientemodificarActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
       
          
            
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tbl_mclientedatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mclientedatosMouseClicked
        txt_mclientecodigo.setEnabled(true); 
       txt_mclientenombre.setEnabled(true);
       txt_mclienteapellidos.setEnabled(true);
       cmb_mclientesexo.setEnabled(true);
       txt_mclientedni.setEnabled(true);
       txt_mclientetelefono.setEnabled(true);
       txt_mclienteruc.setEnabled(true);
       txt_mclienteemail.setEnabled(true);
       txt_mclientedireccion.setEnabled(true);
       btn_mclientemodificar.setEnabled(true);
       btn_mclienteeliminar.setEnabled(true);
       btn_mclientenuevo.setEnabled(false);
        
        int filaselect=tbl_mclientedatos.getSelectedRow();
        txt_mclientecodigo.setText(tbl_mclientedatos.getValueAt(filaselect, 0).toString());
        txt_mclientenombre.setText(tbl_mclientedatos.getValueAt(filaselect, 1).toString());
        txt_mclienteapellidos.setText(tbl_mclientedatos.getValueAt(filaselect, 2).toString());
        cmb_mclientesexo.setSelectedItem(tbl_mclientedatos.getValueAt(filaselect, 3).toString());
        txt_mclientedni.setText(tbl_mclientedatos.getValueAt(filaselect, 4).toString());
        txt_mclientetelefono.setText(tbl_mclientedatos.getValueAt(filaselect, 5).toString());
        txt_mclienteruc.setText(tbl_mclientedatos.getValueAt(filaselect, 6).toString());
        txt_mclienteemail.setText(tbl_mclientedatos.getValueAt(filaselect, 7).toString());
        txt_mclientedireccion.setText(tbl_mclientedatos.getValueAt(filaselect, 8).toString());
        
        filas=filaselect;
    }//GEN-LAST:event_tbl_mclientedatosMouseClicked

    private void tbl_mclientedatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mclientedatosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_mclientedatosMouseEntered

    private void txt_mclientenombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mclientenombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mclientenombreActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_mclienteagregar;
    private javax.swing.JButton btn_mclientecancelar;
    private javax.swing.JButton btn_mclienteeliminar;
    private javax.swing.JButton btn_mclientemodificar;
    private javax.swing.JButton btn_mclientenuevo;
    private javax.swing.JButton btn_mclientesalir;
    private javax.swing.JComboBox cmb_mclientesexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_mclientedatos;
    private javax.swing.JTextField txt_mclienteapellidos;
    private javax.swing.JTextField txt_mclientecodigo;
    private javax.swing.JTextField txt_mclientedireccion;
    private javax.swing.JTextField txt_mclientedni;
    private javax.swing.JTextField txt_mclienteemail;
    private javax.swing.JTextField txt_mclientenombre;
    private javax.swing.JTextField txt_mclienteruc;
    private javax.swing.JTextField txt_mclientetelefono;
    // End of variables declaration//GEN-END:variables

    public void datos(){
         modelo=(DefaultTableModel) tbl_mclientedatos.getModel();
   
        String[] datos=new String[10];
   
   datos[0]="1";
   datos[1]="Kenyi";
   datos[2]="Timoteo Justo";
   datos[3]="M";
   datos[4]="22455654";
   datos[5]="516905";
   datos[6]="26456145646";
   datos[7]="timjus@gmail.com";
   datos[8]="Jr.Huallayco #44";
   modelo.addRow(datos);
    
   datos[0]="2";
   datos[1]="Alexander";
   datos[2]="Dominguez Pilco";
   datos[3]="M";
   datos[4]="71590824";
   datos[5]="518649";
   datos[6]="35645641664";
   datos[7]="alex@gmail.com";
   datos[8]="jr. Dos de Mayo #211";
   modelo.addRow(datos);
     
        
    }
    
    public void limpiartodo(){
        txt_mclientecodigo.setText(""); 
       txt_mclientenombre.setText("");
       txt_mclienteapellidos.setText("");
       cmb_mclientesexo.setSelectedIndex(0);
       txt_mclientedni.setText("");
       txt_mclientetelefono.setText("");
       txt_mclienteruc.setText("");
       txt_mclienteemail.setText("");
       txt_mclientedireccion.setText("");
        
    }
    
    
    
    public void desabilitartodo(){
   txt_mclientecodigo.setEnabled(false); 
       txt_mclientenombre.setEnabled(false);
       txt_mclienteapellidos.setEnabled(false);
       cmb_mclientesexo.setEnabled(false);
       txt_mclientedni.setEnabled(false);
       txt_mclientetelefono.setEnabled(false);
       txt_mclienteruc.setEnabled(false);
       txt_mclienteemail.setEnabled(false);
       txt_mclientedireccion.setEnabled(false);
       
   
}
    int filas;
    public void SLetras (JTextField a){
        a.addKeyListener(new KeyAdapter() {
       public void keyTyped(KeyEvent e){
        char c=e.getKeyChar();
        if (Character.isDigit(c)){
            getToolkit().beep();
            e.consume();
        }
       }
});
    }
    public void SNumeros (JTextField a){
        a.addKeyListener(new KeyAdapter() {
       public void keyTyped(KeyEvent e){
        char c=e.getKeyChar();
        if (!Character.isDigit(c)){
            getToolkit().beep();
            e.consume();
        }
       }
});
    }
    
}
