package exercise.exceptoinhandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerToFile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File f=new File("message.txt");
		
		String st;
		try{
			FileWriter writer=new FileWriter(f);			
			System.out.println("Your FirstName: ");
			st=sc.nextLine();
			writer.write("First Name: "+st);
			System.out.println("Your LastName: ");
			st=sc.nextLine();
			writer.write("\nLast Name: "+st);
			System.out.println("Your email: ");
			st=sc.nextLine();
			writer.write("\nEmail Id: "+st);
			System.out.println("Your Mobile: ");
			st=sc.nextLine();
			writer.write("\nContact Number: "+st);
			writer.flush();
			System.out.println("Your Details saved successfully..");
			writer.close();
			sc.close();
		}catch(IOException ioe){
			System.out.println("unable to write file");
		}catch(Exception e){
			System.out.println("unable to write file");
		}
	}

}
