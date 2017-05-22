package Test;
import org.junit.Test;
import Model.Duck;
import Model.RubberDuck;
import Model.MallardDuck;
import Model.RedheadDuck;
public class DuckSimulator {
			@Test
			public void RubberDuck() {
			      Duck RubberDuck = new RubberDuck();
			      System.out.println("RubberDuck:");
			      RubberDuck.display();
			      RubberDuck.swim();
			      RubberDuck.performQuack();
			      RubberDuck.performFly();	
			      System.out.println("=====================");
			   }
			@Test
			public void MallardDuck() {
			      Duck MallardDuck = new MallardDuck();
			      System.out.println("MallardDuck:");
			      MallardDuck.display();
			      MallardDuck.swim();
			      MallardDuck.performQuack();
			      MallardDuck.performFly();		
			      System.out.println("=====================");
			   }
			@Test
			public void RedheadDuck() {
			      Duck RedHeadDuck = new RedheadDuck();
			      System.out.println("RedHeadDuck:");
			      RedHeadDuck.display();
			      RedHeadDuck.swim();
			      RedHeadDuck.performQuack();
			      RedHeadDuck.performFly();		      
			   }
}
