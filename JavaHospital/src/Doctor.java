
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ashis
 */
public class Doctor extends javax.swing.JFrame {
    public int flag=0;

    /**
     * Creates new form Doctor
     */
    public Doctor() {
        initComponents();
        LoadPatient();
    }
    
    public class Patient
    {
        String name;
        String RFV;
        String hospital;
        
        public Patient(String name, String RFV, String hospital)
        {
            this.name = name;
            this.RFV = RFV;
            this.hospital = hospital;
        }
        
        public String toString()
        {
            return name;
           
            
        }
        
    }
    
    
    public void LoadPatient()
    {
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalsystem", "root", "root");
            
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
           // statement.executeUpdate("insert into hospitalsystem.login" + "(role, username, password)" + "values ('"+role+"','"+username+"', '"+password+"')");
            //JOptionPane.showMessageDialog(null, "User successfully added!");
            
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement("SELECT * FROM hospitalsystem.patient");
            java.sql.ResultSet rs=preparedStmt.executeQuery();
            pNameTxt.removeAll();
          //pHospTxt.removeAll();
           //RFVTxt.removeAll();
            
            while(rs.next())
            {
                pNameTxt.addItem(new Patient(rs.getString(1),rs.getString(2),rs.getString(3)));
               //RFVTxt.addItem(new Patient(rs.getString(1),rs.getString(2),rs.getString(3)));
              //pHospTxt.addItem(new Patient(rs.getString(1),rs.getString(2),rs.getString(3)));
            }
            
            connection.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"please add data in correct format!");

    
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

        PatientVariablePane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RFV = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pulseRateTxt = new javax.swing.JTextField();
        oxyLvlTxt = new javax.swing.JTextField();
        diagnosisTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        pNameTxt = new javax.swing.JComboBox();
        hospTxt = new javax.swing.JTextField();
        RFVTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PatientVariablePane.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Checkup");

        patientTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientName", "Hospital", "RFV", "PulseRate", "OxygenLevel", "Diagnosis"
            }
        ));
        jScrollPane1.setViewportView(patientTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Hospital:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PatientName:");

        RFV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RFV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RFV.setText("RFV");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("PulseRate");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("OxygenLevel");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Diagnosis:");

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateBtn.setText("Update");

        viewBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PatientVariablePaneLayout = new javax.swing.GroupLayout(PatientVariablePane);
        PatientVariablePane.setLayout(PatientVariablePaneLayout);
        PatientVariablePaneLayout.setHorizontalGroup(
            PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientVariablePaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientVariablePaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RFV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(122, 122, 122)
                        .addGroup(PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pulseRateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(oxyLvlTxt)
                            .addComponent(diagnosisTxt))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientVariablePaneLayout.createSequentialGroup()
                        .addGroup(PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                            .addGroup(PatientVariablePaneLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addBtn)
                                .addGap(37, 37, 37)
                                .addComponent(updateBtn)
                                .addGap(46, 46, 46)
                                .addComponent(viewBtn)))
                        .addGap(67, 67, 67))))
            .addGroup(PatientVariablePaneLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PatientVariablePaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBtn, updateBtn, viewBtn});

        PatientVariablePaneLayout.setVerticalGroup(
            PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientVariablePaneLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBtn)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(RFV)
                .addGap(18, 18, 18)
                .addGroup(PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pulseRateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(oxyLvlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PatientVariablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(diagnosisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        PatientVariablePaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addBtn, updateBtn, viewBtn});

        PatientVariablePaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {diagnosisTxt, oxyLvlTxt, pulseRateTxt});

        pNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameTxtActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Signout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hospTxt)
                    .addComponent(RFVTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pNameTxt, 0, 379, Short.MAX_VALUE))
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(24, Short.MAX_VALUE)
                    .addComponent(PatientVariablePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(pNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hospTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RFVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(47, Short.MAX_VALUE)
                    .addComponent(PatientVariablePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameTxtActionPerformed

    public class Checkup{
        public static void CreateCheckup(String name, String RFV, String Hospital, String pulse, String oxyLvl, String diagnosis){
            try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalsystem", "root", "root");
            
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
           //tring query = "INSERT INTO hospitalsystem.patient (Name,Doctor,Hospital,Community,City,Date,Time,Gender,RFV) values(?,?,?,?,?,?,?,?,?)";
            String query = "INSERT * FROM hospitalsystem.doctor (PatientName,Hospital,RFV,PulseRate,OxygenLevel,Diagnosis) values(?,?,?,?,?,?)";
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1,name);
            preparedStmt.setString(2,RFV);
            preparedStmt.setString(3,Hospital);
            preparedStmt.setString(4,pulse);
            preparedStmt.setString(5,oxyLvl);
            preparedStmt.setString(6,diagnosis);
            System.out.println("connection ");
           

            preparedStmt.execute();
            System.out.println("connection open");
                        JOptionPane.showMessageDialog(null,"Details Added");

             connection.close();
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,"please add data !");
            
            

    
    }             
        }
    }
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
       //tring name = (String) pNameTxt.getSelectedItem();
        
        Patient p = (Patient) pNameTxt.getSelectedItem();
        
        String RFV = RFVTxt.getText();
        String Hospital = hospTxt.getText();
        String pulse = pulseRateTxt.getText();
        String oxyLvl = oxyLvlTxt.getText();
        String diagnosis = diagnosisTxt.getText();
        
        Checkup.CreateCheckup(p.name,RFV,Hospital,pulse,oxyLvl,diagnosis);
        
         pNameTxt.setSelectedItem("");
         RFVTxt.setText("");
         hospTxt.getText();
         pulseRateTxt.setText("");
         oxyLvlTxt.setText("");
         diagnosisTxt.setText("");
         
    }//GEN-LAST:event_addBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        String hospital = hospTxt.getText();
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalsystem", "root", "root");
            
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
          //  statement.executeUpdate("insert into hospitalsystem.login" + "(role, username, password)" + "values ('"+role+"','"+username+"', '"+password+"')");
            JOptionPane.showMessageDialog(null, "User successfully added!");
            java.sql.ResultSet rs=statement.executeQuery("SELECT * FROM hospitalsystem.patient");
           // patientTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"please add data in correct format!");

    
    }                                         
        
    }//GEN-LAST:event_viewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PatientVariablePane;
    private javax.swing.JLabel RFV;
    private javax.swing.JTextField RFVTxt;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField diagnosisTxt;
    private javax.swing.JTextField hospTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField oxyLvlTxt;
    private javax.swing.JComboBox pNameTxt;
    private javax.swing.JTable patientTable;
    private javax.swing.JTextField pulseRateTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
