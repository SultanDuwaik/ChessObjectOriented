package com.company;

public class HumanPlayer implements Player{

    private String name;
    private boolean isWhite;


    public HumanPlayer(String name, boolean isWhite){
        this.name = name;
        this.isWhite = isWhite;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isWhite() {
        return isWhite;
    }

    @Override
    public String toString() {
        return "HumanPlayer{" +
                "name='" + name + '\'' +
                ", isWhite=" + isWhite +
                '}';
    }
}
