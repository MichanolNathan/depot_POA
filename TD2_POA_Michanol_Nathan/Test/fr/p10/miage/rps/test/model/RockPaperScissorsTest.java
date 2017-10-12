package fr.p10.miage.rps.test.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class RockPaperScissorsTest {
    private RockPaperScissors rps;

    @BeforeMethod
    public void setUp() throws Exception {
        this.rps = new RockPaperScissors();
    }

    @Parameters({"Paper","Rock"})
    @Test
    public void testPlay(String p1, String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)),Result.Lost);
    }
    @Parameters({"Rock","Scissors"})
    @Test
    public void winPlay(String p1,String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)),Result.Win);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        rps = null;
    }


}