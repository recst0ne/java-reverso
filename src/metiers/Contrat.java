/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metiers;

import exception.ExceptionMetier;
import java.time.LocalDate;

/**
 *
 * @author alexa
 */
public class Contrat {
    
    
    private  int idContrat;
    private String libelleContrat;
    private double montantContrat;
    private LocalDate dateDebutContrat;
    private LocalDate dateFinContrat;
    
    
   public Contrat(int idContrat, String libelleContrat, int montantContrat, LocalDate dateDebutContrat,LocalDate dateFinContrat ) throws ExceptionMetier
   {
       setIdContrat(idContrat);
       setLibelleContrat(libelleContrat);
       setMontantContrat(montantContrat);
       setDateDebutContrat(dateDebutContrat);
       setDateDebutContrat(dateFinContrat);
       
   }
    
    //GETTER AND SETTER
    public int getIdContrat() {
        return idContrat;
    }   
    public void setIdContrat(int idContrat) throws ExceptionMetier{
        String idContratParse = Integer.toString(idContrat);
           this.idContrat = idContrat;     
    }
    public String getLibelleContrat() {
        return libelleContrat;
    }
    public void setLibelleContrat(String libelleContrat) {
        this.libelleContrat = libelleContrat;
    }
    public double getMontantContrat() {
        return montantContrat;
    }
    public void setMontantContrat(double montantContrat) {
        this.montantContrat = montantContrat;
    }
    public LocalDate getDateDebutContrat() {
        return dateDebutContrat;
    }
    public void setDateDebutContrat(LocalDate dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }
    public LocalDate getDateFinContrat() {
        return dateFinContrat;
    }
    public void setDateFinContrat(LocalDate dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }
   
    
  }


