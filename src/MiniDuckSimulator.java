import strategy.Duck;
import strategy.FlyRocketPower;
import strategy.MallarDuck;
import strategy.ModelDuck;

public class MiniDuckSimulator{
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPower());
        model.performFly();

    }
}
