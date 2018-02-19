/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

/**
 *
 * @author Formation
 */
public class FermeService {
    
    /**
     * pseudo: 3 à 8 lettres
     * mdp: 5 à 10 lettres
     * pseudo unique
     * mdp : au moins une maj et un chiffre
     * @param pseudo
     * @param mdp 
     */
    public void inscription(String pseudo, String mdp) {
        if(pseudo.length()<3 || pseudo.length()>8) {
            System.out.println("Le pseudo doit contenir de 3 à 8 lettres");
        }
        if(mdp.length()<5 || mdp.length()>10) {
            System.out.println("Le mot de passe doit contenir de 5 à 10 lettres");
        }
        
        boolean contientUnChiffre=false;
        int i;
        for(i=0;i<mdp.length();i++) {
            /*if(! Character.isDigit(mdp[i])) {
                contientUnChiffre=true;
            }*/
        }
       
    }
}
