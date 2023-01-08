package strategy.practice.quack;

import strategy.practice.quack.QuackInterface;

public class QuackQuack implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
