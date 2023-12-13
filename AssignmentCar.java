package week1.day1;

public class AssignmentCar {

	public static void main(String[] args) {
		
		AssignmentCar sea=new AssignmentCar();
				
		sea.applybreak();
		sea.applyAcclerate();
		sea.applyGear();
		sea.switchOAc();
		
	}
	
	public void applybreak() {
		
		System.out.println("Break is applied");

	}
	public void applyGear() {
		
		System.out.println("Gear has been applied");
	}
	public void switchOAc() {
		
		System.out.println("Ac has been turned on");
	}
	public void applyAcclerate() {
		
		System.out.println("Accelration has been applied");
	}
}
