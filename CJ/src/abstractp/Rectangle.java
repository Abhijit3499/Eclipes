package abstractp;

public final class Rectangle extends Shape {   
	
	public Rectangle() {
		
	}

	@Override
	public void draw() {
		System.out.println("Making a Rectangle.............");
		
	}

	@Override
	public float getArea() {
		float length =5.0f;
		float bredth = 7.0f;
		return length*bredth;
	}

}
