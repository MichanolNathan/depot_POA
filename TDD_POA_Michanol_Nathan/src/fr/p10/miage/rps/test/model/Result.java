package fr.p10.miage.rps.test.model;

public enum Result {

    WIN ("Win"),
    LOST ("Lost"),
    TIE ("Tie");

    private String resultat;

    Result(String result){
        this.resultat = result;
    }
}
