package com.velocity.demo;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hash=new HashSet<Integer>();
		hash.add(100);
		hash.add(200);
		hash.add(300);
		
             for(Integer i:hash){
	     System.out.println(i);
	     }
	}

}
