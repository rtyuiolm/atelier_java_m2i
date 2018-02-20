/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.test;

import atelierjava.exercice_ferme.service.FermeService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class FermeServiceTest {
    
    @Test
    public void inscriptionOK() {
        FermeService fs1 = new FermeService();
        
        fs1.inscription("abcd", "A2azertt");
    }
    
    @Test(expected = RuntimeException.class)
    public void inscriptionKO() {
        FermeService fs2 = new FermeService();
        
        fs2.inscription("abcd", "aaaa123");
    }
}
