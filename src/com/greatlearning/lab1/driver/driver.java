package com.greatlearning.lab1.driver;
import java.util.Stack;
import com.greatlearning.lab1.balanceString.balanceString;

public class driver {

	public static void main(String[] args) {
		
		String inputString1 = "( [ [ { } ] ])";
		String inputString2 = "{(})";
		
		balanceString bs = new balanceString();
		if (bs.isBalance(inputString1))
		{
			System.out.println("The entered String "+ inputString1 +" has Balanced Brackets");
		}
		else
		{
			System.out.println("The entered Strings "+ inputString1 +" do not contain Balanced Brackets");
		}
		
		if (bs.isBalance(inputString2))
		{
			System.out.println("The entered String "+ inputString2 +" has Balanced Brackets");
		}
		else
		{
			System.out.println("The entered Strings "+ inputString2 +" do not contain Balanced Brackets");
		}

	}

}
