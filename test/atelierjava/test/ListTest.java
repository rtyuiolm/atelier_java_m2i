/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.math.BigInteger;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class ListTest {
    
    @Test
    public void factorielleAvecBigIntegerOK() {
        int i;
        int n=50;
        ArrayList<BigInteger> factorielles = new ArrayList();
        factorielles.add(BigInteger.ONE);
        for(i=1;i<=n;i++) {
            factorielles.add(factorielles.get(i-1).multiply(new BigInteger(Integer.toString(i))));
        }
        
        for(i=1;i<=n;i++) {
            System.out.println(String.format("%3d!=%80s", i,factorielles.get(i).toString()));
        }
    }
    
    @Test
    public void factorielleOK() {
        int i;
        int n=50;
        ArrayList<Integer> factorielles = new ArrayList();
        factorielles.add(1);
        for(i=1;i<=n;i++) {
            factorielles.add(factorielles.get(i-1)*i);
        }
        
        for(i=0;i<=n;i++) {
            System.out.println(String.format("%3d!=%80d", i,factorielles.get(i)));
        }
    }
    
    @Test
    public void nombresPremiersOK() {
        ArrayList<Integer> nombresPremiers = new ArrayList();
        int i=2;
        boolean estPremier;
        while(nombresPremiers.size()<50) {
            estPremier=true;
            for(Integer p : nombresPremiers) {
                if(i%p==0) {
                    estPremier=false;
                    break;
                }
            }
            if(estPremier) {
                nombresPremiers.add(i);
            }
            i++;
        }
        
        for(Integer n: nombresPremiers) {
            System.out.println(n);
        }
        
    }
    
    @Test
    public void addAvecIndiceOK() {
        
        ArrayList<Integer> nombresPremiers = new ArrayList();
        
        nombresPremiers.add(2);
        nombresPremiers.add(5);
        
        nombresPremiers.add(1,3);
        
        for(Integer i: nombresPremiers) {
            System.out.println(i);
        }
    }
    
    @Test
    public void removeOK() {
        
        ArrayList<String> capitales = new ArrayList<>();
        
        capitales.add("Paris");
        capitales.add("Madrid");
        capitales.add("Rome");
        
        for(String cap : capitales) {
            System.out.println(cap);
        }
    }
    
}
