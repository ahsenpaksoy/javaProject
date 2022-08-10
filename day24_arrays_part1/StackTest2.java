package day24_arrays_part1;

import java.util.Arrays;
import java.util.Stack;

public class StackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> mystack = new Stack<Integer>();
		
		mystack.push(10);
		mystack.push(20);
		
		for (int i = 0; i < 10; i++) {
			mystack.push(i);
			
		}
		
		//System.out.println(Arrays.toString(mystack.toArray()));
		 System.out.println("Initial Stack: " + mystack);
		 
		 System.out.println("Initial Stack: " + mystack.peek());
		 System.out.println("Initial Stack: " + mystack.peek());
		 System.out.println("Initial Stack: " + mystack);
		 System.out.println("Initial Stack: " + mystack.pop());
		 System.out.println("Initial Stack: " + mystack);
		 System.out.println("Initial Stack: " + mystack.pop());
		 System.out.println("Initial Stack: " + mystack);
		
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		int sum = 0;
		
		while (!mystack.empty()) {
			
			sum = sum + mystack.peek();
			mystack.pop();
			
		}
		
		System.out.println(sum);
		System.out.println("Initial Stack: " + mystack);
		
		
	}

}
