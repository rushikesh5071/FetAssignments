import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ramesh", 30, 900000));
		employees.add(new Employee("Ritesh", 28, 600000));
		employees.add(new Employee("Sunil", 25, 700000));
		employees.add(new Employee("Parth", 24, 400000));
		
		
		//sort by Name
		System.out.println("Sort by name");
		List<Employee> sortedByName = employees.stream()
				.sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		
		sortedByName.forEach(System.out :: println);
		
		
		//sort by Age
		System.out.println("Sort by age");
		List<Employee> sortedByAge = employees.stream()
				.sorted(Comparator.comparingInt(Employee :: getAge))
				.collect(Collectors.toList());
		
		sortedByAge.forEach(e -> System.out.println(e));
        
        //sort by salary
		System.out.println("Sort by Salary");
		
	    Collections.sort(employees, new Comparator<Employee>() {
	    	public int compare(Employee e1 , Employee e2) {
	    		return (int) (e1.getSalary() - e2.getSalary());
	    	}
	    });
	    System.out.println(employees);

	}
}
