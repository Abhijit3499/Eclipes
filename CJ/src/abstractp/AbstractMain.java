package abstractp;

public class AbstractMain {

	public static void main(String[] args) {
		Shape s; 
		s = new Rectangle();
		s.draw();
		System.out.println("Area of Rectangle :"+s.getArea());
		s.erase();
		
		s = new Circle();
		s.draw();
		System.out.println("Area of Circle :"+s.getArea());
		s.erase();

	}

}
