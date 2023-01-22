package com.test;

import java.util.*;

public class Clientinfo {

	public static void main(String[] args) {

		Set s = new HashSet();
		s.add(10);
		s.add(70);
		s.add(100);
		s.add("jhon");
		s.add(55.0f);
		s.add(true);
		s.add(88);
		System.out.println(s);

		Set<Integer> s1 = new TreeSet<Integer>();
		s1.add(10);
		s1.add(70);
		s1.add(60);
		System.out.println(s1);
		
		s.addAll(s1);
		System.out.println(s);
		
		boolean c = s.contains(10);
		System.out.println(c);
		
		
		s.remove(70);
		System.out.println(s);
	
		s.removeAll(s1);
		System.out.println(s);
		
		s.clear();
		System.out.println(s);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
	}

}
