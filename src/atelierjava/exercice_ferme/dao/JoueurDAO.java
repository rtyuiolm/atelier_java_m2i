/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Joueur;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class JoueurDAO {
    
    private static ArrayList<Joueur> joueurs = new ArrayList<>();
    
    public void ajouter(Joueur ferme) {
        joueurs.add(ferme);
    }
    
    public Joueur recherche(String login) {
        for(Joueur j : joueurs) {
            if(j.getPseudo().equals(login)) {
                return j;
            }
        }
        return null;
    }
    
    public boolean existe(String login, String mdp) {
        for(Joueur j : joueurs) {
            if(j.getPseudo().equals(login) && j.getMotDePasse().equals(mdp)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean existe(String login) {
        Joueur j = this.recherche(login);
        if(j==null) {
            return false;
        }
        return true;
    }
}
