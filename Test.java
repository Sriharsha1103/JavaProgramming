import java.io.*;
import java.util.Scanner;
public class Test{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String []subStrings = input.split(",");
		for(int i = 0; i < subStrings.length ; i++){
			 for(int j = 0 ; j< subStrings.length-i ; j++)
			 {
			 	if(subStrings[i].compareTo(subStrings[j])<0)
			 	{
			 		String temp = subStrings[i];
			 		subStrings[i] = subStrings[j];
			 		subStrings[j] = temp;
			 	}
			 	
			 }
		}
		System.out.println("The contents in the string after sorting are:");
		for(String str : subStrings)
			System.out.println(str);
	}
}
