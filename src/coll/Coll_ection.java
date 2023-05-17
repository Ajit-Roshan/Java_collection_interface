package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Coll_ection {

	public static void main(String[] args) {
		// count no. of char with and without duplication.
		// count no. of occurrence of char in a string.

		String nm= "mark zuckerberg and facebook";

		Set<Character> chars= new HashSet<>();
		List<Character> arrChar= new ArrayList<>();

		for(int i=0; i<(nm.length()); i++ ) {
			if(nm.charAt(i) != ' ') {
				chars.add(nm.charAt(i));
				arrChar.add(nm.charAt(i));
			}
		}
		System.out.println("no duplication  :: "+chars+" "+chars.size());
		System.out.println("arrayList all available chars:: "+arrChar+" "+arrChar.size());
		
		System.out.println(" --------------------- --------------------- ------------------ ");
		
		//frequency
		
		for(char eachChar : chars) {
			System.out.println(  eachChar +" - "+ Collections.frequency(arrChar, eachChar));
		}		
	}
}
