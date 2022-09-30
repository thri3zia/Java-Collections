
import java.util.ArrayList;
import java.util.Scanner;

public class TMLArraylist {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int number = 0;

        
        ArrayList <Integer> numberArrayList = new ArrayList<>();
        numberArrayList.add(1);
        numberArrayList.add(4);
        numberArrayList.add(3);
        numberArrayList.add(2);
        numberArrayList.add(5);
        char choice;

        do{
            System.out.println("\n===================================================================");
            System.out.println("Given numbers in ArrayList implementation:" + numberArrayList);
            System.out.println("Choose from below:");
            System.out.print("1. Add");
            System.out.print("\n2. Remove");
            System.out.print("\n3. Display");
            System.out.print("\n4. Clear");
            System.out.print("\n5. Exit");

            System.out.print("\nSelected option: ");
            choice = input.next().charAt(0);
            
           switch (choice) {
                 
                case '1':
                    System.out.println("\n***** You are now going to ADD a NUMBER *****");
                        number = 0;
                        System.out.print("\nInput a number: ");
                        number = in.nextInt();
          //---------- CONDITION ADDED ---------------
                    if (number >= 0){
                        numberArrayList.add(number);
                        System.out.println("\nThe added number is: " + numberArrayList.get(5));
                        System.out.println(numberArrayList);
                        System.out.print("\n********************************************************************");
                    }else{
                        System.out.print("\nPlease input a POSITIVE NUMBER\n");
                        System.out.print("\n********************************************************************");
                    }
        //--------------------------------------------
                    break;
                case '2':
                    System.out.println("\n***** You are now going to REMOVE a NUMBER *****");
                    System.out.print("\nInput the index you want to remove: ");
                    int number2 = in.nextInt();
                    numberArrayList.remove(number2);
                    System.out.println("\nThe removed index number is: " + number2);
                    System.out.println("The latest ArrayList:" + numberArrayList);
                    System.out.print("\n********************************************************************");
                    break;
                case '3':
                    System.out.println("\nThe added number earlier is: " + number);
                    System.out.println(numberArrayList);
                    System.out.print("\n********************************************************************");
                    break;
                case '4':
                    System.out.print("\n********************************************************************\n"); 
                    numberArrayList.clear();  
                    System.out.println("\n\t\tCLEARED Arraylist Collection:" + numberArrayList);
                    System.out.print("\n********************************************************************\n"); 
                    break;
                case '5':
                    System.out.print("\n====================================================================\n"); 
                    System.out.println("\n******* THANK YOU FOR USING THIS SIMPLE PROGRAM. ADIOS! *******");  
                    System.out.print("\n====================================================================\n\n"); 
                    break;
                
                default:
                    System.out.println("\nJust Pick fron the options given above. Please try Again. ");
                    break;
            } 
        }while (choice != '5');

    }
    
}
