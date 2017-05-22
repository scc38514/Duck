package Model;

public class MallardDuck extends Duck{
	   public MallardDuck() {
		      quackBehavior = new Quack();
		      flyBehavior = new FlyWithWings();
		   }

		@Override
		public void swim() {
			// TODO Auto-generated method stub
			System.out.println("MallardDuck����Ӿ��");
		}

		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("����ֻMallardDuck��");
		}
}
