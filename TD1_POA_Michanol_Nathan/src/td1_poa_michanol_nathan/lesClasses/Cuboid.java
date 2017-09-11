/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td1_poa_michanol_nathan.lesClasses;

/**
 *
 * @author nathan
 */
public class Cuboid extends Shape3D {
    
    private double length;
    private double width;
    private double height;
    
    public Cuboid(double longueur,double largeur,double hauteur){
        this.length=longueur;
        this.width=largeur;
        this.height = hauteur;
    }
    
    public double getLenght(){
        return this.length;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double volume(){
        double valeur = 0.0;
        return valeur;
    }
    
    public double surface(){
        double valeur=0.0;
        return valeur;
    }
            
}
