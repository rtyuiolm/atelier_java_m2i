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
public class Fermier {

    private String nom;
    private String prenom;
    private String specialite;

    @Override
    public String toString() {
        return "Fermier{" + "nom=" + nom + ", prenom=" + prenom + ", specialite=" + specialite + '}';
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    
    
}
