/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rbaezm.t01.p1;
import java.util.*;
//Rubén Daniel Báez Muñiz A01411504 IMT

/**
 *
 * @author Rubén 
 */
public class SPPRBaezMT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int X1, X2, Y1, Y2;  // TODO code application logic here
      double D;
      //int = coordenadas, D= Distancia
      //Declarar teclado
      Scanner kb = new Scanner (System.in);
        System.out.println("Escribe el punto X1");
        X1 = (int) kb.nextDouble();
        System.out.println("Escribe el punto X2");
        X2 = (int) kb.nextDouble();
        System.out.println("Escribe el punto Y1");
        Y1 = (int) kb.nextDouble();
        System.out.println("Escribe el punto Y2");
        Y2 = (int) kb.nextDouble();
        
        D = Math.sqrt(Math.pow((X1-X2),2) + Math.pow((Y1-Y2),2));
        
        System.out.println("La distancia entre los puntos es: " + D);

    }
    
}
