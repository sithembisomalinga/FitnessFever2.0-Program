package JFrames;

import Classes.dataValidation;
import Classes.databaseManager;
import Classes.members;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * A class used to either update or insert data in tblMembers
 * @author Mr S Malinga(218021100)
 */

public class AdminInsertOrUpdateMember extends javax.swing.JFrame {

    /**
     * Creates new form AdminInsertMember
     */
    
    public AdminInsertOrUpdateMember() throws SQLException, ParseException 
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
    
    int which = AdminUpdateWhichMember.whichMember;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblDoB = new javax.swing.JLabel();
        lblCell = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblGymID = new javax.swing.JLabel();
        lblPTID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtCellNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGymID = new javax.swing.JTextField();
        txtPTID = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnShowPassword = new javax.swing.JToggleButton();
        btnHelp = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        dateChooserDoB = new com.toedter.calendar.JDateChooser();

        jLabel10.setText("jLabel10");

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

        lblName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");

        lblSurname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSurname.setForeground(new java.awt.Color(255, 255, 255));
        lblSurname.setText("Surname:");

        lblDoB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDoB.setForeground(new java.awt.Color(255, 255, 255));
        lblDoB.setText("Date of Birth:");

        lblCell.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCell.setForeground(new java.awt.Color(255, 255, 255));
        lblCell.setText("Cellphone Number:");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email Address:");

        lblGymID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblGymID.setForeground(new java.awt.Color(255, 255, 255));
        lblGymID.setText("Gym ID:");

        lblPTID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPTID.setForeground(new java.awt.Color(255, 255, 255));
        lblPTID.setText("Personal Trainer ID:");

        txtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtSurname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtCellNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtGymID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtPTID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

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

        dateChooserDoB.setDateFormatString("yyyy/MM/dd");
        dateChooserDoB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dateChooserDoB.setMaxSelectableDate(maxDate());
        dateChooserDoB.setMinSelectableDate(new java.util.Date(-1420073917000L));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGymID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPTID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtSurname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCellNumber)
                            .addComponent(txtEmail)
                            .addComponent(txtGymID)
                            .addComponent(txtPTID)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(dateChooserDoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnEnter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoB)
                    .addComponent(dateChooserDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell)
                    .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGymID)
                    .addComponent(txtGymID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPTID)
                    .addComponent(txtPTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPassword)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHelp)
                    .addComponent(btnBack))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        JOptionPane.showMessageDialog(null, "Enter the name of the member.\nEnter the surname of the member.\nEnter the date of birth of the member.\nEnter the cellphone number of the member.\nEnter email address of the member.\nEnter the gymID of the member.\nEnter the personal trainer of the member.\nEnter the password of the member.\nPress enter to record the updates!", "Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHelpActionPerformed

    /**
     * A method used to check whether the purpose of this JFrame is to insert or update data into the table tblMembers
     * If it is updated then the JTextFields will be filled in with the old data 
     * @throws SQLException 
     */
    
    private void insertOrUpdate() throws SQLException, ParseException 
    {
        boolean temp = false;
        if (Login.whichinsert == 1) 
        {
            temp = AdminInsert.insertUpdate;
        }
        if (Login.whichinsert == 2) 
        {
            temp = GymInsert.insertUpdate;
        }

        if (temp == false) 
        {
            members member = dm.searchMember(which);

            Date date = new SimpleDateFormat("yyyy/MM/dd").parse(member.getDateOfBirth());

            txtName.setText(member.getName());
            txtSurname.setText(member.getSurname());
            dateChooserDoB.setDate(date);
            txtCellNumber.setText(member.getCellNumber());
            txtEmail.setText(member.getEmail());
            txtGymID.setText(member.getGymID() + "");
            txtPTID.setText(member.getPersonalTrainerID() + "");
            txtPassword.setText(dm.getPassword(member.getEmail()));

            update = true;
        } 
        else 
        {
            insert = true;
            txtPassword.setEditable(true);
        }
    }

    /**
     * A method used to validate the data entered in the various JTextField and if all the data is correct the an old member will be updated in tblMembers
     */
    
    private void update() 
    {
        try 
        {
                if (dm.checkGymID(Integer.parseInt(txtGymID.getText())) == false || dm.checkPersonalTrainerID(Integer.parseInt(txtPTID.getText())) == false) 
                {
                    JOptionPane.showMessageDialog(null, "The personal trainer ID or gym ID does not exist. Please try again.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    txtGymID.setBackground(Color.red);
                    txtPTID.setBackground(Color.red);
                }
                else if (dv.formatCheckNames(txtName) == true && dv.formatCheckNames(txtSurname) == true && dv.validateCell(txtCellNumber) == true && dv.validateEmail(txtEmail))
                {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
                    String dateOfBirth = sdf.format(dateChooserDoB.getDate());

                    try 
                    {
                        dm.updateMembers(which, txtName.getText(), txtSurname.getText(), dateOfBirth, txtCellNumber.getText(), txtEmail.getText(), Integer.parseInt(txtGymID.getText()), Integer.parseInt(txtPTID.getText()), txtPassword.getText());
                    } 
                    catch (ParseException ex)
                    {
                        System.out.println(ex);
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
                    JOptionPane.showMessageDialog(null, "You entered an incorrect data type!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
                
            } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }

    }
    
    /**
     * A method used to validate the data entered in the various JTextField and if all the data is correct the a new member will be entered into tblMembers
     */
    
    private void insert()
    {
        try {
                if (dm.checkEmail(txtEmail.getText()))
                {
                    JOptionPane.showMessageDialog(null, "This email has already been used!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    txtEmail.setForeground(Color.red);
                }
                else if (dm.checkGymID(Integer.parseInt(txtGymID.getText())) == false || dm.checkPersonalTrainerID(Integer.parseInt(txtPTID.getText())) == false) 
                {
                    JOptionPane.showMessageDialog(null, "The personal trainer ID or gym ID does not exist. Please try again.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    txtGymID.setBackground(Color.red);
                    txtPTID.setBackground(Color.red);
                }
                else if (dv.formatCheckNames(txtName) == true && dv.formatCheckNames(txtSurname) == true && dv.validateCell(txtCellNumber) == true && dv.validateEmail(txtEmail) == true)
                {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
                    String dateOfBirth = sdf.format(dateChooserDoB.getDate());

                    try 
                    {
                        dm.insertMember(txtName.getText(), txtSurname.getText(), dateOfBirth, txtCellNumber.getText(), txtEmail.getText(), txtPassword.getText(), Integer.parseInt(txtGymID.getText()), Integer.parseInt(txtPTID.getText()));
                    } 
                    catch (ParseException ex) 
                    {
                        System.out.println("Error: " + ex);
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
                    JOptionPane.showMessageDialog(null, "You entered an incorrect data type!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
                
            } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }

    /**
     * A method that returns today's date and is used by the JDateChooser to stop a user from choosing a date in the future
     * @return 
     */
    
    private java.util.Date maxDate() 
    {
        Calendar cal = Calendar.getInstance();

        return cal.getTime();
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
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInsertOrUpdateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminInsertOrUpdateMember().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminInsertOrUpdateMember.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(AdminInsertOrUpdateMember.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnHelp;
    private javax.swing.JToggleButton btnShowPassword;
    private com.toedter.calendar.JDateChooser dateChooserDoB;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCell;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGymID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPTID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JTextField txtCellNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGymID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPTID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
