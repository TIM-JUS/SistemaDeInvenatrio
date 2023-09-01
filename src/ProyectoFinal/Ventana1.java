/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;


public class Ventana1 extends javax.swing.JFrame {

public Ventana1() {
         
setResizable(false);
        
setTitle("PRESENTACION");
        
initComponents();
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_presentacion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.bp.blogspot.com--qPqClGS2luM-TXbv9OfEZ3I-AAAAAAAABmw-ys7IJ4dku9Q-s1600-Atomic_Ice_by_saretta1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.bp.blogspot.com--qPqClGS2luM-TXbv9OfEZ3I-AAAAAAAABmw-ys7IJ4dku9Q-s1600-Atomic_Ice_by_saretta1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.bp.blogspot.com--qPqClGS2luM-TXbv9OfEZ3I-AAAAAAAABmw-ys7IJ4dku9Q-s1600-Atomic_Ice_by_saretta1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.bp.blogspot.com--qPqClGS2luM-TXbv9OfEZ3I-AAAAAAAABmw-ys7IJ4dku9Q-s1600-Atomic_Ice_by_saretta1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Este proyecto de Programación se basa en un \"SISTEMA DE VENTAS\"");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 100, 520, 50);

        btn_presentacion.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btn_presentacion.setForeground(new java.awt.Color(204, 0, 0));
        btn_presentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1. salir..jpg"))); // NOI18N
        btn_presentacion.setText("Salir");
        btn_presentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_presentacionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_presentacion);
        btn_presentacion.setBounds(420, 250, 114, 38);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("en la cual nos proporciona muchas facilidades en un sistema de cualquier empresa.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 150, 612, 52);

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("PRESENTACIÓN KENYI");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(160, 50, 290, 30);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(450, -10, 10, 10);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/introducucion.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-250, -70, 1060, 460);

        setSize(new java.awt.Dimension(629, 343));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_presentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_presentacionActionPerformed
        
        Principal OBJ=new Principal();
        OBJ.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_presentacionActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_presentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
