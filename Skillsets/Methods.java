import java.util.Scanner;

public class Methods 
{
    
    public static void getRequirements(String[] args)
    {
        System.out.println("Programmer: James Francois");
        System.out.println("Program evaluates integers as even or odd");
        System.out.println("Note: Program does *not* check for non-numerical characters"); 
        System.out.println();
        
        
       
       
        }//end of main


    
    
     public static void evaluateNumber(String[] args)
    {
    int num;
    System.out.println("Enter an Integer number:");

    //The input provided by user is stored in num
    Scanner scnr = newScanner(System.in);
    num = scnr.nextInt();
       
    
    
    
    if ( num % 2 == 0 )
        System.out.println("Entered number is an even");
     else
        System.out.println("Entered number is an odd");
        
        
        }//end of main
    
}//end of class 
    