package Teacher_Stress;
/**
*
* @author Zekai Li
*
* Lab 03 - The class Main
*
*/
public class Main {

	public static void main(String[] args) {

		// Test the university without contract faculty
		University u = new University();
		u.add(new Professor(50, 10));
		u.add(new Lecturer(27, 4));
		u.add(new Grad_Student(23, 2));

		//check the toString of University
		System.out.println(u);
		
		//send e-mails to teachers
		for (int x = 1; x <= 10; x++) {
			u.sendThemMail(x * 10 + 50);
		}

		//check the toString of University
		System.out.println(u);
		
		// Test the university with contract faculty
		University u2 = new University();
		u2.add(new Professor(50, 10));
		u2.add(new ContractFaculty(40, 10, 10));
		u2.add(new Grad_Student(23, 2));
		u2.add(new ContractFaculty(30, 2, 5));
		for (int x = 1; x <= 5; x++) {
			u2.sendThemMail(x * 10 + 50);
		}
		u2.IncrementYearsOfServiceOfContractFacultyTeachers();

		// check if the years of service have been changed
		System.out.println(((ContractFaculty) u2.lis.get(1)).getServiceYears());
		System.out.println(((ContractFaculty) u2.lis.get(3)).getServiceYears());
		System.out.println(u2.lis.get(1).getRespect());
	}

}
