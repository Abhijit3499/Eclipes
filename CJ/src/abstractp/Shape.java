package abstractp;

public abstract class Shape {
	public abstract void draw();
	public abstract float getArea();
	
	public final void erase() {
		System.out.println("Erasing the shape.........");
		
	}
	
	public Shape() {
		
	}

}
