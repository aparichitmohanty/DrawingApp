/**
 * This is a simple Drawing Java Application, used to draw a Triangle & Circle.
 * This used the Dependency Injection by using Interface (Also called "Method" Injection.).
 * It uses Class Member Variable.
 */

package in.lif;

public class MainApplication {

	public static void main(String[] args) {
		
		//Main Application Changed
		
		Shape triangleShape = new Triangle();
		Shape circleShape = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.setShape(triangleShape);
		drawing.drawShape();
		
		drawing.setShape(circleShape);
		drawing.drawShape();
	}
}