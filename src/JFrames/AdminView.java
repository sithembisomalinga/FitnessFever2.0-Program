package JFrames;

import Classes.databaseManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * A class used to view the different data
 * @author Mr S Malinga(218021100)
 */

public class AdminView extends javax.swing.JFrame {

    /**
     * Creates new form AdminViewMembers
     */
    public AdminView() throws SQLException {
        initComponents();
        
        //A method used to see what the user wanted to view
        displayWhich();
        
        sort();
    }

    /**
     * The instantiation of the databaseManager class
     */
    databaseManager dm = new databaseManager();

    /**
     * The instantiation of a defaultTableModel
     */
    DefaultTableModel dtm;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fitness Fever");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fitness Fever");

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

        table.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHelp)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * A method used to tell the user how to use the specific JFrame
     * @param evt 
     */
    
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        JOptionPane.showMessageDialog(null, "If you want to change the order in which it is displayed press the column header that you want it ordered by.\nIt will be in descending order.\nWhen viewing activities the dyas are formatted in a way so that the first letter of each day is displayed and if there are 2 days with the same letter the second day that starts with that letter is a lower case letter", "Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHelpActionPerformed

    /**
     * A method used to return to the main menu JFrame of the corresponding user type and closes the current JFrame
     * @param evt 
     */
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (GymMainMenu.gym == true) 
        {
            this.dispose();
            GymMainMenu main = new GymMainMenu();
            main.setVisible(true);
        } 
        else if (MemberMainMenu.member == true) 
        {
            this.dispose();
            MemberMainMenu main = new MemberMainMenu();
            main.setVisible(true);
        } 
        else if (PTMainMenu.PT == true) 
        {
            this.dispose();
            PTMainMenu main = new PTMainMenu();
            main.setVisible(true);
        } 
        else 
        {
            this.dispose();
            AdminMainMenu main = new AdminMainMenu();
            main.setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * A method used to check what the viewer has requested to view and displays it in the table
     * @throws SQLException 
     */
    private void displayWhich() throws SQLException
    {
        if (AdminViewWhich.viewWhich == 1) 
        {
            dm.display(table, "SELECT * FROM tblMembers");
        }
        if (AdminViewWhich.viewWhich == 2) 
        {
            dm.display(table, "SELECT * FROM tblPersonalTrainers");
        }
        if (AdminViewWhich.viewWhich == 3) 
        {
            dm.display(table, "SELECT * FROM tblGyms");
        }
        if (AdminViewWhich.viewWhich == 4) 
        {
            dm.display(table, "SELECT * FROM tblActivities");
        }
        if (AdminViewWhich.viewWhich == 5) 
        {
            dm.display(table, "SELECT * FROM tblExercises");
        }
        if (AdminViewWhich.viewWhich == 6) 
        {
            dm.display(table, "SELECT * FROM tblMembers WHERE GymID = " + Login.gymID);
        }
        if (AdminViewWhich.viewWhich == 7) 
        {
            dm.display(table, "SELECT * FROM tblPersonalTrainers WHERE GymID = " + Login.gymID);
        }
        if (AdminViewWhich.viewWhich == 8) 
        {
            dm.display(table, "SELECT * FROM tblActivities WHERE GymID = " + Login.gymID);
        }
        if (AdminViewWhich.viewWhich == 9) 
        {
            dm.display(table, "SELECT * FROM tblExercises WHERE GymID = " + Login.gymID);
        }
        if (AdminViewWhich.viewWhich == 11) 
        {
            dm.display(table, "SELECT * FROM tblExercises WHERE MemberID = " + Login.memberID);
        }
        if (AdminViewWhich.viewWhich == 10) 
        {
            dm.display(table, "SELECT * FROM tblActivities WHERE GymID = " + dm.getID("SELECT GymID FROM tblMembers WHERE MemberID = " + Login.memberID, "GymID"));
        }
        if (AdminViewWhich.viewWhich == 12) 
        {
            dm.display(table, "SELECT * FROM tblMembers WHERE MemberID = " + Login.memberID);
        }
        if (AdminViewWhich.viewWhich == 13) 
        {
            dm.display(table, "SELECT * FROM tblExercises WHERE MemberID = " + dm.getID("SELECT MemberID FROM tblMembers WHERE PersonalTrainerID = " + Login.PTID, "MemberID"));
        }
        if (AdminViewWhich.viewWhich == 14) 
        {
            dm.display(table, "SELECT * FROM tblMembers WHERE PersonalTrainerID = " + Login.PTID);
        }
    }
    
    /**
     * A method used to allow the user to order the data as they want
     */
    private void sort()
    {
        dtm = (DefaultTableModel) table.getModel();
        
        TableRowSorter<DefaultTableModel> sort = new TableRowSorter<DefaultTableModel>(dtm);
        table.setRowSorter(sort);
    }
    
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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
