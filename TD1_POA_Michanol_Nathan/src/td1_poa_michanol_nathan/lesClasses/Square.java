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
public class Square extends Rectangle {
    
    public Square(double theLength, double theWidth,Point2D refPoint) {
         super(theLength, theWidth,refPoint);
    }
    
    @Override
    public String toString(){
        return "Largeur : "+super.getWidth()+" ,longueur : "+super.getLength();
    }
    
}
