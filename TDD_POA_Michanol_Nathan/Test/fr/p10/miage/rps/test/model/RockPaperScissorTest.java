package fr.p10.miage.rps.test.model;

import com.sun.tracing.dtrace.ProviderAttributes;
import org.testng.annotations.*;

import java.util.List;

import static org.testng.Assert.*;

public class RockPaperScissorTest {

    private RockPaperScissor rps;
    private List<RPSEnum> lesMouvementsP1;
    private List<RPSEnum> lesMouvementsP2;
    private Player p1;
    private Player p2;
    @BeforeMethod
    public void setUp() throws Exception
    {
        this.rps = new RockPaperScissor();
        this.p1 = new Player("nathan",0,lesMouvementsP1);
        this.p2 = new Player("ludwig",0,lesMouvementsP2);
    }

    @AfterMethod
    public void TearDown() throws Exception
    {
        this.rps = null;
        this.p1 = null;
        this.p2 = null;
    }

    @DataProvider(name="winData")
    public static Object[][] winData(){
        return new Object[][] {{RPSEnum.PAPER,RPSEnum.ROCK},{RPSEnum.ROCK,RPSEnum.SCISSORS},{RPSEnum.SCISSORS,RPSEnum.PAPER}};
    }
    @DataProvider(name="lostData")
    public static Object[][] lostData(){
        return new Object[][] {{RPSEnum.PAPER,RPSEnum.SCISSORS},{RPSEnum.ROCK,RPSEnum.PAPER},{RPSEnum.SCISSORS,RPSEnum.ROCK}};
    }
    @DataProvider(name="tieData")
    public static Object[][] tieData(){
        return new Object[][] {{RPSEnum.PAPER,RPSEnum.PAPER},{RPSEnum.ROCK,RPSEnum.ROCK},{RPSEnum.SCISSORS,RPSEnum.SCISSORS}};
    }

    @DataProvider(name="mouvementData")
    public static Object[][] mouvementData(){

    };
    
    //@Parameters({"rock","scissors"})
    @Test (dataProvider="winData")
    public void testWinPlay(RPSEnum p1,RPSEnum p2){
        assertEquals(rps.play(p1,p2),Result.WIN);
    }


    @Test (dataProvider = "tieData")
    public void testTiePlay(RPSEnum p1,RPSEnum p2){
        assertEquals(rps.play(p1,p2),Result.TIE);
    }

    @Test (dataProvider = "lostData")
    public void testLostPlay(RPSEnum p1,RPSEnum p2){
        assertEquals(rps.play(p1,p2),Result.LOST);

    }

}