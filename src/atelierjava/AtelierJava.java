/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class AtelierJava {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> liste = new ArrayList();
        
        liste.add("Rouge");
        liste.add("Vert");
        liste.add("Jaune");
        
        int i;
        for(i=0;i<liste.size();i++) {
            System.out.println(liste.get(i));
        }
        
        for(String couleur : liste) {
            System.out.println(couleur);
        }
        
    }
    
    public static void mainFerme(String[] args) {
        Fermier f1 = new Fermier();
        f1.setNom("Dubois");
        f1.setPrenom("Jules");
        f1.setSpecialite("Cultivateur");
        
        System.out.println(f1);
    }
    
    public static void mainVarStatiques(String[] args) {
        
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        Personne p3 = new Personne();
        
        p1.setNom("Louis");
        p1.setAge(25);
        p2.setNom("Bertrand");
        p2.setAge(29);
        p3.setNom("Paul");
        p3.setAge(19);
        
        System.out.println("Age minimal : " + Personne.getAgeMin());
        System.out.println("Age maximal : " + Personne.getAgeMax());
    }
    
    public static void mainAnimaux(String[] args) {
        
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        
        a1.espece="cochon";
        a1.genre="sus";
        a1.poidsEnKg=12;
        a1.tailleEnCm=20;
        
        a2.espece="girafe";
        a2.genre="giraffa";
        a2.poidsEnKg=15;
        a2.tailleEnCm=300;
        
        a1.afficher();
        a2.afficher();
        
        System.out.println(a1);
        System.out.println(a2);
        
        System.out.println("Nombre d'animaux : "+Animal.nbAnimaux);
    }
    
}
