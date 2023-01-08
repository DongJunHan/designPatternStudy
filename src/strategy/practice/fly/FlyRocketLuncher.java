package strategy.practice.fly;

import strategy.practice.fly.FlyInterface;

public class FlyRocketLuncher implements FlyInterface {
    @Override
    public void fly() {
        System.out.println("로켓런처로 난다.");
    }
}
