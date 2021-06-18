package JFrames;

import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 * A class used by the admin to allow it to choose what they want to insert
 * @author Mr S Malinga(218021100)
 */

public class AdminInsert extends javax.swing.JFrame {


    /**
     * Creates new form AdminInsert
     */
    public AdminInsert() 
    {
        initComponents();
    }

    /**
     * A Boolean variable used in other JFrames to see whether an update query or insert query must be run
     * If insertUpdate = false then a update query will take place in the following JFrames
     * If insertUpdate = true then a insert query will take place in the following JFrame
     */
    
    static boolean insertUpdate = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInsertMember = new javax.swing.JButton();
        btnInsertPT = new javax.swing.JButton();
        btnInsertGym = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnInsertActivity = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fitness Fever");

        btnInsertMember.setBackground(new java.awt.Color(27, 27, 27));
        btnInsertMember.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnInsertMember.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertMember.setText("Insert New Member");
        btnInsertMember.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnInsertMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertMemberActionPerformed(evt);
            }
        });

        btnInsertPT.setBackground(new java.awt.Color(27, 27, 27));
        btnInsertPT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnInsertPT.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertPT.setText("Insert New Personal Trainer");
        btnInsertPT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnInsertPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertPTActionPerformed(evt);
            }
        });

        btnInsertGym.setBackground(new java.awt.Color(27, 27, 27));
        btnInsertGym.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnInsertGym.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertGym.setText("Insert New Gym");
        btnInsertGym.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnInsertGym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertGymActionPerformed(evt);
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

        btnInsertActivity.setBackground(new java.awt.Color(27, 27, 27));
        btnInsertActivity.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnInsertActivity.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertActivity.setText("Insert New Activity");
        btnInsertActivity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnInsertActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActivityActionPerformed(evt);
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(btnInsertMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertGym, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInsertActivity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInsertMember)
                .addGap(18, 18, 18)
                .addComponent(btnInsertPT)
                .addGap(18, 18, 18)
                .addComponent(btnInsertGym)
                .addGap(18, 18, 18)
                .addComponent(btnInsertActivity)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * A method used to open a JFrame that allows the user to insert a record into tblMembers
     * The variable whichInsert is equal to one to say that the user type is 1
     * @param evt 
     */
    
    private void btnInsertMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertMemberActionPerformed
        try 
        {
            insertUpdate = true;
            Login.whichinsert = 1;
            this.dispose();
            AdminInsertOrUpdateMember insert = new AdminInsertOrUpdateMember();
            insert.setVisible(true);
        } 
        
        catch (SQLException | ParseException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnInsertMemberActionPerformed

    /**
     * A method used to open a JFrame that allows the user to insert a record into tblPersonalTrainers
     * @param evt 
     */
    
    private void btnInsertPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertPTActionPerformed
        try {
            insertUpdate = true;
            this.dispose();
            AdminInsertOrUpdatePT insert = new AdminInsertOrUpdatePT();
            insert.setVisible(true);
        } 
        
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnInsertPTActionPerformed

    /**
     * A method used to open a JFrame that allows the user to insert a record into tblGyms
     * @param evt 
     */
    
    private void btnInsertGymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertGymActionPerformed
        try {
            insertUpdate = true;
            this.dispose();
            AdminInsertOrUpdateGym insert = new AdminInsertOrUpdateGym();
            insert.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnInsertGymActionPerformed

    /**
     * A method used to open a JFrame that allows the user to insert a record into tblActivities
     * @param evt 
     */
   
    private void btnInsertActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActivityActionPerformed
        try {
            insertUpdate = true;
            this.dispose();
            AdminInsertOrUpdateActivity insert = new AdminInsertOrUpdateActivity();
            insert.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnInsertActivityActionPerformed

    /**
     * A method used to open the AdminMainMenu JFrame
     * @param evt 
     */
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        AdminMainMenu main = new AdminMainMenu();
        main.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * A Method that explains the user what to do in this JFrame
     * @param evt 
     */
    
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        JOptionPane.showMessageDialog(null, "Enter what type user you want to insert.", "Help", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(AdminInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInsert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnInsertActivity;
    private javax.swing.JButton btnInsertGym;
    private javax.swing.JButton btnInsertMember;
    private javax.swing.JButton btnInsertPT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
