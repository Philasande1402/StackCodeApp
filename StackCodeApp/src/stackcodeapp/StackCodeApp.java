package stackcodeapp;

import java.util.Stack;

public class StackCodeApp {

    public static void main(String[] args) {
        
        //Declare and initailize a stack that can store string objects representing book titles
        Stack<String> stackList = new Stack<>();
        
        //Add the following books to the stack in this order: ”The Great Gatsby”,”1984”, ”To Kill a Mockingbird”, ”Moby Dick”, ”Hamlet”
        stackList.add("The Great Gatsby");
        stackList.add("1984");
        stackList.add("To Kill a Mockingbird");
        stackList.add("Moby Dick");
        stackList.add("Hamlet");
        
        //Print the current stack of books.
        System.out.println("Current stack : "+stackList);
        System.out.println("");
        
        //Remove the top two books from the stack and print their titles
        String firstRemove = stackList.pop();
        String secondRemove = stackList.pop();
        System.out.println("First remove :"+firstRemove);
        System.out.println("Second remove :"+secondRemove);
        
        System.out.println("");
        
        //Print the stack after removing the top two books
        System.out.println("After removing two stack : "+stackList);
        
        //Add two more books to the stack: ”Pride and Prejudice” and ”War andPeace”
        stackList.add("Pride and Prejudice");
        stackList.add("War and Peace");
        
        System.out.println("");
        //Print the final state of the stack
        System.out.println("after adding two stack : "+stackList);
        
        
    }
    
}
