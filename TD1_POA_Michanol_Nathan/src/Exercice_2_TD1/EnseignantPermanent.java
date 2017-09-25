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
public abstract class EnseignantPermanent extends Enseignant{
    
    private String domaineRecherche;
    
    public EnseignantPermanent(String unNom,String unPrenom,Integer unNumSecu,CDI contrat,String unDomaine){
        
        super(unNom,unPrenom,unNumSecu,contrat);
        this.domaineRecherche = unDomaine;
        
    }
    
    public void setDomaineRecherch(String domaine){this.domaineRecherche = domaine;}
    
    public String getDomaineRecherche(){return this.domaineRecherche;}
    
    public double augmentation(double augmentation){
        super.contrat.setSalaire(super.contrat.getSalaire()+augmentation);
        return super.contrat.getSalaire();
    }
    
    
}
