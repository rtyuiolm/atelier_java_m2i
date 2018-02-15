/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.HashMap;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class MapTest {
    
    @Test
    public void mapKeySetOK() {
        HashMap<String, String> paysCapitales = new HashMap<>();
        
        paysCapitales.put("Belgique", "Bruxelles");
        paysCapitales.put("France", "Paris");
        paysCapitales.put("Autriche", "Vienne");
        paysCapitales.put("Slovénie", "Ljubljana");
        paysCapitales.put("Serbie", "Belgrade");
        paysCapitales.put("Suède", "Stockholm");
        
        
        
        Set<String> cles = paysCapitales.keySet();
        
        for(String pays : cles) {
            System.out.println(paysCapitales.get(pays)+" : "+pays);
        }
    }
    
    //@Test
    public void mapPutGetOK() {
        HashMap<String, String> paysCapitales = new HashMap<>();
        
        paysCapitales.put("Belgique", "Bruxelles");
        paysCapitales.put("France", "Paris");
        paysCapitales.put("Autriche", "Vienne");
        paysCapitales.put("Slovénie", "Ljubljana");
        paysCapitales.put("Serbie", "Belgrade");
        paysCapitales.put("Suède", "Stockholm");
        
        System.out.println(paysCapitales.get("Serbie"));
        
        paysCapitales.keySet();
    }
    
}
