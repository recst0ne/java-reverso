/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaire;
import java.util.ArrayList;
import java.util.Comparator;
import metiers.*;


/**
 *
 * @author  Alexandre Colomar
 */
public abstract class CollectionSociete {
   
    /**
     * Instancie une collection abstraire d'objet Societe
     */
    public static ArrayList<Societe> listeSociete = new ArrayList<Societe>();   
  
    /**
     * Methode pour trier par ordre Alphabétique une collection
     */
    public  static   Comparator<Societe>triListe = new Comparator<Societe>(){

      @Override
       public int compare (Societe a1, Societe a2){
       return a1.getRaisonSociale().compareTo(a2.getRaisonSociale());
      }
    }; 
   
    /**
     * Ajouter une instance à une collection 
     * @param societe est l'instance à intégrer à la collection
     */
    public static  void ajouter(Societe societe){  
     if(societe instanceof Client){
         CollectionClient.getListeClient().add((Client) societe);
     }  else {
         CollectionProspect.getListeProspect().add((Prospect) societe);
     }
     
    }
  
}

