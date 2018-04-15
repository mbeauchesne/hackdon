package Teacher_Stress;

import java.util.ArrayList;

/**
*
* @author Zekai Li
*
* Lab 03 - The class University
*
*/
public class University {
	ArrayList<Teacher> lis;
	
	University(){
		lis = new ArrayList<Teacher>(30);
	}
	
	public void add(Teacher t) {
		this.lis.add(t);
	}
	
	// send mails to all teachers
	public void sendThemMail(int i) {
		for(int x = 0; x<this.lis.size();x++) {
			this.lis.get(x).receiveMail(i);
		}
	}
	
	// output information about all teachers
	public String toString() {
		Teacher t;
		String s = "";
		for(int x = 0; x<this.lis.size();x++) {
			s = s + "Teahcer No." + x + ": " +this.lis.get(x).toString()+"\n";
		}
		return s;
	}
	
	// increase the year of service for contract faculty
	public void IncrementYearsOfServiceOfContractFacultyTeachers() {
		for(int x = 0;x<lis.size();x++) {
			if(lis.get(x) instanceof ContractFaculty) {
				((ContractFaculty)lis.get(x)).incrementYearsOfService();
			}
		}
	}
}
