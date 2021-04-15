package Quiz1;

import java.util.Scanner;

public class Bird {

	 String breed;
	 String colour;
	 String size;
	 String classification;
	
	Scanner in = new Scanner(System.in);
	
	//Create Setter Method
	public void setBreed() {
		System.out.println("Enter the breed of bird: ");
		this.breed = in.next();
	}
	
	public void setColour() {
		System.out.println("Enter the colour of bird: ");
		this.colour = in.next();
	}
	
	public void setSize() {
		System.out.println("Enter the size of bird: ");
		this.size = in.next();
	}
	
	public void setClassification() {
		System.out.println("Enter the bird's classification: ");
		this.classification = in.next();
	}
	
	//Create Getter Method
	public String getBreed() {
		return this.breed;
	}
	
	
	public String getColour() {
		return this.colour;
	}
	
	
	public String getSize() {
		return this.size;
	}
	
	
	public String getClassification() {
		return this.classification;
	}
	
}
