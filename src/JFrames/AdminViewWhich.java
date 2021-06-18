package JFrames;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * A class used by the administrator to choose what the administrator wants to view
 * @author Mr S Malinga(218021100)
 */
public class AdminViewWhich extends javax.swing.JFrame {

    /**
     * Creates new form AdminView
     */
    public AdminViewWhich() {
        initComponents();
    }

    /**
     * A variable used in the AdminView JFrame that tells the Frame what it must display
     */
    static int viewWhich = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnViewMembers = new javax.swing.JButton();
        btnViewPT = new javax.swing.JButton();
        btnViewGyms = new javax.swing.JButton();
        btnViewActivities = new javax.swing.JButton();
        btnViewWorkouts = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fitness Fever");

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

        btnViewMembers.setBackground(new java.awt.Color(27, 27, 27));
        btnViewMembers.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnViewMembers.setForeground(new java.awt.Color(255, 255, 255));
        btnViewMembers.setText("View Members");
        btnViewMembers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnViewMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMembersActionPerformed(evt);
            }
        });

        btnViewPT.setBackground(new java.awt.Color(27, 27, 27));
        btnViewPT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnViewPT.setForeground(new java.awt.Color(255, 255, 255));
        btnViewPT.setText("View Personal Trainers");
        btnViewPT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnViewPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPTActionPerformed(evt);
            }
        });

        btnViewGyms.setBackground(new java.awt.Color(27, 27, 27));
        btnViewGyms.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnViewGyms.setForeground(new java.awt.Color(255, 255, 255));
        btnViewGyms.setText("View Gyms");
        btnViewGyms.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnViewGyms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewGymsActionPerformed(evt);
            }
        });

        btnViewActivities.setBackground(new java.awt.Color(27, 27, 27));
        btnViewActivities.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnViewActivities.setForeground(new java.awt.Color(255, 255, 255));
        btnViewActivities.setText("View Activities");
        btnViewActivities.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnViewActivities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActivitiesActionPerformed(evt);
            }
        });

        btnViewWorkouts.setBackground(new java.awt.Color(27, 27, 27));
        btnViewWorkouts.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnViewWorkouts.setForeground(new java.awt.Color(255, 255, 255));
        btnViewWorkouts.setText("View Member's Workouts");
        btnViewWorkouts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnViewWorkouts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewWorkoutsActionPerformed(evt);
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewMembers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 60, Short.MAX_VALUE))
                            .addComponent(btnViewPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewGyms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewActivities, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewWorkouts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(btnViewMembers)
                .addGap(18, 18, 18)
                .addComponent(btnViewPT)
                .addGap(18, 18, 18)
                .addComponent(btnViewGyms)
                .addGap(18, 18, 18)
                .addComponent(btnViewActivities)
                .addGap(18, 18, 18)
                .addComponent(btnViewWorkouts)
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
     * A method used to open the AdminView JFrame
     * The variable viewWhich is also declared as 1 which tells the AdminViewJframe that the user wants to view all the Members in tblMembers
     * @param evt 
     */
    
    private void btnViewMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMembersActionPerformed
        try 
        {
            viewWhich = 1;
            this.dispose();
            AdminView view = new AdminView();
            view.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnViewMembersActionPerformed

    /**
     * A method used to open the AdminView JFrame
     * The variable viewWhich is also declared as 2 which tells the AdminViewJframe that the user wants to view all the gyms in tblGyms
     * @param evt 
     */
    
    private void btnViewGymsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewGymsActionPerformed
        try 
        {
            viewWhich = 3;
            this.dispose();
            AdminView view = new AdminView();
            view.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnViewGymsActionPerformed

    /**
     * A method used to open the AdminView JFrame
     * The variable viewWhich is also declared as 3 which tells the AdminViewJframe that the user wants to view all the personal trainers in tblPersonalTrainers
     * @param evt 
     */
    
    private void btnViewPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPTActionPerformed
        try 
        {
            viewWhich = 2;
            this.dispose();
            AdminView view = new AdminView();
            view.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnViewPTActionPerformed

    /**
     * A method used to open the AdminView JFrame
     * The variable viewWhich is also declared as 4 which tells the AdminViewJframe that the user wants to view all the activities in tblActivities
     * @param evt 
     */
    private void btnViewActivitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActivitiesActionPerformed
        try 
        {
            viewWhich = 4;
            this.dispose();
            AdminView view = new AdminView();
            view.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnViewActivitiesActionPerformed

    /**
     * A method used to open the AdminView JFrame
     * The variable viewWhich is also declared as 5 which tells the AdminViewJframe that the user wants to view all the exercises in tblExercises
     * @param evt 
     */
    
    private void btnViewWorkoutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewWorkoutsActionPerformed
        try 
        {
            viewWhich = 5;
            this.dispose();
            AdminView view = new AdminView();
            view.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnViewWorkoutsActionPerformed

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
     * A method used to tell the user how to use the specific JFrame
     * @param evt 
     */
    
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        JOptionPane.showMessageDialog(null, "Click the button showing what you would like to view", "Help", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(AdminViewWhich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewWhich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewWhich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewWhich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewWhich().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnViewActivities;
    private javax.swing.JButton btnViewGyms;
    private javax.swing.JButton btnViewMembers;
    private javax.swing.JButton btnViewPT;
    private javax.swing.JButton btnViewWorkouts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
