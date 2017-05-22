package Model;

public class RedheadDuck extends Duck{
	public RedheadDuck() {
	      quackBehavior = new Quack();
	      flyBehavior = new FlyWithRocket();
	   }

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("RedHeadDuck会游泳。");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这是只RedHeadDuck。");
	}
}
