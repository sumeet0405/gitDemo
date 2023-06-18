package Java_Utils;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	
	//we can store hetrogenious data
	Stack s=new Stack();
	s.push("sumit");
	s.push("dheeraj");
	s.push(200);
	s.push(11.55);
	
	//remove the element from top
	System.out.println(s);
	System.out.println(s.pop());// 11.55 will remove and return
	System.out.println(s);
	
	//to return top element on stack
	System.out.println(s.peek());
	System.out.println(s);
	
	//it will return position of element from top
	System.out.println(s.search("dheeraj"));
	System.out.println(s.search(11.55));// if value not present then it return -1
	
	//it will return stack is empty or not
	System.out.println(s.empty());//if element is present in stack return false
	
	
	
}
}
