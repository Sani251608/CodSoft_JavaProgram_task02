package com.codsoft.studentgrade;
import java.util.*;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of subject:");
		int numSubject=sc.nextInt();
		int[] totalNumSubject=new int[numSubject];
		for(int i=0;i<numSubject;i++) {
		while(true) {
		System.out.println("enter the marks of each subject (out of 100):"+(i+1));
		int marks=sc.nextInt();
		if(marks>=0&&marks<=100) {
			totalNumSubject[i]=marks;
			break;
		}else {
			System.out.println("invalid marks");
		}
		}
		
		}
		System.out.println("Marks Obtained all subject");
		for(int i=1;i<numSubject;i++) {
			//System.out.println("Marks Obtained all subject");
			System.out.println("Subject "+i+":"+totalNumSubject[i]);
		}
		int totalmarks=0;
		for(int i=0;i<numSubject;i++) {
		totalmarks+=totalNumSubject[i];
		}
		System.out.println("total Marks Obtain "+totalmarks);
		
		double avg=totalmarks /numSubject;
		System.out.println("total Average Percentage:"+avg+"%");
		System.out.println("Grade Acquired:");
		if(avg>=90 && avg<=100) {
			System.out.println("A grade");
		}else if(avg>=70 && avg<=89) {
			System.out.println("B grade");
		}else if(avg>=50 && avg<=69) {
			System.out.println("C grade");
		}else {
			System.out.println("Failed");
		}
		
		
		

	}

}
