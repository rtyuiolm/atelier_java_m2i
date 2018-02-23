/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.test;

import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.service.JoueurService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class JoueurServiceTest {
    
    @Test
    public void rejoindrePartieOK() {
        JoueurService js = new JoueurService();
        js.inscription("tota", "Art2ol");
        Joueur joueur = js.connexion("tota", "Art2ol");
        js.rejoindrePartie(joueur.getId());
    }
    
    @Test
    public void inscriptionOK() {
        JoueurService js = new JoueurService();
        
        js.inscription("abcd", "A2azertt");
    }
    
    @Test(expected = RuntimeException.class)
    public void inscriptionKO() {
        JoueurService js = new JoueurService();
        
        js.inscription("abct", "aaaa123");
    }
    
    @Test
    public void connexionOK() {
        JoueurService js = new JoueurService();
        
        js.inscription("abcde", "A2azertt");
        js.connexion("abcde", "A2azertt");
    }
    
    @Test(expected = RuntimeException.class)
    public void connexionKO() {
        JoueurService js = new JoueurService();
       
        js.connexion("abcg", "A2ahertt");
    }
}
