import fr.p10.miage.rps.test.model.RPSEnum;
import fr.p10.miage.rps.test.model.RockPaperScissors;

public class Main {

    public static void main(String[] args) {


        RockPaperScissors rps = new RockPaperScissors();

        System.out.println(rps.winPlay(RPSEnum.Scissors,RPSEnum.Paper));
    }
}
