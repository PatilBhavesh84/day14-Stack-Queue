package com.BridgeLabz;
import java.util.Scanner;
public class Stack {
	int top;
	int maxsize = 3;
	int[] arr = new int[maxsize];


	boolean isEmpty()
	{
		return (top < 0);
	}
	Stack()
	{
		top = -1;
	}
	boolean push (Scanner sc)
	{
		if(top == maxsize-1)
		{
			System.out.println("Overflow !!");
			return false;
		}
		else
		{
			System.out.println("Enter Value");     
			int val = sc.nextInt();
			top++;
			arr[top]=val;  
			return true;
		}
	}

	void display ()
	{
		System.out.println("Stack elements");
		for(int i = top; i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}




