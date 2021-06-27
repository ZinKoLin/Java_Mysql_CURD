package com.collection;

import java.util.*;

import java.util.ArrayList;
import java.util.List;


public class IteraterUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data = new ArrayList<>();
		data.add("Mg Mg");
		data.add("ko ko");
		data.add("Mg Mg");
		
	
		Iterator<String> it = data.iterator();//use remove modify iterator
		
		while(it.hasNext()) {
			
			String value = it.next();
			
			if(value.equals("Mg Mg")) {
				it.remove();
			}
			
		}
		
		System.out.println(data.size());

	}

}
