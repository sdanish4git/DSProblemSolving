package java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertListToMapUsingGroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList=Arrays.asList(
				new Employee("Shakil","Bokaro","e1"),
				new Employee("Gauhar","Bokaro","e2"),
				new Employee("Danish","Chennai","e3"),
				new Employee("Athar","Delhi","e4"),
				new Employee("Raju","Bokaro","e5"));
		
		Map<String, List<Employee>> empMapByCity=empList.stream()
				.collect(Collectors.groupingBy(Employee::getCity));
		empMapByCity.forEach((key,value) -> System.out.println(key+" "+value));
		//Integer[] nums= {3,4,5,56,7,5};
		//Stream<Integer> numStream=Arrays.asList(nums).stream();
		//numStream.distinct().forEach(System.out::println);
		//Set<Integer> unique=numStream.collect(Collectors.toSet());
	}

}

class Employee{
	String name;
	String city;
	String id;
	
	
	public Employee(String name, String city, String id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", id=" + id + "]";
	}
	
}
