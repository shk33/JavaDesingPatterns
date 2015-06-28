package com.head.first.book.strategy.pattern.example1.duck;

import com.head.first.book.strategy.pattern.example1.duck.behavior.fly.FlyWithWings;
import com.head.first.book.strategy.pattern.example1.duck.behavior.quack.Quack;

/**
 * Created by miguel on 26/06/15.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("Im a real Mallard com.head.first.book.strategy.pattern.example1.pattern.duck.Duck");
    }
}

