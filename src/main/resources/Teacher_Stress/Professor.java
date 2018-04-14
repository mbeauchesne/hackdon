
package Teacher_Stress;

/**
*
* @author Zekai Li
*
* Lab 03 - The class Professor
*
*/
public class Professor extends Teacher {

	public Professor(int age, int mail) {
		super(age, mail);
		this.setRespect(this.getAge() + this.getEccen());
	}

	// rewrite the computeRespect for professor
	public void computeRespect() {
		this.setRespect(this.getAge() + this.getEccen());
	}

	public String toString() {
		return "Type : Professor. Age: " + this.getAge() 
				+ ", unread e-mail messages: " + this.getEmail()
				+ ", eccentricities: " + this.getEccen();
	}

	public void cope() {
		System.out.println(this.toString());
		System.out.println("Before cope -- Stress: " 
							+ this.getStress() + ". Respect: " + this.getRespect());

		this.setEccen(this.getEccen() + 30);
		this.computeRespect();
		this.computeStress();

		System.out.println("After cope -- Stress: " 
							+ this.getStress() + ". Respect: " + this.getRespect());
		
		System.out.println();// make the output clearer
	}
}
