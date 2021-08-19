package KNN;

import KNN.PanelGrafica;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }
    
    Parametros p = new Parametros();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nClases = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        k = new javax.swing.JTextField();
        graficar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nPuntos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("KNN");

        nClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nClasesActionPerformed(evt);
            }
        });
        nClases.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nClasesKeyTyped(evt);
            }
        });

        jLabel2.setText("# Clases");

        jLabel3.setText("K");

        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });
        k.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kKeyTyped(evt);
            }
        });

        graficar.setText("Graficar");
        graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficarActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        jLabel4.setText("# Puntos");

        nPuntos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nPuntosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nClases, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(graficar)
                        .addGap(18, 18, 18)
                        .addComponent(borrar)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graficar)
                    .addComponent(borrar)
                    .addComponent(jLabel4)
                    .addComponent(nPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nClasesActionPerformed
        
    }//GEN-LAST:event_nClasesActionPerformed

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kActionPerformed

    private void graficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficarActionPerformed
        if(nClases.getText().isEmpty() || nPuntos.getText().isEmpty() || k.getText().isEmpty()){
            JOptionPane.showMessageDialog( null ,"Solo positivos y hasta 5", "KNN",JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        int nC = Integer.parseInt( nClases.getText());
        int nP = Integer.parseInt( nPuntos.getText());
        int kn = Integer.parseInt( k.getText());
        
        if(nC > 5 || nC<=0){
            
            JOptionPane.showMessageDialog( null ,"Solo se puede hasta 5 clases y solo positivos", "KNN",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(kn > nP || kn<=0){
            JOptionPane.showMessageDialog( null ,"K no puede ser mayor que #puntos", "KNN",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        if(nP>100 || nP<=0){
            JOptionPane.showMessageDialog( null ,"Ingresa un numero positivo o hasta 100", "KNN",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //System.out.println(""+nC + nP + kn);
        //PanelGrafica a = new PanelGrafica();
        p.setnClases(nC);
        p.setnPuntos(nP);
        p.setK(kn);
        
        //Aqui emezamos a graficar llamando al JFrame
        JFrame v = new JFrame();
        v.add(new PanelGrafica());
        v.setSize(600,600);
        v.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        v.setVisible(true);
        
    }//GEN-LAST:event_graficarActionPerformed

    private void nClasesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nClasesKeyTyped
        
    }//GEN-LAST:event_nClasesKeyTyped

    private void kKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kKeyTyped
        
    }//GEN-LAST:event_kKeyTyped

    private void nPuntosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nPuntosKeyTyped
        
    }//GEN-LAST:event_nPuntosKeyTyped

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        nClases.setText("");
        k.setText("");
        nPuntos.setText("");
    }//GEN-LAST:event_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton graficar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField k;
    private javax.swing.JTextField nClases;
    private javax.swing.JTextField nPuntos;
    // End of variables declaration//GEN-END:variables
}
