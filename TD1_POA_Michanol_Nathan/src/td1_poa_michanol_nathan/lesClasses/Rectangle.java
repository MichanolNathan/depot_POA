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
public class Rectangle extends Shape2D {
    
    private double length;
    private double width;
    
    public Rectangle(double theLength,double theWidth){
        this.length=theLength;
        this.width=theWidth;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public double perimeter(){
        double valeur = 0.0;
        return valeur;
    }
    
    public double surface(){
        double valeur = 0.0;
        return valeur;
    }
    
    
}
