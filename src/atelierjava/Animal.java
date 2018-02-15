/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava; 

/**
 *
 * @author Formation
 */
public class Animal {
    
    static int nbAnimaux = 0;
    
    int tailleEnCm;
    float poidsEnKg;
    String genre;
    String espece; 

    @Override
    public String toString() {
        String res = "Espèce : "+espece+", genre : "+genre+", poids : "+poidsEnKg + " kg"+", taille : "+tailleEnCm + " cm";
        return res;
    }
    
    

    public void afficher() {
        
        System.out.println("__________________________________");
        System.out.println("Espèce : "+espece);
        System.out.println("Genre : "+genre);
        System.out.println("Poids : "+poidsEnKg + " kg");
        System.out.println("Taille : "+tailleEnCm + " cm");
        System.out.println("__________________________________");
    }
    
    public Animal() {
        nbAnimaux++;
    }
    
    
    
}
