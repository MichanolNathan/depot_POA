/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.p10.miage.rps.model;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Nathan
 */
public class RockPaperScissorsNGTest {
    
    public RockPaperScissorsNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testResultPlay() {
        System.out.println("resultPlay");
        RockPaperScissors instance = new RockPaperScissors();
        Result expResult = null;
        Result result = instance.resultPlay();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }
    
}
