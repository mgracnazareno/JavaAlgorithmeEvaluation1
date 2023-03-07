/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double temp;
      
       Scanner input = new Scanner(System.in);
       
       boolean continuer= true;
        
       while(continuer){
            System.out.println("Entrez la temperature: ");
            temp = input.nextDouble();
            
             String saison= "";
            if (temp <= -50 && temp >=5.0) 
                saison="Hiver";
            else if( temp <= 15.0)
                saison ="Printemps";
            else if(temp <= 20.0)
                saison = "Automne";
            else if(temp <= 50.0)
                saison = "Été";
            else
                System.out.println("Je ne sais pas");
            
            System.out.println("La temperature " + temp + "°C correspond à la saison " + saison);
            
             System.out.print("Voulez-vous continuer ? (Oui/Non) ");
            String reponse = input.next();

            if (reponse.equalsIgnoreCase("non")) {
                continuer = false;
            }
       }
    
  }
}
