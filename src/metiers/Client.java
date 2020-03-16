/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Dans la classe Client, vous rajouterez,  en attribut d'instance, la liste des contrats du client.
Vous initialiserez des contrats pour certains clients, pas la peine de faire de formulaire pour instancier des contrats .
Vous ajouterez la possibilité  depuis l'écran d'accueil de visualiser les contrats d'un client.
Pour gérer les dates du contrat, vous ferez une constante de type DateTimeFormatter pour futiliser les dates au format "dd-MM-yyyy".
*/
package metiers;
import exception.ExceptionMetier;
import utilitaire.*;


/**
 *
 * @author CDA03-02
 */
public  class Client extends Societe {
    
    //ATTRIBUTS
    private int chiffreAffaire;
    private int nbEmploye;

    //CONSTRUCTEURS 
       
    /**
     * Constructeur de la classe Client héritant de Societe
     * @param raisonSociale
     * @param numeroRue
     * @param nomRue
     * @param codePostal
     * @param ville
     * @param telephone
     * @param mail
     * @param chiffreAffaire
     * @param nbEmploye
     * @param commentaire
     * @param listeContrat
     * @throws ExceptionMetier 
     */
    
    public Client(String raisonSociale,
                  String numeroRue, 
                  String nomRue, 
                  String codePostal, 
                  String ville, 
                  String telephone, 
                  String mail,
                  String commentaire, 
                  int chiffreAffaire, 
                  int nbEmploye, 
                  Contrat listeContrat) 
throws ExceptionMetier{
                        super(raisonSociale, numeroRue, nomRue, codePostal, ville, telephone, mail, commentaire);
                        setChiffreAffaire(chiffreAffaire);
                        setNbEmploye(nbEmploye);    
                    }    
       
    //GETTER ET SETTER

    public int getChiffreAffaire() {
        return chiffreAffaire;
    }
    public void setChiffreAffaire(int chiffreAffaire) throws ExceptionMetier {
        if(chiffreAffaire  >= 200){
            this.chiffreAffaire = chiffreAffaire;
        } else {
            throw new ExceptionMetier("Le chiffre d'affaire doit eter superieur ou egal a 200");
        }
        
    }
    public int getNbEmploye() {
        return nbEmploye;
    }   
    public void setNbEmploye(int nbEmploye) throws ExceptionMetier{
        String nbEmployeParse = Integer.toString(nbEmploye);
        
        if(nbEmploye <= 0 || nbEmployeParse.isEmpty() ){
            throw new ExceptionMetier("Le nombre d'employé ne peut être inférieur a zero");
        } else {
           this.nbEmploye = nbEmploye;
        }
        
    }

    //METHODES
    /**
     * methode pour afficher un objet issu d'une collection de type lissteClient
     */
    public static void afficher(){
        
        int occurenceClient = 0;

        
        for (int i = 0; i < CollectionClient.getListeClient().size(); i++) {
            System.out.println(CollectionClient.getListeClient().get(i));
            occurenceClient++;
        }
        System.out.println("Nombre de clients: " + occurenceClient);
    }
}

    
    
    
    

