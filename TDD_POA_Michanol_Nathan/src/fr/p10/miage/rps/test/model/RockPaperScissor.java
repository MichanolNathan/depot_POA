package fr.p10.miage.rps.test.model;

public class RockPaperScissor {


    public Result play(RPSEnum p1,RPSEnum p2){

        if(p1.equals(RPSEnum.ROCK) && p2.equals(RPSEnum.SCISSORS))
            return Result.WIN;
        else if(p1.equals(RPSEnum.SCISSORS) && p2.equals(RPSEnum.PAPER))
            return Result.WIN;
        else if (p1.equals(RPSEnum.PAPER) && p2.equals(RPSEnum.ROCK))
            return Result.WIN;
        else if (p1.equals(p2))
            return Result.TIE;
        else
            return Result.LOST;

    }

    public Result play(Player p1, Player p2){

        return Result.LOST;
    }
}
