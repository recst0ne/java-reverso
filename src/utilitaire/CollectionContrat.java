/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaire;
import java.util.ArrayList;
import java.util.Comparator;
import metiers.Client;
import metiers.Contrat;
import metiers.Prospect;
import metiers.Societe;

/**
 *
 * @author alexa
 */
public class CollectionContrat {
    
    
    /**
     * Instancie une nouvelle collection de client
     */
    private static ArrayList<Contrat> listeContrat = new ArrayList<Contrat>();
/////////////////////////////////////////////
    public  static   Comparator<Contrat>triListe = new Comparator<Contrat>(){

      @Override
       public int compare (Contrat a1, Contrat a2){
       return a1.getLibelleContrat().compareTo(a2.getLibelleContrat());
      }
    }; 
   
    /**
     * Ajouter une instance à une collection 
     * @param contrat est l'instance à intégrer à la collection
     */
    public static  void ajouter(Contrat contrat){  
         CollectionContrat.getListeContrat().add(contrat);
    }   
    
////////////////////////////////////////////////////    
    /**
     * 
     * @return l'ensemble des objets constituant la collection 
     */
    public static ArrayList<Contrat> getListeContrat() {
        return listeContrat;
    }
       
}
