package com.core.patterns.creational.prototype;

public class Game implements Cloneable {

    private int id;
    private String name;
    private Membership membership;

    //    @Override
//    protected Game clone() throws CloneNotSupportedException { // shallow copy
//        return (Game) super.clone();
//    }

    @Override
    protected Game clone() throws CloneNotSupportedException { // deep  [no circular dependency!]
        Game game = (Game) super.clone();
        game.setMembership(new Membership());
        return game;
    }

    Game() {}
    Game(Game game) { // deep copy constructor
        this.id = game.id;
        this.name = game.name;
        this.membership = new Membership();
    }

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
