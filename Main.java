package Quiz1;

import MotorGetterSetter.Motor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Bird eagle = new Bird();
	Bird amazon = new Bird();
	Bird cardinal = new Bird();
	Bird owls = new Bird();
	
	System.out.println();
		
	eagle.setBreed();
	eagle.setColour();
	eagle.setSize();
	eagle.setClassification();
	
	System.out.println();
	
	amazon.setBreed();
	amazon.setColour();
	amazon.setSize();
	amazon.setClassification();
	
	System.out.println();
	
	cardinal.setBreed();
	cardinal.setColour();
	cardinal.setSize();
	cardinal.setClassification();
	
	System.out.println();
	
	owls.setBreed();
	owls.setColour();
	owls.setSize();
	owls.setClassification();
	
	System.out.println();
	
	System.out.println("Breed: " + eagle.getBreed());
	System.out.println("Colour: " + eagle.getColour());
	System.out.println("Size: " + eagle.getSize());
	System.out.println("Classification: " + eagle.getClassification());
	
	System.out.println();
	
	System.out.println("Breed: " + amazon.getBreed());
	System.out.println("Colour: " + amazon.getColour());
	System.out.println("Size: " + amazon.getSize());
	System.out.println("Classification: " + amazon.getClassification());
	
	System.out.println();
	
	System.out.println("Breed: " + cardinal.getBreed());
	System.out.println("Colour: " + cardinal.getColour());
	System.out.println("Size: " + cardinal.getSize());
	System.out.println("Classification: " + cardinal.getClassification());
	
	System.out.println();
	
	System.out.println("Breed: " + owls.getBreed());
	System.out.println("Colour: " + owls.getColour());
	System.out.println("Size: " + owls.getSize());
	System.out.println("Classification: " + owls.getClassification());
	}

}
