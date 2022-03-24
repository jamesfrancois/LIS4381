import java.util.Scanner;
import java.util.ArrayList;

class Methods {

static final Scanner sc = new Scanner(System.in);

public static void getRequirements() {
    System.out.println("Developer: James Francois");
    System.out.println("Program populates ArrayList of strings with user-entered animal type values.");
    System.out.println("Examples: Polar bear, Guinea pig, dog, cat, bird.");
    System.out.println("Program continues to collect user-entered values until user types n.");
    System.out.println("Program displays ArrayList values after each iteration, as well as size.");
}

public static void createArrayList() 
{
    Scanner sc = new Scanner(System.in);
    ArrayList<String> obj = new ArrayList<String>();
    String myStr = "";
    String choice = "y";
    int num = 0;

    while (choice.equals("y"))
    {
        System.out.print("Enter animal type: ");
        myStr = sc.nextLine();
        obj.add(myStr);
        num = obj.size();
        System.out.println("Arraylist elements:" + obj + "\nArrayList Size = " + num );
        System.out.println("\nContinue? Enter y or n: ");
        choice = sc.next().toLowerCase();
        sc.nextLine();
        }
    }

}
