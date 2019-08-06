package com.tekwill.gui;

import com.tekwill.model.Employee;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/* @author pilot*/
public class App extends javax.swing.JFrame {
    
    DefaultTableModel tableModel;
    AddDialog addDialog;
    EditDialog editDialog;
    
    public App() {
        initComponents();
        tableModel = (DefaultTableModel) this.empTable.getModel();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        showInConsoleBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Surname", "IDNP"
            }
        ));
        jScrollPane1.setViewportView(empTable);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        showInConsoleBtn.setText("Show in console");

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showInConsoleBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delBtn)
                        .addGap(50, 50, 50)
                        .addComponent(showInConsoleBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        boolean isModal = true;
        addDialog = new AddDialog(this, isModal);
        addDialog.setVisible(true);
        Employee emp = addDialog.getResult();
        tableModel = (DefaultTableModel) this.empTable.getModel();
        tableModel.addRow(new Object[]{this.empTable.getRowCount() + 1, emp.getName(), emp.getSurname(), emp.getIdnp()});
        // transmit la employee service
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // stabilim rindul selectat 
        tableModel = (DefaultTableModel) this.empTable.getModel();
        int selectedRow = this.empTable.getSelectedRow();
        //stabilim daca s-a selectat un rind
        if (selectedRow == -1)
        { JOptionPane.showMessageDialog(editDialog, "Nu ai selectat nici un rind !");}
        if (selectedRow != -1) {
            
        //stergem rindul selectat
        tableModel.removeRow(selectedRow);}
        //folosim un iterator p.u a seta din nou nr rindurilor ,
        //altfel nr rindurilor no sa fie afisat in ordine numerica corecta
        for (int i = 0; i < tableModel.getRowCount(); i++) {
        tableModel.setValueAt(i + 1, i, 0);
        }
        // delete the row
        // delete from employee service
    }//GEN-LAST:event_delBtnActionPerformed
        // metota care stabileste rindul selectat 
    public int selectedRow()  {
        tableModel = (DefaultTableModel) this.empTable.getModel();
        int selectedRow = this.empTable.getSelectedRow();
        return selectedRow;
    }
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        
        // Vedem care rand este selectat
        int selectedRow = this.selectedRow();
        if (selectedRow == -1)
        {JOptionPane.showMessageDialog(editDialog, "Nu ai selectat nici un rind !");}
        if (selectedRow != -1) {
        // Luam datele de pe randul respectiv si impachetam datele intrun obiect de tip Employee.
        Employee emp = new Employee();
        emp.setName(tableModel.getValueAt(selectedRow, 1).toString());
        emp.setSurname(tableModel.getValueAt(selectedRow, 2).toString());
        emp.setIdnp(tableModel.getValueAt(selectedRow, 3).toString());

        // Initializam dialogul de editare(EditDialog)
        editDialog = new EditDialog(this, true, emp);
        // setam ca EditDialoc sa fie afisata (vizibil)
        editDialog.setVisible(true);
        // Citim valoarea modificata din EditDialog
         Employee edit = editDialog.editedEmployee();
        // Setam valorile noi p.u selectedRow
        tableModel.setValueAt(edit.getName(), selectedRow, 1);
        tableModel.setValueAt(edit.getSurname(), selectedRow, 2);
        tableModel.setValueAt(edit.getIdnp(), selectedRow, 3);
        // Verificam daca s-au schimbat valorile
        if(emp.getIdnp().equals(edit.getIdnp()) && 
           emp.getName().equals(edit.getName()) &&
           emp.getSurname().equals(edit.getSurname())) {
        System.out.println("Sult identici!");        
        JOptionPane.showMessageDialog(editDialog, "Sult identici!");
        } else {
        System.out.println("Nu sunt identici!");
        JOptionPane.showMessageDialog(editDialog, "Nu sult identici!");
        }
        }

         
    }//GEN-LAST:event_editBtnActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTable empTable;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showInConsoleBtn;
    // End of variables declaration//GEN-END:variables
}
