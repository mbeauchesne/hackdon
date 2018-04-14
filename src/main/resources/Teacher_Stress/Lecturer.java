package Teacher_Stress;

/**
*
* @author Zekai Li
*
* Lab 03 - The class Lecturer
*
*/
public class Lecturer extends Teacher{
	Lecturer(int age, int mail){
		super(age, mail);
	}
	
	public String toString() {
		return "Type : Lecturer. Age: "+ this.getAge() +
				", unread e-mail messages: " + this.getEmail()
				+ ", eccentricities: " + this.getEccen();
	}
	
	public void cope() {
		System.out.println(this.toString());
		System.out.println("Before cope -- Stress: "+this.getStress()
							+". Respect: " + this.getRespect());
		
		this.setEmail((int)(this.getEmail()*0.4));
		this.computeRespect();
		this.computeStress();
		
		System.out.println("After cope -- Stress: "+this.getStress()
							+". Respect: " + this.getRespect());
		
		System.out.println();//make the output clearer
	}
}
