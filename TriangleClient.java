import java.util.Scanner;

public class TriangleClient {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int inSide1 = 0;
		int inSide2 = 0;
		int inSide3 = 0;
		
		System.out.println("Enter the measurement of side 1.");
		inSide1 = userInput.nextInt();
		
		System.out.println("Enter the measurement of side 1.");
		inSide2 = userInput.nextInt();
		
		System.out.println("Enter the measurement of side 1.");
		inSide3 = userInput.nextInt();		
		
		Triangle inTriangle = new Triangle(inSide1, inSide2, inSide3);
		
		System.out.println(inTriangle.toString());
		System.out.println(inTriangle.isEquilateral());
		System.out.println(inTriangle.isIsoceles());
		System.out.println(inTriangle.isScalene());
	}

}
