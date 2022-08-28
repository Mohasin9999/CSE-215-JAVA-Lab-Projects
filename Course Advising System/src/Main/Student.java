package Main;

public class Student {
	private String firstName,lastName,age,address,email,contactNumber,gender,password,id,department;

	public Student() {

	}

	

	public Student(String firstName, String lastName, String age, String address, String email, String contactNumber,
			String gender, String password, String id, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.email = email;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.password = password;
		this.id = id;
		this.department = department;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Email: " + email+"\t"+"Password: "+password+"\n"+"FirstName: " + firstName+"\n" + "LastName: " + lastName+"\n"  + "Age: " + age+"\n"  + "Gender: " + gender +"\n"+ "Address: " + address
				+"\n" + "Contact Number: " + contactNumber+"\n" +"Department: " + department+"\n"+"ID: "+id ;
	}


}
