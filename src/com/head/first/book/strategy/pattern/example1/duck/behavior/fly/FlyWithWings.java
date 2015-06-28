package com.head.first.book.strategy.pattern.example1.duck.behavior.fly;

/**
 * Created by miguel on 26/06/15.
 */
public class FlyWithWings implements FlyBehavior {
    public void fly(){
        System.out.println("Im flying");
    }
}
