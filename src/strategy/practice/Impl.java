package strategy.practice;

import strategy.practice.fly.FlyInterface;
import strategy.practice.quack.QuackInterface;

public class Impl {
    private final FlyInterface f;
    private final QuackInterface q;

    public Impl(FlyInterface f, QuackInterface q) {
        this.f = f;
        this.q = q;
    }

    public FlyInterface getF() {
        return f;
    }

    public QuackInterface getQ() {
        return q;
    }
}
