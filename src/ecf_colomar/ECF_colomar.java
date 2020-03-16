/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecf_colomar;

import java.util.Collections;
import javax.swing.JOptionPane;
import metiers.*;
import utilitaire.*;
import static utilitaire.CollectionSociete.ajouter;

import exception.ExceptionMetier;
import jframe.Accueil;

/**
 *
 * @author CDA03-02
 */
public class ECF_colomar {
    
    /**
     * @param args the command line arguments
     * @throws exception.ExceptionMetier
     */
    
    public static void main(String[] args) throws ExceptionMetier {
    try {
        
    //LISTE CLIENT
    //Contrat Contrat1 = new Contrat(1, "client1 contrat1", 70000, '17/04/1989', '12/05/1992'); 
    //String raisonSociale, int numeroRue, String nomRue, int codePostal, String ville, String telephone, String mail, int chiffreAffaire, int nbEmploye, 
    Client client1 = new Client("Hyundai", "30", "rue de Miyazaki", "45561", "Okinawa", "0243336578", "hyundai@mail.com","", 3000000, 2744);
    Client client2 = new Client("Mitsubishi", "2", "impasse Dorin", "10237", "Tokyo", "0692821324", "mitsubishi@mail.com","", 500000, 4325);
    Client client3 = new Client("Renault", "18", "avenue du repos", "75016", "Paris", "0619698345", "renault@mail.com","" , 35000000, 4000);
    Client client4 = new Client("Ferrari", "43", "boulevard le soif", "86001", "Milan", "0658227948", "ferrari@mail.com","" , 120000000, 6000);
    
    //LISTE PROSPECT
    //String raisonSociale, int numeroRue, String nomRue, int codePostal, String ville, String telephone, String mail, String dateProspection, String prospectInterest)
    Prospect prospect1 = new Prospect("Jaguar", "12", "allée des myosotis", "97400", "Texas", "0262306524", "jaguar@mail.com","" , "19/04/1989", "oui");
    Prospect prospect2 = new Prospect("Porsche", "6", "rue des jonquilles", "45955", "Rome", "0262410593", "porsche@mail.com","" , "12/08/2018", "non");
    Prospect prospect3 = new Prospect("Subaru", "43", "boulebard du saint pierrois", "35500", "Kyoto", "0624306573", "subaru@mail.com","" , "14/03/1989", "non");
    Prospect prospect4 = new Prospect("Nissan", "29 bis", "rue Saint Julien", "54000", "Nancy", "0624566774", "nissan@mail.com","" , "10/07/2023", "oui");
    
    //AJOUT
    ajouter(client1);
    ajouter(client2);
    ajouter(client3);
    ajouter(client4);
    ajouter(prospect1);
    ajouter(prospect2);
    ajouter(prospect3);
    ajouter(prospect4); 
    
    //TRI
    Collections.sort(CollectionProspect.getListeProspect(), CollectionProspect.triListe);
    Collections.sort(CollectionClient.getListeClient(), CollectionClient.triListe);
    

      Accueil accueil = new Accueil();
      accueil.setVisible(true);
      
        
    } catch(ExceptionMetier e)  {
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
    } 
    }  
}
