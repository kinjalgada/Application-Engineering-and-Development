/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NewCustomerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.ExistingCustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Policy.Product;
import Business.UserAccount.UserAccount;
import UserInterface.NewCustomerRole.insertPIIDetailsJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author user
 */
public class PolicyBrochure extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private OrganizationDirectory organizationDirectory;
    /**
     * Creates new form PolicyBrochure
     */
    public PolicyBrochure(JPanel userProcessContainer, Enterprise enterprise, OrganizationDirectory eOD) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organizationDirectory = eOD;
        populateTable();
    }

    public void populateTable(){
        int rowCount = tblPolicyBrochure.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblPolicyBrochure.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        
        for (Product p : enterprise.getProductCatalog().getProductCatalog()) {
            Object row[] = new Object[8];
            row[0] = p;
            row[1] = p.getDescription();
            row[2] = p.getVehicleClass();
            row[3] = p.getDriverInsured();
            row[4] = p.getPolicyMaxCover();
            row[5] = p.getDuration();
            row[6] = p.getPlanBenefit();
            row[7] = p.getPolicyPrice();

            model.addRow(row);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPolicyBrochure = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnBuyPolicy = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Policy Brochure");

        tblPolicyBrochure.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblPolicyBrochure.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Plan Name", "Plan Description", "Vehicle Class", "Driver Insured", "Max Cover", "Duration", "Plan Benefit", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblPolicyBrochure);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBuyPolicy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuyPolicy.setText("Buy Policy");
        btnBuyPolicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyPolicyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuyPolicy)
                        .addGap(241, 241, 241))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuyPolicy)
                    .addComponent(btnBack))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBuyPolicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyPolicyActionPerformed
        int row = tblPolicyBrochure.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product policy = (Product) tblPolicyBrochure.getValueAt(row,0);
        insertPIIDetailsJPanel insertPIIDetailsJPanel = new insertPIIDetailsJPanel(userProcessContainer, enterprise, organizationDirectory, policy);
        userProcessContainer.add("insertPIIDetailsJPanel", insertPIIDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBuyPolicyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuyPolicy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPolicyBrochure;
    // End of variables declaration//GEN-END:variables
}