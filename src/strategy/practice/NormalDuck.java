package strategy.practice;

import strategy.practice.fly.FlyInterface;
import strategy.practice.fly.FlyNormal;
import strategy.practice.quack.QuackInterface;
import strategy.practice.quack.QuackQuack;

public class NormalDuck extends DDuck{
    Interface i;
    Impl impl;

    public NormalDuck() {
        i = new Interface();
        impl = i.middle();
    }

    @Override
    public void Display() {
        impl.getF().fly();
        impl.getQ().quack();
        swim();
    }
}
