/**
 * This is Just a Simple Spring Bean class which have one draw() method to draw a Circle. 
 */
package in.lif;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle is Drawn");
	}
}