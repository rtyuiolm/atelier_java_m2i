/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.entite;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Joueur {
    private double budget;
    private String pseudo;
    private String motDePasse;
    private ArrayList<Ressource> ressourcesPossedees = new ArrayList<>();
    private ArrayList<Terrain> terrains = new ArrayList<>();

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public ArrayList<Ressource> getRessourcesPossedees() {
        return ressourcesPossedees;
    }

    public void setRessourcesPossedees(ArrayList<Ressource> ressourcesPossedees) {
        this.ressourcesPossedees = ressourcesPossedees;
    }

    public ArrayList<Terrain> getTerrains() {
        return terrains;
    }

    public void setTerrains(ArrayList<Terrain> terrains) {
        this.terrains = terrains;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
    
    
}
