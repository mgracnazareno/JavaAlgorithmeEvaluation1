/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int taille;
       double[] notes ;
        int total_grades =0;
        int meilleureNoteIndex =0;
        int pireNoteIndex = 0;
        
        int reussi =0;
        int echec =0;
     
        int totalNotes = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez les nombres des etudiants: ");
        taille = input.nextInt();
        notes =new double[taille];
        
//      //Saisir les notes une par une
        System.out.println("Entrez les notes des etudiants");
        for (int i = 0; i < taille; i++) {
           
           System.out.println("Etudiant " + ( i+1) + ":");
            double note = input.nextDouble();
            while (note < 0 || note > 100) {
                System.out.println("Note invalide, veuillez entrer une note entre 0 et 100:");
                note = input.nextDouble();
            }
            notes[i] = note;
      }
        
//     //Afficher la meilleure note et la pire note
       double meilleureNote = 0;
        double pireNote = 0; 
       for ( int i = 0; i < taille; i++) {
           if (notes[i] > meilleureNote)
               meilleureNote = notes[i];
            else
                pireNote = notes[i];
       }
       
       //Trouvez l'index de la meileureNote et le pireNote puis affichez
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > notes[meilleureNoteIndex]) {
                meilleureNoteIndex = i;
            }
            if (notes[i] <  notes[pireNoteIndex]) {
                pireNoteIndex = i;
            }
        }
        
        //Affichez si l'etudiant a reussi ou echoué
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < 60){
               System.out.println("Etudiant" + (i+ 1) + ": Echec");
               echec++;
            }
            else{
                System.out.println("Etudiant" + (i+ 1) +  ": Reussi");
                reussi++;
            } 
        }
        
        for (int i = 0; i <notes.length; i++) {
            totalNotes+=notes[i];
        }
        System.out.println("\n\nLe moyenne est " + totalNotes / notes.length + "\n");
        
        
        System.out.printf("%s%.2f\n" , "La meilleure Note est "  , meilleureNote );
        System.out.printf("%s%.2f\n\n", "Le pire note parmi les notes entree est " , pireNote);
    
        System.out.println("La position de meilleure note est " + meilleureNoteIndex);
        System.out.println("Le position de pire note est " +  pireNoteIndex);
        
        System.out.println("\nLe nombres d'etudiant qui a reussi " + reussi);
        System.out.println("Le nombres d'etudiant qui a echoué " + echec);
       }  
    }    



