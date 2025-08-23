package labsession250725;

public class IShapemain {
	public static void main(String[]args) {
		IRectangle rt = new IRectangle();
		ICircle cr = new ICircle();
		ITriangle tr = new ITriangle();
		System.out.println(rt.getArea());
		System.out.println(cr.getArea());
		System.out.println(tr.getArea());
	}

}
