package december29;

import java.util.Scanner;

public class asgnmtparaand_concatenation {
		 public static String Concatenation(String str1,String str2){
		    return str1+" "+str2;
		 }
		 public static void main(String args[]){
			   Scanner sc=new Scanner(System.in);
			   System.out.println("enter two strings");
			   String str1=sc.nextLine();
			   String str2=sc.nextLine();
			   System.out.println(Concatenation(str1,str2)); 
			 }
		}
