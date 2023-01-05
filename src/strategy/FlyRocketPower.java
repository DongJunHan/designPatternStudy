package strategy;

public class FlyRocketPower implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("로켓 추진으루 날아갑니다");
    }
}
