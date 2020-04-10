package com.company;

public class Hero {


    private int health;
    private int damage;
    private int superAbility;

    public Hero(int health, int damage, int superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;

    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;

    }
}
