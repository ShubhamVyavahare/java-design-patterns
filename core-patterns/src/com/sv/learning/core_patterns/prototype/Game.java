package com.sv.learning.core_patterns.prototype;

public class Game implements Cloneable {

    private int id;
    private String name;
    private Membership membership;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Game clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        game.setMembership(new Membership());
        return game;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", membership=" + membership +
                '}';
    }
}
