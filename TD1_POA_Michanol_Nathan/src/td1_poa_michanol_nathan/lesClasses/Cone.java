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
public class Cone extends Shape3D{
    
    private double height;
    private double radius;
    
    public Cone(double uneHauteur,double unRadius){
        this.height = uneHauteur;
        this.radius = unRadius;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    
    public double volume (){
        double valeur = 0.0;
        valeur = (Math.PI*Math.pow(radius,2)*height)/3;
        return valeur;
    }
    
    public double surface(){
        
        double valeur = 0.0;
        valeur = (Math.PI*radius*height)+(Math.PI*Math.pow(radius,2));
        return valeur;
    }
        
}
