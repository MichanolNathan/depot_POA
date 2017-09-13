/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td1_poa_michanol_nathan;
import td1_poa_michanol_nathan.lesClasses.*;

/**
 *
 * @author nathan
 */
public class TD1_POA_Michanol_Nathan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point2D unPoint = new Point2D(3,1);
        Point2D pointDeux = new Point2D(2,5);
        Point2D pointOriginel = new Point2D(0,0);
        Square unCarré = new Square (5,2,unPoint);
        
        System.out.println(unCarré);
        System.out.println("distance entre unPoint et pointDeux : "+pointDeux.distance(unPoint));
        System.out.println("Origine unPoint? : "+unPoint.isOrigin()+" Origine de pointOriginel ?: "+pointOriginel.isOrigin());
        
        
    }
    
}
