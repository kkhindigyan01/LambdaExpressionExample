package com.kkhindigyan.client;

import com.kkhindigyan.org.Operation;
import com.kkhindigyan.org.Walkable;
import com.kkhindigyan.org.Welcome;

public class ClientTest {

	public static void main(String[] args) {

		Walkable walkable = () -> System.out.println("Hey, Let go to walk!!");
		walkable.walk();
		
		Welcome welcome = (String name)-> {
			return "Hello:"+name;
		};
		System.out.println(welcome.welcome("KK"));
		
		Welcome welcome2 = name-> "Hello:"+name;
		System.out.println(welcome2.welcome("PK"));
		
		Operation operation1 = (int n1,int n2) ->{
			System.out.println("Addition of both parameters..");
			return n1+n2;
		};
		
		System.out.println(operation1.operate(10, 20));
		
		Operation operation2 = (n1,n2) ->{
			System.out.println("Addition of both parameters..");
			return n1+n2;
		};
		
		System.out.println(operation2.operate(100, 20));
		
		Operation operation3 = (n1,n2) ->n1+n2;
		
		System.out.println(operation3.operate(200, 20));
	}
}
