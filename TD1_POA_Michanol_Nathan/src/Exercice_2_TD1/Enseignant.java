/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice_2_TD1;

import java.util.Date;

/**
 *
 * @author Nathan
 */
public abstract class Enseignant extends Personnel{
    
    protected Contrat contrat;

    Enseignant(String unNom,String unPrenom,Integer unNumSecu,Contrat unContrat){
        super(unNom,unPrenom,unNumSecu);
        this.contrat=unContrat;

    }
    
    public Double getSalaire(){return this.contrat.getSalaire();}
    
    public Date getDebut(){return this.contrat.getDateDebut();}
    
}
