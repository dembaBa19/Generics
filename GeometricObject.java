package Generics;

public abstract class GeometricObject {
	private String colour = "white";
	private boolean filled;
	
	public GeometricObject() {
		
	}
	
	public 
	
	public boolean Comparable(GeometricObject a) {
		if(this.getArea()>a.getArea()) {
			return true;
		} else {
			return false;
		}
	}
	
	public abstract double getArea();

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean getFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

}
