package com.head.first.book.strategy.pattern.example1.duck;

import com.head.first.book.strategy.pattern.example1.duck.behavior.fly.FlyBehavior;
import com.head.first.book.strategy.pattern.example1.duck.behavior.quack.QuackBehavior;

/**
 * Created by miguel on 26/06/15.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck (){
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
