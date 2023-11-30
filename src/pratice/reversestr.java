package pratice;
import java.util.*;
public class reversestr{
	
	public static void revStr(String str) {//reverse string method
		String str2="";
		for(int i=0;i<str.length();i++) {
			str2 = str.charAt(i) + str2;
		}
		System.out.println(str2);	
	}
	
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);//taking input from user
		System.out.print("Enter the String : ");
		String str = sc.nextLine();//input for String
		
		String str2 ="";
				for(int i=0;i<str.length();i++) { //loop for every single character
					str2 = str.charAt(i)+str2; 
				}
		System.out.println(str2);
		
		System.out.print("O/P with Method : ");
		revStr(str); //Call to the revStr Method
		
//	System.out.println(	new StringBuilder("ROHIT").reverse().toString()); //direct method
	
		
	}
	
}

