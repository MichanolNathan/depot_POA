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
public class CDD extends Contrat {
    
    private Date fin;
    
    public CDD(Double unSalaire,Date debut,Date unefin){
        
        super(unSalaire,debut);
        this.fin = unefin;
    
    }
    
    public Date fin(){return this.fin;}
}
