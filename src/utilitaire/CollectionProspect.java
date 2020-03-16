/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaire;
import java.util.ArrayList;
import metiers.Prospect;


/**
 *
 * @author Alexandre Colomar
 */
public class CollectionProspect extends CollectionSociete {
    
    /**
     * Instancie une nouvelle collection de prospect
     */
     private static ArrayList<Prospect> listeProspect = new ArrayList<Prospect>();
     
     
     /**
      * 
      * @return  une liste d'objets de type prospect
      */
     
        //GETTER
         public static ArrayList<Prospect> getListeProspect() {
        return listeProspect;
    }
}
