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
public class Etudiant extends Personnel{
    
    
    private Float bourse;
    
    public Etudiant (String unNom,String unPrenom,Integer unNumSecu,Float uneBourse){
        super(unNom,unPrenom,unNumSecu);
        this.bourse = uneBourse;
    }
    
    
}
