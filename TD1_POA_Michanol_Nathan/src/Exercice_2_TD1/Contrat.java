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
public abstract class Contrat {
    
    private double salaire;
    private Date debut;
    
    public Contrat (Double unSalaire,Date unDebut)
    {
        this.salaire = unSalaire;
        this.debut = unDebut;
    }
    
    public Date getDateDebut(){return this.debut;}
    
    public Double getSalaire(){return this.salaire;}
    
    public void setSalaire(double salaire){
        this.salaire = salaire;
    }
}
