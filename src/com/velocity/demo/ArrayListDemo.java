package com.velocity.demo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("suraj");
		list.add("dipak");
		list.add("sagar");
		
		list.stream().forEach(x->System.out.println(x));
	
		
	}

}
