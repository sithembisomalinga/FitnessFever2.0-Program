package JFrames;

import Classes.dataValidation;
import Classes.databaseManager;
import Classes.personalTrainers;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * A class used to either update or insert a Personal Trainer
 * @author Mr S Malinga(218021100)
 */
public class AdminInsertOrUpdatePT extends javax.swing.JFrame {

    /**
     * Creates new form AdminInsertPT
     */
    public AdminInsertOrUpdatePT() throws SQLException {
        initComponents();
        insertOrUpdate();
    }

    /**
     * A variable to see which record must be updated
     * The variable value will be entered in a JTextField in the previous Frame that was open
     */
    
    int which = AdminUpdateWhichPT.whichPT;
    
    /**
     * The instantiation of the classes databaseManager and dataValidation
     */
    
    databaseManager dm = new databaseManager();
    dataValidation dv = new dataValidation();

    private boolean update = false;
    private boolean insert = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtCellNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGymID = new javax.swing.JTextField();
        btnShowPassword = new javax.swing.JToggleButton();
        btnHelp = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

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

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Surname:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cellphone Number:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email Address:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gym ID:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");

        txtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtSurname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtCellNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtGymID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnShowPassword.setBackground(new java.awt.Color(255, 255, 255));
        btnShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/show_password_16px.png"))); // NOI18N
        btnShowPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPasswordActionPerformed(evt);
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

        txtPassword.setEditable(false);
        txtPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtGymID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCellNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSurname)))
                    .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGymID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnter)
                .addGap(18, 18, 18)
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
        JOptionPane.showMessageDialog(null, "Enter the name of the personal trainer.\nEnter the surname of the personal trainer.\nEnter the cellphone number of the personal trainer.\nEnter the password of the member.\nPress enter to record the updates!", "Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHelpActionPerformed

    /**
     * A method used to validate the data entered in the various JTextField and if all the data is correct the a new personal trainer will be entered into tblPersonalTrainers
     */
    
    private void insert()
    {
        try 
        {
            if (dm.checkEmail(txtEmail.getText())) 
            {
                JOptionPane.showMessageDialog(null, "This email has already been used!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                txtEmail.setForeground(Color.red);
            }
            if (dm.checkGymID(Integer.parseInt(txtGymID.getText())) == false) 
            {
                JOptionPane.showMessageDialog(null, "The gym ID does not exist. Please try again.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                txtGymID.setBackground(Color.red);
            } 
            else
            {
                if (dv.formatCheckNames(txtName) == true && dv.formatCheckNames(txtSurname) && dv.validateCell(txtCellNumber) == true && dv.checkEmail(txtEmail)) 
                {
                    dm.insertPersonalTrainer(txtName.getText(), txtSurname.getText(), txtCellNumber.getText(), txtEmail.getText(), Integer.parseInt(txtGymID.getText()), txtPassword.getText());
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
     * A method used to validate the data entered in the various JTextField and if all the data is correct the an old personal trainer will be updated in tblPersonalTrainers
     */
    
    private void update()
    {
        try 
        {
                if (dv.formatCheckNames(txtName) == true && dv.formatCheckNames(txtSurname) && dv.validateCell(txtCellNumber) == true && dv.checkEmail(txtEmail)) 
                {
                    if (dm.checkGymID(Integer.parseInt(txtGymID.getText())) == false)
                    {
                        dm.updatePersonalTrainers(which, txtName.getText(), txtSurname.getText(), txtCellNumber.getText(), txtEmail.getText(), Integer.parseInt(txtGymID.getText()), txtPassword.getText());
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "The gym ID does not exist. Please try again.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
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
     * A method used to check whether the purpose of this JFrame is to insert or update data into the table tblMembers
     * If it is updated then the JTextFields will be filled in with the old data 
     * @throws SQLException 
     */
    
    private void insertOrUpdate() throws SQLException 
    {
        boolean temp = AdminInsert.insertUpdate;

        if (temp == false) 
        {
            personalTrainers pt = dm.searchPersonalTrainers(which);

            txtName.setText(pt.getName());
            txtSurname.setText(pt.getSurname());
            txtCellNumber.setText(pt.getCellNumber());
            txtEmail.setText(pt.getEmail());
            txtGymID.setText(pt.getGymID() + "");
            txtPassword.setText(dm.getPassword(pt.getEmail()));

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
            java.util.logging.Logger.getLogger(AdminInsertOrUpdatePT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdatePT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdatePT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdatePT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminInsertOrUpdatePT().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminInsertOrUpdatePT.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCellNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGymID;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
