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
final class Sphere extends Shape3D{
    
    public double radius;
    
    public Sphere(Point3D refPoint,double unRadius){
        super(refPoint);
        this.radius = unRadius;
    }
    
    public double volume(){
        
      double valeur = 4/3*Math.pow(radius,3);
      return valeur;
      
    }
    
    @Override
    public double surface(){
        double valeur = 4*Math.PI*Math.pow(radius, 2);
        return valeur;
    }
    
}
