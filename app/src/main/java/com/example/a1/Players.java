package com.example.a1;

import java.io.Serializable;

public class Players implements Serializable {
    private String PlayerName;
    private int score;
    private int ballsPlayed;

    Players(String PlayerName,int score,int ballsPlayed){
        this.PlayerName=PlayerName;
        this.score=score;
        this.ballsPlayed=ballsPlayed;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score= score;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public void setBallsPlayed(int ballsPlayed) {
        this.ballsPlayed = ballsPlayed;
    }
}

