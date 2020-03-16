/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaire;
import java.util.ArrayList;
import metiers.Client;
/**
 *
 * @author Colomar Alexandre
 */
public class CollectionClient extends CollectionSociete {
   
    /**
     * Instancie une nouvelle collection de client
     */
    private static ArrayList<Client> listeClient = new ArrayList<Client>();

    /**
     * 
     * @return l'ensemble des objets constituant la collection 
     */
    public static ArrayList<Client> getListeClient() {
        return listeClient;
    }
    
   
}
