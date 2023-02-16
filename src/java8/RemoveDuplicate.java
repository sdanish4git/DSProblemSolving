package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,5,6,6};
		
		System.out.print(Arrays.stream(a).distinct().collect());
		//System.out.println(list);
		//Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		
		Collection<Integer> list=Arrays.asList(a);
		 
		// Get collection without duplicate i.e. distinct only
		List<Integer> distinctElements = list.stream()
		                        .distinct()
		                        .collect(Collectors.toList());
		 
		//Let's verify distinct elements
		System.out.println(distinctElements);

	}

}
