package Teacher_Stress;
/**
*
* @author Zekai Li
*
* Lab 03 - The class Grad_Student
*
*/
public class Grad_Student extends Teacher {
	Grad_Student(int age, int mail) {
		super(age, mail);
	}

	// rewrite the computeStress for graduate students
	public void computeStress() {

		if (this.getEmail() * 1.5 > 1500)
			this.setStress(1500);
		else
			this.setStress(this.getEmail() * 1.5);
	}

	public String toString() {
		return "Type : Grad Student. Age: " + this.getAge() 
				+ ", unread e-mail messages: " + this.getEmail()
				+ ", eccentricities: " + this.getEccen();
	}

	public void cope() {
		System.out.println(this.toString());
		System.out.println("Before cope -- Stress: " 
							+ this.getStress() + ". Respect: " + this.getRespect());

		this.setEmail(0);

		// randomly the eccen up or down
		int m = (int) (Math.random() * 100);
		if (m < 50)
			this.setEccen(this.getEccen() + 3);
		else
			this.setEccen(this.getEccen() - 3);
		this.computeRespect();
		this.computeStress();

		System.out.println("After cope -- Stress: " 
							+ this.getStress() + ". Respect: " + this.getRespect());
		
		System.out.println();// make the output clearer
	}
}
