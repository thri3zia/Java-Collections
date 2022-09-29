import java.util.HashSet;
import java.util.Scanner;


public class TMLHashSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        
        HashSet<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(9);
        numberHashSet.add(7);
        numberHashSet.add(5);
        numberHashSet.add(3);
        numberHashSet.add(1);
        char choice;
        int number = 0;

        
        do{
            System.out.print("\n====================================================================");
            System.out.println("\nGiven numbers in HASHSET Collection:" + numberHashSet);
            System.out.println("\nChoose from below:");
            System.out.print("1. Add");
            System.out.print("\n2. Remove");
            System.out.print("\n3. Display");
            System.out.print("\n4. Clear");
            System.out.print("\n5. Exit");

            System.out.print("\nSelected option: ");
            choice = input.next().charAt(0);
            
            
            switch (choice) {
            case '1':
                System.out.print("\n====================================================================");
                System.out.print("\n***** You are going to ADD a NUMBER *****");
                System.out.print("\nInput a number: ");
                number = in.nextInt();
                //----------------------------CONDITION ADDED ----------------------------
                if(numberHashSet.contains(number)){
                    System.out.print("\nThe number inputted is already in the HashSet Collection.\n");
                    System.out.print("\n*** Please Try inputting another number. ***\n");
                    System.out.print("\n********************************************************************");
                 } else {
                    numberHashSet.add(number);
                    System.out.println("\nThe added number is: " + number);
                    System.out.println("\nThe latest HashSet Collection:" + numberHashSet);
                    System.out.print("\n********************************************************************");
                 }
                //------------------------------------------------------------------------
                break;
                
            case '2':
                System.out.println("\n***** You are now going to REMOVE a NUMBER *****");
                System.out.print("Input the number you want to remove: ");
                int number2 = in.nextInt();
                numberHashSet.remove(number2);
                System.out.println("\nThe removed number number is:" + number2);
                System.out.println("\nThe latest HashSet Collection:" + numberHashSet);
                System.out.print("\n********************************************************************");
                break;
                
            case '3':
                System.out.println("\nThe added number earlier is:" + number);
                System.out.println("\nThe latest HashSet Collection:" + numberHashSet);
                System.out.print("\n********************************************************************");
                break;
                
            case '4':
                System.out.print("\n********************************************************************\n"); 
                numberHashSet.clear();  
                System.out.println("\n\t\tCLEARED HashSet Collection:" + numberHashSet);
                System.out.print("\n********************************************************************\n"); 
                break;
                
            case '5':
                System.out.print("\n====================================================================\n"); 
                System.out.println("\n******* THANK YOU FOR USING THIS SIMPLE PROGRAM. ADIOS! *******");  
                System.out.print("\n====================================================================\n\n"); 
                break;
                
            default:
                System.out.println("\nJust Pick fron the options given above. Please try Again. ");
                System.out.print("\n********************************************************************");
                break;
        }
        }while (choice != '5');
        
        
    
    }

}
