public class Employee {

	String name;
	String studentId;
	String department;
	String position;
	
	
	public Employee(){}
	public Employee(String studName,String stuId,String department,String position){
		name = studName;
		studentId = stuId;
		
	}
	
	public String getName(){
	return name;
	}
	
	public void setName(String studName){
		name = studName;
	}
	
	
	public String getStudentId(){
		return studentId;
	}
	
	public void setStudentId(String stuId){
		studentId = stuId;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public void setDepartment(String dep){
		department = dep;
	}

	public String getPosition(){
		return position;
	}
	
	public void setPosition(String pos){
		position = pos;
	}
	
	public static void main(String[] args)
	{
		
		Employee stud = new Employee();
		stud.setName("Elizabeth Swann");
		stud.setStudentId("47888");
		stud.setDepartment("Accounting");
		stud.setPosition("Vice President");
		
		Employee stud2 = new Employee();
		stud2.setName("Will Turner");
		stud2.setStudentId("10101");
		stud2.setDepartment("IT");
		stud2.setPosition("Vice President");
		
		Employee stud3 = new Employee();
		stud3.setName("Jack Sparrow");
		stud3.setStudentId("81774");
		stud3.setDepartment("Manufacturing");
		stud3.setPosition("Engineer");
		
		System.out.println("Name: " + stud.getName() + "\nID Number:" + 
		stud.getStudentId() + "\nDepartment: " + stud.getDepartment() + 
		"\nPosition: " + stud.getPosition() + "\n");
		
		System.out.println("Name: " + stud2.getName() + "\nID Number:" + 
		stud2.getStudentId() + "\nDepartment: " + stud2.getDepartment() + 
		"\nPosition: " + stud2.getPosition() + "\n");
		
		System.out.println("Name: " + stud3.getName() + "\nID Number:" + 
		stud3.getStudentId() + "\nDepartment: " + stud3.getDepartment() + 
		"\nPosition: " + stud3.getPosition() + "\n");
		
	}
 	
}


