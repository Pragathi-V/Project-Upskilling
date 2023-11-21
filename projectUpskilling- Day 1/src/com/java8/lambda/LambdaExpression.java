package com.java8.lambda;

import java.util.function.BiConsumer;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaExpression l= new LambdaExpression();
		l.add(10,5);
		
		//lambda expression
		BiConsumer<Integer, Integer> bi = (a,b) -> System.out.println(a+b);
		bi.accept(10, 5);

	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}

