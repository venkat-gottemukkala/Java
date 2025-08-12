package com.venkat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		int[] arr =  {1,3,1,4,5,1,6,4,5,2,3};
		
		Set<Integer> set = new HashSet();
		
		Arrays.stream(arr)
		.filter(element -> set.add(element)).forEach(System.out::println);
		System.out.println("====");
	
		
         
		 Arrays.stream(arr)
			.filter(element -> !set.add(element)).distinct().forEach(System.out::println);
	 
    
				
		
		String[] array = {"apple", "banana", "apple", "orange", "banana", "grape"};

        Set<String> seenElements = new HashSet<>();
        List<String> duplicates = Arrays.stream(array)
                                      .filter(element -> !seenElements.add(element)) // Filter elements that can't be added (duplicates)
                                      .collect(Collectors.toList());

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Duplicate elements: " + duplicates);
    }


}
