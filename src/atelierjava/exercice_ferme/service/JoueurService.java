/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.dao.JoueurDAO;
import atelierjava.exercice_ferme.dao.RessourceDAO;
import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.entite.Ressource;
import atelierjava.exercice_ferme.exception.PseudoExisteException;
import atelierjava.exercice_ferme.exception.ValidationException;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class JoueurService {
    
    public void ajouterRessource(Long joueurId, Ressource.TypeRessource typeRessource, long quantite) {
        //Genere les ressources si aucune ressource
        JoueurDAO jdao = new JoueurDAO();
        Joueur joueur = jdao.rechercher(joueurId);
    
            int i;
            for(i=0;i<quantite;i++) {
                Ressource ressource = new Ressource();
                ressource.setDesignation(typeRessource);
                ressource.setJoueur(joueur);
                joueur.getRessourcesPossedees().add(ressource);
            
                RessourceDAO rdao = new RessourceDAO();
            
                rdao.ajouter(ressource);
            }
    }
    
    public void rejoindrePartie(long idJoueur) {
        
        //Genere les ressources si aucune ressource
        JoueurDAO jdao = new JoueurDAO();
        Joueur joueur = jdao.rechercher(idJoueur);
    
        if(joueur.getRessourcesPossedees().isEmpty()) {
            // Ajouter 5 carottes
            ajouterRessource(idJoueur, Ressource.TypeRessource.CAROTTE, 5);
            // Ajouter 5 blés
            ajouterRessource(idJoueur, Ressource.TypeRessource.BLE, 5);
            // Ajouter 5 chèvres
            ajouterRessource(idJoueur, Ressource.TypeRessource.CHEVRE, 5);
            // Ajouter 2 fermiers
            ajouterRessource(idJoueur, Ressource.TypeRessource.FERMIER, 2);
        }
    
    }
    
    //private static ArrayList<Ferme> fermes = new ArrayList<>();
            
    /**
     * pseudo: 3 à 8 lettres
     * mdp: 5 à 10 lettres
     * pseudo unique
     * mdp : au moins une maj et un chiffre
     * @param pseudo
     * @param mdp 
     */
    public void inscription(String pseudo, String mdp) throws ValidationException, PseudoExisteException {
        if(! pseudo.matches(".{3,8}")) {
            throw new ValidationException("Le pseudo doit contenir de 3 à 8 lettres");
        }
        
        if(! mdp.matches(".{5,10}")) {
            throw new ValidationException("Le mot de passe doit contenir de 5 à 10 lettres");
        }
        
        if(! mdp.matches(".*\\d.*")) {
            throw new ValidationException("Le mot de passe doit contenir au moins un chiffre.");
        }
       
        if(! mdp.matches(".*[A-Z].*")) {
            throw new ValidationException("Le mot de passe doit contenir au moins une majuscule.");
        }
        
        JoueurDAO fdao = new JoueurDAO();
        if(fdao.existe(pseudo)) {
            throw new PseudoExisteException("Ce pseudo est déjà pris.");
        }
        
        //Ajouter la ferme en BDD
        Joueur ferme = new Joueur();
        ferme.setPseudo(pseudo);
        ferme.setMotDePasse(mdp);
        fdao.ajouter(ferme);
    }
    
    public Joueur connexion(String pseudo, String mdp) {
        JoueurDAO fdao = new JoueurDAO();
        Joueur j = fdao.rechercher(pseudo, mdp);
        
        return j;
    }
}
