package com.head.first.book.strategy.pattern.example1.duck;

import com.head.first.book.strategy.pattern.example1.duck.behavior.fly.FlyNoWay;
import com.head.first.book.strategy.pattern.example1.duck.behavior.quack.Quack;

/**
 * Created by miguel on 28/06/15.
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a Model com.head.first.book.strategy.pattern.example1.pattern.duck.Duck");
    }

}
