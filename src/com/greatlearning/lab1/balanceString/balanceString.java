package com.greatlearning.lab1.balanceString;

import java.util.Stack;

public class balanceString {
	
	public boolean isBalance(String inputString)
	{
		Stack<Character> stack = new Stack<>();
		
		boolean unBalanced = false;
		
			
		for (int i = 0; i < inputString.length(); i++)
		{
			char ch = inputString.charAt(i);
			switch(ch)
			{
				case '(':
				case '{':
				case '[':
					stack.push(ch);
					continue;
				case ')':
					if (stack.empty() || (stack.pop()!='('))
					{
						unBalanced = true; 
						break;
					}
					continue;
				case '}':
					if (stack.empty() || (stack.pop()!='{'))
					{
						unBalanced = true; 
						break;
					}
					continue;
				case ']':
					if (stack.empty() || (stack.pop()!='['))
					{
						unBalanced = true; 
						break;
					}
					continue;

			}
			
			
		}
		if (unBalanced || !stack.empty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
