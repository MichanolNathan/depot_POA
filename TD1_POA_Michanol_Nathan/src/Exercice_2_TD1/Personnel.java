/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice_2_TD1;

/**
 *
 * @author Nathan
 */
public abstract class Personnel {
    
    private String nom;
    private String prenom;
    private Integer numSecu;
    
    Personnel(String unNom,String unPrenom,Integer unNumSecu){
        this.nom = unNom;
        this.prenom = unPrenom;
        this.numSecu = unNumSecu;
    }
    
  
    public String ToString(){
        return prenom+" "+nom;
    }
}
