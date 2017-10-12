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
public abstract class Shape2D extends Shape implements Translate2D {
    
    private Point2D refPoint;
    
    public Shape2D(Point2D refPoint){
        this.refPoint = refPoint;
    }
     public abstract double perimeter();
    
    public Point2D getRefPoint(){
        
        return this.refPoint;
        
    }
}
