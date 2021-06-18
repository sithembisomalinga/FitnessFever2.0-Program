package JFrames;

import Classes.activities;
import Classes.dataValidation;
import Classes.databaseManager;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * A class used to either insert a new record into tblActivities or update a current record in tblActivities
 * @author Mr S Malinga(218021100)
 */

public class AdminInsertOrUpdateActivity extends javax.swing.JFrame {

    /**
     * Creates new form AdminInsertActivity
     */
    
    public AdminInsertOrUpdateActivity() throws SQLException 
    {
        initComponents();
        insertOrUpdate();

    }

    /**
     * The instantiation of the dataValidation and databaseManager classes
     */
    dataValidation dv = new dataValidation();
    databaseManager dm = new databaseManager();
    
    /**
     * A variable to see which record must be updated
     * The variable value will be entered in a JTextField in the previous Frame that was open
     */
    
    int which = AdminUpdateWhichActivity.whichActivity;

    private boolean update = false;
    private boolean insert = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        txtStartTime = new javax.swing.JTextField();
        txtGymID = new javax.swing.JTextField();
        cBoxMon = new javax.swing.JCheckBox();
        cBoxThur = new javax.swing.JCheckBox();
        cBoxTues = new javax.swing.JCheckBox();
        cBoxWed = new javax.swing.JCheckBox();
        cBoxFri = new javax.swing.JCheckBox();
        cBoxSat = new javax.swing.JCheckBox();
        cBoxSun = new javax.swing.JCheckBox();
        btnHelp = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fitness Fever");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Start Time:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fitness Fever");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Duration:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Start Time:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gym ID:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Days:");

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

        txtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtDuration.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtStartTime.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtStartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartTimeActionPerformed(evt);
            }
        });

        txtGymID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtGymID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGymIDActionPerformed(evt);
            }
        });

        cBoxMon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cBoxMon.setForeground(new java.awt.Color(255, 255, 255));
        cBoxMon.setText("Monday");

        cBoxThur.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cBoxThur.setForeground(new java.awt.Color(255, 255, 255));
        cBoxThur.setText("Thursday");

        cBoxTues.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cBoxTues.setForeground(new java.awt.Color(255, 255, 255));
        cBoxTues.setText("Tuesday");

        cBoxWed.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cBoxWed.setForeground(new java.awt.Color(255, 255, 255));
        cBoxWed.setText("Wednesday");

        cBoxFri.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cBoxFri.setForeground(new java.awt.Color(255, 255, 255));
        cBoxFri.setText("Friday");

        cBoxSat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cBoxSat.setForeground(new java.awt.Color(255, 255, 255));
        cBoxSat.setText("Saturday");

        cBoxSun.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cBoxSun.setForeground(new java.awt.Color(255, 255, 255));
        cBoxSun.setText("Sunday");

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

        btnEnter.setBackground(new java.awt.Color(0, 0, 0));
        btnEnter.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("Enter");
        btnEnter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
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
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtName)
                            .addComponent(txtDuration, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtStartTime, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGymID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cBoxSun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cBoxFri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cBoxWed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cBoxMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cBoxTues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cBoxThur, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(cBoxSat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtGymID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxMon)
                    .addComponent(cBoxTues)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBoxThur)
                    .addComponent(cBoxWed, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBoxSat)
                    .addComponent(cBoxFri, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBoxSun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnHelp))
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtStartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartTimeActionPerformed

    private void txtGymIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGymIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGymIDActionPerformed

    /**
     * A method used to see whether an update or insert query should be run and runs either of the queries
     * @param evt 
     */
    
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        if (update == true) 
        {
            update();
        }
        if (insert == true) 
        {
            insert();
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    /**
     * A method used to see whether the previous JFrames was from the GymMainMenu or from AdminMainMenu and takes the user back to that JFrame
     * @param evt 
     */
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (GymMainMenu.gym == false) 
        {
            this.dispose();
            AdminMainMenu main = new AdminMainMenu();
            main.setVisible(true);
        } 
        else 
        {
            this.dispose();
            GymMainMenu main = new GymMainMenu();
            main.setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * A method used to tell the user how to use the specific JFrame
     * @param evt 
     */
    
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        JOptionPane.showMessageDialog(null, "Enter the name of the activity.\nEnter the duration of the activity in minutes.\nEnter the starting time of the activity (hh:mm).\nEnter the ID of the gym that offers that exercise.\nChoose the days that the activity is offered at that gym.\nPress enter to record the updates!", "Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHelpActionPerformed

    /**
     * A method used to validate the data entered in the various JTextField and if all the data is correct the a new activity will be entered into tblActivities
     */
    
    private void insert()
    {
        try {
                if (dv.formatCheckNames(txtName) == true && dv.formatCheckNumbers(txtDuration) && dv.checkTimeFormat(txtStartTime)) 
                {
                    if (dm.checkGymID(Integer.parseInt(txtGymID.getText())) == false) 
                    {
                        JOptionPane.showMessageDialog(null, "The gym ID does not exist. Please try again.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                        txtGymID.setBackground(Color.red);
                    } 
                    else 
                    {
                        dm.insertActivities(txtName.getText(), Integer.parseInt(txtDuration.getText()), encodeDays(), txtStartTime.getText(), Integer.parseInt(txtGymID.getText()));
                        
                        if (GymMainMenu.gym == false) 
                        {
                            this.dispose();
                            AdminMainMenu main = new AdminMainMenu();
                            main.setVisible(true);
                        } 
                        else 
                        {
                            this.dispose();
                            GymMainMenu main = new GymMainMenu();
                            main.setVisible(true);
                        }
                    }
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "You have entered an incorrect data type into one of the fields. Try again!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }
    
    /**
     * A method used to validate the data entered in the various JTextField and if all the data is correct the an old activity will be updated in tblActivities
     */
    private void update()
    {
        try 
        {
                if (dv.formatCheckNames(txtName) == true && dv.formatCheckNumbers(txtDuration) && dv.checkTimeFormat(txtStartTime)) 
                {
                    if (dm.checkGymID(Integer.parseInt(txtGymID.getText())) == false) 
                    {
                        JOptionPane.showMessageDialog(null, "The gym ID does not exist. Please try again.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                        txtGymID.setBackground(Color.red);
                    } 
                    else 
                    {
                        dm.updateActivities(which, txtName.getText(), Integer.parseInt(txtDuration.getText()), encodeDays(), txtStartTime.getText(), Integer.parseInt(txtGymID.getText()));
                        if (GymMainMenu.gym == false) 
                        {
                            this.dispose();
                            AdminMainMenu main = new AdminMainMenu();
                            main.setVisible(true);
                        } 
                        else 
                        {
                            this.dispose();
                            GymMainMenu main = new GymMainMenu();
                            main.setVisible(true);
                        }
                    }
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "You have entered an incorrect data type into one of the fields. Try again!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }
    
    /**
     * A method used to check whether the purpose of this JFrame is to insert or update data into the table tblActivities
     * If it is updated then the JTextFields will be filled in with the old data 
     * @throws SQLException 
     */
    
    private void insertOrUpdate() throws SQLException 
    {
        boolean temp = AdminInsert.insertUpdate;

        if (temp == false) 
        {
            activities activity = dm.searchActivities(which);

            txtName.setText(activity.getName());
            txtDuration.setText(activity.getDuration() + "");
            txtStartTime.setText(activity.getStartTime() + "");
            txtGymID.setText(activity.getGymID() + "");

            dm.days(activity.getDays(), cBoxMon, cBoxTues, cBoxWed, cBoxThur, cBoxFri, cBoxSat, cBoxSun);

            update = true;
        } 
        else 
        {
            insert = true;
        }
    }

    /**
     * A method used to return the first letters of each day that the activity is being offered 
     * It returns a value that is allowed by the database
     * @return 
     */
    
    public String encodeDays() {
        String temp = "";

        if (cBoxMon.isSelected()) {
            temp = temp + "M";
        }

        if (cBoxTues.isSelected()) {
            temp = temp + "T";
        }

        if (cBoxWed.isSelected()) {
            temp = temp + "W";
        }

        if (cBoxThur.isSelected()) {
            temp = temp + "t";
        }

        if (cBoxFri.isSelected()) {
            temp = temp + "F";
        }

        if (cBoxSat.isSelected()) {
            temp = temp + "S";
        }

        if (cBoxSun.isSelected()) {
            temp = temp + "s";
        }
        return temp;
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
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminInsertOrUpdateActivity().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminInsertOrUpdateActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnHelp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cBoxFri;
    private javax.swing.JCheckBox cBoxMon;
    private javax.swing.JCheckBox cBoxSat;
    private javax.swing.JCheckBox cBoxSun;
    private javax.swing.JCheckBox cBoxThur;
    private javax.swing.JCheckBox cBoxTues;
    private javax.swing.JCheckBox cBoxWed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtGymID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStartTime;
    // End of variables declaration//GEN-END:variables
}
