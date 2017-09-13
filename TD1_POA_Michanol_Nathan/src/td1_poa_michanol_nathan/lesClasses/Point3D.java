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
public class Point3D extends Point2D {
    
    private double z;
    
    public Point3D (double unX,double unY,double unZ){
        super(unX,unY);
        this.z = unZ;
    }
    
 
    @Override
    public boolean isOrigin(){
        boolean valeur = false;
       if(super.x==0&&super.y==0&&this.z==0){
           valeur = true;
       };
       
       return valeur;
    }
    
    public void translate(double x,double y,double z){
        
            super.x+=x;
            super.y+=y;
            this.z+=z;
    }
    
    public double distance(Point3D unPoint){
        double valeur;
        valeur = Math.sqrt( Math.pow(super.x - unPoint.x, 2) + Math.pow(super.y - unPoint.y, 2) + Math.pow(this.z - unPoint.z, 2)) ;
        return valeur;
    }
    
    @Override
    public String toString(){
          return "coordonnée x : "+super.x+",coordonnée y : "+super.y+",coordonnée z : "+this.z;
    }
    
    
}
