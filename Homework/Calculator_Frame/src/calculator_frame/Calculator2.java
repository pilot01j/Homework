package calculator_frame;
 /* @author User*/
public class Calculator2 extends javax.swing.JFrame {
    double num1;
    double num2;
    double ans;
    int operation;
    String ansver;
    public Calculator2() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nr1 = new javax.swing.JTextField();
        Nr2 = new javax.swing.JTextField();
        Adunarea = new javax.swing.JButton();
        Scaderea = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Impartirea = new javax.swing.JButton();
        PlusMinos = new javax.swing.JButton();
        Display = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nr1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Nr1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Nr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nr1ActionPerformed(evt);
            }
        });

        Nr2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Nr2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Nr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nr2ActionPerformed(evt);
            }
        });

        Adunarea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Adunarea.setText("+");
        Adunarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdunareaActionPerformed(evt);
            }
        });

        Scaderea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Scaderea.setText("-");
        Scaderea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScadereaActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("*");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Impartirea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Impartirea.setText("/");
        Impartirea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpartireaActionPerformed(evt);
            }
        });

        PlusMinos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PlusMinos.setText("C");
        PlusMinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusMinosActionPerformed(evt);
            }
        });

        Display.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nr1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nr2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Adunarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Scaderea, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Impartirea, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PlusMinos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Nr1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nr2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Adunarea, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Scaderea, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PlusMinos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Impartirea, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nr1ActionPerformed
            num1 = Double.parseDouble(Nr1.getText());
    }//GEN-LAST:event_Nr1ActionPerformed
    private void AdunareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdunareaActionPerformed
        ans = num1 + num2;                         
        ansver = String.format ("%.2f",ans);
        Display.setText(num1+" + "+num2+" = "+ansver);
    }//GEN-LAST:event_AdunareaActionPerformed
    private void ScadereaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScadereaActionPerformed
        ans = num1 - num2;                         
        ansver = String.format ("%.2f",ans);
        Display.setText(num1+" - "+num2+" = "+ansver);
    }//GEN-LAST:event_ScadereaActionPerformed
    private void ImpartireaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpartireaActionPerformed
        ans = num1 / num2;                         
        ansver = String.format ("%.2f",ans);
        Display.setText(num1+" / "+num2+" = "+ansver);
    }//GEN-LAST:event_ImpartireaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ans = num1 * num2;                         
        ansver = String.format ("%.2f",ans);
        Display.setText(num1+" * "+num2+" = "+ansver);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void PlusMinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusMinosActionPerformed
    Display.setText("");
    Nr1.setText("");
    Nr2.setText("");  
    num1 =0;
    num2 = 0;
    ans = 0;
    }//GEN-LAST:event_PlusMinosActionPerformed

    private void Nr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nr2ActionPerformed
        num2 = Double.parseDouble(Nr2.getText());
    }//GEN-LAST:event_Nr2ActionPerformed
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
            java.util.logging.Logger.getLogger(Calculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator2().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adunarea;
    private javax.swing.JLabel Display;
    private javax.swing.JButton Impartirea;
    private javax.swing.JTextField Nr1;
    private javax.swing.JTextField Nr2;
    private javax.swing.JButton PlusMinos;
    private javax.swing.JButton Scaderea;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
