package fr.p10.miage.rps.test.model;

public enum RPSEnum {

    ROCK ("Rock"),
    PAPER ("Paper"),
    SCISSORS ("Scissors");



    private String mouvement;

    RPSEnum(String name){
        this.mouvement = name;
    }
}
