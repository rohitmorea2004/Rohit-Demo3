import java.util.ArrayList;
import java.util.Scanner;

public class Student2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		ArrayList <Student>Student=new ArrayList<>();
		
		while (true) {
			System.out.println("\n---Student Management System---");
			
			System.out.println ("1.Add Student");
			
			System.out.println("2.view Student");
			
			System.out.println("3.Search Student");
			
			System.out.println("4. Delete Student");
			
			System.out.println("5.Exit");
			
			System.out.println("Enter choice:");
			
			int  choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				
				System.out.println("Enter Roll No");
				
				int roll=sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter Name");
				
				String name=sc.nextLine();
				
				System.out.println("Enter Age:");
				int age=sc.nextInt();
				
				Student.add(new Student(roll,name,age));
				
				System.out.println("Student Added Successfully!");
				
				break;
				
			case 2:
				System.out.println("\n---Student List");
				
				for (Student s:Student) {
					
					s.display();
				}
				
				     break;
				     
			case 3:
				
				System.out.println("Enter Roll No To Search :");
				
				int searcRoll =sc.nextInt();
				
				boolean found =false;
				
				for (Student s: Student) {
					
					if (s.rollno==searcRoll) {
						s.display();
						
						found =true ;
						
						break;
					}
				}
				
		
	if (!found) {
		System.out.println("Student is Not Found !");
	}
				break;
				
	
			case 4:
	System.out.println("Enter Roll No To Deleate:");
	
	int deleteRoll =sc.nextInt();
	
	Student toRemove =null;
	
	for (Student s: Student) {
		
		if (s.rollno==deleteRoll) {
			
			toRemove =s;
			break;
		}
		
	}
	
	if (toRemove !=null) {
		
		Student.remove (toRemove);
		System.out.println("Student Deleted !");
	}
	else {
		System.out.println("Student is Not Found");
	}
				break;
				
			case 5:
				System.out.println("Exting...Thank you!");
				
				sc.close();
				
		System.exit(0);
		
				
		default:
			
			System.out.println("Invalid choice! Try again.");
         
			}
			
		}
		
	}

}
