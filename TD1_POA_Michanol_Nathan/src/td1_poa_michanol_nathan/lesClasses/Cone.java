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
final class Cone extends Shape3D{
    
    private double height;
    private double radius;
    
    public Cone(Point3D refPoint,double uneHauteur,double unRadius){
        super(refPoint);
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
        double valeur;
        valeur = (Math.PI*Math.pow(radius,2)*height)/3;
        return valeur;
    }
    
    public double surface(){
        
        double valeur;
        valeur = (Math.PI*radius*height)+(Math.PI*Math.pow(radius,2));
        return valeur;
    }
    
    @Override
    public String toString(){
        
        return "Hauteur : "+this.height+",rayon :  "+this.radius;
    }
}
