package jo.secondstep.task1;

import java.util.ArrayList;
import java.util.Scanner;

// The user should enter his/her name, his/her class , number of material , each material name and grade , grade should be grater than zero and less than 100.
//Program should print all user information that he/she entered before and calculate the GPA.
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare Variables
 
		double GPA=0;
		int choise, grade=0, sum=0;
		String materialName;
		ArrayList <Integer> materialGradeList = new ArrayList<>();
		ArrayList <String> materialNameList = new ArrayList<>();
		
		Scanner in= new Scanner(System.in);
		
		     //Enter Name
		System.out.println("Please Enter Your Name:");
		String studentName = in.nextLine();
		
		     //Enter Class
		System.out.println("Please Enter Your Class:");
		String Class = in.nextLine();
		
	       	//Enter Number of Material
		System.out.println("Please Enter The Number of Materials You Study:");
		int materialNum = in.nextInt();
		
		    //Insert Material to NameList
		for(int i=0; i<materialNum;i++){
			System.out.println("Please Enter The Name of Material Number "+(i+1)+": ");
			materialName=in.next();
			materialNameList.add(materialName);
		}
		
		     //Insert Grade to GradeList
		for(int i=0; i<materialNum;i++){
			System.out.println("Please Enter Your Grade in "+materialNameList.get(i)+": ");
			grade=in.nextInt();
			
			  //Check Grade
			while(grade > 100 || grade < 0) {
				System.out.println("You Enterd Invalid Value, Please Re-enter The Correct Grade");
				grade=in.nextInt();
			}
		    materialGradeList.add(grade); 
		}
		
		    //Print Information
		System.out.println("Thank you, Press 1 to Print Your Information and Your GPA");
		choise=in.nextInt();
		if(choise != 1)
			System.out.println("Wrong Entry");
		
		else {
			System.out.println("Your Name is: "+studentName);
			System.out.println("Your class is: "+Class);
			System.out.println("Number of Materials= "+materialNum);
			System.out.println("Your Grades as Following:");
			for(int i=0;i<materialNum;i++){
				System.out.println(materialNameList.get(i)+"\t"+materialGradeList.get(i));
				sum+=materialGradeList.get(i);
			}
			
			//Calculate GPA
		   GPA=sum/materialNum;
		   System.out.println("Your GPA = "+GPA);
		}
		
		   //End Message
		if(GPA >=50)
			System.out.println("\n**Conguraltion You Pass**");
		else
			System.out.println("\n**Hard Luck**");
		
		in.close();
		
		
	}

}
