/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Ferme;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class FermeDAO {
    
    private static ArrayList<Ferme> fermes = new ArrayList<>();
    
    public void ajouter(Ferme ferme) {
        fermes.add(ferme);
    }
    
    public Ferme recherche(String login) {
        for(Ferme f : fermes) {
            if(f.getNom().equals(login)) {
                return f;
            }
        }
        return null;
    }
    
    public boolean existe(String login) {
        Ferme f = this.recherche(login);
        if(f==null) {
            return false;
        }
        return true;
    }
}
