	
public class Student {

	int rollno;
    String name;
    int age;
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public void display () {
		System.out.println("Roll No:"+rollno +",Name:"+name+",age:"+age);
	}
		
	}

