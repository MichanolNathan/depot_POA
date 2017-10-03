package fr.p10.miage.rps.test.model;

public class RockPaperScissors {

    public RockPaperScissors(){

    }

    public Result play(RPSEnum p1,RPSEnum p2){

        return Result.Lost;
    }

    public Result winPlay(RPSEnum p1, RPSEnum p2){

        if(p1.equals(RPSEnum.Paper) && p2.equals(RPSEnum.Rock))
            return Result.Win;
        if(p1.equals(RPSEnum.Rock) && p2.equals(RPSEnum.Scissors))
            return Result.Win;
        if(p1.equals(RPSEnum.Scissors) && p2.equals(RPSEnum.Paper))
            return Result.Win;

        return Result.Lost;
    }
}
