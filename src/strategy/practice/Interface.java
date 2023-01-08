package strategy.practice;

import strategy.practice.fly.FlyInterface;
import strategy.practice.fly.FlyRocketLuncher;
import strategy.practice.quack.QuackInterface;
import strategy.practice.quack.QuackQuack;

public class Interface {
    public Impl middle() {
        return new Impl(fi(), qi());
    }

    public FlyInterface fi() {
        return new FlyRocketLuncher();
    }
    public QuackInterface qi() {
        return new QuackQuack();
    }
}
