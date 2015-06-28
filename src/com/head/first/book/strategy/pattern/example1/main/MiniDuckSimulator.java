package com.head.first.book.strategy.pattern.example1.main;

import com.head.first.book.strategy.pattern.example1.duck.ModelDuck;
import com.head.first.book.strategy.pattern.example1.duck.behavior.fly.FlyRocketPowered;
import com.head.first.book.strategy.pattern.example1.duck.Duck;
import com.head.first.book.strategy.pattern.example1.duck.MallardDuck;

/**
 * Created by miguel on 28/06/15.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}