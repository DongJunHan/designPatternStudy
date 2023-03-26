import adaptor.*;

public class AdaptorSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdaptor(turkey);
        turkey.gobble();
        turkeyAdaptor.quack();
        duck.quack();

    }
}
