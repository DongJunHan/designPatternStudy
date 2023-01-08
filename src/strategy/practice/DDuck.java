package strategy.practice;

import strategy.practice.fly.FlyInterface;
import strategy.practice.quack.QuackInterface;

public abstract class DDuck {
    FlyInterface flyInterface;
    QuackInterface quackInterface;

    public void performFly() {
        flyInterface.fly();
    }
    public void performQuack() {
        quackInterface.quack();
    }
    public void setFlyInterface(FlyInterface flyInterface) {
        this.flyInterface = flyInterface;
    }

    public void setQuackInterface(QuackInterface quackInterface) {
        this.quackInterface = quackInterface;
    }
    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다. 짜가오리도 뜨죠");
    }
    public abstract void  Display();
}
