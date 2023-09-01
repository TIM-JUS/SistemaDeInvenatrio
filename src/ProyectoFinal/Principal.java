
package ProyectoFinal;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        setResizable(false);
        setTitle("SISTEMA DE VENTAS");
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MenuBar_MenuDeProyecto = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        mi_introduccion = new javax.swing.JMenuItem();
        mi_salir = new javax.swing.JMenuItem();
        menu_mantenimiento = new javax.swing.JMenu();
        mi_manclientes = new javax.swing.JMenuItem();
        mi_manproductos = new javax.swing.JMenuItem();
        mi_manempleados = new javax.swing.JMenuItem();
        menu_movimiento = new javax.swing.JMenu();
        mi_mofactura = new javax.swing.JMenuItem();
        mi_moboleta = new javax.swing.JMenuItem();
        menu_ayuda = new javax.swing.JMenu();
        mi_aotros = new javax.swing.JMenuItem();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.bp.blogspot.com--qPqClGS2luM-TXbv9OfEZ3I-AAAAAAAABmw-ys7IJ4dku9Q-s1600-Atomic_Ice_by_saretta1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 255));
        jLabel2.setText("SISTEMA ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 20, 290, 80);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("DE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 70, 90, 80);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SERVICIO TECNICO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 310, 460, 70);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 50)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setText("VENTAS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 120, 280, 70);

        jLabel6.setBackground(new java.awt.Color(51, 255, 51));
        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 3, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NCD SISTEM");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 260, 330, 70);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2023-08-31 074222.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-130, -40, 1030, 570);

        MenuBar_MenuDeProyecto.setBackground(new java.awt.Color(204, 204, 204));
        MenuBar_MenuDeProyecto.setBorder(new javax.swing.border.MatteBorder(null));
        MenuBar_MenuDeProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menu_archivo.setBorder(new javax.swing.border.MatteBorder(null));
        menu_archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        menu_archivo.setText("ARCHIVO");

        mi_introduccion.setText("Introducción");
        mi_introduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_introduccionActionPerformed(evt);
            }
        });
        menu_archivo.add(mi_introduccion);

        mi_salir.setText("Salir");
        mi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_salirActionPerformed(evt);
            }
        });
        menu_archivo.add(mi_salir);

        MenuBar_MenuDeProyecto.add(menu_archivo);

        menu_mantenimiento.setText("MANTENIMIENTO");

        mi_manclientes.setText("Clientes");
        mi_manclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_manclientesActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(mi_manclientes);

        mi_manproductos.setText("Productos");
        mi_manproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_manproductosActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(mi_manproductos);

        mi_manempleados.setText("Empleados");
        mi_manempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_manempleadosActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(mi_manempleados);

        MenuBar_MenuDeProyecto.add(menu_mantenimiento);

        menu_movimiento.setText("MOVIMIENTO");

        mi_mofactura.setText("Factura");
        mi_mofactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_mofacturaActionPerformed(evt);
            }
        });
        menu_movimiento.add(mi_mofactura);

        mi_moboleta.setText("Boleta");
        mi_moboleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_moboletaActionPerformed(evt);
            }
        });
        menu_movimiento.add(mi_moboleta);

        MenuBar_MenuDeProyecto.add(menu_movimiento);

        menu_ayuda.setText("AYUDA");

        mi_aotros.setText("Otros");
        mi_aotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_aotrosActionPerformed(evt);
            }
        });
        menu_ayuda.add(mi_aotros);

        MenuBar_MenuDeProyecto.add(menu_ayuda);

        setJMenuBar(MenuBar_MenuDeProyecto);

        setSize(new java.awt.Dimension(639, 466));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mi_manclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_manclientesActionPerformed

     Ventana2 OBJ=new  Ventana2();
     OBJ.setVisible(true);
     dispose();
      
    }//GEN-LAST:event_mi_manclientesActionPerformed

    private void mi_introduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_introduccionActionPerformed
      
        Ventana1 OBJ=new Ventana1();
        OBJ.setVisible(true);
        dispose();
  
    }//GEN-LAST:event_mi_introduccionActionPerformed

    private void mi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_salirActionPerformed

    }//GEN-LAST:event_mi_salirActionPerformed

    private void mi_manproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_manproductosActionPerformed
             
    }//GEN-LAST:event_mi_manproductosActionPerformed

    private void mi_manempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_manempleadosActionPerformed
        
    }//GEN-LAST:event_mi_manempleadosActionPerformed

    private void mi_mofacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_mofacturaActionPerformed
        
    }//GEN-LAST:event_mi_mofacturaActionPerformed

    private void mi_moboletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_moboletaActionPerformed
             
    }//GEN-LAST:event_mi_moboletaActionPerformed

    private void mi_aotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_aotrosActionPerformed

        Ventana7 OBJ=new Ventana7();
        OBJ.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_mi_aotrosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar_MenuDeProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_mantenimiento;
    private javax.swing.JMenu menu_movimiento;
    private javax.swing.JMenuItem mi_aotros;
    private javax.swing.JMenuItem mi_introduccion;
    private javax.swing.JMenuItem mi_manclientes;
    private javax.swing.JMenuItem mi_manempleados;
    private javax.swing.JMenuItem mi_manproductos;
    private javax.swing.JMenuItem mi_moboleta;
    private javax.swing.JMenuItem mi_mofactura;
    private javax.swing.JMenuItem mi_salir;
    // End of variables declaration//GEN-END:variables
}
