/**
 * Created by 45019 on 2017/10/16.
 */
public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }
}
