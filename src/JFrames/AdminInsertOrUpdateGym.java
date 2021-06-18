package JFrames;

import Classes.dataValidation;
import Classes.databaseManager;
import Classes.gyms;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * A class used to either update or insert a gym record in tblGyms
 * @author Mr S Malinga(218021100)
 */

public class AdminInsertOrUpdateGym extends javax.swing.JFrame {

    /**
     * Creates new form AdminInsertGym
     * @throws java.sql.SQLException
     */
    public AdminInsertOrUpdateGym() throws SQLException 
    {
        initComponents();
        insertOrUpdate();
    }

    /**
     * The instantiation of the classes databaseManager and dataValidation
     */
    databaseManager dm = new databaseManager();
    dataValidation dv = new dataValidation();

    private boolean update = false;
    private boolean insert = false;

    /**
     * A variable to see which record must be updated
     * The variable value will be entered in a JTextField in the previous Frame that was open
     */
    
    int which = AdminUpdateWhichGym.whichGym;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblGymName = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        txtGymName = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        lblLocation1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLocation2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnShowPassword = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fitness Fever");

        lblGymName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblGymName.setForeground(new java.awt.Color(255, 255, 255));
        lblGymName.setText("Gym Name:");

        lblLocation.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblLocation.setText("Gym Location:");

        txtGymName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtLocation.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

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

        lblLocation1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblLocation1.setForeground(new java.awt.Color(255, 255, 255));
        lblLocation1.setText("Gym Email:");

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblLocation2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblLocation2.setForeground(new java.awt.Color(255, 255, 255));
        lblLocation2.setText("Gym Password:");

        txtPassword.setEditable(false);
        txtPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnShowPassword.setBackground(new java.awt.Color(255, 255, 255));
        btnShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/show_password_16px.png"))); // NOI18N
        btnShowPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPasswordActionPerformed(evt);
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblLocation1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLocation2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblGymName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGymName)
                            .addComponent(txtLocation)
                            .addComponent(txtEmail)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGymName)
                    .addComponent(txtGymName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLocation2)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnter)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnHelp))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
     * A method used to either hide or show the password
     * @param evt 
     */
    
    private void btnShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPasswordActionPerformed
        if (btnShowPassword.isSelected() == true) 
        {
            txtPassword.setEchoChar((char) 0);
        }
        if (btnShowPassword.isSelected() == false) 
        {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_btnShowPasswordActionPerformed

    /**
     * A method used to tell the user how to use the specific JFrame
     * @param evt 
     */
    
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        JOptionPane.showMessageDialog(null, "Enter the name of the gym.\nEnter the location, suburb, of the gym.\nEnter the email address of the gym.\nEnter a password for the gym.\nPress enter to record the updates!", "Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHelpActionPerformed

    /**
     * A method used to validate the data entered in the various JTextField and if all the data is correct the a new gym will be entered into tblGyms
     */
    
    private void insert()
    {
        try {
                if (dm.checkEmail(txtEmail.getText())) 
                {
                    JOptionPane.showMessageDialog(null, "This email has already been used!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    txtEmail.setBackground(Color.red);
                } 
                else 
                {
                    if (dv.formatCheckNames(txtGymName) == true && dv.formatCheckNames(txtLocation) == true && dv.checkEmail(txtEmail)) 
                    {
                        dm.insertGym(txtGymName.getText(), txtLocation.getText(), txtEmail.getText(), txtPassword.getText());

                        this.dispose();
                        AdminMainMenu main = new AdminMainMenu();
                        main.setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "You have entered an incorrect data type into one of the fields. Try again!", "ERROR!", JOptionPane.ERROR_MESSAGE);

                    }
                }
            } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }
    
    /**
     * A method used to validate the data entered in the various JTextField and if all the data is correct the an old gym will be updated in tblGyms
     */
    
    private void update()
    {
        try {
                if (dv.formatCheckNames(txtGymName) == true && dv.formatCheckNames(txtLocation) == true && dv.checkEmail(txtEmail)) 
                {
                    dm.updateGyms(which, txtGymName.getText(), txtLocation.getText(), txtEmail.getText(), txtPassword.getText());

                    this.dispose();
                    AdminMainMenu main = new AdminMainMenu();
                    main.setVisible(true);
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
     * A method used to check whether the purpose of this JFrame is to insert or update data into the table tblGyms
     * If it is updated then the JTextFields will be filled in with the old data 
     * @throws SQLException 
     */
    
    private void insertOrUpdate() throws SQLException 
    {
        boolean temp = AdminInsert.insertUpdate;

        if (temp == false) 
        {
            gyms gym = dm.searchGyms(which);

            txtGymName.setText(gym.getName());
            txtLocation.setText(gym.getLocation() + "");
            txtEmail.setText(gym.getEmail() + "");
            txtPassword.setText(dm.getPassword(gym.getEmail()));

            update = true;
        } 
        else 
        {
            insert = true;
            txtPassword.setEditable(true);
        }
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
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminInsertOrUpdateGym().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminInsertOrUpdateGym.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnHelp;
    private javax.swing.JToggleButton btnShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGymName;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblLocation1;
    private javax.swing.JLabel lblLocation2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGymName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
