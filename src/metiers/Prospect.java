/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metiers;

import exception.ExceptionMetier;
import utilitaire.*;

/**
 *
 * @author Alexandre Colomar
 */
public class Prospect extends Societe {

    //ATTRIBUTS
    private String dateProspection;
    private String prospectInterest;
    private String commentaire;

    //CONSTRUCTEUR
/**
 * Constructeur de la classe Prospect hérité de Société
 * @param raisonSociale
 * @param numeroRue
 * @param nomRue
 * @param codePostal
 * @param ville
 * @param telephone
 * @param mail
 * @param dateProspection
 * @param prospectInterest
 * @param commentaire
 * @throws ExceptionMetier 
 */
    public Prospect(String raisonSociale, String numeroRue, String nomRue, String codePostal, String ville, String telephone, String mail , String commentaire, 
            String dateProspection, String prospectInterest) throws ExceptionMetier {
        
        super(raisonSociale, numeroRue, nomRue, codePostal, ville, telephone, mail, commentaire);
        setDateProspection(dateProspection);
        setProspectInterest(prospectInterest);
        
    }
 
    //GETTER ET SETTER
    public String getDateProspection() {
        return dateProspection;
    }
    public void setDateProspection(String p_dateProspection) throws ExceptionMetier {
       
        if (p_dateProspection.length() == 10 && p_dateProspection.charAt(2) == '/' && p_dateProspection.charAt(5) == '/' ){
             this.dateProspection = p_dateProspection;
        } else {
            throw new ExceptionMetier("la date doit être renseignée au format dd/mm/yyyy ");
        }
        
       
    }
    public String getProspectInterest() {
        return prospectInterest;
    }
    public void setProspectInterest(String prospectInterest) {
        
        this.prospectInterest = prospectInterest;
    }

 
    //METHODES
    /**
     * methode pour afficher un objet issu d'une collection de type lissteProspect
     */
    public static void afficher(){
        
        int occurenceProspect= 0;

        
        for (int i = 0; i < CollectionProspect.getListeProspect().size(); i++) {
            System.out.println(CollectionProspect.getListeProspect().get(i));
            occurenceProspect++;
        }
        System.out.println("Nombre de prospects: " + occurenceProspect);

    }

}
