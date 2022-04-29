/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Lawyer;

import business.EcoSystem;
import business.Encounter.EncounterLawyer;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.LawyerWorkRequest;
import business.WorkQueue.CaseReporterWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author dax98
 */
public class LawyerEncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LawyerEncounterJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    LawyerWorkRequest request;
    UserAccount userAccount;
    Network network;
    Organization organization;
    public LawyerEncounterJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount userAccount,Network network, Organization organization, LawyerWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        this.organization=organization;
        this.request=request;
        populateName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounterDetails = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblEncounterNo = new javax.swing.JLabel();
        txtEncounterNo = new javax.swing.JTextField();
        lblMinutes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaMinutes = new javax.swing.JTextArea();
        txtName = new javax.swing.JTextField();

        lblHeader.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(51, 102, 255));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Encounters");

        lblName.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name");

        tblEncounterDetails.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Encounter No.", "Minutes of Encounter"
                }
        ));
        jScrollPane1.setViewportView(tblEncounterDetails);

        btnUpdate.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblEncounterNo.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblEncounterNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEncounterNo.setText("Encounter no");

        lblMinutes.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblMinutes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMinutes.setText("Minutes of Encounter");

        txtAreaMinutes.setColumns(20);
        txtAreaMinutes.setRows(5);
        jScrollPane2.setViewportView(txtAreaMinutes);

        txtName.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblMinutes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(39, 39, 39)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(102, 102, 102)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblEncounterNo))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtEncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnBack)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(325, 325, 325)
                                .addComponent(btnUpdate)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addGap(61, 61, 61)
                                                .addComponent(btnUpdate)
                                                .addGap(206, 206, 206))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblEncounterNo)
                                                        .addComponent(txtEncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(281, 281, 281))))
        );
    }// </editor-fold>

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {
        btnUpdate.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {
        btnUpdate.setForeground(Color.black);        // TODO add your handling code here:
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {

        if(txtEncounterNo.getText().equalsIgnoreCase("") && txtAreaMinutes.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill the necessary fields");
        }
        else{
            EncounterLawyer encounterLawyer =new EncounterLawyer();
            encounterLawyer.setEncounter(txtEncounterNo.getText());
            encounterLawyer.setMinutes(txtAreaMinutes.getText());

            request.getLawyerEncounter().add(encounterLawyer);
            populateName();
            txtEncounterNo.setText("");
            txtAreaMinutes.setText("");

            /*String FromEmail="sexualawareness.help@gmail.com";
            String FromEmailPass="Fin@lProject21";
            String Subject = "Sign up successful";

            Properties properties=new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            Session session=Session.getDefaultInstance(properties, new javax.mail.Authenticator(){

                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(FromEmail,FromEmailPass);
                }
            });

            try
            {
                Message msg=new MimeMessage(session);
                msg.setFrom(new InternetAddress(FromEmail));
                msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(request.CaseReporterWorkRequest().getEmail()));
                msg.setSubject("Invitation for a session with Lawyer, " + request.CaseReporterWorkRequest().getNameofvictim() );
                msg.setText("Dear "+ request.CaseReporterWorkRequest().getNameofvictim()+"\n"+"I am here to help you. Please schedule an appointment through the following link for the next encounter."+"\n"+"calendly.link"+"\n"+"Best,"+"\n"+"Andy Rubella");
                Transport.send(msg);
            }catch(Exception e)
            {
                System.out.println(""+e);
            } */

        }

        // TODO add your handling code here:
    }

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {
        btnBack.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {
        btnBack.setForeground(Color.black);        // TODO add your handling code here:
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LawyerJPanel sysAdminwjp = (LawyerJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEncounterNo;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMinutes;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblEncounterDetails;
    private javax.swing.JTextArea txtAreaMinutes;
    private javax.swing.JTextField txtEncounterNo;
    private javax.swing.JTextField txtName;
    // End of variables declaration

    private void populateName() {

        txtName.setText(request.getCaseReporterWorkRequest().getChildName());


        DefaultTableModel model= (DefaultTableModel) tblEncounterDetails.getModel();
        Object[] row=new Object[2];
        model.setRowCount(0);

        for (EncounterLawyer l: request.getLawyerEncounter()){
            row[0] = l.getEncounter();
            row[1] = l.getMinutes();
            model.addRow(row);
        }
    }

}

