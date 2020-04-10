package com.company;

public class Main {

    public static void main(String[] args) {


        Boss boss = new Boss(100, 150, "(500) Защита");
        System.out.println("Здоровье (" + boss.getHealth() + ") Урон Босса (" + boss.getDamage() + ")  " + boss.getProtection());


    }


}

