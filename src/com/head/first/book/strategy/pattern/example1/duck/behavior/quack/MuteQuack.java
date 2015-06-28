package com.head.first.book.strategy.pattern.example1.duck.behavior.quack;

/**
 * Created by miguel on 28/06/15.
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<<Silence>>");
    }
}
