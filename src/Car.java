
public class Car extends Vehicle {
	
	public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) {
		super(name);
		this.type = type;
		this.gears = gears;
		this.doors = doors;
		this.isManual = isManual;
		this.wheels = wheels;
		currentGear = 1;
	}

	private int wheels;
	
	private String type;
	
	private int doors;
	
	private int gears;
	
	private boolean isManual;
	
	private int currentGear;
	
	public void changeGear(int newGear) {
		this.currentGear = newGear;
		System.out.println("ChangeGear method called: Changed to " + this.currentGear + " gear.");
	}
	
	public void changeSpeed(int newSpeed, int newDirection) {
		move(newSpeed, newDirection);
		System.out.println("change speed method called: Speed -> " + newSpeed + " direction -> " +newDirection);
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}
}
