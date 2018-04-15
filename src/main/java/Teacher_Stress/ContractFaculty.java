package Teacher_Stress;

/**
 *
 * @author Zekai Li
 *
 *         Lab 03 - The class ContractFaculty
 *
 */
public class ContractFaculty extends Lecturer {
	private int serviceYears;

	ContractFaculty(int age, int mail, int years) {
		super(age, mail);
		this.serviceYears = years;
	}

	public int getServiceYears() {
		return serviceYears;
	}

	public void setServiceYears(int years) {
		this.serviceYears = years;
	}

	public void incrementYearsOfService() {
		this.serviceYears++;
		computeStress();
		computeRespect();
	}


	public void computeStress() {
		double m = Math.random() + 1;
		this.setStress((int) (this.getEmail() * m));
	}
	
	// the assignment : respect = age + 2*serviceYears
	public void computeRespect() {
		this.setRespect(this.getAge() + this.serviceYears * 2);
	}

	public String toString() {
		return "Type : Contract Faculty Teacher. Age: " + this.getAge() 
				+ ", unread e-mail messages: " + this.getEmail()
				+ ", eccentricities: " + this.getEccen() 
				+ ", years Of Service: " + this.serviceYears;
	}

}
