package Main;

 class Course {
	 String course_name;
	  String section;
	  String Faculty;
	  String Routine;
	public Course(String course_name, String section, String faculty, String routine) {
		super();
		this.course_name = course_name;
		this.section = section;
		Faculty = faculty;
		Routine = routine;
	}
	@Override
	public String toString() {
		return course_name +" "+ section +" "+ Faculty + " "
				+ Routine ;
	}
	  
	

}
