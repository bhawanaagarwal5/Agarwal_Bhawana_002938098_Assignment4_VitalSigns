/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Functionality.personDetails;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Functionality.personDetailsDirectory;
import java.awt.CardLayout;
import Functionality.patientDetails;
import Functionality.patientDetailsDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author agarw
 */
public class ViewPersonDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewPersonDetails
     */
    private personDetails personDetails;
    private JPanel jpanelContainer;
    private  personDetailsDirectory personDirectory;
    private patientDetailsDirectory patientDirectory;
    
    public ViewPersonDetails(personDetailsDirectory pd, JPanel panel) {
        initComponents();
        this.personDirectory = pd;
        this.jpanelContainer = panel;
        this.patientDirectory = new patientDetailsDirectory();
        //Patient_Details patientDetails = new 
        generateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        personDetailsjTable = new javax.swing.JTable();
        createPatientjBtn = new javax.swing.JButton();
        updatePersonjBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDeletePerson = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 153));

        personDetailsjTable.setBackground(new java.awt.Color(204, 204, 255));
        personDetailsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Phone Number", "Street Address", "Zip Code", "City Name", "Community Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personDetailsjTable);
        if (personDetailsjTable.getColumnModel().getColumnCount() > 0) {
            personDetailsjTable.getColumnModel().getColumn(0).setResizable(false);
            personDetailsjTable.getColumnModel().getColumn(1).setResizable(false);
            personDetailsjTable.getColumnModel().getColumn(2).setResizable(false);
            personDetailsjTable.getColumnModel().getColumn(3).setResizable(false);
            personDetailsjTable.getColumnModel().getColumn(4).setResizable(false);
            personDetailsjTable.getColumnModel().getColumn(5).setResizable(false);
            personDetailsjTable.getColumnModel().getColumn(6).setResizable(false);
        }

        createPatientjBtn.setBackground(new java.awt.Color(204, 204, 255));
        createPatientjBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createPatientjBtn.setForeground(new java.awt.Color(0, 102, 102));
        createPatientjBtn.setText("Add Patient ");
        createPatientjBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        createPatientjBtn.setBorderPainted(false);
        createPatientjBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientjBtnActionPerformed(evt);
            }
        });

        updatePersonjBtn.setBackground(new java.awt.Color(204, 204, 255));
        updatePersonjBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatePersonjBtn.setForeground(new java.awt.Color(0, 102, 102));
        updatePersonjBtn.setText("Update Person");
        updatePersonjBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        updatePersonjBtn.setBorderPainted(false);
        updatePersonjBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePersonjBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Add Person");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Back");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Persons' Details");

        btnDeletePerson.setBackground(new java.awt.Color(204, 204, 255));
        btnDeletePerson.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeletePerson.setForeground(new java.awt.Color(0, 102, 102));
        btnDeletePerson.setText("Delete Person");
        btnDeletePerson.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnDeletePerson.setBorderPainted(false);
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatePersonjBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeletePerson, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(createPatientjBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton2)))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePersonjBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createPatientjBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createPatientjBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientjBtnActionPerformed
        // TODO add your handling code here:
        int count = personDetailsjTable.getSelectedRow();
        if(count >= 0)
        {
            personDetails = (personDetails)personDetailsjTable.getValueAt(count, 0);
            Add_Patient pat = new Add_Patient(patientDirectory,personDetails,jpanelContainer);
            jpanelContainer.add(pat);
            CardLayout layout = (CardLayout)jpanelContainer.getLayout();
            layout.next(jpanelContainer);
            
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select atleast one row to add Patient details");
        }
    }//GEN-LAST:event_createPatientjBtnActionPerformed

    private void updatePersonjBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePersonjBtnActionPerformed
        // TODO add your handling code here:
        int count = personDetailsjTable.getSelectedRow();
        if(count >= 0)
        {
            personDetails =(personDetails) personDetailsjTable.getValueAt(count, 0);
            UpdatePersonDetails vpd = new UpdatePersonDetails(personDetails, jpanelContainer, this);
            jpanelContainer.add(vpd);
            CardLayout layout = (CardLayout)jpanelContainer.getLayout();
            layout.next(jpanelContainer);
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select atleast one row to update Person details");
        }
    }//GEN-LAST:event_updatePersonjBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Person_Profile per = new Person_Profile(personDirectory,jpanelContainer,this);
        jpanelContainer.add("PersonDetails", per);
        CardLayout layout = (CardLayout)jpanelContainer.getLayout();
        layout.next(jpanelContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                jpanelContainer.remove(this);
        //viewPersonDetails.generateTable();
        CardLayout layout = (CardLayout)jpanelContainer.getLayout();
        layout.previous(jpanelContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
        // TODO add your handling code here:
              
        //
        
        int count = personDetailsjTable.getSelectedRow();
        if(count >= 0)
        {
            personDetails =(personDetails) personDetailsjTable.getValueAt(count, 0);
            personDirectory.deletePersonDetails(personDetails);
           
            JOptionPane.showMessageDialog(this, "Person Detail has been deleted.");
            generateTable();
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select atleast one row to delete Person details");
        }
        
    }//GEN-LAST:event_btnDeletePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton createPatientjBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable personDetailsjTable;
    private javax.swing.JButton updatePersonjBtn;
    // End of variables declaration//GEN-END:variables

    public void generateTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
       DefaultTableModel dtm = (DefaultTableModel) personDetailsjTable.getModel();
       dtm.setRowCount(0);
       for(personDetails pd:personDirectory.getPersonDirectory())
       {
           Object row[]=new Object[7];
            row[0] = pd;
            row[1] = pd.getLastName();
            row[2] = pd.getPhoneNumber();
            row[3] = pd.getStreetAddress();            
            row[4] = pd.getZipCode();
            row[5] = pd.getCityName();
            row[6] = pd.getCommunityName();
            dtm.addRow(row);
       }
    }
}