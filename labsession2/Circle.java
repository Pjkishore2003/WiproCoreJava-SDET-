package labsession250725;

public class Circle implements circleshape {
	public void draw() {
		System.out.println("drawing circle");
	}
	public void radius() {
		System.out.println("Radius is 5 units");
	}
	public static void main(String[]args) {
		Circle c = new Circle();
		c.draw();
		c.radius();
	}

}
