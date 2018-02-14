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
public class Personne {
    private String nom;
    private int age;
    private static int ageMin = 0;
    private static int ageMax = 0;

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public void setAge(int age) {
        this.age = age;
        if(ageMin == 0) {
            ageMin = age;
            ageMax = age;
        } else {
            if(age < ageMin) {
               ageMin = age;
            }
            if(age > ageMax) {
               ageMax = age;
            }
        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static int getAgeMin() {
        return ageMin;
    }

    public static int getAgeMax() {
        return ageMax;
    }
    
}
