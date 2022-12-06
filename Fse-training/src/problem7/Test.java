package problem7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1, "satish", 100);
		Employee employee2 = new Employee(2, "atish", 300);
		Employee employee3 = new Employee(3, "tish", 300);
		Employee employee4 = new Employee(4, "sushma", 500);
		Employee employee5 = new Employee(5, "madhu", 700);
		Employee employee6 = new Employee(6, "surya", 800);
		Employee employee7 = new Employee(7, "rahul", 700);
		Employee employee8 = new Employee(8, "revi", 900);
		Employee employee9 = new Employee(9, "pradeep", 800);
		Employee employee10 = new Employee(10, "dass", 100);

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(employee10);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);

		System.out.println("for each loop ******************");
		   list.stream().forEach(emp -> System.out.println(emp));

		System.out.println("for loop ******************* ");
		    for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + " ");

		
		  System.out.println( "STREAMS ******************* ");
		  list.stream().forEach(s->System.out.println(s));
		 
		 
		  System.out.println("Sort the employees using their name. ******************* ");
		  
		  
		  
		  Comparator<Employee> NameCommparator =Comparator.comparing(Employee::getName);
		  List<Employee> list1=list.stream().sorted(NameCommparator).collect(Collectors.toList());
		  System.out.println(list1);
		 
		 
		  System.out.println("Use Iterator and List Iterator object to iterate the employee in both direction ******************* " );
		  
		  Iterator itr = list.iterator(); System.out.println("Iterator:");
		  System.out.println("Forward traversal: ");
		 
		  while(itr.hasNext()) { 
			  System.out.println(itr.next());
		  
		  }
		  
		 
		  ListIterator i = list.listIterator();
		 
		  System.out.println("ListIterator:");
		  System.out.println("Forward Traversal : ");
		  
		  while (i.hasNext()) { System.out.print(i.next() + " "); }
		  System.out.println();
		  
		  System.out.println("Backward Traversal : ");
		 
		  while(i.hasPrevious()) { System.out.println(i.previous()); }
		  System.out.println();
		  
		  
		  System.out.println("Use Stream map method to show all the employee name in uppercase. ******************* ");
		  list.stream().map(map->map.getName().toUpperCase()).forEach(s->System.out.println(s));
		  
		  
		 
		  System.out.println("use stream to calculate avg salary -");
		  System.out.println(list.stream().mapToDouble(emp->emp.getSalary()).average().getAsDouble());
		  
		 
		
			System.out.println("Stream sort() method of stream class to sort the employees.");
			
			list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(s->System.out.println(s));
		}
		 

	}

