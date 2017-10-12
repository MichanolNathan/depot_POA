/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td1_poa_michanol_nathan;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import td1_poa_michanol_nathan.lesClasses.*;
import Exercice_2_TD1.*;

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
        /*Point2D unPoint = new Point2D(3,1);
        Point2D pointDeux = new Point2D(2,5);
        Point2D pointOriginel = new Point2D(0,0);
        Square unCarré = new Square (5,2,unPoint);
        
        System.out.println(unCarré);
        System.out.println("distance entre unPoint et pointDeux : "+pointDeux.distance(unPoint));
        System.out.println("Origine unPoint? : "+unPoint.isOrigin()+" Origine de pointOriginel ?: "+pointOriginel.isOrigin());
        */
        Personnel et1 = new Etudiant("Etu", "Diant", 500, 500.0f);
        Personnel dt1 = new Doctorant("Doc", "Torant", 400,230.f);
        Personnel mc1 = new MaitreConferences("Maitre", "Conference", 500, new CDI(1200.00, new Date()), "Info");
        Personnel pr1 = new Professeur("Prof", "Esseur", 500, new CDI(1200.00, new Date()), "Info");
        Personnel at1 = new Ater("At", "Er", 500, new CDD(1200.00, new Date(), new Date()));
        Personnel va1 = new Vacataire("Vac", "Ataire", 500, new CDD(1200.00, new Date(), new Date()));
        Personnel bt1 = new Biatoss("Biblio", "Thequaire", 500, new CDI(1200.00, new Date()));
        Personnel bi1 = new Bibliothequaire("Biblio", "Thequairex", 500, new CDI(1200.00, new Date()));
        Personnel se1 = new Secretaire("Secre", "Taire", 500, new CDI(1200.00, new Date()));

        List<Personnel> li1 = Arrays.asList(et1, dt1, mc1, pr1, at1, va1, bt1, bi1, se1);
        for (Personnel list: li1)
            System.out.println(list);
        
    }
    
}
