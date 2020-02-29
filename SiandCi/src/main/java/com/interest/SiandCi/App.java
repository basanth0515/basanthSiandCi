package com.interest.SiandCi;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
{
	private static PrintStream myprint;
	private static Scanner sc;
	public static void getInterest() {
		myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myprint.print("enter principal amount ");
		double pa=sc.nextDouble();
		myprint.print("enter time period ");
		double ti= sc.nextDouble();
		myprint.print("Enter rate of interest ");
		double rate=sc.nextDouble();
		Interest i=new Interest(pa,ti,rate);
		myprint.print("\noption 1- calculate simple interest\nOption 2- Calculates the compound interest\nEnter option ");
		int  op=sc.nextInt();
		if(op==1) {
			myprint.print("Simple Interest is "+i.getSimpleInterest());
		}
		else {
			myprint.print("Compound Interest is "+i.getCompoundInterest());
		}
	}
	public static void getCostOfBuliding() {
		myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myprint.print("• Option 1-standard materials\n• Option 2-use above standard materials\n• Option 3-high standard material\n• Option 4-high standard material and fully automated home\n Enter the type material requried for type of constuction of buliding ");
		int op2=sc.nextInt();
		myprint.print("Enter the area of the land to estimate the cost of buliding ");
		double area=sc.nextDouble();
		Building b=new Building(area,op2);
		myprint.print("Cost for construction of buliding is "+b.getCostOfBuilding());
	}
    public static void main( String[] args )
    {
	    myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    	sc =new Scanner(System.in);
        while(true) {
        	myprint.print("\n1 opion one to claculate Interest\n2 option to calculate the cost for buliding a buliding\n3 option to exit\n");
        	myprint.print("Enter option ");
        	int option = sc.nextInt();
        	switch(option) {
        	case 1:
        		getInterest();
        		break;
        	case 2:
        		getCostOfBuliding();
        		break;
        	case 3:
        		sc.close();
        		return;
        	default:
        		error();
        	}
        }
        
    }
	private static void error() {
		myprint.print("Enter valid opion");
			myprint.close();
	}
}
