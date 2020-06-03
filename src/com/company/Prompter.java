package com.company;

public class Prompter {
    private Game game;

    public Prompter(Game game) {
        this.game = game;
    }

    public void displayProgress(){
        System.out.println(game.getCurrentProgress());
    }

}
