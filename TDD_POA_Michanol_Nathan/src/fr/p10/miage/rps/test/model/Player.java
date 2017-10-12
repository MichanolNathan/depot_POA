package fr.p10.miage.rps.test.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String nom;
    private int score;
    private List<RPSEnum> lesMouvements;

    public Player(String unNom, int unScore, List<RPSEnum> desMouvements) {
        this.nom = unNom;
        this.score = unScore;
        this.lesMouvements = desMouvements;
    }


    public Player(String unNom, int unScore){
        this.nom = unNom;
        this.score = unScore;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

