package Main;

public class Faculty extends Student{
	private String facultyInitial;
    private String department;
	public Faculty() {
		super();
	}
	public Faculty(String facultyInitial, String department) {
		super();
		this.facultyInitial = facultyInitial;
		this.department = department;
	}
	public String getFacultyInitial() {
		return facultyInitial;
	}
	public void setFacultyInitial(String facultyInitial) {
		this.facultyInitial = facultyInitial;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override 
	public String toString() {
		return "Faculty Initial: " + facultyInitial +"\n"+ 
	           "Department=" + department;
	}
    

}
