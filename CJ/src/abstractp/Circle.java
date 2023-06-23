package abstractp;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Making a circle.........");
		
	}

	@Override
	public float getArea() {
		float radius = 10;
		return (float)Math.PI * radius * radius;
	}
	

}
