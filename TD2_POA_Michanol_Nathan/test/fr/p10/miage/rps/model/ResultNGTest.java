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
public class ResultNGTest {
    
    public ResultNGTest() {
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
    public void testValues() {
        System.out.println("values");
        Result[] expResult = null;
        Result[] result = Result.values();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Result expResult = null;
        Result result = Result.valueOf(name);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }
    
}
