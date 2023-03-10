package strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){};
    public abstract void Display();
    public void performFly(){
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다. 짜가오리도 뜨죠");
    }
}