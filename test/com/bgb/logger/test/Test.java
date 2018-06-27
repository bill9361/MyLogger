package com.bgb.logger.test;
import java.util.UUID;

public class Test 
{
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
		{
			System.out.println(UUID.randomUUID().toString());
		}
		
		System.out.println("000000000000000000000000000000000000".length());
	}

}
