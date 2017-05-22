package Model;

public class MallardDuck extends Duck{
	   public MallardDuck() {
		      quackBehavior = new Quack();
		      flyBehavior = new FlyWithWings();
		   }

		@Override
		public void swim() {
			// TODO Auto-generated method stub
			System.out.println("MallardDuck会游泳。");
		}

		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("这是只MallardDuck。");
		}
}
