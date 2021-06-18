package JFrames;

import javax.swing.JOptionPane;

/**
 * A class used to by an administrator used to choose what they want to delete
 * @author Mr S Malinga(218021100)
 */

public class AdminDelete extends javax.swing.JFrame {

    /**
     * Creates new form AdminDelete
     */
    public AdminDelete() 
    {
        initComponents();
    }

    /**
     * A Boolean variable type used in multiple JFrames to see whether a delete or update query should be run
     * If updateDelete = false the next JFrames will be used to update a certain record from the database
     * If updateDelete = true the next JFrame will be used to delete a record from the database
     */
    
    static boolean updateDelete = false;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDeleteMember = new javax.swing.JButton();
        btnDeletePT = new javax.swing.JButton();
        btnDeleteGym = new javax.swing.JButton();
        btnDeleteActivities = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fitness Fever");

        btnDeleteMember.setBackground(new java.awt.Color(27, 27, 27));
        btnDeleteMember.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeleteMember.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteMember.setText("Delete Member");
        btnDeleteMember.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMemberActionPerformed(evt);
            }
        });

        btnDeletePT.setBackground(new java.awt.Color(27, 27, 27));
        btnDeletePT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeletePT.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletePT.setText("Delete Personal Trainer");
        btnDeletePT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnDeletePT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePTActionPerformed(evt);
            }
        });

        btnDeleteGym.setBackground(new java.awt.Color(27, 27, 27));
        btnDeleteGym.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeleteGym.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteGym.setText("Delete Gym");
        btnDeleteGym.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnDeleteGym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteGymActionPerformed(evt);
            }
        });

        btnDeleteActivities.setBackground(new java.awt.Color(27, 27, 27));
        btnDeleteActivities.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeleteActivities.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteActivities.setText("Delete Activity");
        btnDeleteActivities.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnDeleteActivities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActivitiesActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(27, 27, 27));
        btnBack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnHelp.setBackground(new java.awt.Color(0, 0, 0));
        btnHelp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnHelp.setForeground(new java.awt.Color(255, 255, 255));
        btnHelp.setText("Help");
        btnHelp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDeleteMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDeleteActivities, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteGym, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeletePT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteMember)
                .addGap(18, 18, 18)
                .addComponent(btnDeletePT)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteGym)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteActivities)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnHelp))
                .addContainerGap())
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * A method that opens a JFrame that will allow the user to delete a record from tblMembers 
     * @param evt 
     */
    
    private void btnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMemberActionPerformed
        updateDelete = true;
        this.dispose();
        AdminUpdateWhichMember del = new AdminUpdateWhichMember();
        del.setVisible(true);
    }//GEN-LAST:event_btnDeleteMemberActionPerformed

    /**
     * A method that opens a JFrame that will allow the user to delete a record from tblPersonalTrainers
     * @param evt 
     */
    
    private void btnDeletePTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePTActionPerformed
        updateDelete = true;
        this.dispose();
        AdminUpdateWhichPT del = new AdminUpdateWhichPT();
        del.setVisible(true);
    }//GEN-LAST:event_btnDeletePTActionPerformed

    /**
     * A method that opens a JFrame that will allow the user to delete a record from tblGyms
     * @param evt 
     */
    
    private void btnDeleteGymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteGymActionPerformed
        updateDelete = true;
        this.dispose();
        AdminUpdateWhichGym del = new AdminUpdateWhichGym();
        del.setVisible(true);
    }//GEN-LAST:event_btnDeleteGymActionPerformed

    /**
     * A method that opens a JFrame that will allow the user to delete a record from tblActivities
     * @param evt 
     */
    
    private void btnDeleteActivitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActivitiesActionPerformed
        updateDelete = true;
        this.dispose();
        AdminUpdateWhichActivity del = new AdminUpdateWhichActivity();
        del.setVisible(true);
    }//GEN-LAST:event_btnDeleteActivitiesActionPerformed

    /**
     * A method used to go back to the main menu
     * @param evt 
     */
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        AdminMainMenu main = new AdminMainMenu();
        main.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * A method that explains to the user what to do in the JFrame
     * @param evt 
     */
    
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        JOptionPane.showMessageDialog(null, "Enter what type of user you want to delete.", "Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHelpActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteActivities;
    private javax.swing.JButton btnDeleteGym;
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnDeletePT;
    private javax.swing.JButton btnHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
