package com.BridgeLabz;

import java.util.Scanner;

public class StackMain {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		while(choice != 4)
		{
			System.out.println("Select option");
			System.out.println("\n1.Push\n2.Show\n3.Exit");
			System.out.println("\n Enter your choice :");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				s.push(sc);
				break;
			}
			case 2:
			{
				s.display();
				break;
			}
			case 3:
			{
				System.out.println("Exiting");
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("Please Enter valid choice ");

			}
			}
		}
	}
}
