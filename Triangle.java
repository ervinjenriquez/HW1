public class Triangle {

	private int side1;
	private int side2;
	private int side3;
	
	public Triangle(int newSide1, int newSide2, int newSide3) {
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
	}
	
	public int getSide1() {
		return side1;
	}
	
	public int getSide2() {
		return side2;
	}
	
	public int getSide3() {
		return side3;
	}
	
	public String toString() {
		return "{Side1: " + side1 + ", Side2: " + side2 + ". Side3: " + side3 + "}";
	}
	
	public String isEquilateral() {
		
		String message = "";
		
		if (side1 == side2 && side2 == side3 && side3 == side1 ) {
			message = "The triangle is equilateral.";
		} else {
			message = "The triangle is not equilateral.";
		}
		return message;
	}
	
	public String isIsoceles() {
		
		String message = "";
		
		if ((side1 == side2 && side2 != side3) || (side1 != side2 && side3 == side1) || (side3 == side2 && side3 != side1)) {
			message = "The triangle is Isosceles.";
		} else {
			message = "The triangle is not isosceles.";
		}
		return message;
	}
	
	public String isScalene() {
		String message = "";
		
		if (side1 != side2 && side2 != side3 && side3 != side1 ) {
			message = "The triangle is scalene.";
		} else {
			message = "The triangle is not scalene.";
		}
		return message;
	}
}
