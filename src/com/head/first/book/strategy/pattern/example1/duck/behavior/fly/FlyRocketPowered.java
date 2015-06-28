package com.head.first.book.strategy.pattern.example1.duck.behavior.fly;

/**
 * Created by miguel on 28/06/15.
 */
public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
