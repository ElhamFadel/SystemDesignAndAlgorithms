package factorymethodexample.entities;

public class ParttimeEmployee extends Employee{

	int noOfHours;
	float hourRate;
	
	public int getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
	public float getHourRate() {
		return hourRate;
	}
	public void setHourRate(float hourRate) {
		this.hourRate = hourRate;
	}

}
