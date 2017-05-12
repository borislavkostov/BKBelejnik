import java.util.ArrayList;
import java.util.List;

public class Student {
	private String firstname;
	private String lastName;
	private List<Grade> grades = new ArrayList<>();
	public Student(String firstname, String lastName, List<Grade> grades) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.grades = grades;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Grade> getGrades() {
		return grades;
	}
	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
	
}
