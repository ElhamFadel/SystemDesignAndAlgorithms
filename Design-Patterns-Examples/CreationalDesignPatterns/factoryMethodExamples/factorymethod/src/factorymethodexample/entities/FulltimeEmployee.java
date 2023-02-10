package factorymethodexample.entities;

public class FulltimeEmployee extends Employee{

	float basicSalary;
	int level;
	boolean hasInsurence;
	
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public boolean isHasInsurence() {
		return hasInsurence;
	}
	public void setHasInsurence(boolean hasInsurence) {
		this.hasInsurence = hasInsurence;
	}

}
