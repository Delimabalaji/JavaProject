package Arrayy;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String > a= new ArrayList <String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selinium");
    	System.out.println(a.get(3));
    	
    	for(int i=0;i<a.size();i++) {
    		System.out.print(a.get(i));
    	}
    		
		System.out.println("********");
		for(String man : a) {
			System.out.println(man);
			
		}
		System.out.println(a.contains("selinium"));
		
	}

}
