package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(4,5,6,7,3,3);
		List<Integer> unique=al.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
	
		//System.out.println(al.stream().sorted((n1,n2) -> -n1.compareTo(n2)).collect(Collectors.toList()));
		System.out.println(al.stream().sorted(Comparator.comparing(Integer::compareTo).collect(Collectors.toList()));
		
	}

}
