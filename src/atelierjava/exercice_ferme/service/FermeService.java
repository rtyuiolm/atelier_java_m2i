/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.dao.FermeDAO;
import atelierjava.exercice_ferme.entite.Ferme;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class FermeService {
    
    
    //private static ArrayList<Ferme> fermes = new ArrayList<>();
            
    /**
     * pseudo: 3 à 8 lettres
     * mdp: 5 à 10 lettres
     * pseudo unique
     * mdp : au moins une maj et un chiffre
     * @param pseudo
     * @param mdp 
     */
    public void inscription(String pseudo, String mdp) {
        if(! pseudo.matches(".{3,8}")) {
            throw new RuntimeException("Le pseudo doit contenir de 3 à 8 lettres");
        }
        
        if(! mdp.matches(".{5,10}")) {
            throw new RuntimeException("Le mot de passe doit contenir de 5 à 10 lettres");
        }
        
        if(! mdp.matches(".*\\d.*")) {
            throw new RuntimeException("Le mot de passe doit contenir au moins un chiffre.");
        }
       
        if(! mdp.matches(".*[A-Z].*")) {
            throw new RuntimeException("Le mot de passe doit contenir au moins une majuscule.");
        }
        
        FermeDAO fdao = new FermeDAO();
        if(fdao.existe(pseudo)) {
            throw new RuntimeException("Ce pseudo est déjà pris.");
        }
        
        //Ajouter la ferme en BDD
        Ferme ferme = new Ferme();
        ferme.setNom(pseudo);
        ferme.setMotDePasse(mdp);
        fdao.ajouter(ferme);
    }
}
