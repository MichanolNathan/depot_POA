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
public class Point2D {
    
    protected double x;
    protected double y;
    
    public Point2D(double unX,double unY){
        
        this.x = unX;
        this.y = unY;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public void translate(double unX,double unY){
            this.x+=unX;
            this.y+=unY;
    }
    
    public boolean isOrigin(){
        
      boolean valeur = false;
      
      if (this.x==0 && this.y==0){
          valeur = true;
      }
       
       return valeur;
    }
    
    public double distance(Point2D unPoint){
        
        double valeur;
        valeur = Math.sqrt( Math.pow(this.x - unPoint.x, 2) + Math.pow(this.y - unPoint.y, 2) );
        return valeur;
    }
    
}
