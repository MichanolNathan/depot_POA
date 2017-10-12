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
final class Cuboid extends Shape3D {
    
    private double length;
    private double width;
    private double height;
    
    public Cuboid(Point3D refPoint,double longueur,double largeur,double hauteur){
        super(refPoint);
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
        double valeur;
        valeur = this.length*this.width*this.height;
        return valeur;
    }
    
    public double surface(){
        double valeur;
        valeur = 2*(this.length*this.width+this.width*this.height+this.length*this.height);
        return valeur;
    }
    
    @Override
    public String toString(){
        return "longueur : "+this.length+",largeur : "+this.width+",hauteur :  "+this.height;
    }
            
}
