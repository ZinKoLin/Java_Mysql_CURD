package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ArrayList
		List<String> data = new ArrayList<>();
		data.add("Mg Zin");
		data.add("Mg Mg");
		
		//LinkedList
		List<Integer> data1 = new LinkedList<>();//use unlimited data input
		data1.add(1);
		data1.add(2);
		
		
		
		//SET
		Set<Integer> data2 = new HashSet<Integer>();//use in not want to duplication eg: phone no, id
		data2.add(1);
		data2.add(2);
		data2.add(3);
		data2.add(2);
		for(String out: data) {
			System.out.println(out);
		}
		
		System.out.println(data2.size());
		
		//Map
		
		Map<String, String>data3 = new HashMap<String,String>();// Key and Value
		data3.put("a", "Zin Ko");
		data3.put("b", "Aung Aung");
		
		
		System.out.println(data3.get("a"));
		
		for(Map.Entry<String, String> out :data3.entrySet()) {
			System.out.println(out.getKey()+"-> "+out.getValue());
		}
		
		
		

	}

}
