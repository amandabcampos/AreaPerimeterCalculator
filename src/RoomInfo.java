import java.util.Scanner;

public class RoomInfo {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		boolean looping = true;
		while(looping) {
		
			System.out.print("Enter Length: ");
			double length = scnr.nextDouble();
			
			System.out.print("Enter Width: ");
			double width = scnr.nextDouble();
			
			System.out.print("Enter Height: ");
			double heigth = scnr.nextDouble();
			
			double area = length * width;
			double perimeter = 2 * length + 2 * width;
			double volume = length * width * heigth;
			
			System.out.println("Area: " + area + "\nPerimeter: " + perimeter + "\nVolume: " + volume);
			
			System.out.print("Continue? (y/n): ");
			String repeat = scnr.next();
				
			if (repeat.equalsIgnoreCase("n")) {
				System.out.print("Goodbye.");
				looping = false;
			}
		}
		scnr.close();	
	}
}