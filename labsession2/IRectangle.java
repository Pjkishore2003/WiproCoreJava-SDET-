package labsession250725;

public class IRectangle implements IShape {
	double length = 5;
	double width= 3;
	
	//override
	public double getArea() {
		return length*width;
	}

}
