/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Joueur;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Formation
 */
public class JoueurDAO {
    
    public Joueur rechercher(long idJoueur) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Joueur j = em.find(Joueur.class, idJoueur);
        
        return j;
    }
    
    public void ajouter(Joueur j) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        em.persist(j);
        
        em.getTransaction().commit();
    }
    
    public Joueur recherche(String pseudo) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT j FROM Joueur  j WHERE j.pseudo=:pseudoRecherche");
        query.setParameter("pseudoRecherche", pseudo);
        
        Joueur j = (Joueur) query.getSingleResult();
        
        return j;
    }
    
    public Joueur rechercher(String pseudo, String mdp) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        
        Query query = em.createQuery("SELECT j FROM Joueur j WHERE j.pseudo=:pseudoExistant AND j.motDePasse=:mdp");
        query.setParameter("pseudoExistant", pseudo);
        query.setParameter("mdp", mdp);
        
        Joueur j = (Joueur) query.getSingleResult();
        
        return j;
    }
    
    public boolean existe(String pseudo) {
        EntityManager em =Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT COUNT(j) FROM Joueur j WHERE j.pseudo=:pseudoExistant");
        query.setParameter("pseudoExistant", pseudo);
        
        Long nbJoueurs = (Long) query.getSingleResult();
        
        if(nbJoueurs>0) {
            return true;
        }
        
        return false;
    }
}
