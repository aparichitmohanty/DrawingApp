/**
 * This is Just a Simple Spring Bean class which have one draw() method to draw a Triangle. 
 */
package in.lif;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Triangle is Drawn");
	}
}