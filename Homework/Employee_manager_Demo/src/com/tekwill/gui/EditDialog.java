
package com.tekwill.gui;

import com.tekwill.model.Employee;
import javax.swing.JOptionPane;

/* @author pilot*/
public class EditDialog extends javax.swing.JDialog {
    private Employee result;
 
    public EditDialog(java.awt.Frame parent, boolean modal, Employee emp) {
        super(parent, modal);
        initComponents(); // initialize the graphic components
        //trimit datele Employee din selectedRow catre datele grafice ale EditDialog 
        this.nameFrame.setText(emp.getName());
        this.surnameFrame.setText(emp.getSurname());
        this.idnpFrame.setText(emp.getIdnp());
    }
    //impachetez datele intrun Employee nou
    public Employee editedEmployee() {
        return result;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameFrame = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        surnameFrame = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idnpFrame = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        deleteBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name");

        nameFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFrameActionPerformed(evt);
            }
        });

        jLabel2.setText("Surname");

        surnameFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameFrameActionPerformed(evt);
            }
        });

        jLabel3.setText("IDNP");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        deleteBt.setText("Delete");
        deleteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(surnameFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nameFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(idnpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(surnameFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idnpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(deleteBt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        //iau datele din cimpurile  frame si le transmit trnsmit noului Employee
        this.result = new Employee(
        this.nameFrame.getText(),
        this.surnameFrame.getText(),
        this.idnpFrame.getText());
        System.out.println("AddDialog: " + this.result);
        //ascund EditDialog
        this.setVisible(false);
        JOptionPane.showConfirmDialog(this, "Are you sure?", "Changes detected", JOptionPane.OK_CANCEL_OPTION);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtActionPerformed
        //sterg datele din Frame-uri 
        nameFrame.setText("");
        surnameFrame.setText("");
        idnpFrame.setText("");
    }//GEN-LAST:event_deleteBtActionPerformed

    private void nameFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFrameActionPerformed
    }//GEN-LAST:event_nameFrameActionPerformed

    private void surnameFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFrameActionPerformed
    }//GEN-LAST:event_surnameFrameActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBt;
    private javax.swing.JTextField idnpFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameFrame;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField surnameFrame;
    // End of variables declaration//GEN-END:variables
}
