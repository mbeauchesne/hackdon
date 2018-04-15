package Teacher_Stress;
/**
*
* @author Zekai Li
*
* Lab 03 - The class Teacher
*
*/
public abstract class Teacher {
	private int email;
	private int age;
	private int eccen;
	private double Stress;
	private double Respect;

	Teacher(int age, int mail) {
		this.age = age;
		this.email = mail;
		this.eccen = 0;
	}

	// getters and setters
	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEccen() {
		return eccen;
	}

	public void setEccen(int eccen) {
		this.eccen = eccen;
	}

	public double getStress() {
		return Stress;
	}

	public void setStress(double s) {
		this.Stress = s;
	}

	public double getRespect() {
		return Respect;
	}

	public void setRespect(double r) {
		if(r<0)
			this.Respect = 0;
		else 
			this.Respect = r;
	}

	// compute the stress and respect
	public void computeStress() {
		Stress = this.email;
		if (Stress > 1000)
			this.Stress = 1000;
	}

	public void computeRespect() {
		Respect = this.age - this.eccen;
		if (Respect < 0)
			Respect = 0;
	}

	// receive mail
	public void receiveMail(int mail) {

		// receive new email and recompute stress and respect
		this.email += mail;
		this.computeStress();
		this.computeRespect();

		// randomly change the eccentricities
		int n = (int) (Math.random() * 100);
		if (n >= 80) {
			int m = (int) (Math.random() * 100);
			if (m >= 50)
				this.eccen += 2;
			else
				this.eccen -= 2;
		}

		// may call cope()
		if (this.Stress > this.Respect) {
			cope();
		}
	}

	// Cope
	abstract void cope();

	public String toString() {
		return "Age: " + this.age + ", unread e-mail messages: " 
				+ this.email + ", eccentricities: " + this.eccen;
	}
}
