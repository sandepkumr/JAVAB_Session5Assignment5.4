/**
 * Java program to implement FixedStack and VariableStack
 */
package myPack;
import java.util.Scanner;

/**
 * @author Sandeep
 * 
 */
class FixedStack implements Stack { // class to implement fixed size stack
	
	int stackSize;								// Instance variable to define size of stack	
	int stackCurrentSize;						// Instance variable for current Size of Stack
	
	
	FixedStack(int stackSize){					// Constructor to accept size of stack at object initialization
		
		stackCurrentSize=0;						// Start size of stack is 0
		this.stackSize=stackSize;				// Assigning a fixed size to stack
		System.out.println("A FixedStack with size "+stackSize+" is initialized"); // Printing the message
		
	}
	
	public void push(int i) {					// push method to override push and push element to stack
		 
												
		if (stackCurrentSize==stackSize) 		// If current size of stack before adding element equals overall size of stack
			System.out.println("Stack Over flow"); // Print stack over flow
		else
			stackCurrentSize++;					// Increase the current stack size by 1

		
	}
	
	public void pop() {							// Pop method to overide pop and remove elements from stack
		 
		if(stackCurrentSize==0)					// if current size equals zero
			System.out.println("No Integers in stack to pop"); 	// Print no interger elements to pop
		else {
			
			System.out.println("One elememt removed ");			// else print element poped
			stackCurrentSize--;					// Decrease the stack size by n1
			
		}
	}
	
}

class VariableStack {							// class to implement variable sized stack
	
	int stackSize;								// Instance variable to define size of stack	
	int stackCurrentSize;						// Instance variable for current Size of Stack
	
	VariableStack(int stackSize){				// Constructor to accept size of stack at object initialization
		
		stackCurrentSize=0;						// Start size of stack is 0
		this.stackSize=stackSize;				// Assigning a fixed size to stack
		System.out.println("A variable stack with size "+stackSize+" is initialized"); // Printing the message
		
	}
	
	public void push(int i) {					// push method to override push and push element to stack
		 
												
			stackCurrentSize++;					// Increase the current stack size by 1
			if (stackCurrentSize>stackSize)		// if current size is greater than defined size
				stackSize=stackCurrentSize;		// Change the size of the stack

		
	}
	
	public void pop() {							// Pop method to overide pop and remove elements from stack
		 
		if(stackCurrentSize==0)					// if current size equals zero
			System.out.println("No Integers in stack to pop"); 	// Print no interger elements to pop
		else {
			System.out.println("One elememt removed ");			// else print element poped
			stackCurrentSize--;					// Decrease the stack current size by 1
			
		}
	}
	
}


public class Assignment5_4 { 					// Class to demonstrate fixed stack and variable stack

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;										// Declaring local variable for inputs
		Scanner scanner = new Scanner(System.in);		// Creating scanner object for inputs
		
		// Using Fixed stack
		
		System.out.println("Enter the size of the fixed stack :");	// Print message
		number=scanner.nextInt();						// Assigning input to number
		FixedStack fixedStack = new FixedStack(number);	// Intializing fixed stack with size inputed
		
		System.out.println("Do you want to push elements to Fixed Stack , Press 1 and enter for yes "); 
		number=scanner.nextInt();						// Assigning input to number
		
		while(number==1) {								// Looping to push series of elements into stack
			System.out.println("Enter the integer you want to push to stack :"); // Print message to input integer into stack
			fixedStack.push(scanner.nextInt());			// call push method to push into stack
			
			System.out.println("Do you want push more elememts, press 1 and enter to continue or press anynumber and enter to exit" ); // Print message to exit or continue the push 
			number=scanner.nextInt();					// Assigning input to number
		}
		
		System.out.println("Do you want to pop elements out of Fixed Stack , Press 1 and enter for yes "); // Print message to pop elements out of stack
		number=scanner.nextInt();						// Assigning input to number
		
		while(number==1) {								// Looping to pop series of elements out of stack
			fixedStack.pop();							// call pop method to pop outof stack
			System.out.println("Do you want pop more elememts, press 1 and enter to continue or press anynumber and enter to exit" ); // Print message to exit or continue the pop
			number=scanner.nextInt();						// Assigning input to number
		}
		
		// Using Variable stack
		
		System.out.println("Enter the size of the variable stack :");	// Print message
		number=scanner.nextInt();						// Assigning input to number
		VariableStack variableStack = new VariableStack(number);  // Intializing fixed stack with size inputed
		
		System.out.println("Do you want to push elements to variable Stack , Press 1 and enter for yes "); 
		number=scanner.nextInt();						// Assigning input to number
		
		while(number==1) {								// Looping to push series of elements into stack
			System.out.println("Enter the integer you want to push to stack :"); // Print message to input integer into stack
			variableStack.push(scanner.nextInt());		// call push method to push into stack
			
			System.out.println("Do you want push more elememts, press 1 and enter to continue or press anynumber and enter to exit" ); // Print message to exit or continue the push 
			number=scanner.nextInt();					// Assigning input to number
		}
		
		System.out.println("Do you want to pop elements out of Fixed Stack , Press 1 and enter for yes "); // Print message to pop elements out of stack
		number=scanner.nextInt();						// Assigning input to number
		
		while(number==1) {								// Looping to pop series of elements out of stack
			variableStack.pop();						// call pop method to pop outof stack
			System.out.println("Do you want pop more elememts, press 1 and enter to continue or press anynumber and enter to exit" ); // Print message to exit or continue the pop
			number=scanner.nextInt();					// Assigning input to number
		}
		
		scanner.close(); 								// Closing scanner object
		

	}

}
