package com.will;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		// {1, 2 ,5 ,6 ,3}
		long startTime = System.currentTimeMillis();
		List<String> list = new LinkedList<>();
		for(int i = 0 ; i < 10000000; i++){
			list.add("sunwei");
		}
		System.out.println(System.currentTimeMillis() - startTime);
		
		long startTime1 = System.currentTimeMillis();
		List<String> list1 = new ArrayList<>(10000000);
		for(int i = 0 ; i < 10000000; i++){
			list1.add("sunwei");
		}
		System.out.println(System.currentTimeMillis() - startTime1);
	}
}
