package Model;

public class RubberDuck extends Duck{
	public RubberDuck() {
	      quackBehavior = new Squeak();
	      flyBehavior = new FlyNoWay();
	   }
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("RubberDuck������Ӿ��");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("����ֻRubberDuck��");
	}
}
