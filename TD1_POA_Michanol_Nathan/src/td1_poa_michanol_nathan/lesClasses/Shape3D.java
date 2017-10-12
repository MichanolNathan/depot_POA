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
public abstract class Shape3D extends Shape implements Translatable3D{
    
    private Point3D refPoint;
    
    public Shape3D(Point3D refPoint){
        this.refPoint = refPoint;
    }
    
    public abstract double volume();
    
    public Point3D getRefPoint(){
        
        return this.refPoint;
    }
}
