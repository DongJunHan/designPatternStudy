package strategy.practice.fly;

import strategy.practice.fly.FlyInterface;

public class FlyNormal implements FlyInterface {
    @Override
    public void fly() {
        System.out.println("날개로 난다.");
    }
}
