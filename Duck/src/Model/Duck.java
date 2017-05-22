package Model;

public abstract class Duck {
	   QuackBehavior quackBehavior;
	   FlyBehavior flyBehavior;
	   
	   
	   public void performQuack() {
		      quackBehavior.quack();
	   }
	   public void performFly() {
		      flyBehavior.fly();
	   }
		public abstract void swim();
		public abstract void display();
	   public void setQuackBehavior(
		         QuackBehavior behavior) {
		      this.quackBehavior = behavior;
		   }
		   public void setFlyBehavior(
			         FlyBehavior behavior) {
			      this.flyBehavior = behavior;
			   }

}