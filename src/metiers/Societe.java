/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metiers;
import exception.ExceptionMetier;


/**
 *
 * @author CDA03-02
 */
public abstract class  Societe  {

    //ATTRIBUTS
    private int nbSociete = 8;
    private static int idSociete = 0;
    private int identifiant;
    private String raisonSociale;
    private String numeroRue;
    private String nomRue;
    private String codePostal;
    private String ville;
    private String telephone;
    private String mail;
    private String commentaire;
    

    //CONSTRUCTEUR
    
    /**
     * Classe Societe abstraite
     * @param raisonSociale
     * @param numeroRue
     * @param nomRue
     * @param codePostal
     * @param ville
     * @param telephone
     * @param mail
     * @throws ExceptionMetier 
     */
    public Societe(String raisonSociale, String numeroRue, String nomRue, String codePostal, String ville, 
            String telephone, String mail, String commentaire ) throws ExceptionMetier  {
        setIdSociete();
        setIdentifiant();
        setRaisonSociale(raisonSociale);
        setNumeroRue(numeroRue);
        setNomRue(nomRue);
        setCodePostal(codePostal);
        setVille(ville);
        setTelephone(telephone);
        setMail(mail);

    }


    //TOSTRING
    /**
     * Surcharche de la methode toString pour tester l'integration des objets aux collections
     * @return La raison sociale, son adresse et son identifiant 
     */
    @Override
    public String toString(){
    return raisonSociale + " "+ numeroRue +" " + nomRue + " " + codePostal + " " +ville + " ,identifiant:" + idSociete;
    }  
    
    //GETTER ET SETTER
    public int getIdSociete(){
        return idSociete;
    }      
    public void setIdSociete(){
      idSociete++;  
    }
    public void setIdentifiant (){
        this.identifiant = idSociete;
    }
    public int getNbSociete() {
        return nbSociete;
    }
    public void setNbSociete(int p_nbSociete) {
        this.nbSociete = p_nbSociete;
    }
    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int p_identifiant) {
        this.identifiant = p_identifiant;
    }
    public String getRaisonSociale() {
        return raisonSociale;
    }
    public void setRaisonSociale(String p_raisonSociale) throws ExceptionMetier {
        
        if(p_raisonSociale.isEmpty()){
            throw new ExceptionMetier("la raison sociale doit être renseignée");
        } else {
          this.raisonSociale = p_raisonSociale;   
        }
        
        
        
    }
    public String getNumeroRue() {
        return numeroRue;
    }
    public void setNumeroRue(String p_numeroRue)throws ExceptionMetier {
        
        if(p_numeroRue.isEmpty()){
            throw new ExceptionMetier("le champ numero de rue doit être renseigné");
        } else {
           this.numeroRue = p_numeroRue; 
        }
        
    }
    public String getNomRue() {
        return nomRue;
    }
    public void setNomRue(String p_nomRue) throws ExceptionMetier{
        if(p_nomRue.isEmpty()){
            throw new ExceptionMetier("Le nom de rue doit être renseigné");
        } else {
           this.nomRue = p_nomRue; 
        }
        
        
    }
    public String getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(String p_codePostal) throws ExceptionMetier{
        
        if(p_codePostal.isEmpty()){
            throw new ExceptionMetier("le champ code postal doit être renseigné");
        } else {
        this.codePostal = p_codePostal;
        }
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String p_ville) throws ExceptionMetier {
        
        if(p_ville.isEmpty()){
          throw new ExceptionMetier("le champ ville doit être renseigné");
        } else {
          this.ville = p_ville;  
        }
        
    }
    public String getTelephone() {
        return telephone;
    }   
    public void setTelephone(String telephone) throws ExceptionMetier {
        
        if (telephone.length() < 10){
           throw new ExceptionMetier("Le champ numero doit contenir au moins 10 chiffres");
        } else {
            this.telephone = telephone;   
        }
        
    }   
    public String getMail() {
        return mail;
    }
    public void setMail(String p_mail) throws ExceptionMetier{
        
        if(p_mail.contains("@")){
           this.mail = p_mail; 
        } else {
            throw new ExceptionMetier("le mail doit contenir un @");
        }
        
                 
    }
    public String getCommentaire() {
        return commentaire;
    }
    public void setCommentaire(String p_commentaire) {
        this.commentaire = p_commentaire;
    }

}




