class Student 
{
	String name;
	int roll;
	String college;
	String branch;
	int yop;
	String degree;
	
	Student()
	{
	}
	Student(String name, int roll, String college, 
		String branch, int yop, String degree)
	{
		this.name=name;
		this.roll=roll;	
		this.college=college;
		this.branch=branch;
		this.yop=yop;
		this.degree=degree;
	}
		Public void displayStudent()
	{
			System.out.println("Name is:"+name);
			System.out.println("Roll is:"+roll);
			System.out.println("College is:"+college);
			System.out.println("Branch is:"+branch);
			System.out.println("YOP is:"+yop);
			System.out.println("Degree is:"+degree);
	}
}
 