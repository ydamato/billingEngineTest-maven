import interfaces.IPatient;

public class Patient implements IPatient{
	private int age;
	private boolean hasMediHealthInsurance;
	
	/**
	 * 
	 * @param age
	 * @param hasMediHealthInsurance
	 */
	public Patient(int age, boolean hasMediHealthInsurance) {
		this.age = age;
		this.hasMediHealthInsurance = hasMediHealthInsurance;
	}
	
	/**
	 * 
	 * @param age
	 */
	public Patient(int age) {
		this.age = age;
		this.hasMediHealthInsurance = false;
	}

	public int getAge() {
		return age;
	}
	
	public boolean hasMediHealthInsurance() {
		return hasMediHealthInsurance;
	}
}
