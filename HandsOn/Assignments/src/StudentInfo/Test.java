package StudentInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, "Sahil", 75, "Science"));
		list.add(new Student(2, "Rahul", 80, "Mathematics"));
		list.add(new Student(3, "Akanksha", 80, "Science"));
		list.add(new Student(4, "Ved", 77, "Mathematics"));
		list.add(new Student(5, "Ayesha", 78, "Mathematics"));
		
		//Get list of "Mathematics" students
		Predicate <Student> mathematics = (Student student) -> student.getSpecialization().equals("Mathematics");
		
		List<Student> mathematicsStudents = new ArrayList<Student>();
		
		for (Student student : list)
		{
			if(mathematics.test(student))
			{
				mathematicsStudents.add(student);
			}
		}
		System.out.println(mathematicsStudents);
		
		
		
		//Display all students with there percentage.
		Consumer<Student> percentage = (Student student) -> {
	        System.out.println(student.getName()+" : "+student.getPercentage());
	    };
	         
	for (Student student : list) 
	{
	    percentage.accept(student);
	}
	System.out.println(percentage);
		
	
	
	//Extract only name of students from list
	Function<Student, String> nameFuntion = (Student Student) -> Student.getName();
    
	List<String> studentNames = new ArrayList<String>();
	         
	for (Student student : list) 
	{
	    studentNames.add(nameFuntion.apply(student));
	}
	
	System.out.println(studentNames);
	
	
	
	//Creating student object
	Supplier<Student> studentSupplier = () -> new Student(6, "Harsh", 92, "English");
    
	list.add(studentSupplier.get());
	
	System.out.println(studentSupplier);
	
	System.out.println(list);
	
	
	}

}
