/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;


import exception.ExceptionMetier;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metiers.Client;
import metiers.Prospect;
import metiers.Societe;
import utilitaire.CollectionClient;
import utilitaire.CollectionProspect;
import static utilitaire.CollectionSociete.ajouter;



public class Formulaire extends javax.swing.JFrame {
    
String choix;
Societe societe;

    //METHODES
     /**
      * Operation destruction redondance
      */

    private void instanceAccueil(){
            Accueil accueil = new Accueil();
            accueil.setVisible(true);
            this.dispose();
    }
    private  void formIneditable(){
                formResSocial.setEditable(false);   
                formNumRue.setEditable(false);
                formNomrue.setEditable(false);
                formCodePostal.setEditable(false);
                formVille.setEditable(false);
                formTelephone.setEditable(false);
                formMail.setEditable(false);
                formChiffreAffaire.setEditable(false);
                formNbEmploi.setEditable(false);
                formCommentaire.setEditable(false);
                boxInterest.setEditable(false);
    } 
    private void formulaireCommun(){
                formResSocial.setText(societe.getRaisonSociale());
                formNumRue.setText(societe.getNumeroRue());
                formNomrue.setText(societe.getNomRue());
                formCodePostal.setText(societe.getCodePostal());
                formVille.setText(societe.getVille());
                formTelephone.setText(societe.getTelephone());
                formMail.setText(societe.getMail());
    }
    private void modifierFormulaireCommun() throws ExceptionMetier{
                societe.setRaisonSociale(formResSocial.getText());
                societe.setNumeroRue(formNumRue.getText());
                societe.setNomRue(formNomrue.getText());
                societe.setCodePostal(formCodePostal.getText());
                societe.setVille(formVille.getText());
                societe.setTelephone(formTelephone.getText());
                societe.setMail(formMail.getText());
    }
    
    
     /**
     * Creer un nouveau formulaire
     */
    public Formulaire() {
        initComponents();
    }

    
    /**
     * Deuxieme constructeur de formlaire permettant de passer différents parametre depuis la page Accueil
     * @param choix est un flag permettant d'identifier si l'utilisateur a choisit d'ajouter, supprimer, modifier ou afficher
     * @param societe est un objet selectionné par l'utilisateur ou qu'il compte instancié
     */
    public Formulaire(String choix, Societe societe){
        initComponents();
        this.societe = societe;
        this.choix = choix;
        
            if(choix.equals("clientSupprimer")){
                titreFormulaire.setText("Formulaire de suppresion");
                lblChiffreAffaire.setText("chiffre d'affaire");              
                lblNbEmploi.setText("nombre d'emploi");
                lblInterest.setVisible(false);
                boxInterest.setVisible(false);
                
                formulaireCommun();
                formChiffreAffaire.setText(""+((Client) societe).getChiffreAffaire());                 
                formNbEmploi.setText(""+((Client) societe).getNbEmploye());
                formIneditable();
                      
            } else {
                if(choix.equals("prospectSupprimer")){
                lblNbEmploi.setVisible(false);
                formNbEmploi.setVisible(false);    
                    
                formulaireCommun();
                formChiffreAffaire.setText(""+((Prospect) societe).getDateProspection()); 
                formIneditable();

            }
    } 
    
    if(choix.equals("clientModifier")){
        
        titreFormulaire.setText("Formulaire de modification");
        lblChiffreAffaire.setText("chiffre d'affaire");              
        lblNbEmploi.setText("nombre d'emploi");
        lblInterest.setVisible(false);
        boxInterest.setVisible(false);
 
        formulaireCommun();
        formChiffreAffaire.setText(""+((Client) societe).getChiffreAffaire()); 
        formNbEmploi.setText(""+((Client) societe).getNbEmploye());

    } else {
        
        if(choix.equals("prospectModifier")){
       titreFormulaire.setText("Formulaire de modification");
        lblChiffreAffaire.setText("date de prospection");              
        lblNbEmploi.setVisible(false);
        formNbEmploi.setVisible(false);  
        formulaireCommun();
        formChiffreAffaire.setText(((Prospect) societe).getDateProspection()); 
        
        }
    }
    
    if(choix.equals("clientAjouter")){
        
        lblInterest.setVisible(false);
        boxInterest.setVisible(false);
        
        lblChiffreAffaire.setText("chiffre d'affaire");              
        lblNbEmploi.setText("nombre d'emploi");     
    } else{
        if(choix.equals("prospectAjouter")){
        lblNbEmploi.setVisible(false);
        formNbEmploi.setVisible(false);
        lblChiffreAffaire.setText("date de prospection");              
        lblNbEmploi.setText("intêret du prospect");

        }

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

        titreFormulaire = new javax.swing.JLabel();
        formResSocial = new javax.swing.JTextField();
        formNumRue = new javax.swing.JTextField();
        formNbEmploi = new javax.swing.JTextField();
        formTelephone = new javax.swing.JTextField();
        formChiffreAffaire = new javax.swing.JTextField();
        lblRaisonSociale = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblChiffreAffaire = new javax.swing.JLabel();
        lblNbEmploi = new javax.swing.JLabel();
        btnValiderForm = new javax.swing.JButton();
        btnRetourAccueil = new javax.swing.JButton();
        lblMail = new javax.swing.JLabel();
        formMail = new javax.swing.JTextField();
        lblNumRue = new javax.swing.JLabel();
        formNomrue = new javax.swing.JTextField();
        formCodePostal = new javax.swing.JTextField();
        formVille = new javax.swing.JTextField();
        lblNomRue = new javax.swing.JLabel();
        lblCodePostal = new javax.swing.JLabel();
        lblVille = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        formCommentaire = new javax.swing.JTextArea();
        lblCommentaire = new javax.swing.JLabel();
        boxInterest = new javax.swing.JComboBox<>();
        lblInterest = new javax.swing.JLabel();
        btnQuitForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 650));

        titreFormulaire.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        titreFormulaire.setText("Formulaire d'ajout");

        lblRaisonSociale.setText("raison sociale");

        lblPhone.setText("telephone");

        lblChiffreAffaire.setText("chiffre d'affaire");

        lblNbEmploi.setText("nombre d'emploi");

        btnValiderForm.setText("valider");
        btnValiderForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderFormActionPerformed(evt);
            }
        });

        btnRetourAccueil.setText("accueil");
        btnRetourAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourAccueilActionPerformed(evt);
            }
        });

        lblMail.setText("mail");

        lblNumRue.setText("numero");

        formNomrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNomrueActionPerformed(evt);
            }
        });

        lblNomRue.setText("nom de rue");

        lblCodePostal.setText("code postal");

        lblVille.setText("ville");

        formCommentaire.setColumns(20);
        formCommentaire.setRows(5);
        jScrollPane1.setViewportView(formCommentaire);

        lblCommentaire.setText("Commentaire");

        boxInterest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "oui", "non" }));

        lblInterest.setText("Intêret");

        btnQuitForm.setText("quitter");
        btnQuitForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnQuitForm)
                        .addGap(135, 135, 135)
                        .addComponent(btnRetourAccueil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnValiderForm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(titreFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblVille)
                                                    .addComponent(lblCodePostal)
                                                    .addComponent(lblNomRue)
                                                    .addComponent(lblNumRue)
                                                    .addComponent(lblRaisonSociale)))
                                            .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(lblMail, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblChiffreAffaire, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(lblNbEmploi, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(lblCommentaire))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblInterest)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(formNomrue)
                                .addComponent(formNumRue, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(formVille)
                                        .addComponent(formCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(formResSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(formMail, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formChiffreAffaire, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formNbEmploi, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titreFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formResSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaisonSociale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formNumRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumRue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formNomrue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomRue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodePostal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVille))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formChiffreAffaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChiffreAffaire))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formNbEmploi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNbEmploi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInterest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommentaire))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRetourAccueil)
                            .addComponent(btnValiderForm))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitForm))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetourAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourAccueilActionPerformed

     Accueil accueil = new Accueil();
     accueil.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnRetourAccueilActionPerformed

    private void btnValiderFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderFormActionPerformed
  
        if(choix.equals("clientSupprimer")){           
            JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir supprimer cette entree?");
            CollectionClient.getListeClient().remove(societe);
            instanceAccueil();
            
           } else {

        if(choix.equals("prospectSupprimer")){           
            JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir supprimer cette entree?");
            CollectionProspect.getListeProspect().remove(societe);
            instanceAccueil();
        }
    }
        
        if(choix.equals("clientModifier")){
            try {
                
                modifierFormulaireCommun();
                int ParseChiffreAffaire = Integer.parseInt(formChiffreAffaire.getText());
                ((Client) societe).setChiffreAffaire(ParseChiffreAffaire); 

                int ParseNombreEmploi = Integer.parseInt(formNbEmploi.getText());
                ((Client) societe).setChiffreAffaire(ParseNombreEmploi); 
                societe.setCommentaire(formCommentaire.getText()); 
                
            } catch (ExceptionMetier ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage(), "erreur", 0);
            }
        } else {
                if(choix.equals("prospectModifier")){
                    
            try {
                
                   modifierFormulaireCommun();
                 ((Prospect) societe).setDateProspection(formChiffreAffaire.getText()); 

                if(boxInterest.getSelectedIndex() == 0){
                   formNbEmploi.setText("oui");
                } else {
                    if(boxInterest.getSelectedIndex() == 1)
                   formNbEmploi.setText("non");
                }   
                
                 ((Prospect) societe).setProspectInterest(formNbEmploi.getText()); 
                            
                 if(societe instanceof Prospect){        
                 societe.setCommentaire(formCommentaire.getText()); 
                }
                     
            } catch (ExceptionMetier ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage(), "erreur", 0);
            }       
        }           
    }
        
        if(choix.equals("clientAjouter")){
                    
            try {
                int ParseChiffreAffaire = Integer.parseInt(formChiffreAffaire.getText());
                int ParseNbEmploi = Integer.parseInt(formNbEmploi.getText());
                Client client = new Client(
                        formResSocial.getText(),
                        formNumRue.getText(), 
                        formNomrue.getText(),
                        formCodePostal.getText(),
                        formVille.getText(),
                        formTelephone.getText(),
                        formMail.getText(),
                        formCommentaire.getText(),
                        ParseChiffreAffaire,
                        ParseNbEmploi
                        
                );
                ajouter(client);
            } catch (ExceptionMetier ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage(), "erreur", 0);
            }
                
        } else {
                 if(choix.equals("prospectAjouter")){

                try {
                         
                    if(boxInterest.getSelectedIndex() == 0){
                       formNbEmploi.setText("oui");
                    } else {
                        if(boxInterest.getSelectedIndex() == 1)
                       formNbEmploi.setText("non");
                    }            
                
                         Prospect prospect = new Prospect(
                                 formResSocial.getText(),
                                 formNumRue.getText(),
                                 formNomrue.getText(),
                                 formCodePostal.getText(),
                                 formVille.getText(),
                                 formTelephone.getText(),
                                 formMail.getText(),
                                 formChiffreAffaire.getText(),
                                 formNbEmploi.getText(),
                                 formCommentaire.getText()
                                ); 
                         ajouter(prospect);
                } catch (ExceptionMetier ex) {
                         Logger.getLogger(Formulaire.class.getName()).log(Level.SEVERE, null, ex);
                         JOptionPane.showMessageDialog(null, ex.getMessage(), "erreur", 0);
                        }
                    }    
                }                                         
            instanceAccueil();
    }//GEN-LAST:event_btnValiderFormActionPerformed

    private void formNomrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNomrueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formNomrueActionPerformed

    private void btnQuitFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitFormActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitFormActionPerformed

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
            java.util.logging.Logger.getLogger(Formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxInterest;
    private javax.swing.JButton btnQuitForm;
    private javax.swing.JButton btnRetourAccueil;
    private javax.swing.JButton btnValiderForm;
    private javax.swing.JTextField formChiffreAffaire;
    private javax.swing.JTextField formCodePostal;
    private javax.swing.JTextArea formCommentaire;
    private javax.swing.JTextField formMail;
    private javax.swing.JTextField formNbEmploi;
    private javax.swing.JTextField formNomrue;
    private javax.swing.JTextField formNumRue;
    private javax.swing.JTextField formResSocial;
    private javax.swing.JTextField formTelephone;
    private javax.swing.JTextField formVille;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChiffreAffaire;
    private javax.swing.JLabel lblCodePostal;
    private javax.swing.JLabel lblCommentaire;
    private javax.swing.JLabel lblInterest;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNbEmploi;
    private javax.swing.JLabel lblNomRue;
    private javax.swing.JLabel lblNumRue;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRaisonSociale;
    private javax.swing.JLabel lblVille;
    private javax.swing.JLabel titreFormulaire;
    // End of variables declaration//GEN-END:variables
}
