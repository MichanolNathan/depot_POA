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
public class RPSenumNGTest {
    
    public RPSenumNGTest() {
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
        RPSenum[] expResult = null;
        RPSenum[] result = RPSenum.values();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        RPSenum expResult = null;
        RPSenum result = RPSenum.valueOf(name);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }
    
}
